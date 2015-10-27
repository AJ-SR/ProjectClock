package ajsr.ProjectClock.entity;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderSpaceCow extends RenderLiving{

	public static final ResourceLocation texture = new ResourceLocation("pc:textures/entities/space_cow.png");
	
	public RenderSpaceCow()
	{
		super(renderManager, new ModelSpaceCow(), 0.75f);

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		
		return texture;
	}
	protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_)
    {
		float scale = 1.2f;
        GL11.glScalef(scale, scale, scale);
    }
}
