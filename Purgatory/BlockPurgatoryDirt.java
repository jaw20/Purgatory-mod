package mods.Purgatory;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPurgatoryDirt extends Block
{
    protected BlockPurgatoryDirt(int par1)
    {
        super(par1, Material.ground);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.blockIcon = par1IconRegister.registerIcon("Purgatory:PurgatoryDirt");
    }
}
