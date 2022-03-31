package tech.erudo.mc.dottech.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.network.Packet;
import net.minecraft.util.math.RayTraceResult;

public final class Wrapper {

    private static Wrapper INSTANCE = new Wrapper();

    public static Wrapper getInstance() {
        return INSTANCE;
    }

    public Minecraft mc = Minecraft.getMinecraft();

    public EntityPlayerSP getPlayer() {
        return this.mc.player;
    }

    public WorldClient getWorld() {
        return this.mc.world;
    }

    public FontRenderer getFontRenderer() {
        return this.mc.fontRenderer;
    }

    public NetHandlerPlayClient getQueue() {
        return this.mc.player.connection;
    }

    public EntityRenderer getEntityRenderer() {
        return this.mc.entityRenderer;
    }

    public ParticleManager getEffectRenderer() {
        return this.mc.effectRenderer;
    }

    public GameSettings getGameSettings() {
        return this.mc.gameSettings;
    }

    public static void sendPackets(Packet packet) {
        getInstance().getPlayer().connection.sendPacket(packet);
    }

    public PlayerControllerMP getPlayerContoller() {
        return this.mc.playerController;
    }

    public RenderGlobal getRenderGlobal() {
        return this.mc.renderGlobal;
    }

    public GuiScreen getCurrentDisplyedGuiScreen() {
        return this.mc.currentScreen;
    }

    public RayTraceResult getMouseOverObject() {
        return this.mc.objectMouseOver;
    }

    public GuiIngame getGuiIngame() {
        return this.mc.ingameGUI;
    }

    public Minecraft getMinecraft() {
        return this.mc;
    }

}
