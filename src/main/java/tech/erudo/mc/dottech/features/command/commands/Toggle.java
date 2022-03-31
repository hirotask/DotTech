package tech.erudo.mc.dottech.features.command.commands;

import tech.erudo.mc.dottech.DotTech;
import tech.erudo.mc.dottech.features.command.Command;
import tech.erudo.mc.dottech.features.module.Module;

public class Toggle extends Command {
    public Toggle() {
        super("Toggle", "t");
    }

    @Override
    public void onCommand() {
        try {
            for (Module m : DotTech.module.modules) {
                if (m.name.toLowerCase().equals(getArg(1).toLowerCase())) {
                    m.toggle();
                    return;
                }
            }
            sendMessage("no such module");
        } catch (Exception ex) {
            sendMessage("error");
        }
    }
}
