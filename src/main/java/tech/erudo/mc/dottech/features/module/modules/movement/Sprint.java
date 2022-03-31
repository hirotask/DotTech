package tech.erudo.mc.dottech.features.module.modules.movement;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.features.module.Category;
import tech.erudo.mc.dottech.features.module.Module;

public class Sprint extends Module {

    public Sprint() {
        super("Sprint", Category.MOVEMENT, Keyboard.KEY_U);
    }

    @Override
    public void onUpdate() {
        if (Minecraft.getMinecraft().player.moveForward > 0) { //前に進んでいる時
            Minecraft.getMinecraft().player.setSprinting(true);
        }
    }


}
