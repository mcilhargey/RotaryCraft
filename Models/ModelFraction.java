/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 26/02/2013 11:50:47 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.List;

import net.minecraft.client.model.ModelRenderer;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelFraction extends RotaryModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape3a;
    ModelRenderer Shape3b;
    ModelRenderer Shape3c;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape5a;
    ModelRenderer Shape6;
    ModelRenderer Shape6a;
    ModelRenderer Shape6b;
    ModelRenderer Shape5b;
    ModelRenderer Shape5c;
    ModelRenderer Shape6c;
    ModelRenderer Shape6d;
    ModelRenderer Shape5d;
    ModelRenderer Shape6e;
    ModelRenderer Shape5e;
    ModelRenderer Shape5f;
    ModelRenderer Shape6f;
    ModelRenderer Shape5g;
    ModelRenderer Shape6g;
    ModelRenderer Shape7;
  
  public ModelFraction()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 64, 14);
      Shape1.addBox(0F, 0F, 0F, 8, 14, 12);
      Shape1.setRotationPoint(-4F, 9F, -6F);
      Shape1.setTextureSize(128, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 18);
      Shape2.addBox(0F, 0F, 0F, 12, 14, 8);
      Shape2.setRotationPoint(-6F, 9F, -4F);
      Shape2.setTextureSize(128, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 41);
      Shape3.addBox(0F, 0F, 0F, 3, 14, 3);
      Shape3.setRotationPoint(1.7F, 9F, 3.8F);
      Shape3.setTextureSize(128, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0.7853982F, 0F);
      Shape3a = new ModelRenderer(this, 0, 41);
      Shape3a.addBox(0F, 0F, 0F, 3, 14, 3);
      Shape3a.setRotationPoint(1.7F, 9F, -3.8F);
      Shape3a.setTextureSize(128, 128);
      Shape3a.mirror = true;
      setRotation(Shape3a, 0F, 0.7853982F, 0F);
      Shape3b = new ModelRenderer(this, 0, 41);
      Shape3b.addBox(0F, 0F, 0F, 3, 14, 3);
      Shape3b.setRotationPoint(-5.9F, 9F, 3.8F);
      Shape3b.setTextureSize(128, 128);
      Shape3b.mirror = true;
      setRotation(Shape3b, 0F, 0.7853982F, 0F);
      Shape3c = new ModelRenderer(this, 0, 41);
      Shape3c.addBox(0F, 0F, 0F, 3, 14, 3);
      Shape3c.setRotationPoint(-5.9F, 9F, -3.8F);
      Shape3c.setTextureSize(128, 128);
      Shape3c.mirror = true;
      setRotation(Shape3c, 0F, 0.7853982F, 0F);
      Shape4 = new ModelRenderer(this, 64, 0);
      Shape4.addBox(0F, 0F, 0F, 13, 1, 13);
      Shape4.setRotationPoint(-6.5F, 8F, -6.5F);
      Shape4.setTextureSize(128, 128);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 76);
      Shape5.addBox(0F, 0F, 0F, 16, 2, 2);
      Shape5.setRotationPoint(-8F, 10F, -8F);
      Shape5.setTextureSize(128, 128);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape5a = new ModelRenderer(this, 0, 76);
      Shape5a.addBox(0F, 0F, 0F, 16, 2, 2);
      Shape5a.setRotationPoint(-8F, 10F, 6F);
      Shape5a.setTextureSize(128, 128);
      Shape5a.mirror = true;
      setRotation(Shape5a, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 2, 61);
      Shape6.addBox(0F, 0F, 0F, 2, 2, 12);
      Shape6.setRotationPoint(6F, 10F, -6F);
      Shape6.setTextureSize(128, 128);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape6a = new ModelRenderer(this, 2, 61);
      Shape6a.addBox(0F, 0F, 0F, 2, 2, 12);
      Shape6a.setRotationPoint(-8F, 18F, -6F);
      Shape6a.setTextureSize(128, 128);
      Shape6a.mirror = true;
      setRotation(Shape6a, 0F, 0F, 0F);
      Shape6b = new ModelRenderer(this, 14, 46);
      Shape6b.addBox(0F, 0F, 0F, 2, 1, 12);
      Shape6b.setRotationPoint(6F, 22F, -6F);
      Shape6b.setTextureSize(128, 128);
      Shape6b.mirror = true;
      setRotation(Shape6b, 0F, 0F, 0F);
      Shape5b = new ModelRenderer(this, 12, 41);
      Shape5b.addBox(0F, 0F, 0F, 16, 1, 2);
      Shape5b.setRotationPoint(-8F, 22F, 6F);
      Shape5b.setTextureSize(128, 128);
      Shape5b.mirror = true;
      setRotation(Shape5b, 0F, 0F, 0F);
      Shape5c = new ModelRenderer(this, 12, 41);
      Shape5c.addBox(0F, 0F, 0F, 16, 1, 2);
      Shape5c.setRotationPoint(-8F, 22F, -8F);
      Shape5c.setTextureSize(128, 128);
      Shape5c.mirror = true;
      setRotation(Shape5c, 0F, 0F, 0F);
      Shape6c = new ModelRenderer(this, 2, 61);
      Shape6c.addBox(0F, 0F, 0F, 2, 2, 12);
      Shape6c.setRotationPoint(-8F, 10F, -6F);
      Shape6c.setTextureSize(128, 128);
      Shape6c.mirror = true;
      setRotation(Shape6c, 0F, 0F, 0F);
      Shape6d = new ModelRenderer(this, 14, 46);
      Shape6d.addBox(0F, 0F, 0F, 2, 1, 12);
      Shape6d.setRotationPoint(-8F, 22F, -6F);
      Shape6d.setTextureSize(128, 128);
      Shape6d.mirror = true;
      setRotation(Shape6d, 0F, 0F, 0F);
      Shape5d = new ModelRenderer(this, 0, 76);
      Shape5d.addBox(0F, 0F, 0F, 16, 2, 2);
      Shape5d.setRotationPoint(-8F, 18F, -8F);
      Shape5d.setTextureSize(128, 128);
      Shape5d.mirror = true;
      setRotation(Shape5d, 0F, 0F, 0F);
      Shape6e = new ModelRenderer(this, 2, 61);
      Shape6e.addBox(0F, 0F, 1F, 2, 2, 12);
      Shape6e.setRotationPoint(6F, 18F, -7F);
      Shape6e.setTextureSize(128, 128);
      Shape6e.mirror = true;
      setRotation(Shape6e, 0F, 0F, 0F);
      Shape5e = new ModelRenderer(this, 0, 76);
      Shape5e.addBox(0F, 0F, 0F, 16, 2, 2);
      Shape5e.setRotationPoint(-8F, 18F, 6F);
      Shape5e.setTextureSize(128, 128);
      Shape5e.mirror = true;
      setRotation(Shape5e, 0F, 0F, 0F);
      Shape5f = new ModelRenderer(this, 0, 76);
      Shape5f.addBox(0F, 0F, 0F, 16, 2, 2);
      Shape5f.setRotationPoint(-8F, 14F, 6F);
      Shape5f.setTextureSize(128, 128);
      Shape5f.mirror = true;
      setRotation(Shape5f, 0F, 0F, 0F);
      Shape6f = new ModelRenderer(this, 2, 61);
      Shape6f.addBox(0F, 0F, 0F, 2, 2, 12);
      Shape6f.setRotationPoint(6F, 14F, -6F);
      Shape6f.setTextureSize(128, 128);
      Shape6f.mirror = true;
      setRotation(Shape6f, 0F, 0F, 0F);
      Shape5g = new ModelRenderer(this, 0, 76);
      Shape5g.addBox(0F, 0F, 0F, 16, 2, 2);
      Shape5g.setRotationPoint(-8F, 14F, -8F);
      Shape5g.setTextureSize(128, 128);
      Shape5g.mirror = true;
      setRotation(Shape5g, 0F, 0F, 0F);
      Shape6g = new ModelRenderer(this, 2, 61);
      Shape6g.addBox(0F, 0F, 0F, 2, 2, 12);
      Shape6g.setRotationPoint(-8F, 14F, -6F);
      Shape6g.setTextureSize(128, 128);
      Shape6g.mirror = true;
      setRotation(Shape6g, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(0F, 0F, 0F, 16, 1, 16);
      Shape7.setRotationPoint(-8F, 23F, -8F);
      Shape7.setTextureSize(128, 128);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
  }
  
  public void renderAll(List li, float phi)
  {
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape3a.render(f5);
    Shape3b.render(f5);
    Shape3c.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape5a.render(f5);
    Shape6.render(f5);
    Shape6a.render(f5);
    Shape6b.render(f5);
    Shape5b.render(f5);
    Shape5c.render(f5);
    Shape6c.render(f5);
    Shape6d.render(f5);
    Shape5d.render(f5);
    Shape6e.render(f5);
    Shape5e.render(f5);
    Shape5f.render(f5);
    Shape6f.render(f5);
    Shape5g.render(f5);
    Shape6g.render(f5);
    Shape7.render(f5);
  }

}
