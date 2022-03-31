package tech.erudo.mc.dottech.features.module;

import tech.erudo.mc.dottech.features.module.modules.movement.Sprint;
import tech.erudo.mc.dottech.features.module.modules.player.MyFirstModule;

import java.util.Stack;

public class ModuleManager {

    public Stack<Module> modules = new Stack<>();

    public ModuleManager() {
        modules.push(new MyFirstModule());
        modules.push(new Sprint());
    }

}
