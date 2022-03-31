package tech.erudo.mc.dottech;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;
import tech.erudo.mc.dottech.event.EventManager;
import tech.erudo.mc.dottech.event.PlayerKeyInputEvent;
import tech.erudo.mc.dottech.features.command.CommandManager;
import tech.erudo.mc.dottech.features.module.ModuleManager;
import tech.erudo.mc.dottech.features.ui.Hud;

@Mod(modid = DotTech.MODID, name = DotTech.NAME, version = DotTech.VERSION)
public class DotTech
{
    public static final String MODID = "dottech";
    public static final String NAME = "DotTech Client";
    public static final String VERSION = "1.0";

    private static Logger logger;

    public static final ModuleManager module = new ModuleManager();

    public Hud hud = new Hud();

    public CommandManager command = new CommandManager();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        //set Title
        Display.setTitle(DotTech.NAME + " " + DotTech.VERSION);

        //set Events
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(hud);
        MinecraftForge.EVENT_BUS.register(command);

        new EventManager();
    }
}
