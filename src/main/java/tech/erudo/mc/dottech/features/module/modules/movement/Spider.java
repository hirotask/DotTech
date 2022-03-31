package tech.erudo.mc.dottech.features.module.modules.movement;

import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.features.module.Category;
import tech.erudo.mc.dottech.features.module.Module;
import tech.erudo.mc.dottech.util.Wrapper;

public class Spider extends Module {
    public Spider() {
        super("Spider", Category.MOVEMENT, Keyboard.KEY_P);
    }

    @Override
    public void onUpdate() {
        if(Wrapper.getInstance().getPlayer().collidedHorizontally) {
            Wrapper.getInstance().getPlayer().motionY = 0.25F;
        }
    }
}
