package com.nhoryzon.mc.farmersdelight.registry;

import com.nhoryzon.mc.farmersdelight.FarmersDelightMod;
import com.nhoryzon.mc.farmersdelight.block.BasketBlock;
import com.nhoryzon.mc.farmersdelight.block.BuddingTomatoBlock;
import com.nhoryzon.mc.farmersdelight.block.CabbageCropBlock;
import com.nhoryzon.mc.farmersdelight.block.CanvasRugBlock;
import com.nhoryzon.mc.farmersdelight.block.CookingPotBlock;
import com.nhoryzon.mc.farmersdelight.block.CuttingBoardBlock;
import com.nhoryzon.mc.farmersdelight.block.FeastBlock;
import com.nhoryzon.mc.farmersdelight.block.HoneyGlazedHamBlock;
import com.nhoryzon.mc.farmersdelight.block.MushroomColonyBlock;
import com.nhoryzon.mc.farmersdelight.block.OnionCropBlock;
import com.nhoryzon.mc.farmersdelight.block.OrganicCompostBlock;
import com.nhoryzon.mc.farmersdelight.block.CabinetBlock;
import com.nhoryzon.mc.farmersdelight.block.PieBlock;
import com.nhoryzon.mc.farmersdelight.block.RiceBaleBlock;
import com.nhoryzon.mc.farmersdelight.block.RiceCropBlock;
import com.nhoryzon.mc.farmersdelight.block.RiceRollMedleyBlock;
import com.nhoryzon.mc.farmersdelight.block.RiceUpperCropBlock;
import com.nhoryzon.mc.farmersdelight.block.RichSoilBlock;
import com.nhoryzon.mc.farmersdelight.block.RichSoilFarmlandBlock;
import com.nhoryzon.mc.farmersdelight.block.RoastChickenBlock;
import com.nhoryzon.mc.farmersdelight.block.RopeBlock;
import com.nhoryzon.mc.farmersdelight.block.SafetyNetBlock;
import com.nhoryzon.mc.farmersdelight.block.SandyShrubBlock;
import com.nhoryzon.mc.farmersdelight.block.ShepherdsPieBlock;
import com.nhoryzon.mc.farmersdelight.block.SkilletBlock;
import com.nhoryzon.mc.farmersdelight.block.StoveBlock;
import com.nhoryzon.mc.farmersdelight.block.TatamiBlock;
import com.nhoryzon.mc.farmersdelight.block.TatamiHalfMatBlock;
import com.nhoryzon.mc.farmersdelight.block.TatamiMatBlock;
import com.nhoryzon.mc.farmersdelight.block.TomatoVineBlock;
import com.nhoryzon.mc.farmersdelight.block.WildCropBlock;
import com.nhoryzon.mc.farmersdelight.block.WildPatchBlock;
import com.nhoryzon.mc.farmersdelight.block.WildRiceCropBlock;
import com.nhoryzon.mc.farmersdelight.block.signs.StandingCanvasSignBlock;
import com.nhoryzon.mc.farmersdelight.block.signs.WallCanvasSignBlock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.HayBlock;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public enum BlocksRegistry {

    STOVE("stove", StoveBlock::new),
    COOKING_POT("cooking_pot", CookingPotBlock::new, true),
    BASKET("basket", BasketBlock::new, true),
    CUTTING_BOARD("cutting_board", CuttingBoardBlock::new, true),
    SKILLET("skillet", SkilletBlock::new, true),

    CARROT_CRATE("carrot_crate", () -> new Block(FabricBlockSettings.of(Material.WOOD).hardness(2.f).resistance(3.f).sounds(BlockSoundGroup.WOOD))),
    POTATO_CRATE("potato_crate", () -> new Block(FabricBlockSettings.of(Material.WOOD).hardness(2.f).resistance(3.f).sounds(BlockSoundGroup.WOOD))),
    BEETROOT_CRATE("beetroot_crate", () -> new Block(FabricBlockSettings.of(Material.WOOD).hardness(2.f).resistance(3.f).sounds(BlockSoundGroup.WOOD))),
    CABBAGE_CRATE("cabbage_crate", () -> new Block(FabricBlockSettings.of(Material.WOOD).hardness(2.f).resistance(3.f).sounds(BlockSoundGroup.WOOD))),
    TOMATO_CRATE("tomato_crate", () -> new Block(FabricBlockSettings.of(Material.WOOD).hardness(2.f).resistance(3.f).sounds(BlockSoundGroup.WOOD))),
    ONION_CRATE("onion_crate", () -> new Block(FabricBlockSettings.of(Material.WOOD).hardness(2.f).resistance(3.f).sounds(BlockSoundGroup.WOOD))),
    RICE_BALE("rice_bale", RiceBaleBlock::new, false, flammable(20, 60)),
    RICE_BAG("rice_bag", () -> new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL))),
    STRAW_BALE("straw_bale", () -> new HayBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)), true, flammable(20, 60)),

    ROPE("rope", RopeBlock::new, true),
    SAFETY_NET("safety_net", SafetyNetBlock::new, true),
    OAK_CABINET("oak_cabinet", CabinetBlock::new),
    BIRCH_CABINET("birch_cabinet", CabinetBlock::new),
    SPRUCE_CABINET("spruce_cabinet", CabinetBlock::new),
    JUNGLE_CABINET("jungle_cabinet", CabinetBlock::new),
    ACACIA_CABINET("acacia_cabinet", CabinetBlock::new),
    DARK_OAK_CABINET("dark_oak_cabinet", CabinetBlock::new),
    MANGROVE_CABINET("mangrove_cabinet", CabinetBlock::new),
    CRIMSON_CABINET("crimson_cabinet", CabinetBlock::new),
    WARPED_CABINET("warped_cabinet", CabinetBlock::new),
    CANVAS_RUG("canvas_rug", CanvasRugBlock::new, true),
    TATAMI("tatami", TatamiBlock::new),
    FULL_TATAMI_MAT("full_tatami_mat", TatamiMatBlock::new, true),
    HALF_TATAMI_MAT("half_tatami_mat", TatamiHalfMatBlock::new),

    CANVAS_SIGN("canvas_sign", () -> new StandingCanvasSignBlock(null)),
    WHITE_CANVAS_SIGN("white_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.WHITE)),
    ORANGE_CANVAS_SIGN("orange_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.ORANGE)),
    MAGENTA_CANVAS_SIGN("magenta_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.MAGENTA)),
    LIGHT_BLUE_CANVAS_SIGN("light_blue_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.LIGHT_BLUE)),
    YELLOW_CANVAS_SIGN("yellow_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.YELLOW)),
    LIME_CANVAS_SIGN("lime_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.LIME)),
    PINK_CANVAS_SIGN("pink_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.PINK)),
    GRAY_CANVAS_SIGN("gray_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.GRAY)),
    LIGHT_GRAY_CANVAS_SIGN("light_gray_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.LIGHT_GRAY)),
    CYAN_CANVAS_SIGN("cyan_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.CYAN)),
    PURPLE_CANVAS_SIGN("purple_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.PURPLE)),
    BLUE_CANVAS_SIGN("blue_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.BLUE)),
    BROWN_CANVAS_SIGN("brown_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.BROWN)),
    GREEN_CANVAS_SIGN("green_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.GREEN)),
    RED_CANVAS_SIGN("red_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.RED)),
    BLACK_CANVAS_SIGN("black_canvas_sign", () -> new StandingCanvasSignBlock(DyeColor.BLACK)),

    CANVAS_WALL_SIGN("canvas_wall_sign", () -> new WallCanvasSignBlock(CANVAS_SIGN.get(), null)),
    WHITE_CANVAS_WALL_SIGN("white_canvas_wall_sign", () -> new WallCanvasSignBlock(WHITE_CANVAS_SIGN.get(), DyeColor.WHITE)),
    ORANGE_CANVAS_WALL_SIGN("orange_canvas_wall_sign", () -> new WallCanvasSignBlock(ORANGE_CANVAS_SIGN.get(), DyeColor.ORANGE)),
    MAGENTA_CANVAS_WALL_SIGN("magenta_canvas_wall_sign", () -> new WallCanvasSignBlock(MAGENTA_CANVAS_SIGN.get(), DyeColor.MAGENTA)),
    LIGHT_BLUE_CANVAS_WALL_SIGN("light_blue_canvas_wall_sign", () -> new WallCanvasSignBlock(LIGHT_BLUE_CANVAS_SIGN.get(), DyeColor.LIGHT_BLUE)),
    YELLOW_CANVAS_WALL_SIGN("yellow_canvas_wall_sign", () -> new WallCanvasSignBlock(YELLOW_CANVAS_SIGN.get(), DyeColor.YELLOW)),
    LIME_CANVAS_WALL_SIGN("lime_canvas_wall_sign", () -> new WallCanvasSignBlock(LIME_CANVAS_SIGN.get(), DyeColor.LIME)),
    PINK_CANVAS_WALL_SIGN("pink_canvas_wall_sign", () -> new WallCanvasSignBlock(PINK_CANVAS_SIGN.get(), DyeColor.PINK)),
    GRAY_CANVAS_WALL_SIGN("gray_canvas_wall_sign", () -> new WallCanvasSignBlock(GRAY_CANVAS_SIGN.get(), DyeColor.GRAY)),
    LIGHT_GRAY_CANVAS_WALL_SIGN("light_gray_canvas_wall_sign", () -> new WallCanvasSignBlock(LIGHT_GRAY_CANVAS_SIGN.get(), DyeColor.LIGHT_GRAY)),
    CYAN_CANVAS_WALL_SIGN("cyan_canvas_wall_sign", () -> new WallCanvasSignBlock(CYAN_CANVAS_SIGN.get(), DyeColor.CYAN)),
    PURPLE_CANVAS_WALL_SIGN("purple_canvas_wall_sign", () -> new WallCanvasSignBlock(PURPLE_CANVAS_SIGN.get(), DyeColor.PURPLE)),
    BLUE_CANVAS_WALL_SIGN("blue_canvas_wall_sign", () -> new WallCanvasSignBlock(BLUE_CANVAS_SIGN.get(), DyeColor.BLUE)),
    BROWN_CANVAS_WALL_SIGN("brown_canvas_wall_sign", () -> new WallCanvasSignBlock(BROWN_CANVAS_SIGN.get(), DyeColor.BROWN)),
    GREEN_CANVAS_WALL_SIGN("green_canvas_wall_sign", () -> new WallCanvasSignBlock(GREEN_CANVAS_SIGN.get(), DyeColor.GREEN)),
    RED_CANVAS_WALL_SIGN("red_canvas_wall_sign", () -> new WallCanvasSignBlock(RED_CANVAS_SIGN.get(), DyeColor.RED)),
    BLACK_CANVAS_WALL_SIGN("black_canvas_wall_sign", () -> new WallCanvasSignBlock(BLACK_CANVAS_SIGN.get(), DyeColor.BLACK)),

    BROWN_MUSHROOM_COLONY("brown_mushroom_colony", () -> new MushroomColonyBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM), Items.BROWN_MUSHROOM), true),
    RED_MUSHROOM_COLONY("red_mushroom_colony", () -> new MushroomColonyBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM), Items.RED_MUSHROOM), true),
    ORGANIC_COMPOST("organic_compost", OrganicCompostBlock::new),
    RICH_SOIL("rich_soil", RichSoilBlock::new),
    RICH_SOIL_FARMLAND("rich_soil_farmland", RichSoilFarmlandBlock::new),

    SANDY_SHRUB("sandy_shrub", SandyShrubBlock::new, true),
    WILD_CABBAGES("wild_cabbages", WildPatchBlock::new, true, flammable(100, 60)),
    WILD_ONIONS("wild_onions", WildCropBlock::new, true, flammable(100, 60)),
    WILD_TOMATOES("wild_tomatoes", WildPatchBlock::new, true, flammable(100, 60)),
    WILD_CARROTS("wild_carrots", WildCropBlock::new, true, flammable(100, 60)),
    WILD_POTATOES("wild_potatoes", WildPatchBlock::new, true, flammable(100, 60)),
    WILD_BEETROOTS("wild_beetroots", WildPatchBlock::new, true, flammable(100, 60)),
    WILD_RICE("wild_rice", WildRiceCropBlock::new, true, flammable(100, 60)),

    CABBAGE_CROP("cabbages", CabbageCropBlock::new, true),
    ONION_CROP("onions", OnionCropBlock::new, true),
    BUDDING_TOMATO_CROP("budding_tomatoes", BuddingTomatoBlock::new, true),
    TOMATO_CROP("tomatoes", TomatoVineBlock::new, true),
    RICE("rice", RiceCropBlock::new, true),
    RICE_PANICLE("rice_panicle", RiceUpperCropBlock::new, true),

    APPLE_PIE("apple_pie", () -> new PieBlock(ItemsRegistry.APPLE_PIE_SLICE.get())),
    SWEET_BERRY_CHEESECAKE("sweet_berry_cheesecake", () -> new PieBlock(ItemsRegistry.SWEET_BERRY_CHEESECAKE_SLICE.get())),
    CHOCOLATE_PIE("chocolate_pie", () -> new PieBlock(ItemsRegistry.CHOCOLATE_PIE_SLICE.get())),

    ROAST_CHICKEN_BLOCK("roast_chicken_block", RoastChickenBlock::new, true),
    STUFFED_PUMPKIN_BLOCK("stuffed_pumpkin_block", () -> new FeastBlock(FabricBlockSettings.copyOf(Blocks.PUMPKIN), ItemsRegistry.STUFFED_PUMPKIN.get(), false)),
    HONEY_GLAZED_HAM_BLOCK("honey_glazed_ham_block", HoneyGlazedHamBlock::new),
    SHEPHERDS_PIE_BLOCK("shepherds_pie_block", ShepherdsPieBlock::new),
    RICE_ROLL_MEDLEY_BLOCK("rice_roll_medley_block", RiceRollMedleyBlock::new);

    private static FlammableBlockRegistry.Entry flammable(int burnChance, @SuppressWarnings("SameParameterValue") int spreadChance) {
        return new FlammableBlockRegistry.Entry(burnChance, spreadChance);
    }

    private static boolean isValidFlammableEntry(FlammableBlockRegistry.Entry flammableRate) {
        return flammableRate != null && flammableRate.getBurnChance() > 0 && flammableRate.getSpreadChance() > 0;
    }

    private final String pathName;
    private final Supplier<Block> blockSupplier;
    private final FlammableBlockRegistry.Entry flammableRate;
    private final boolean isCutout;
    private Block block;

    BlocksRegistry(String pathName, Supplier<Block> blockSupplier) {
        this(pathName, blockSupplier, false, new FlammableBlockRegistry.Entry(0, 0));
    }

    BlocksRegistry(String pathName, Supplier<Block> blockSupplier, boolean isCutout) {
        this(pathName, blockSupplier, isCutout, new FlammableBlockRegistry.Entry(0, 0));
    }

    BlocksRegistry(String pathName, Supplier<Block> blockSupplier, boolean isCutout, FlammableBlockRegistry.Entry flammableRate) {
        this.pathName = pathName;
        this.blockSupplier = blockSupplier;
        this.flammableRate = flammableRate;
        this.isCutout = isCutout;
    }

    public static void registerAll() {
        for (BlocksRegistry value : values()) {
            Block block = value.get();
            Registry.register(Registry.BLOCK, new Identifier(FarmersDelightMod.MOD_ID, value.pathName), block);
            if (isValidFlammableEntry(value.flammableRate)) {
                FlammableBlockRegistry.getDefaultInstance().add(block, value.flammableRate);
            }
        }
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayer() {
        for (BlocksRegistry value : values()) {
            if (value.isCutout) {
                BlockRenderLayerMap.INSTANCE.putBlock(value.get(), RenderLayer.getCutout());
            }
        }
    }

    public Block get() {
        if (block == null) {
            block = blockSupplier.get();
        }

        return block;
    }

    public String getId() {
        return Registry.BLOCK.getId(get()).toString();
    }

}