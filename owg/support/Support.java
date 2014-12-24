package owg.support;

import java.util.ArrayList;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBeach;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.biome.BiomeGenEnd;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.biome.BiomeGenHell;
import net.minecraft.world.biome.BiomeGenHills;
import net.minecraft.world.biome.BiomeGenJungle;
import net.minecraft.world.biome.BiomeGenMushroomIsland;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.biome.BiomeGenRiver;
import net.minecraft.world.biome.BiomeGenSnow;
import net.minecraft.world.biome.BiomeGenSwamp;
import net.minecraft.world.biome.BiomeGenTaiga;
import cpw.mods.fml.common.Loader;

public class Support 
{
	public static ArrayList<BiomeGenBase> biomes_snow;
	public static ArrayList<BiomeGenBase> biomes_cold;
	public static ArrayList<BiomeGenBase> biomes_wet;
	public static ArrayList<BiomeGenBase> biomes_hot;
	
	public static void init()
	{
		biomes_snow = new ArrayList<BiomeGenBase>();
		biomes_cold = new ArrayList<BiomeGenBase>();
		biomes_wet = new ArrayList<BiomeGenBase>();
		biomes_hot = new ArrayList<BiomeGenBase>();
		
		addDefaultBiomes();
		
		if (Loader.isModLoaded("BiomesOPlenty"))
		{
			SupportBOP.init();
		}
		
		if (Loader.isModLoaded("ExtrabiomesXL"))
		{
			SupportEBXL.init();
		}
		
		if (Loader.isModLoaded("Highlands"))
		{
			SupportHL.init();
		}
	}
	
	public static void addDefaultBiomes()
	{
	    biomes_snow.add(BiomeGenBase.icePlains);
	    biomes_snow.add(BiomeGenBase.iceMountains);
	    biomes_snow.add(BiomeGenBase.taiga);
	    
		biomes_cold.add(BiomeGenBase.plains);
	    biomes_cold.add(BiomeGenBase.extremeHills);
	    biomes_cold.add(BiomeGenBase.forest);
	    biomes_cold.add(BiomeGenBase.forestHills);
	    biomes_cold.add(BiomeGenBase.taigaHills);
	    biomes_cold.add(BiomeGenBase.extremeHillsEdge);

		biomes_hot.add(BiomeGenBase.desert);
	    biomes_hot.add(BiomeGenBase.desertHills);

	    biomes_wet.add(BiomeGenBase.swampland);
	    biomes_wet.add(BiomeGenBase.jungle);
	    biomes_wet.add(BiomeGenBase.jungleHills);
	}
}
