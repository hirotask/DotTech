package tech.erudo.mc.dottech.event;

import net.minecraftforge.common.MinecraftForge;

import java.util.Set;
import java.util.Stack;

public class EventManager {

    private Stack<Object> events = new Stack<>();

    public  EventManager() {
        events.push(new PlayerKeyInputEvent());
        events.push(new PlayerTickEvent());

        for(Object event : events) {
            MinecraftForge.EVENT_BUS.register(event);
        }
    }

}
