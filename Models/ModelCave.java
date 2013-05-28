/*******************************************************************************
 * @author Reika
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 03/05/2013 12:24:45 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.List;

import net.minecraft.client.model.ModelRenderer;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelCave extends RotaryModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape2a;
    ModelRenderer Shape2b;
    ModelRenderer Shape2c;
    ModelRenderer Shape3;
    ModelRenderer Shape3a;
    ModelRenderer Shape4;
    ModelRenderer Shape3b;
    ModelRenderer Shape3c;
    ModelRenderer Shape3d;
    ModelRenderer Shape3e;
    ModelRenderer Shape3f;
    ModelRenderer Shape3g;
    ModelRenderer Shape5;
    ModelRenderer Shape5a;
    ModelRenderer Shape6;
    ModelRenderer Shape6a;
    ModelRenderer Shape5b;
    ModelRenderer Shape5c;
    ModelRenderer Shape7a;
    ModelRenderer Shape7;

  public ModelCave()
  {
    textureWidth = 128;
    textureHeight = 128;

      Shape1 = new ModelRenderer(this, 0, 96);
      Shape1.addBox(0F, 0F, 0F, 12, 16, 12);
      Shape1.setRotationPoint(-6F, 8F, -6F);
      Shape1.setTextureSize(128, 128);
      Shape1.mirror = true;
      this.setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 44, 21);
      Shape2.addBox(0F, 0F, 0F, 16, 5, 2);
      Shape2.setRotationPoint(-8F, 19F, 6F);
      Shape2.setTextureSize(128, 128);
      Shape2.mirror = true;
      this.setRotation(Shape2, 0F, 0F, 0F);
      Shape2a = new ModelRenderer(this, 44, 7);
      Shape2a.addBox(0F, 0F, 0F, 16, 5, 2);
      Shape2a.setRotationPoint(-8F, 8F, 6F);
      Shape2a.setTextureSize(128, 128);
      Shape2a.mirror = true;
      this.setRotation(Shape2a, 0F, 0F, 0F);
      Shape2b = new ModelRenderer(this, 44, 0);
      Shape2b.addBox(0F, 0F, 0F, 16, 5, 2);
      Shape2b.setRotationPoint(-8F, 8F, -8F);
      Shape2b.setTextureSize(128, 128);
      Shape2b.mirror = true;
      this.setRotation(Shape2b, 0F, 0F, 0F);
      Shape2c = new ModelRenderer(this, 44, 14);
      Shape2c.addBox(0F, 0F, 0F, 16, 5, 2);
      Shape2c.setRotationPoint(-8F, 19F, -8F);
      Shape2c.setTextureSize(128, 128);
      Shape2c.mirror = true;
      this.setRotation(Shape2c, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 14, 25);
      Shape3.addBox(0F, 0F, -1F, 1, 6, 1);
      Shape3.setRotationPoint(6F, 13F, 7F);
      Shape3.setTextureSize(128, 128);
      Shape3.mirror = true;
      this.setRotation(Shape3, 0F, 0F, 0F);
      Shape3a = new ModelRenderer(this, 7, 25);
      Shape3a.addBox(0F, 0F, 0F, 2, 6, 1);
      Shape3a.setRotationPoint(-8F, 13F, 6F);
      Shape3a.setTextureSize(128, 128);
      Shape3a.mirror = true;
      this.setRotation(Shape3a, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 48, 96);
      Shape4.addBox(-5.5F, 0F, -5.5F, 11, 14, 11);
      Shape4.setRotationPoint(0F, 9F, 0F);
      Shape4.setTextureSize(128, 128);
      Shape4.mirror = true;
      this.setRotation(Shape4, 0F, 0.7853982F, 0F);
      Shape3b = new ModelRenderer(this, 0, 17);
      Shape3b.addBox(0F, 0F, 0F, 3, 6, 1);
      Shape3b.setRotationPoint(-8F, 13F, 7F);
      Shape3b.setTextureSize(128, 128);
      Shape3b.mirror = true;
      this.setRotation(Shape3b, 0F, 0F, 0F);
      Shape3c = new ModelRenderer(this, 9, 17);
      Shape3c.addBox(0F, 0F, 0F, 3, 6, 1);
      Shape3c.setRotationPoint(5F, 13F, 7F);
      Shape3c.setTextureSize(128, 128);
      Shape3c.mirror = true;
      this.setRotation(Shape3c, 0F, 0F, 0F);
      Shape3d = new ModelRenderer(this, 0, 25);
      Shape3d.addBox(0F, 0F, 0F, 2, 6, 1);
      Shape3d.setRotationPoint(-8F, 13F, -7F);
      Shape3d.setTextureSize(128, 128);
      Shape3d.mirror = true;
      this.setRotation(Shape3d, 0F, 0F, 0F);
      Shape3e = new ModelRenderer(this, 19, 25);
      Shape3e.addBox(0F, 0F, 0F, 1, 6, 1);
      Shape3e.setRotationPoint(6F, 13F, -7F);
      Shape3e.setTextureSize(128, 128);
      Shape3e.mirror = true;
      this.setRotation(Shape3e, 0F, 0F, 0F);
      Shape3f = new ModelRenderer(this, 27, 17);
      Shape3f.addBox(0F, 0F, 0F, 3, 6, 1);
      Shape3f.setRotationPoint(5F, 13F, -8F);
      Shape3f.setTextureSize(128, 128);
      Shape3f.mirror = true;
      this.setRotation(Shape3f, 0F, 0F, 0F);
      Shape3g = new ModelRenderer(this, 18, 17);
      Shape3g.addBox(0F, 0F, 0F, 3, 6, 1);
      Shape3g.setRotationPoint(-8F, 13F, -8F);
      Shape3g.setTextureSize(128, 128);
      Shape3g.mirror = true;
      this.setRotation(Shape3g, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 81, 18);
      Shape5.addBox(0F, 0F, 0F, 2, 5, 12);
      Shape5.setRotationPoint(-8F, 19F, -6F);
      Shape5.setTextureSize(128, 128);
      Shape5.mirror = true;
      this.setRotation(Shape5, 0F, 0F, 0F);
      Shape5a = new ModelRenderer(this, 81, 0);
      Shape5a.addBox(0F, 0F, 0F, 2, 5, 12);
      Shape5a.setRotationPoint(-8F, 8F, -6F);
      Shape5a.setTextureSize(128, 128);
      Shape5a.mirror = true;
      this.setRotation(Shape5a, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(0F, 0F, 0F, 1, 6, 2);
      Shape6.setRotationPoint(7F, 13F, 5F);
      Shape6.setTextureSize(128, 128);
      Shape6.mirror = true;
      this.setRotation(Shape6, 0F, 0F, 0F);
      Shape6a = new ModelRenderer(this, 7, 0);
      Shape6a.addBox(0F, 0F, 0F, 1, 6, 2);
      Shape6a.setRotationPoint(7F, 13F, -7F);
      Shape6a.setTextureSize(128, 128);
      Shape6a.mirror = true;
      this.setRotation(Shape6a, 0F, 0F, 0F);
      Shape5b = new ModelRenderer(this, 81, 36);
      Shape5b.addBox(0F, 0F, 0F, 2, 5, 12);
      Shape5b.setRotationPoint(6F, 8F, -6F);
      Shape5b.setTextureSize(128, 128);
      Shape5b.mirror = true;
      this.setRotation(Shape5b, 0F, 0F, 0F);
      Shape5c = new ModelRenderer(this, 81, 54);
      Shape5c.addBox(0F, 0F, 0F, 2, 5, 12);
      Shape5c.setRotationPoint(6F, 19F, -6F);
      Shape5c.setTextureSize(128, 128);
      Shape5c.mirror = true;
      this.setRotation(Shape5c, 0F, 0F, 0F);
      Shape7a = new ModelRenderer(this, 29, 25);
      Shape7a.addBox(0F, 0F, 0F, 1, 6, 1);
      Shape7a.setRotationPoint(-8F, 13F, 5F);
      Shape7a.setTextureSize(128, 128);
      Shape7a.mirror = true;
      this.setRotation(Shape7a, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 24, 25);
      Shape7.addBox(0F, 0F, 0F, 1, 6, 1);
      Shape7.setRotationPoint(-8F, 13F, -6F);
      Shape7.setTextureSize(128, 128);
      Shape7.mirror = true;
      this.setRotation(Shape7, 0F, 0F, 0F);
  }

  @Override
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

	@Override
	public void renderAll(List conditions, float phi) {
	    Shape1.render(f5);
	    Shape2.render(f5);
	    Shape2a.render(f5);
	    Shape2b.render(f5);
	    Shape2c.render(f5);
	    Shape3.render(f5);
	    Shape3a.render(f5);
	    Shape4.render(f5);
	    Shape3b.render(f5);
	    Shape3c.render(f5);
	    Shape3d.render(f5);
	    Shape3e.render(f5);
	    Shape3f.render(f5);
	    Shape3g.render(f5);
	    Shape5.render(f5);
	    Shape5a.render(f5);
	    Shape6.render(f5);
	    Shape6a.render(f5);
	    Shape5b.render(f5);
	    Shape5c.render(f5);
	    Shape7a.render(f5);
	    Shape7.render(f5);
	}

}
