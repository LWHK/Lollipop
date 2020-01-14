package owmii.lib;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import owmii.lib.network.Network;

import java.util.function.Consumer;

@Mod(Lollipop.MOD_ID)
public class Lollipop {
    public static final Network NET = new Network();
    public static final String MOD_ID = "lollipop";

    public static <T extends Event> void addModListener(Consumer<T> consumer) {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(consumer);
    }

    public static <T extends Event> void addEventListener(Consumer<T> consumer) {
        MinecraftForge.EVENT_BUS.addListener(consumer);
    }
}
