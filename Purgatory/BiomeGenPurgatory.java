package mods.Purgatory;
import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
public class BiomeGenPurgatory extends BiomeGenBase
{
private WorldGenerator WorldGenPurgatoryTree;
private Object worldGeneratorPurgatoryBigTree;
public final Material blockMaterial;
public BiomeGenPurgatory(int par1)
{
super(par1);
this.blockMaterial = Material.water;
this.minHeight = 0.1F;
this.maxHeight = 0.6F;
this.spawnableMonsterList.clear();
this.spawnableCreatureList.clear();
this.topBlock = ((byte)Main.PurgatoryGrass.blockID);
this.fillerBlock = ((byte)Main.PurgatoryDirt.blockID);
this.setBiomeName("Purgatory");


/** this changes the water colour, its set to red now but ggole the java colours **/
this.waterColorMultiplier = 0x323232;
}

/**
* Gets a WorldGen appropriate for this biome.
*/
public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
{
	return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.worldGeneratorForest : (par1Random.nextInt(10) == 0 ? this.worldGeneratorForest : this.worldGeneratorTrees));
}
}