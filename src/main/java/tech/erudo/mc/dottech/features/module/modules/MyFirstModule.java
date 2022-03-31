package tech.erudo.mc.dottech.features.module.modules;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.features.module.Category;
import tech.erudo.mc.dottech.features.module.Module;

public class MyFirstModule extends Module {

    public MyFirstModule() {
        super("MyFirstModule", Category.PLAYER, Keyboard.KEY_I);
    }

    @Override
    public void onEnable() {
        Minecraft.getMinecraft().player.sendChatMessage(this.name + " is Enabled!");
    }

    @Override
    public void onDisable() {
        Minecraft.getMinecraft().player.sendChatMessage(this.name + " is Disabled!");
    }
}
