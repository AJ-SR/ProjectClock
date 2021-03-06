package ajsr.ProjectClock.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 5.0.0
 */
public class ModelSpaceCow extends ModelBase {
    public ModelRenderer field_78148_b0;
    public ModelRenderer field_78148_b1;
    public ModelRenderer field_78146_d;
    public ModelRenderer field_78144_f;
    public ModelRenderer field_78149_c;
    public ModelRenderer field_78147_e;
    public ModelRenderer field_78150_a0;
    public ModelRenderer field_78150_a1;
    public ModelRenderer field_78150_a2;
    public ModelRenderer shape10;

    public ModelSpaceCow() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.field_78144_f = new ModelRenderer(this, 0, 14);
        this.field_78144_f.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.field_78144_f.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_78144_f, 0.41643555952584704F, 0.0F, 0.0F);
        this.field_78150_a0 = new ModelRenderer(this, 0, 1);
        this.field_78150_a0.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.field_78150_a0.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
        this.shape10 = new ModelRenderer(this, 0, 32);
        this.shape10.setRotationPoint(-5.0F, -0.7F, -15.1F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 10, 10, 8, 0.0F);
        this.field_78149_c = new ModelRenderer(this, 0, 14);
        this.field_78149_c.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.field_78149_c.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_78149_c, 0.41643555952584704F, 0.0F, 0.0F);
        this.field_78150_a1 = new ModelRenderer(this, 22, 0);
        this.field_78150_a1.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.field_78150_a1.addBox(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.field_78148_b1 = new ModelRenderer(this, 52, 6);
        this.field_78148_b1.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.field_78148_b1.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(field_78148_b1, 1.5707963267948966F, 0.0F, 0.0F);
        this.field_78148_b0 = new ModelRenderer(this, 17, 4);
        this.field_78148_b0.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.field_78148_b0.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(field_78148_b0, 1.5707963267948966F, 0.0F, 0.0F);
        this.field_78150_a2 = new ModelRenderer(this, 22, 0);
        this.field_78150_a2.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.field_78150_a2.addBox(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.field_78146_d = new ModelRenderer(this, 0, 14);
        this.field_78146_d.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.field_78146_d.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_78146_d, -0.41643555952584704F, 0.0F, 0.0F);
        this.field_78147_e = new ModelRenderer(this, 0, 14);
        this.field_78147_e.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.field_78147_e.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_78147_e, -0.41643555952584704F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78144_f.render(f5);
        this.field_78150_a0.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape10.offsetX, this.shape10.offsetY, this.shape10.offsetZ);
        GlStateManager.translate(this.shape10.rotationPointX * f5, this.shape10.rotationPointY * f5, this.shape10.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.9D);
        GlStateManager.translate(-this.shape10.offsetX, -this.shape10.offsetY, -this.shape10.offsetZ);
        GlStateManager.translate(-this.shape10.rotationPointX * f5, -this.shape10.rotationPointY * f5, -this.shape10.rotationPointZ * f5);
        this.shape10.render(f5);
        GlStateManager.popMatrix();
        this.field_78149_c.render(f5);
        this.field_78150_a1.render(f5);
        this.field_78148_b1.render(f5);
        this.field_78148_b0.render(f5);
        this.field_78150_a2.render(f5);
        this.field_78146_d.render(f5);
        this.field_78147_e.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
