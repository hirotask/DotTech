package tech.erudo.mc.dottech.features.command;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;

public class Command {
    public String name;
    public String abbName; //省略名
    public String commandInput;

    public Command(String name, String abbName) {
        this.name = name;
        this.abbName = abbName;
    }

    public Command(String name) {
        this(name, name);
    }

    public void onCommand() { }

    public String getArg(int i) {
        return commandInput.split(" ")[i];
    }

    public static void sendMessage(String content) {
        Minecraft.getMinecraft().player.sendMessage(new TextComponentString( ChatFormatting.GRAY + ".TEch >> " + content));
    }
}
