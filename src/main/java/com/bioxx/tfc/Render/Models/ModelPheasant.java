// Date: 29/12/2013 11:39:01 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package com.bioxx.tfc.Render.Models;

import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.api.Entities.IAnimal;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelPheasant extends ModelBase {
    // fields
    private ModelRenderer body;
    private ModelRenderer tail;
    private ModelRenderer leftLeg;
    private ModelRenderer rightLeg;
    private ModelRenderer tailFeather;
    private ModelRenderer leftLowerLeg;
    private ModelRenderer rightLowerLeg;
    private ModelRenderer neck;
    private ModelRenderer head;
    private ModelRenderer beak;
    private ModelRenderer chest;
    private ModelRenderer leftWing;
    private ModelRenderer rightWing;
    private ModelRenderer leftFoot;
    private ModelRenderer rightFoot;

    public ModelPheasant() {
        textureWidth = 64;
        textureHeight = 32;

        body = new ModelRenderer(this, 0, 7);
        body.addBox(-4F, 0F, -2.5F, 9, 6, 5);
        body.setRotationPoint(0F, 12F, 0F);
        body.mirror = true;
        setRotation(body, 0F, 0F, -0.5235988F);

        tail = new ModelRenderer(this, 0, 0);
        tail.addBox(-7F, 2F, -2F, 6, 3, 4);
        tail.setRotationPoint(0F, 12F, 0F);
        tail.mirror = true;
        setRotation(tail, 0F, 0F, -0.1745329F);

        leftLeg = new ModelRenderer(this, 16, 24);
        leftLeg.addBox(1F, 4F, 1F, 3, 4, 2);
        leftLeg.setRotationPoint(0F, 12F, 0F);
        leftLeg.mirror = true;
        setRotation(leftLeg, 0F, 0F, 0.3490659F);

        rightLeg = new ModelRenderer(this, 26, 24);
        rightLeg.addBox(1F, 4F, -3F, 3, 4, 2);
        rightLeg.setRotationPoint(0F, 12F, 0F);
        rightLeg.mirror = true;
        setRotation(rightLeg, 0F, 0F, 0.3490659F);

        tailFeather = new ModelRenderer(this, 20, 0);
        tailFeather.addBox(-14.96F, 3F, -1F, 9, 1, 2);
        tailFeather.setRotationPoint(0F, 12F, 0F);
        tailFeather.mirror = true;
        setRotation(tailFeather, 0F, 0F, -0.0872665F);

        leftLowerLeg = new ModelRenderer(this, 34, 19);
        leftLowerLeg.addBox(-1F, 8F, 1.5F, 1, 4, 1);
        leftLowerLeg.setRotationPoint(0F, 0F, 0F);
        leftLowerLeg.mirror = true;
        setRotation(leftLowerLeg, 0F, 0F, 0F);

        rightLowerLeg = new ModelRenderer(this, 38, 19);
        rightLowerLeg.addBox(-1F, 8F, -2.5F, 1, 4, 1);
        rightLowerLeg.setRotationPoint(0F, 0F, 0F);
        rightLowerLeg.mirror = true;
        setRotation(rightLowerLeg, 0F, 0F, 0F);

        neck = new ModelRenderer(this, 28, 13);
        neck.addBox(4F, 2F, -1.5F, 4, 3, 3, 0.05F);
        neck.setRotationPoint(-4F, 2F, 0F);
        neck.mirror = true;
        setRotation(neck, 0F, 0F, -0.8726646F);

        head = new ModelRenderer(this, 16, 18);
        head.addBox(2.5F, -3F, -1.5F, 3, 3, 3, 0.1F);
        head.setRotationPoint(4F, 10F, 0F);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);

        beak = new ModelRenderer(this, 28, 19);
        beak.addBox(5F, -2F, -0.5F, 2, 1, 1);
        beak.setRotationPoint(4F, 10F, 0F);
        beak.mirror = true;
        setRotation(beak, 0F, 0F, 0F);

        chest = new ModelRenderer(this, 28, 7);
        chest.addBox(-1F, 4.5F, -1.5F, 4, 3, 3);
        chest.setRotationPoint(-4F, 2F, 0F);
        chest.mirror = true;
        setRotation(chest, 0F, 0F, -1.396263F);

        leftWing = new ModelRenderer(this, 0, 23);
        leftWing.addBox(-3F, 1F, 2.5F, 7, 4, 1);
        leftWing.setRotationPoint(0F, 12F, 0F);
        leftWing.mirror = true;
        setRotation(leftWing, 0F, 0F, -0.5235988F);

        rightWing = new ModelRenderer(this, 0, 18);
        rightWing.addBox(-3F, 1F, -3.5F, 7, 4, 1);
        rightWing.setRotationPoint(0F, 12F, 0F);
        rightWing.mirror = true;
        setRotation(rightWing, 0F, 0F, -0.5235988F);

        leftFoot = new ModelRenderer(this, 20, 3);
        leftFoot.addBox(-2F, 11.9F, 0.5F, 4, 0, 3, 0.001F);
        leftFoot.setRotationPoint(0F, 0F, 0F);
        leftFoot.mirror = true;
        setRotation(leftFoot, 0F, 0F, 0F);

        rightFoot = new ModelRenderer(this, 20, 3);
        rightFoot.addBox(-2F, 11.9F, -3.5F, 4, 0, 3, 0.001F);
        rightFoot.setRotationPoint(0F, 0F, 0F);
        rightFoot.mirror = true;
        setRotation(rightFoot, 0F, 0F, 0F);

        head.addChild(neck);
        head.addChild(chest);

        rightLeg.addChild(rightLowerLeg);
        rightLowerLeg.addChild(rightFoot);
        leftLeg.addChild(leftLowerLeg);
        leftLowerLeg.addChild(leftFoot);
    }

    @Override
    public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7);
        float percent = Math.max(TFC_Core.getPercentGrown((IAnimal) entity), 0);
        float ageScale = 2.0F - percent;
        // float offset = 1.4f - percent;

        GL11.glPushMatrix();

        GL11.glTranslatef(0.0F, 0.75f - (0.75f * percent), 0f);
        GL11.glScalef(1 / ageScale, 1 / ageScale, 1 / ageScale);

        this.head.render(par7);
        this.beak.render(par7);
        // this.Neck.render(par7);
        // this.Chest.render(par7);

        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 0.75f - (0.75f * percent), 0f);
        GL11.glScalef(1 / ageScale, 1 / ageScale, 1 / ageScale);
        this.body.render(par7);
        this.rightLeg.render(par7);
        this.leftLeg.render(par7);
        // this.RightLowerLeg.render(par7);
        // this.LeftLowerLeg.render(par7);
        this.rightWing.render(par7);
        this.leftWing.render(par7);
        // this.LeftFoot.render(par7);
        // this.RightFoot.render(par7);
        this.tail.render(par7);
        this.tailFeather.render(par7);
        GL11.glPopMatrix();
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
        // this.Head.rotateAngleZ = -(par5 / (180F / (float)Math.PI));
        this.head.rotateAngleY = par4 / (180F / (float) Math.PI);
        // this.Beak.rotateAngleZ = this.Head.rotateAngleZ;
        this.beak.rotateAngleY = this.head.rotateAngleY;
        // this.Neck.rotateAngleY = this.Head.rotateAngleY;
        // this.Chest.rotateAngleY = this.Head.rotateAngleY;
        this.neck.rotateAngleZ = -(5 * (float) (Math.PI / 18F));
        this.chest.rotateAngleZ = -(8 * (float) (Math.PI / 18F));
        this.body.rotateAngleZ = -((float) (Math.PI / 6F));
        this.rightWing.rotateAngleZ = -((float) (Math.PI / 6F));
        this.leftWing.rotateAngleZ = -((float) (Math.PI / 6F));
        if (par3 != 0) {
            rightWing.setRotationPoint(4, 12, -2);
            leftWing.setRotationPoint(4, 12, 2);
            rightWing.rotateAngleZ = -(float) (Math.PI / 2F);
            leftWing.rotateAngleZ = -(float) (Math.PI / 2F);
            rightWing.offsetX = -3F / 16F;
            rightWing.offsetY = -3F / 16F;
            rightWing.offsetZ = -1.5F / 16F;
            leftWing.offsetX = -3F / 16F;
            leftWing.offsetY = -3F / 16F;
            leftWing.offsetZ = 1.5F / 16F;
        } else {
            rightWing.setRotationPoint(0, 12, 0);
            leftWing.setRotationPoint(0, 12, 0);
            rightWing.offsetX = 0;
            rightWing.offsetY = 0;
            rightWing.offsetZ = 0;
            leftWing.offsetX = 0;
            leftWing.offsetY = 0;
            leftWing.offsetZ = 0;
        }
        this.rightWing.rotateAngleY = par3;
        this.leftWing.rotateAngleY = -par3;

        this.tail.rotateAngleZ = -((float) (Math.PI / 18F));
        this.tailFeather.rotateAngleZ = -((float) (Math.PI / 36F));
        this.rightLeg.rotateAngleZ = ((float) (Math.PI / 9F)) + MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
        this.leftLeg.rotateAngleZ =
                ((float) (Math.PI / 9F)) + MathHelper.cos(par1 * 0.6662F + (float) Math.PI) * 1.4F * par2;
        this.rightLowerLeg.rotateAngleZ = -((float) (Math.PI / 9F));
        this.leftLowerLeg.rotateAngleZ = -((float) (Math.PI / 9F));
        this.rightFoot.rotateAngleZ = 0;
        this.leftFoot.rotateAngleZ = 0;
    }
}
