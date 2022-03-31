package tech.erudo.mc.dottech.features.command.commands;

import org.lwjgl.input.Keyboard;
import tech.erudo.mc.dottech.DotTech;
import tech.erudo.mc.dottech.features.command.Command;
import tech.erudo.mc.dottech.features.module.Module;

public class Bind extends Command {
    public Bind() {
        super("Bind", "b");
    }

    @Override
    public void onCommand() {
        try {
            for (Module m : DotTech.module.modules) {
                if (m.name.toLowerCase().equals(getArg(1).toLowerCase())) {
                    m.keybind = Keyboard.getKeyIndex(getArg(2).toUpperCase());
                    sendMessage(m.name + " was bound to " + Keyboard.getKeyName(m.keybind));
                    return;
                }
            }
            sendMessage("no such module");
        } catch (Exception ex) {
            sendMessage("error");
        }
    }
}
