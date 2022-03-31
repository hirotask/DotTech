package tech.erudo.mc.dottech.features.module.modules.world;

import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.features.module.Category;
import tech.erudo.mc.dottech.features.module.Module;
import tech.erudo.mc.dottech.util.Wrapper;

public class FullBright extends Module {
    public FullBright() {
        super("FullBright", Category.WORLD, Keyboard.KEY_F);
    }

    @Override
    public void onEnable() {
        Wrapper.getInstance().getMinecraft().gameSettings.gammaSetting = 10F;
    }

    @Override
    public void onDisable() {
        Wrapper.getInstance().getMinecraft().gameSettings.gammaSetting = 1F;
    }
}
