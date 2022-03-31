package tech.erudo.mc.dottech.features.module;

import tech.erudo.mc.dottech.features.module.modules.movement.Spider;
import tech.erudo.mc.dottech.features.module.modules.movement.Sprint;
import tech.erudo.mc.dottech.features.module.modules.player.FastPlace;
import tech.erudo.mc.dottech.features.module.modules.player.MyFirstModule;
import tech.erudo.mc.dottech.features.module.modules.player.NoFall;
import tech.erudo.mc.dottech.features.module.modules.world.FullBright;

import java.util.Stack;

public class ModuleManager {

    public Stack<Module> modules = new Stack<>();

    public ModuleManager() {
        modules.push(new MyFirstModule());
        modules.push(new Sprint());
        modules.push(new NoFall());
        modules.push(new FullBright());
        modules.push(new FastPlace());
        modules.push(new Spider());
    }

}
