package tech.erudo.mc.dottech.features.module.modules.world;

import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.features.module.Category;
import tech.erudo.mc.dottech.features.module.Module;
import tech.erudo.mc.dottech.util.Wrapper;

public class Timer extends Module {
    public Timer() {
        super("Timer", Category.WORLD, Keyboard.KEY_M);
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
