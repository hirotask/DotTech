package tech.erudo.mc.dottech.event;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.DotTech;
import tech.erudo.mc.dottech.features.module.Module;

public class PlayerKeyInputEvent {

    @SubscribeEvent
    public void toggle(InputEvent.KeyInputEvent e) {
        if(Minecraft.getMinecraft().player == null || Minecraft.getMinecraft().world == null) {
            return;
        }

        if(Keyboard.isCreated() && Keyboard.getEventKeyState()) {
            int key = Keyboard.getEventKey();
            for (Module m : DotTech.module.modules) {
                if(m.keybind == key) {
                    m.toggle();
                    return;
                }
            }
        }
    }
}
