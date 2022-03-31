package tech.erudo.mc.dottech.features.command.commands;

import net.minecraft.world.GameType;
import tech.erudo.mc.dottech.DotTech;
import tech.erudo.mc.dottech.features.command.Command;
import tech.erudo.mc.dottech.features.module.Module;
import tech.erudo.mc.dottech.util.Wrapper;

import java.util.Locale;

public class GameMode extends Command {
    public GameMode() {
        super("GameMode", "g");
    }

    @Override
    public void onCommand() {
        try {
            String arg = getArg(1).toLowerCase();

            if(arg.equals("1") || arg.equals("c") || arg.equals("creative")) {
                Wrapper.getInstance().getPlayer().setGameType(GameType.CREATIVE);
            }else if(arg.equals("2") || arg.equals("a") || arg.equals("adventure")) {
                Wrapper.getInstance().getPlayer().setGameType(GameType.ADVENTURE);
            } else if(arg.equals("0") || arg.equals("sv") || arg.equals("survival")) {
                Wrapper.getInstance().getPlayer().setGameType(GameType.SURVIVAL);
            } else if(arg.equals("3") || arg.equals("sp") || arg.equals("spectator")) {
                Wrapper.getInstance().getPlayer().setGameType(GameType.SPECTATOR);
            } else {
                sendMessage("no such GameMode");
            }
        } catch (Exception ex) {
            sendMessage("error");
        }
    }
}
