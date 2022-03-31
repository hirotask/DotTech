package tech.erudo.mc.dottech.features.module.modules.movement;

import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.features.module.Category;
import tech.erudo.mc.dottech.features.module.Module;
import tech.erudo.mc.dottech.util.Wrapper;

public class Step extends Module {
    public Step() {
        super("Step", Category.MOVEMENT, Keyboard.KEY_X);
    }

    @Override
    public void onDisable() {
        Wrapper.getInstance().getPlayer().stepHeight = 0.5F;
    }

    @Override
    public void onUpdate() {
        Wrapper.getInstance().getPlayer().stepHeight = 1F;
    }
}
