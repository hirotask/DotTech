package tech.erudo.mc.dottech.features.module;

import net.minecraftforge.common.MinecraftForge;

public abstract class Module {

    public String name;
    public Category category;
    public boolean isToggled;
    public int keybind;

    public Module(String name, Category category, int keybind) {
        this.name = name;
        this.category = category;
        this.keybind = keybind;
        this.isToggled = false;
    }

    //Module on Enable
    public void OnEnable() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    //Module on Disable
    public void OnDisable() {
        MinecraftForge.EVENT_BUS.unregister(this);
    }

    public void toggle() {
        if(isToggled) {
            onDisable();
            OnDisable();
        } else {
            onEnable();
            OnEnable();
        }
        isToggled = !isToggled;
    }

    public abstract void onEnable();
    public abstract void onDisable();

}
