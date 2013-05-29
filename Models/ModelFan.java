/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 21/02/2013 3:17:13 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.List;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;


public class ModelFan extends RotaryModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape3;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape18;
    ModelRenderer Shape17;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer Shape21;
    ModelRenderer Shape4;
    ModelRenderer Shape2;
  
  public ModelFan()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 0, 22);
      Shape1.addBox(0F, 0F, 0F, 16, 1, 3);
      Shape1.setRotationPoint(-8F, 22F, -6F);
      Shape1.setTextureSize(128, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(0F, 0F, 0F, 16, 1, 16);
      Shape5.setRotationPoint(-8F, 23F, -8F);
      Shape5.setTextureSize(128, 128);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 64, 24);
      Shape6.addBox(0F, 0F, 0F, 14, 14, 2);
      Shape6.setRotationPoint(-7F, 9F, 6F);
      Shape6.setTextureSize(128, 128);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 114, 0);
      Shape7.addBox(0F, 0F, 0F, 2, 12, 3);
      Shape7.setRotationPoint(6F, 10F, -6F);
      Shape7.setTextureSize(128, 128);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 0, 17);
      Shape8.addBox(0F, 0F, 0F, 16, 2, 3);
      Shape8.setRotationPoint(-8F, 8F, -6F);
      Shape8.setTextureSize(128, 128);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 114, 0);
      Shape9.addBox(0F, 0F, 0F, 2, 12, 3);
      Shape9.setRotationPoint(-8F, 10F, -6F);
      Shape9.setTextureSize(128, 128);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 47);
      Shape3.addBox(0F, 0F, 0F, 3, 1, 1);
      Shape3.setRotationPoint(-4F, 18.5F, -4.5F);
      Shape3.setTextureSize(128, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 0, 32);
      Shape10.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape10.setRotationPoint(-1F, 15F, -5F);
      Shape10.setTextureSize(128, 128);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 0, 49);
      Shape11.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape11.setRotationPoint(2.5F, 17F, -4.5F);
      Shape11.setTextureSize(128, 128);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 0, 47);
      Shape12.addBox(0F, 0F, 0F, 3, 1, 1);
      Shape12.setRotationPoint(1F, 12.5F, -4.5F);
      Shape12.setTextureSize(128, 128);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape13 = new ModelRenderer(this, 0, 49);
      Shape13.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape13.setRotationPoint(-3.5F, 12F, -4.5F);
      Shape13.setTextureSize(128, 128);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 0, 45);
      Shape14.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape14.setRotationPoint(3F, 15.5F, -4.5F);
      Shape14.setTextureSize(128, 128);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0F);
      Shape15 = new ModelRenderer(this, 0, 42);
      Shape15.addBox(0F, 0F, 0F, 1, 2, 1);
      Shape15.setRotationPoint(-0.5F, 19F, -4.5F);
      Shape15.setTextureSize(128, 128);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0F);
      Shape16 = new ModelRenderer(this, 0, 36);
      Shape16.addBox(0F, 0F, 0F, 2, 5, 1);
      Shape16.setRotationPoint(0.5F, 16F, -4.5F);
      Shape16.setTextureSize(128, 128);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, 0F);
      Shape18 = new ModelRenderer(this, 0, 29);
      Shape18.addBox(0F, 0F, 0F, 5, 2, 1);
      Shape18.setRotationPoint(0F, 13.5F, -4.5F);
      Shape18.setTextureSize(128, 128);
      Shape18.mirror = true;
      setRotation(Shape18, 0F, 0F, 0F);
      Shape17 = new ModelRenderer(this, 0, 29);
      Shape17.addBox(0F, 0F, 0F, 5, 2, 1);
      Shape17.setRotationPoint(-5F, 16.5F, -4.5F);
      Shape17.setTextureSize(128, 128);
      Shape17.mirror = true;
      setRotation(Shape17, 0F, 0F, 0F);
      Shape19 = new ModelRenderer(this, 0, 45);
      Shape19.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape19.setRotationPoint(-5F, 15.5F, -4.5F);
      Shape19.setTextureSize(128, 128);
      Shape19.mirror = true;
      setRotation(Shape19, 0F, 0F, 0F);
      Shape20 = new ModelRenderer(this, 0, 36);
      Shape20.addBox(0F, 0F, 0F, 2, 5, 1);
      Shape20.setRotationPoint(-2.5F, 11F, -4.5F);
      Shape20.setTextureSize(128, 128);
      Shape20.mirror = true;
      setRotation(Shape20, 0F, 0F, 0F);
      Shape21 = new ModelRenderer(this, 0, 42);
      Shape21.addBox(0F, 0F, 0F, 1, 2, 1);
      Shape21.setRotationPoint(-0.5F, 11F, -4.5F);
      Shape21.setTextureSize(128, 128);
      Shape21.mirror = true;
      setRotation(Shape21, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 97, 25);
      Shape4.addBox(0F, 0F, 0F, 12, 12, 1);
      Shape4.setRotationPoint(-6F, 10F, -6F);
      Shape4.setTextureSize(128, 128);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 64, 0);
      Shape2.addBox(0F, 0F, 0F, 16, 15, 9);
      Shape2.setRotationPoint(-8F, 8F, -3F);
      Shape2.setTextureSize(128, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
  }
  
  public void renderAll(List li, float phi) {
	    Shape1.render(f5);
	    Shape5.render(f5);
	    Shape6.render(f5);
	    Shape7.render(f5);
	    Shape8.render(f5);
	    Shape9.render(f5);
	    Shape3.render(f5);
	    Shape4.render(f5);
	    Shape2.render(f5);
	    GL11.glTranslated(0, 1, 0);
	    GL11.glRotatef(phi, 0, 0, 1);
	    GL11.glTranslated(0, -1, 0);
	    Shape10.render(f5);
	    Shape11.render(f5);
	    Shape12.render(f5);
	    Shape13.render(f5);
	    Shape14.render(f5);
	    Shape15.render(f5);
	    Shape16.render(f5);
	    Shape18.render(f5);
	    Shape17.render(f5);
	    Shape19.render(f5);
	    Shape20.render(f5);
	    Shape21.render(f5);
	    GL11.glTranslated(0, 1, 0);
	    GL11.glRotatef(-phi, 0, 0, 1);
	    GL11.glTranslated(0, -1, 0);
	  }

}
