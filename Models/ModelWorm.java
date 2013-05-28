/*******************************************************************************
 * @author Reika
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 26/03/2013 9:39:38 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.List;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;


public class ModelWorm extends RotaryModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape12a;
    ModelRenderer Shape12b;
    ModelRenderer Shape12c;
    ModelRenderer Shape12d;
    ModelRenderer Shape12e;
    ModelRenderer Shape12f;
    ModelRenderer Shape12g;
    ModelRenderer Shape12h;
    ModelRenderer Shape13a;
    ModelRenderer Shape13b;
    ModelRenderer Shape13c;
    ModelRenderer Shape13d;
    ModelRenderer Shape13e;
    ModelRenderer Shape13f;
    ModelRenderer Shape13g;
    ModelRenderer Shape13h;
    ModelRenderer Shape14;
    ModelRenderer Shape13aa;
    ModelRenderer Shape12aa;
    ModelRenderer Shape121;
    ModelRenderer Shape122;
    ModelRenderer Shape123;
    ModelRenderer Shape124;
    ModelRenderer Shape12a1;
    ModelRenderer Shape12a2;
    ModelRenderer Shape12a3;
    ModelRenderer Shape12a4;
    ModelRenderer Shape12a6;
    ModelRenderer Shape12a5;
    ModelRenderer Shape12a7;
    ModelRenderer Shape12a8;
    ModelRenderer Shape12a9;
    ModelRenderer Shape12a0;
    ModelRenderer Shape122a;
    ModelRenderer Shape122b;
    ModelRenderer Shape15a;
    ModelRenderer Shape15;
  
  public ModelWorm()
  {
    textureWidth = 128;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
      Shape1.setRotationPoint(-8F, 23F, -8F);
      Shape1.setTextureSize(128, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 64, 0);
      Shape2.addBox(0F, 0F, 0F, 1, 12, 16);
      Shape2.setRotationPoint(7F, 11F, -8F);
      Shape2.setTextureSize(128, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 64, 0);
      Shape3.addBox(0F, 0F, 0F, 1, 12, 16);
      Shape3.setRotationPoint(-8F, 11F, -8F);
      Shape3.setTextureSize(128, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 17);
      Shape4.addBox(0F, 0F, 0F, 14, 6, 1);
      Shape4.setRotationPoint(-7F, 17F, 7F);
      Shape4.setTextureSize(128, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 17);
      Shape5.addBox(0F, 0F, 0F, 14, 6, 1);
      Shape5.setRotationPoint(-7F, 17F, -8F);
      Shape5.setTextureSize(128, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 30, 17);
      Shape6.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape6.setRotationPoint(6F, 14F, 7F);
      Shape6.setTextureSize(128, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 30, 17);
      Shape7.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape7.setRotationPoint(6F, 14F, -8F);
      Shape7.setTextureSize(128, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 30, 17);
      Shape8.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape8.setRotationPoint(-7F, 14F, 7F);
      Shape8.setTextureSize(128, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 30, 17);
      Shape9.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape9.setRotationPoint(-7F, 14F, -8F);
      Shape9.setTextureSize(128, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 42, 17);
      Shape10.addBox(0F, 0F, 0F, 1, 3, 10);
      Shape10.setRotationPoint(7F, 8F, -5F);
      Shape10.setTextureSize(128, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 42, 17);
      Shape11.addBox(0F, 0F, 0F, 1, 3, 10);
      Shape11.setRotationPoint(-8F, 8F, -5F);
      Shape11.setTextureSize(128, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 100, 0);
      Shape12.addBox(-0.5F, -2F, -2F, 1, 4, 4);
      Shape12.setRotationPoint(-0.5F, 20F, 0F);
      Shape12.setTextureSize(128, 32);
      Shape12.mirror = true;
      setRotation(Shape12, -0.3926991F, 1.570796F, 0F);
      Shape13 = new ModelRenderer(this, 0, 27);
      Shape13.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape13.setRotationPoint(1.5F, 16F, 0F);
      Shape13.setTextureSize(128, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 2.181662F, 0F, 0F);
      Shape12a = new ModelRenderer(this, 0, 27);
      Shape12a.addBox(0F, -1F, -1F, 3, 2, 2);
      Shape12a.setRotationPoint(5.5F, 16F, 0F);
      Shape12a.setTextureSize(128, 32);
      Shape12a.mirror = true;
      setRotation(Shape12a, 0.7853982F, 0F, 0F);
      Shape12b = new ModelRenderer(this, 0, 27);
      Shape12b.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape12b.setRotationPoint(-5.5F, 16F, 0F);
      Shape12b.setTextureSize(128, 32);
      Shape12b.mirror = true;
      setRotation(Shape12b, 0.1745329F, 0F, 0F);
      Shape12c = new ModelRenderer(this, 0, 27);
      Shape12c.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape12c.setRotationPoint(-3.5F, 16F, 0F);
      Shape12c.setTextureSize(128, 32);
      Shape12c.mirror = true;
      setRotation(Shape12c, 0.5235988F, 0F, 0F);
      Shape12d = new ModelRenderer(this, 0, 27);
      Shape12d.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape12d.setRotationPoint(-4.5F, 16F, 0F);
      Shape12d.setTextureSize(128, 32);
      Shape12d.mirror = true;
      setRotation(Shape12d, 0.3490659F, 0F, 0F);
      Shape12e = new ModelRenderer(this, 0, 27);
      Shape12e.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape12e.setRotationPoint(1.5F, 16F, 0F);
      Shape12e.setTextureSize(128, 32);
      Shape12e.mirror = true;
      setRotation(Shape12e, 1.396263F, 0F, 0F);
      Shape12f = new ModelRenderer(this, 0, 27);
      Shape12f.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape12f.setRotationPoint(-0.5F, 16F, 0F);
      Shape12f.setTextureSize(128, 32);
      Shape12f.mirror = true;
      setRotation(Shape12f, 1.047198F, 0F, 0F);
      Shape12g = new ModelRenderer(this, 0, 27);
      Shape12g.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape12g.setRotationPoint(-2.5F, 16F, 0F);
      Shape12g.setTextureSize(128, 32);
      Shape12g.mirror = true;
      setRotation(Shape12g, 0.6981317F, 0F, 0F);
      Shape12h = new ModelRenderer(this, 0, 27);
      Shape12h.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape12h.setRotationPoint(0.5F, 16F, 0F);
      Shape12h.setTextureSize(128, 32);
      Shape12h.mirror = true;
      setRotation(Shape12h, 1.22173F, 0F, 0F);
      Shape13a = new ModelRenderer(this, 0, 27);
      Shape13a.addBox(0F, -1F, -1F, 2, 2, 2);
      Shape13a.setRotationPoint(2.5F, 16F, 0F);
      Shape13a.setTextureSize(128, 32);
      Shape13a.mirror = true;
      setRotation(Shape13a, 0.7853982F, 0F, 0F);
      Shape13b = new ModelRenderer(this, 0, 27);
      Shape13b.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape13b.setRotationPoint(-5.5F, 16F, 0F);
      Shape13b.setTextureSize(128, 32);
      Shape13b.mirror = true;
      setRotation(Shape13b, 0.9599311F, 0F, 0F);
      Shape13c = new ModelRenderer(this, 0, 27);
      Shape13c.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape13c.setRotationPoint(-4.5F, 16F, 0F);
      Shape13c.setTextureSize(128, 32);
      Shape13c.mirror = true;
      setRotation(Shape13c, 1.134464F, 0F, 0F);
      Shape13d = new ModelRenderer(this, 0, 27);
      Shape13d.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape13d.setRotationPoint(-3.5F, 16F, 0F);
      Shape13d.setTextureSize(128, 32);
      Shape13d.mirror = true;
      setRotation(Shape13d, 1.308997F, 0F, 0F);
      Shape13e = new ModelRenderer(this, 0, 27);
      Shape13e.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape13e.setRotationPoint(-2.5F, 16F, 0F);
      Shape13e.setTextureSize(128, 32);
      Shape13e.mirror = true;
      setRotation(Shape13e, 1.48353F, 0F, 0F);
      Shape13f = new ModelRenderer(this, 0, 27);
      Shape13f.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape13f.setRotationPoint(-1.5F, 16F, 0F);
      Shape13f.setTextureSize(128, 32);
      Shape13f.mirror = true;
      setRotation(Shape13f, 1.658063F, 0F, 0F);
      Shape13g = new ModelRenderer(this, 0, 27);
      Shape13g.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape13g.setRotationPoint(-0.5F, 16F, 0F);
      Shape13g.setTextureSize(128, 32);
      Shape13g.mirror = true;
      setRotation(Shape13g, 1.832596F, 0F, 0F);
      Shape13h = new ModelRenderer(this, 0, 27);
      Shape13h.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape13h.setRotationPoint(0.5F, 16F, 0F);
      Shape13h.setTextureSize(128, 32);
      Shape13h.mirror = true;
      setRotation(Shape13h, 2.007129F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 82, 0);
      Shape14.addBox(0F, 0F, 0F, 1, 9, 6);
      Shape14.setRotationPoint(3F, 14F, -4F);
      Shape14.setTextureSize(128, 32);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0F);
      Shape13aa = new ModelRenderer(this, 0, 27);
      Shape13aa.addBox(0F, -1F, -1F, 3, 2, 2);
      Shape13aa.setRotationPoint(-8.5F, 16F, 0F);
      Shape13aa.setTextureSize(128, 32);
      Shape13aa.mirror = true;
      setRotation(Shape13aa, 0.7853982F, 0F, 0F);
      Shape12aa = new ModelRenderer(this, 0, 27);
      Shape12aa.addBox(0F, -1F, -1F, 3, 2, 2);
      Shape12aa.setRotationPoint(-8.5F, 16F, 0F);
      Shape12aa.setTextureSize(128, 32);
      Shape12aa.mirror = true;
      setRotation(Shape12aa, 0F, 0F, 0F);
      Shape121 = new ModelRenderer(this, 0, 27);
      Shape121.addBox(0F, -1F, -1F, 1, 2, 2);
      Shape121.setRotationPoint(-1.5F, 16F, 0F);
      Shape121.setTextureSize(128, 32);
      Shape121.mirror = true;
      setRotation(Shape121, 0.8726646F, 0F, 0F);
      Shape122 = new ModelRenderer(this, 100, 0);
      Shape122.addBox(-0.5F, -1F, -1F, 10, 2, 2);
      Shape122.setRotationPoint(-0.5F, 20F, 3F);
      Shape122.setTextureSize(128, 32);
      Shape122.mirror = true;
      setRotation(Shape122, 0F, 1.570796F, 0F);
      Shape123 = new ModelRenderer(this, 100, 0);
      Shape123.addBox(-0.5F, -2F, -2F, 1, 4, 4);
      Shape123.setRotationPoint(-0.5F, 20F, 0F);
      Shape123.setTextureSize(128, 32);
      Shape123.mirror = true;
      setRotation(Shape123, 0F, 1.570796F, 0F);
      Shape124 = new ModelRenderer(this, 100, 0);
      Shape124.addBox(-0.5F, -2F, -2F, 1, 4, 4);
      Shape124.setRotationPoint(-0.5F, 20F, 0F);
      Shape124.setTextureSize(128, 32);
      Shape124.mirror = true;
      setRotation(Shape124, 0.3926991F, 1.570796F, 0F);
      Shape12a1 = new ModelRenderer(this, 0, 27);
      Shape12a1.addBox(0F, -1F, -1F, 4, 2, 2);
      Shape12a1.setRotationPoint(2.5F, 20.5F, -2F);
      Shape12a1.setTextureSize(128, 32);
      Shape12a1.mirror = true;
      setRotation(Shape12a1, 0.7853982F, 0F, 0F);
      Shape12a2 = new ModelRenderer(this, 100, 0);
      Shape12a2.addBox(0F, -2F, -2F, 1, 4, 4);
      Shape12a2.setRotationPoint(5.5F, 20.5F, -2F);
      Shape12a2.setTextureSize(128, 32);
      Shape12a2.mirror = true;
      setRotation(Shape12a2, 1.178097F, 0F, 0F);
      Shape12a3 = new ModelRenderer(this, 0, 27);
      Shape12a3.addBox(0F, -1F, -1F, 2, 2, 2);
      Shape12a3.setRotationPoint(2.5F, 16F, 0F);
      Shape12a3.setTextureSize(128, 32);
      Shape12a3.mirror = true;
      setRotation(Shape12a3, 0F, 0F, 0F);
      Shape12a4 = new ModelRenderer(this, 100, 0);
      Shape12a4.addBox(0F, -1.5F, -1.5F, 1, 3, 3);
      Shape12a4.setRotationPoint(1.5F, 20.5F, -2F);
      Shape12a4.setTextureSize(128, 32);
      Shape12a4.mirror = true;
      setRotation(Shape12a4, 0.7853982F, 0F, 0F);
      Shape12a6 = new ModelRenderer(this, 0, 27);
      Shape12a6.addBox(0F, -1F, -1F, 3, 2, 2);
      Shape12a6.setRotationPoint(5.5F, 16F, 0F);
      Shape12a6.setTextureSize(128, 32);
      Shape12a6.mirror = true;
      setRotation(Shape12a6, 0F, 0F, 0F);
      Shape12a5 = new ModelRenderer(this, 100, 0);
      Shape12a5.addBox(0F, -2F, -2F, 1, 4, 4);
      Shape12a5.setRotationPoint(5.5F, 20.5F, -2F);
      Shape12a5.setTextureSize(128, 32);
      Shape12a5.mirror = true;
      setRotation(Shape12a5, 0.3926991F, 0F, 0F);
      Shape12a7 = new ModelRenderer(this, 100, 0);
      Shape12a7.addBox(0F, -2F, -2F, 1, 4, 4);
      Shape12a7.setRotationPoint(5.5F, 16F, 0F);
      Shape12a7.setTextureSize(128, 32);
      Shape12a7.mirror = true;
      setRotation(Shape12a7, 0F, 0F, 0F);
      Shape12a8 = new ModelRenderer(this, 100, 0);
      Shape12a8.addBox(0F, -2F, -2F, 1, 4, 4);
      Shape12a8.setRotationPoint(5.5F, 16F, 0F);
      Shape12a8.setTextureSize(128, 32);
      Shape12a8.mirror = true;
      setRotation(Shape12a8, 0.7853982F, 0F, 0F);
      Shape12a9 = new ModelRenderer(this, 0, 27);
      Shape12a9.addBox(0F, -1F, -1F, 4, 2, 2);
      Shape12a9.setRotationPoint(2.5F, 20.5F, -2F);
      Shape12a9.setTextureSize(128, 32);
      Shape12a9.mirror = true;
      setRotation(Shape12a9, 0F, 0F, 0F);
      Shape12a0 = new ModelRenderer(this, 100, 0);
      Shape12a0.addBox(0F, -1.5F, -1.5F, 1, 3, 3);
      Shape12a0.setRotationPoint(1.5F, 20.5F, -2F);
      Shape12a0.setTextureSize(128, 32);
      Shape12a0.mirror = true;
      setRotation(Shape12a0, 0F, 0F, 0F);
      Shape122a = new ModelRenderer(this, 100, 0);
      Shape122a.addBox(-0.5F, -2F, -2F, 1, 4, 4);
      Shape122a.setRotationPoint(-0.5F, 20F, 0F);
      Shape122a.setTextureSize(128, 32);
      Shape122a.mirror = true;
      setRotation(Shape122a, 0.7853982F, 1.570796F, 0F);
      Shape122b = new ModelRenderer(this, 100, 0);
      Shape122b.addBox(-0.5F, -1F, -1F, 10, 2, 2);
      Shape122b.setRotationPoint(-0.5F, 20F, 3F);
      Shape122b.setTextureSize(128, 32);
      Shape122b.mirror = true;
      setRotation(Shape122b, 0.7853982F, 1.570796F, 0F);
      Shape15a = new ModelRenderer(this, 67, 0);
      Shape15a.addBox(0F, 0F, 0F, 5, 5, 1);
      Shape15a.setRotationPoint(-3F, 18F, -6F);
      Shape15a.setTextureSize(128, 32);
      Shape15a.mirror = true;
      setRotation(Shape15a, 0F, 0F, 0F);
      Shape15 = new ModelRenderer(this, 67, 0);
      Shape15.addBox(0F, 0F, 0F, 5, 5, 1);
      Shape15.setRotationPoint(-3F, 18F, 2F);
      Shape15.setTextureSize(128, 32);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0F);
  }
  
  public void renderAll(List li, float phi)
  {
	  double xoff;
	  double yoff;
	  
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    
    GL11.glTranslated(0, 1, 0);
    GL11.glRotatef(phi*2, 1, 0, 0);
    GL11.glTranslated(0, -1, 0);
    Shape13.render(f5);
    Shape12a.render(f5);
    Shape12b.render(f5);
    Shape12c.render(f5);
    Shape12d.render(f5);
    Shape12e.render(f5);
    Shape12f.render(f5);
    Shape12g.render(f5);
    Shape12h.render(f5);
    Shape13a.render(f5);
    Shape13b.render(f5);
    Shape13c.render(f5);
    Shape13d.render(f5);
    Shape13e.render(f5);
    Shape13f.render(f5);
    Shape13g.render(f5);
    Shape13h.render(f5);
    Shape13aa.render(f5);
    Shape12aa.render(f5);
    Shape12a6.render(f5);
    Shape12a3.render(f5);
    Shape121.render(f5);
    GL11.glTranslated(0, 1, 0);
    GL11.glRotatef(-phi*2, 1, 0, 0);
    GL11.glTranslated(0, -1, 0);
    
    GL11.glTranslated(0, 1, 0);
    GL11.glRotatef(phi, 1, 0, 0);
    GL11.glTranslated(0, -1, 0);
    Shape12a7.render(f5);
    Shape12a8.render(f5);
    GL11.glTranslated(0, 1, 0);
    GL11.glRotatef(-phi, 1, 0, 0);
    GL11.glTranslated(0, -1, 0);
    
    xoff = 0;
    yoff = 0;
    double a = 0.35;
    double b = 1.25;
    double c = -0.125;
    GL11.glTranslated(a, b, c);
    GL11.glRotatef(-phi, 1, 0, 0);
    Shape12a2.setRotationPoint(0, 0, 0);
    Shape12a5.setRotationPoint(0, 0, 0);
    Shape12a2.render(f5);
    Shape12a5.render(f5);
    GL11.glRotatef(phi, 1, 0, 0);
    GL11.glTranslated(-a, -b, -c);
    

    a = 0.1; b = 1.25; c = -0.125;
    GL11.glTranslated(a, b, c);
    GL11.glRotatef(-phi, 1, 0, 0);
    Shape12a9.setRotationPoint(0, 0, 0);
    Shape12a4.setRotationPoint(0, 0, 0);
    Shape12a1.setRotationPoint(0, 0, 0);
    Shape12a0.setRotationPoint(0, 0, 0);
    Shape12a9.render(f5);
    Shape12a4.render(f5);
    Shape12a1.render(f5);
    Shape12a0.render(f5);
    GL11.glRotatef(phi, 1, 0, 0);
    GL11.glTranslated(-a, -b, -c);

    a = -0.03125; b = 1.25; c = 0.1875;
    GL11.glTranslated(a, b, c);
    GL11.glRotatef(phi, 0, 0, 1);
    Shape12.setRotationPoint(0, 0, -3F);
    Shape123.setRotationPoint(0, 0, -3F);
    Shape124.setRotationPoint(0, 0, -3F);
    Shape122a.setRotationPoint(0, 0, -3F);
    Shape122b.setRotationPoint(0, 0, 0);
    Shape122.setRotationPoint(0, 0, 0);
    Shape12.render(f5);
    Shape123.render(f5);
    Shape124.render(f5);
    Shape122a.render(f5);
    Shape122b.render(f5);
    Shape122.render(f5);
    GL11.glRotatef(-phi, 0, 0, 1);
    GL11.glTranslated(-a, -b, -c);
    
    Shape14.render(f5);
    Shape15a.render(f5);
    Shape15.render(f5);
  }
}
