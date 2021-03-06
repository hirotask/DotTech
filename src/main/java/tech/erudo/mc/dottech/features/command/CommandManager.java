package tech.erudo.mc.dottech.features.command;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.features.command.commands.Bind;
import tech.erudo.mc.dottech.features.command.commands.GameMode;
import tech.erudo.mc.dottech.features.command.commands.Toggle;

import java.util.ArrayList;
import java.util.Objects;

public class CommandManager {
    public ArrayList<Command> commands = new ArrayList<>();
    public String PREFIX = ".";

    public CommandManager() {
        commands.add(new Toggle());
        commands.add(new Bind());
        commands.add(new GameMode());
    }

    @SubscribeEvent
    public void key(InputEvent.KeyInputEvent e) {
        if (Minecraft.getMinecraft().world == null || Minecraft.getMinecraft().player == null) {
            return;
        }
        if (Keyboard.isCreated() && Keyboard.getEventKeyState()) {
            final char key = Keyboard.getEventCharacter();
            if (PREFIX.charAt(0) == key) {
                Minecraft.getMinecraft().displayGuiScreen(new GuiChat(PREFIX));
            }
        }
    }

    @SubscribeEvent
    public void listener(ClientChatEvent e) {
        if (Minecraft.getMinecraft().world == null || Minecraft.getMinecraft().player == null) {
            return;
        }
        String content = String.valueOf(e.getMessage()).toLowerCase();
        if (content.startsWith(PREFIX)) {
            e.setCanceled(true);
            for (Command c : commands) {
                if (Objects.equals(c.name.toLowerCase(), content.split(" ")[0].replace(PREFIX, ""))
                || Objects.equals(c.abbName.toLowerCase(), content.split(" ")[0].replace(PREFIX, ""))) {
                    c.commandInput = content;
                    c.onCommand();
                    return;
                }
            }
        } else {
            return;
        }
        Command.sendMessage("no such command");
    }
}
