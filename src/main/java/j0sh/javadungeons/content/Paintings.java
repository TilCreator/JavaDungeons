package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Paintings {

    public static void init() {
        registerPaintingMotive("arch_illager_cool_guy", 32, 32);
        registerPaintingMotive("arch_illager_portrait", 32, 32);
        registerPaintingMotive("crocodile", 32, 32);
        registerPaintingMotive("tropical", 32, 32);
        registerPaintingMotive("aunt", 24, 24);
        registerPaintingMotive("evoker", 24, 24);
        registerPaintingMotive("mountain", 24, 24);
        registerPaintingMotive("redstone_mines", 32, 16);
        registerPaintingMotive("foe_graffiti", 32, 16);
        registerPaintingMotive("weak_graffiti", 32, 16);
        registerPaintingMotive("blue_fields", 16, 16);
        registerPaintingMotive("creeper", 16, 16);
        registerPaintingMotive("cacti_canyon", 32, 64);
        registerPaintingMotive("obsidian_pinnacle", 34, 50);
    }

    private static void registerPaintingMotive(String name, int width, int height) {
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier(JavaDungeons.MOD_ID, name), new PaintingMotive(width, height));
    }
}