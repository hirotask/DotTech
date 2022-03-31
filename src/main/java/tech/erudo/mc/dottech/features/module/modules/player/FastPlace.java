package tech.erudo.mc.dottech.features.module.modules.player;

import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.features.module.Category;
import tech.erudo.mc.dottech.features.module.Module;
import tech.erudo.mc.dottech.util.Wrapper;

public class FastPlace extends Module {
    public FastPlace() {
        super("FastPlace", Category.PLAYER, Keyboard.KEY_L);
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
