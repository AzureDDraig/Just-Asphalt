
package net.ddraig.justasphalt.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.ddraig.justasphalt.JustAsphaltMod;

public class JustAsphaltModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JustAsphaltMod.MODID);
	public static final RegistryObject<CreativeModeTab> JUST_ASPHALT = REGISTRY.register("just_asphalt",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.just_asphalt.just_asphalt")).icon(() -> new ItemStack(JustAsphaltModBlocks.ASPHALT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JustAsphaltModBlocks.ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.BLACK_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.BLUE_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.BROWN_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.CYAN_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.GRAY_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.GREEN_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.LIGHT_BLUE_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.LIGHT_GRAY_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.LIME_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.MAGENTA_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.ORANGE_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.PINK_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.PURPLE_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.RED_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.WHITE_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.YELLOW_ASPHALT.get().asItem());
				tabData.accept(JustAsphaltModBlocks.ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.BLACK_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.BLUE_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.BROWN_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.CYAN_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.GRAY_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.GREEN_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.LIGHT_BLUE_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.LIGHT_GRAY_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.LIME_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.MAGENTA_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.ORANGE_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.PINK_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.PURPLE_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.RED_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.WHITE_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.YELLOW_ASPHALT_SLAB.get().asItem());
				tabData.accept(JustAsphaltModBlocks.ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.BLACK_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.BLUE_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.BROWN_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.CYAN_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.GRAY_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.GREEN_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.LIGHT_BLUE_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.LIGHT_GRAY_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.LIME_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.MAGENTA_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.ORANGE_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.PINK_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.PURPLE_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.RED_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.WHITE_ASPHALT_STAIRS.get().asItem());
				tabData.accept(JustAsphaltModBlocks.YELLOW_ASPHALT_STAIRS.get().asItem());
			})

					.build());
}
