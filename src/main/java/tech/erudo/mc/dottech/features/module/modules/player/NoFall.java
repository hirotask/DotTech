package tech.erudo.mc.dottech.features.module.modules.player;

import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.server.SPacketUpdateHealth;
import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.features.module.Category;
import tech.erudo.mc.dottech.features.module.Module;
import tech.erudo.mc.dottech.util.Wrapper;

public class NoFall extends Module {

    public NoFall() {
        super("noFall", Category.PLAYER, Keyboard.KEY_N);
    }

    @Override
    public void onUpdate() {
        if(Wrapper.getInstance().getPlayer().fallDistance > 2.5f) {
            Wrapper.sendPackets(new CPacketPlayer(true));
        }
    }
}
