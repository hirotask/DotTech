package tech.erudo.mc.dottech.features.module;

import net.minecraftforge.common.MinecraftForge;

import java.awt.*;
import java.util.Random;

public class Module {

    public String name;
    public Category category;
    public boolean isToggled;
    public int keybind;
    public Color color;

    public Module(String name, Category category, int keybind) {
        this.name = name;
        this.category = category;
        this.keybind = keybind;
        this.isToggled = false;

        Random rand = new Random();
        float h = rand.nextFloat();
        float s = rand.nextFloat();
        float b = rand.nextFloat();
        color = Color.getHSBColor(h,s,b);
    }

    //Module on Enable
    public final void OnEnable() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    //Module on Disable
    public final void OnDisable() {
        MinecraftForge.EVENT_BUS.unregister(this);
    }

    public final void toggle() {
        if(isToggled) {
            onDisable();
            OnDisable();
        } else {
            onEnable();
            OnEnable();
        }
        isToggled = !isToggled;
    }

    //Each module enable, disable, update
    public void onEnable() {}
    public void onDisable() {}
    public void onUpdate() {}

    public String getName() {
        return this.name;
    }

    public int getNameLength(){
        return this.name.length();
    }
}
