// Date: 02/04/2012 2:33:37 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.bioxx.tfc.Render.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBear extends ModelBase {
    // fields
    private ModelRenderer neck;
    private ModelRenderer bearHead;
    private ModelRenderer body;
    private ModelRenderer mainBody;
    private ModelRenderer leg1;
    private ModelRenderer leg2;
    private ModelRenderer leg3;
    private ModelRenderer leg4;
    private ModelRenderer tail;
    private ModelRenderer ear1;
    private ModelRenderer ear2;
    private ModelRenderer nose;

    public ModelBear() {
        textureWidth = 128;
        textureHeight = 64;

        neck = new ModelRenderer(this, 0, 29);
        neck.addBox(0F, 0F, 0F, 4, 5, 8);
        neck.setRotationPoint(-3F, 12F, -10F);
        neck.setTextureSize(128, 64);
        neck.mirror = true;
        setRotation(neck, 0.3839724F, 0F, 0F);
        bearHead = new ModelRenderer(this, 0, 0);
        bearHead.addBox(-3F, -3F, -2F, 6, 6, 4);
        bearHead.setRotationPoint(-1F, 13.5F, -10F);
        bearHead.setTextureSize(128, 64);
        bearHead.mirror = true;
        setRotation(bearHead, 0F, 0F, 0F);
        body = new ModelRenderer(this, 24, 18);
        body.addBox(-4F, -2F, -3F, 6, 7, 7);
        body.setRotationPoint(0F, 14F, 4F);
        body.setTextureSize(128, 64);
        body.mirror = true;
        setRotation(body, 1.308997F, 0F, 0F);
        mainBody = new ModelRenderer(this, 24, 0);
        mainBody.addBox(-4F, -3F, -3F, 8, 10, 8);
        mainBody.setRotationPoint(-1F, 14F, -3F);
        mainBody.setTextureSize(128, 64);
        mainBody.mirror = true;
        setRotation(mainBody, 1.570796F, 0F, 0F);
        leg1 = new ModelRenderer(this, 0, 18);
        leg1.addBox(-1F, 0F, -1F, 2, 8, 3);
        leg1.setRotationPoint(-2.966667F, 16F, 6F);
        leg1.setTextureSize(128, 64);
        leg1.mirror = true;
        setRotation(leg1, 0F, 0F, 0F);
        leg2 = new ModelRenderer(this, 0, 18);
        leg2.addBox(-0.4666667F, 0F, -1F, 2, 8, 3);
        leg2.setRotationPoint(0.5F, 16F, 6F);
        leg2.setTextureSize(128, 64);
        leg2.mirror = true;
        setRotation(leg2, 0F, 0F, 0F);
        leg3 = new ModelRenderer(this, 0, 18);
        leg3.addBox(-1F, 0F, -1F, 2, 8, 3);
        leg3.setRotationPoint(-3.5F, 16F, -4F);
        leg3.setTextureSize(128, 64);
        leg3.mirror = true;
        setRotation(leg3, 0F, 0F, 0F);
        leg4 = new ModelRenderer(this, 0, 18);
        leg4.addBox(-1F, 0F, -1F, 2, 8, 3);
        leg4.setRotationPoint(1.5F, 16F, -4F);
        leg4.setTextureSize(128, 64);
        leg4.mirror = true;
        setRotation(leg4, 0F, 0F, 0F);
        tail = new ModelRenderer(this, 10, 18);
        tail.addBox(-1F, 0F, -1F, 2, 2, 2);
        tail.setRotationPoint(-1F, 13F, 9F);
        tail.setTextureSize(128, 64);
        tail.mirror = true;
        setRotation(tail, 1.130069F, 0F, 0F);
        ear1 = new ModelRenderer(this, 16, 14);
        ear1.addBox(-3F, -5F, 0F, 2, 2, 1);
        ear1.setRotationPoint(-1F, 13.5F, -10F);
        ear1.setTextureSize(128, 64);
        ear1.mirror = true;
        setRotation(ear1, 0F, 0F, 0F);
        ear2 = new ModelRenderer(this, 16, 14);
        ear2.addBox(1F, -5F, 0F, 2, 2, 1);
        ear2.setRotationPoint(-1F, 13.5F, -10F);
        ear2.setTextureSize(128, 64);
        ear2.mirror = true;
        setRotation(ear2, 0F, 0F, 0F);
        nose = new ModelRenderer(this, 0, 10);
        nose.addBox(-1.5F, 0F, -4F, 3, 3, 4);
        nose.setRotationPoint(-1.0F, 13.5F, -10F);
        nose.setTextureSize(128, 64);
        nose.mirror = true;
        setRotation(nose, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        float age = 1;
        // long tempAge = 0;
        // int sex = 0;
        /*if (entity instanceof EntityAnimalTFC)
        {
        	tempAge = Math.min(TFC_Time.getTotalTicks()-((EntityAnimalTFC)entity).adultTime,0);
        	if(tempAge < 0){
        		age = (-1F)*tempAge / (((EntityAnimalTFC)entity).adultAge * TFC_Settings.dayLength);
        		//System.out.print("completed; "+age+", "+tempAge);
        	}
        	sex = ((EntityAnimalTFC)entity).sex;
        }*/

        if (isChild) {
            float aa = 2F - (1.0F - age);
            GL11.glPushMatrix();
            float ab = (float) Math.sqrt(1.0F / aa);
            GL11.glScalef(ab, ab, ab);
            GL11.glTranslatef(0.0F, 24F * f5 * age / aa, 2F * f5 * age / ab);
            ear1.render(f5);
            ear2.render(f5);
            nose.render(f5);
            bearHead.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / aa, 1.0F / aa, 1.0F / aa);
            GL11.glTranslatef(0.0F, 24F * f5 * age, 0.0F);
            body.render(f5);
            mainBody.render(f5);
            leg1.render(f5);
            leg2.render(f5);
            leg3.render(f5);
            leg4.render(f5);
            neck.render(f5);
            tail.render(f5);
            GL11.glPopMatrix();
        } else {
            ear1.render(f5);
            ear2.render(f5);
            nose.render(f5);
            bearHead.render(f5);
            body.render(f5);
            mainBody.render(f5);
            leg1.render(f5);
            leg2.render(f5);
            leg3.render(f5);
            leg4.render(f5);
            neck.render(f5);
            tail.render(f5);
        }
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        bearHead.rotateAngleX = f4 / (180F / (float) Math.PI);
        bearHead.rotateAngleY = f3 / (180F / (float) Math.PI);

        ear1.rotateAngleX = f4 / (180F / (float) Math.PI);
        ear1.rotateAngleY = f3 / (180F / (float) Math.PI);

        ear2.rotateAngleX = f4 / (180F / (float) Math.PI);
        ear2.rotateAngleY = f3 / (180F / (float) Math.PI);

        nose.rotateAngleX = f4 / (180F / (float) Math.PI);
        nose.rotateAngleY = f3 / (180F / (float) Math.PI);

        // MainBody.rotateAngleX = ((float) Math.PI / 2F);
        leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
        leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
        leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    }
}
