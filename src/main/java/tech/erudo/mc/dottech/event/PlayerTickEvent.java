package tech.erudo.mc.dottech.event;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import tech.erudo.mc.dottech.DotTech;
import tech.erudo.mc.dottech.features.module.Module;

//毎ティック更新されるイベント
public class PlayerTickEvent {
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent e) {
        if(e.phase != TickEvent.Phase.START) return;

        if(e.player != Minecraft.getMinecraft().player) return;

        for(Module m : DotTech.module.modules) {
            if(m.isToggled) {
                m.onUpdate();
            }
        }
    }
}
