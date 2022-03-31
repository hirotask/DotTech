package tech.erudo.mc.dottech.features.ui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tech.erudo.mc.dottech.DotTech;
import tech.erudo.mc.dottech.features.module.Module;

import java.awt.*;
import java.util.Collections;
import java.util.Comparator;

public class Hud extends GuiScreen {
    Minecraft mc = Minecraft.getMinecraft();

    @SubscribeEvent
    public void hud(RenderGameOverlayEvent e) {
        ScaledResolution resolution = new ScaledResolution(mc);
        FontRenderer renderer = mc.fontRenderer;

        if (e.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
            renderer.drawString( ".TEch " + DotTech.VERSION, 1, 1, Color.CYAN.getRGB());
        }
        //array list
        if (e.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
            int y = 1;

            DotTech.module.modules.sort(Comparator.comparingInt(Module::getNameLength).thenComparing(Module::getName));
            Collections.reverse(DotTech.module.modules);

            for (Module m : DotTech.module.modules) {
                if (m.isToggled) {
                    renderer.drawString(m.name, resolution.getScaledWidth() - renderer.getStringWidth(m.name), y, m.color.getRGB());
                    y += renderer.FONT_HEIGHT + 1;
                }
            }
        }
    }
}
