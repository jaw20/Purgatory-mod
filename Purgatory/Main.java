package mods.Purgatory;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
@Mod(modid="Purgatory", name="Purgatory", version="1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Main {
	/** Dimension ID **/
	public static int DimID = 2;
	/** Blocks **/
	public static BlockPurgatoryFire PurgatoryFire = (BlockPurgatoryFire) new BlockPurgatoryFire(2008).setUnlocalizedName("Purgatory:Purgatoryfire_0");
	public static BlockPurgatoryPortal PurgatoryPortal  = (BlockPurgatoryPortal) new BlockPurgatoryPortal(2009).setUnlocalizedName("Purgatory:PurgatoryPortal");
	public static Block PurgatoryGrass = new BlockPurgatoryGrass(200).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("Purgatory:Purgatorygrass_side");
	public static Block PurgatoryDirt = new BlockPurgatoryDirt(201).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("Purgatory:PurgatoryDirt");
	public static Block PurgatoryStone = new BlockPurgatoryStone(202).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Purgatory:PurgatoryStone");
	public static Block PurgatoryLeaf = new BlockPurgatoryLeaf(1001).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("Purgatory:PurgatoryLeaf");
	public static Block PurgatoryLog = new BlockPurgatoryLog(1002).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("Purgatory:PurgatoryTreeSide");
	public static Block PurgatorySapling = new BlockPurgatorySapling(1003, 0).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("Purgatory:PurgatorySapling");
	/** Items **/
	public static Item PurgatoryFlintAndSteel = new ItemPurgatoryFlintAndSteel(3047).setUnlocalizedName("Purgatory:PurgatoryFlintAndSteel");
	public static Item PurgatoryPortalPlacer = new ItemPortalPlacer(3048).setUnlocalizedName("Purgatory:PurgatoryPortalPlacer");
	/** Biome's **/
	public static final BiomeGenBase PurgatoryBiome = new BiomeGenPurgatory(25);
	@Mod.Init
	public void load(FMLInitializationEvent event)
	{
		/** Register Blocks **/
		GameRegistry.registerBlock(PurgatoryFire, "PurgatoryFire");
		GameRegistry.registerBlock(PurgatoryPortal, "PurgatoryPortal");
		GameRegistry.registerBlock(PurgatoryGrass, "PurgatoryGrass");
		GameRegistry.registerBlock(PurgatoryDirt, "PurgatoryDirt");
		GameRegistry.registerBlock(PurgatoryStone, "PurgatoryStone");
		GameRegistry.registerBlock(PurgatoryLeaf, "PurgatoryLeaf");
		GameRegistry.registerBlock(PurgatoryLog, "PurgatoryLog");
		GameRegistry.registerBlock(PurgatorySapling, "PurgatorySapling");
		/** Register Items **/
		GameRegistry.registerItem(PurgatoryFlintAndSteel, "PurgatoryFlintAndSteel");
		GameRegistry.registerItem(PurgatoryPortalPlacer, "PurgatoryPortalPlacer");
		/** Add In-Game Names **/
		LanguageRegistry.addName(PurgatoryGrass, "Purgatory Grass");
		LanguageRegistry.addName(PurgatoryDirt, "Purgatory Dirt");
		LanguageRegistry.addName(PurgatoryStone, "Purgatory Stone");
		LanguageRegistry.addName(PurgatoryFire, "Purgatory Fire");
		LanguageRegistry.addName(PurgatoryPortal, "Purgatory Portal");
		LanguageRegistry.addName(PurgatoryFlintAndSteel, "Purgatory Lighter");
		LanguageRegistry.addName(PurgatoryPortalPlacer, "Portal Placer");
		LanguageRegistry.addName(PurgatoryLeaf, "Purgatory Leaf");
		LanguageRegistry.addName(PurgatoryLog, "Purgatory Log");
		LanguageRegistry.addName(PurgatorySapling, "Purgatory Sapling");
		/**Register WorldProvider for Dimension **/
		DimensionManager.registerProviderType(DimID, WorldProviderPurgatory.class, true);
		//DimensionManager.registerProviderType(MainConfig.DimID, WorldProviderPurgatoryTest.class, true);
		DimensionManager.registerDimension(DimID, DimID);
		GameRegistry.registerWorldGenerator(new WorldGenPurgatoryTree(false));
		/** Event's **/
		MinecraftForge.EVENT_BUS.register(new PurgatoryEventClass());
	}
}