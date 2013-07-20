package mods.Purgatory;
import java.awt.Event;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
public class PurgatoryEventClass 
{
private int BlockID;
/** Used to make the sapling grow the tree **/
@ForgeSubscribe
public void bonemealUsed(BonemealEvent event)
{
if(event.world.getBlockId(event.X, event.Y, event.Z) == Main.PurgatorySapling.blockID)
{
((BlockPurgatorySapling)Main.PurgatorySapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
}
}
}