package mods.Purgatory;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPurgatoryStone extends Block
{
    public BlockPurgatoryStone(int par1)
    {
        super(par1, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Block.cobblestone.blockID;
    }
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.blockIcon = par1IconRegister.registerIcon("Purgatory:PurgatoryStone");
    }
}
