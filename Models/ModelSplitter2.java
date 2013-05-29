/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 06/03/2013 11:51:37 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.List;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;


public class ModelSplitter2 extends RotaryModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape3;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer Shape21;
    ModelRenderer Shape22;
    ModelRenderer Shape23;
    ModelRenderer Shape2;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape3a;
    ModelRenderer Shape7a;
    ModelRenderer Shape13a;
    ModelRenderer Shape17a;
    ModelRenderer Shape21a;
    ModelRenderer Shape16a;
    ModelRenderer Shape20a;
    ModelRenderer Shape4;
    ModelRenderer Shape4a;
    ModelRenderer Shape5;
    ModelRenderer Shape12a;
    ModelRenderer Shape12b;
  
  public ModelSplitter2()
  {
    textureWidth = 128;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
      Shape1.setRotationPoint(-8F, 23F, -8F);
      Shape1.setTextureSize(128, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 64, 0);
      Shape3.addBox(0F, 0F, 0F, 1, 14, 16);
      Shape3.setRotationPoint(7F, 9F, -8F);
      Shape3.setTextureSize(128, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape3.mirror = false;
      Shape12 = new ModelRenderer(this, 0, 27);
      Shape12.addBox(0F, 0F, 0F, 6, 2, 2);
      Shape12.setRotationPoint(2.5F, 15F, -1F);
      Shape12.setTextureSize(128, 32);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape12.mirror = false;
      Shape13 = new ModelRenderer(this, 0, 27);
      Shape13.addBox(0F, 0F, 0F, 6, 2, 2);
      Shape13.setRotationPoint(2.5F, 16F, -1.4F);
      Shape13.setTextureSize(128, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 0.7853982F, 0F, 0F);
      Shape13.mirror = false;
      Shape14 = new ModelRenderer(this, 0, 24);
      Shape14.addBox(0F, 0F, 0F, 2, 2, 6);
      Shape14.setRotationPoint(-1F, 15F, 2.5F);
      Shape14.setTextureSize(128, 32);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0F);
      Shape15 = new ModelRenderer(this, 0, 24);
      Shape15.addBox(0F, 0F, 0F, 2, 2, 6);
      Shape15.setRotationPoint(0F, 14.5F, 2.5F);
      Shape15.setTextureSize(128, 32);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0.7853982F);
      Shape16 = new ModelRenderer(this, 118, 15);
      Shape16.addBox(0F, 0F, 0F, 1, 4, 4);
      Shape16.setRotationPoint(2F, 14F, -2F);
      Shape16.setTextureSize(128, 32);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, 0F);
      Shape17 = new ModelRenderer(this, 118, 15);
      Shape17.addBox(0F, 0F, 0F, 1, 4, 4);
      Shape17.setRotationPoint(2F, 16F, -2.8F);
      Shape17.setTextureSize(128, 32);
      Shape17.mirror = true;
      setRotation(Shape17, 0.7853982F, 0F, 0F);
      Shape18 = new ModelRenderer(this, 101, 7);
      Shape18.addBox(0F, 0F, 0F, 4, 4, 1);
      Shape18.setRotationPoint(-2F, 14F, 2F);
      Shape18.setTextureSize(128, 32);
      Shape18.mirror = true;
      setRotation(Shape18, 0F, 0F, 0F);
      Shape19 = new ModelRenderer(this, 101, 7);
      Shape19.addBox(0F, 0F, 0F, 4, 4, 1);
      Shape19.setRotationPoint(0F, 13.2F, 2F);
      Shape19.setTextureSize(128, 32);
      Shape19.mirror = true;
      setRotation(Shape19, 0F, 0F, 0.7853982F);
      Shape20 = new ModelRenderer(this, 107, 19);
      Shape20.addBox(0F, 0F, 0F, 1, 6, 6);
      Shape20.setRotationPoint(3F, 13F, -3F);
      Shape20.setTextureSize(128, 32);
      Shape20.mirror = true;
      setRotation(Shape20, 0F, 0F, 0F);
      Shape21 = new ModelRenderer(this, 107, 19);
      Shape21.addBox(0F, 0F, 0F, 1, 6, 6);
      Shape21.setRotationPoint(3F, 16F, -4.2F);
      Shape21.setTextureSize(128, 32);
      Shape21.mirror = true;
      setRotation(Shape21, 0.7853982F, 0F, 0F);
      Shape22 = new ModelRenderer(this, 101, 7);
      Shape22.addBox(0F, 0F, 0F, 6, 6, 1);
      Shape22.setRotationPoint(-3F, 13F, 3F);
      Shape22.setTextureSize(128, 32);
      Shape22.mirror = true;
      setRotation(Shape22, 0F, 0F, 0F);
      Shape23 = new ModelRenderer(this, 101, 7);
      Shape23.addBox(0F, 0F, 0F, 6, 6, 1);
      Shape23.setRotationPoint(0F, 11.7F, 3F);
      Shape23.setTextureSize(128, 32);
      Shape23.mirror = true;
      setRotation(Shape23, 0F, 0F, 0.7853982F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 14, 14, 1);
      Shape2.setRotationPoint(-7F, 9F, 7F);
      Shape2.setTextureSize(128, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(0F, 0F, 0F, 16, 1, 1);
      Shape6.setRotationPoint(-8F, 8F, -8F);
      Shape6.setTextureSize(128, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape7.setRotationPoint(7F, 8F, 7F);
      Shape7.setTextureSize(128, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape3a = new ModelRenderer(this, 64, 0);
      Shape3a.addBox(0F, 0F, 0F, 1, 14, 16);
      Shape3a.setRotationPoint(-8F, 9F, -8F);
      Shape3a.setTextureSize(128, 32);
      Shape3a.mirror = true;
      setRotation(Shape3a, 0F, 0F, 0F);
      Shape7a = new ModelRenderer(this, 0, 0);
      Shape7a.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape7a.setRotationPoint(-8F, 8F, 7F);
      Shape7a.setTextureSize(128, 32);
      Shape7a.mirror = true;
      setRotation(Shape7a, 0F, 0F, 0F);
      Shape13a = new ModelRenderer(this, 0, 27);
      Shape13a.addBox(0F, 0F, 0F, 6, 2, 2);
      Shape13a.setRotationPoint(-8.5F, 16F, -1.4F);
      Shape13a.setTextureSize(128, 32);
      Shape13a.mirror = true;
      setRotation(Shape13a, 0.7853982F, 0F, 0F);
      Shape17a = new ModelRenderer(this, 101, 7);
      Shape17a.addBox(0F, 0F, 0F, 1, 4, 4);
      Shape17a.setRotationPoint(-3F, 16F, -2.8F);
      Shape17a.setTextureSize(128, 32);
      Shape17a.mirror = true;
      setRotation(Shape17a, 0.7853982F, 0F, 0F);
      Shape21a = new ModelRenderer(this, 101, 7);
      Shape21a.addBox(0F, 0F, 0F, 1, 6, 6);
      Shape21a.setRotationPoint(-4F, 16F, -4.2F);
      Shape21a.setTextureSize(128, 32);
      Shape21a.mirror = true;
      setRotation(Shape21a, 0.7853982F, 0F, 0F);
      Shape16a = new ModelRenderer(this, 101, 7);
      Shape16a.addBox(0F, 0F, 0F, 1, 4, 4);
      Shape16a.setRotationPoint(-3F, 14F, -2F);
      Shape16a.setTextureSize(128, 32);
      Shape16a.mirror = true;
      setRotation(Shape16a, 0F, 0F, 0F);
      Shape20a = new ModelRenderer(this, 101, 7);
      Shape20a.addBox(0F, 0F, 0F, 1, 6, 6);
      Shape20a.setRotationPoint(-4F, 13F, -3F);
      Shape20a.setTextureSize(128, 32);
      Shape20a.mirror = true;
      setRotation(Shape20a, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 118, 0);
      Shape4.addBox(0F, 0F, 0F, 1, 9, 4);
      Shape4.setRotationPoint(-6F, 14F, -2F);
      Shape4.setTextureSize(128, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape4a = new ModelRenderer(this, 118, 0);
      Shape4a.addBox(0F, 0F, 0F, 1, 9, 4);
      Shape4a.setRotationPoint(5F, 14F, -2F);
      Shape4a.setTextureSize(128, 32);
      Shape4a.mirror = true;
      setRotation(Shape4a, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 18, 26);
      Shape5.addBox(0F, 0F, 0F, 10, 1, 4);
      Shape5.setRotationPoint(-5F, 22F, -2F);
      Shape5.setTextureSize(128, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape12a = new ModelRenderer(this, 0, 27);
      Shape12a.addBox(0F, 0F, 0F, 6, 2, 2);
      Shape12a.setRotationPoint(-8.5F, 15F, -1F);
      Shape12a.setTextureSize(128, 32);
      Shape12a.mirror = true;
      setRotation(Shape12a, 0F, 0F, 0F);
      Shape12b = new ModelRenderer(this, 0, 27);
      Shape12b.addBox(0F, 0F, 0F, 6, 2, 2);
      Shape12b.setRotationPoint(-8.5F, 15F, -1F);
      Shape12b.setTextureSize(128, 32);
      Shape12b.mirror = true;
      setRotation(Shape12b, 0F, 0F, 0F);
  }
  
  public void renderAll(List li, float phi)
  {
    Shape1.render(f5);
    Shape3.render(f5);
    
    GL11.glTranslated(0, 1, 0);
    GL11.glRotatef(-phi, 0, 0, 1);
    GL11.glTranslated(0, -1, 0);
    Shape23.render(f5);
    Shape22.render(f5);
    Shape19.render(f5);
    Shape18.render(f5);
    Shape15.render(f5);
    Shape14.render(f5);
    GL11.glTranslated(0, 1, 0);
    GL11.glRotatef(phi, 0, 0, 1);
    GL11.glTranslated(0, -1, 0);
    
    GL11.glTranslated(0, 1, 0);
    GL11.glRotatef(phi, 1, 0, 0);
    GL11.glTranslated(0, -1, 0);
    Shape20.render(f5);
    Shape21.render(f5);
    Shape17.render(f5);
    Shape16.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    GL11.glTranslated(0, 1, 0);
    GL11.glRotatef(-phi, 1, 0, 0);
    GL11.glTranslated(0, -1, 0);

    GL11.glTranslated(0, 1, 0);
    GL11.glRotatef(-phi, 1, 0, 0);
    GL11.glTranslated(0, -1, 0);
    Shape12a.render(f5);
    Shape12b.render(f5);
    Shape20a.render(f5);
    Shape16a.render(f5);
    Shape21a.render(f5);
    Shape17a.render(f5);
    Shape13a.render(f5);
    GL11.glTranslated(0, 1, 0);
    GL11.glRotatef(phi, 1, 0, 0);
    GL11.glTranslated(0, -1, 0);    

    Shape5.render(f5);
    Shape4a.render(f5);
    Shape4.render(f5);
    Shape7a.render(f5);
    Shape3a.render(f5);
    Shape7.render(f5);
    Shape6.render(f5);
    Shape2.render(f5);
  }

}
