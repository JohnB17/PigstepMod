
package net.mcreator.pigstep.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.pigstep.ElementsPigstepMod;

@ElementsPigstepMod.ModElement.Tag
public class ItemPigStep extends ElementsPigstepMod.ModElement {
	@GameRegistry.ObjectHolder("pigstep:pig_step")
	public static final Item block = null;
	public ItemPigStep(ElementsPigstepMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("pigstep:pig_step", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("pig_step", ElementsPigstepMod.sounds.get(new ResourceLocation("pigstep:pigstep")));
			setUnlocalizedName("pig_step");
			setRegistryName("pig_step");
			setCreativeTab(CreativeTabs.MISC);
		}
	}
}
