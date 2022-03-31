package tech.erudo.mc.dottech.features.module.modules.movement;

import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.features.module.Category;
import tech.erudo.mc.dottech.features.module.Module;
import tech.erudo.mc.dottech.util.Wrapper;

public class Flight extends Module {
    public Flight() {
        super("Flight", Category.MOVEMENT, Keyboard.KEY_G);
    }

    @Override
    public void onEnable() {
        Wrapper.getInstance().getPlayer().capabilities.setFlySpeed(0.2F);
        Wrapper.getInstance().getPlayer().capabilities.isFlying = true;
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
