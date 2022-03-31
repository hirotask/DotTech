package tech.erudo.mc.dottech.features.module.modules.movement;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.features.module.Category;
import tech.erudo.mc.dottech.features.module.Module;
import tech.erudo.mc.dottech.util.Wrapper;

public class BoatFly extends Module {
    public BoatFly() {
        super("BoatFly", Category.MOVEMENT, Keyboard.KEY_L);
    }

    @Override
    public void onUpdate() {
        //check if riding
        if(!Wrapper.getInstance().getPlayer().isRiding()) {
            return;
        }

        Entity vehicle = Wrapper.getInstance().getPlayer().getRidingEntity();
//        double y = Wrapper
        Vec3d velocity = new Vec3d(vehicle.motionX, 0, vehicle.motionZ);

    }
}
