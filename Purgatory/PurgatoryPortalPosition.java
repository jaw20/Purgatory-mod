package mods.Purgatory;
import net.minecraft.util.ChunkCoordinates;
public class PurgatoryPortalPosition extends ChunkCoordinates
{
	public long field_85087_d;
	final PurgatoryTeleporter field_85088_e;
	public PurgatoryPortalPosition(PurgatoryTeleporter purgatoryTeleporter, int par2, int par3, int par4, long par5)
	{
		super(par2, par3, par4);
		this.field_85088_e = purgatoryTeleporter;
		this.field_85087_d = par5;
	}
}