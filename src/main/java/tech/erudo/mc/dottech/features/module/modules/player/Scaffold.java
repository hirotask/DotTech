package tech.erudo.mc.dottech.features.module.modules.player;

import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.features.module.Category;
import tech.erudo.mc.dottech.features.module.Module;
import tech.erudo.mc.dottech.util.Wrapper;

public class Scaffold extends Module {
    public Scaffold() {
        super("Scaffold", Category.PLAYER, Keyboard.KEY_Z);
    }

    @Override
    public void onUpdate() {
        if(Wrapper.getInstance().getPlayer().moveForward > 0) { //歩いたら
        }
    }
}
