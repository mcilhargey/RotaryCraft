/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 28/05/2013 3:05:07 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.List;

import net.minecraft.client.model.ModelRenderer;

import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelItemCannon extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape2a;
	ModelRenderer Shape2b;
	ModelRenderer Shape2c;
	ModelRenderer Shape2d;
	ModelRenderer Shape2e;
	ModelRenderer Shape2f;
	ModelRenderer Shape2g;
	ModelRenderer Shape3a;
	ModelRenderer Shape3b;
	ModelRenderer Shape3c;
	ModelRenderer Shape3d;
	ModelRenderer Shape3e;
	ModelRenderer Shape3f;
	ModelRenderer Shape2av;
	ModelRenderer Shape2gf;
	ModelRenderer Shape3ddf;
	ModelRenderer Shape3;

	public ModelItemCannon()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 2, 16);
		Shape1.setRotationPoint(-8F, 22F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 86);
		Shape2.addBox(0F, 0F, 0F, 16, 2, 3);
		Shape2.setRotationPoint(-8F, 8F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new ModelRenderer(this, 65, 14);
		Shape2a.addBox(0F, 0F, 0F, 16, 6, 6);
		Shape2a.setRotationPoint(-8F, 16F, -8F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new ModelRenderer(this, 21, 19);
		Shape2b.addBox(0F, 0F, 0F, 5, 4, 5);
		Shape2b.setRotationPoint(-8F, 12F, -8F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape2c = new ModelRenderer(this, 62, 35);
		Shape2c.addBox(0F, 0F, 0F, 16, 2, 4);
		Shape2c.setRotationPoint(-8F, 10F, -8F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape2d = new ModelRenderer(this, 65, 0);
		Shape2d.addBox(0F, 0F, 0F, 16, 6, 6);
		Shape2d.setRotationPoint(-8F, 16F, 2F);
		Shape2d.setTextureSize(128, 128);
		Shape2d.mirror = true;
		this.setRotation(Shape2d, 0F, 0F, 0F);
		Shape2e = new ModelRenderer(this, 42, 19);
		Shape2e.addBox(0F, 0F, 0F, 5, 4, 5);
		Shape2e.setRotationPoint(3F, 12F, -8F);
		Shape2e.setTextureSize(128, 128);
		Shape2e.mirror = true;
		this.setRotation(Shape2e, 0F, 0F, 0F);
		Shape2f = new ModelRenderer(this, 21, 33);
		Shape2f.addBox(0F, 0F, 0F, 16, 2, 4);
		Shape2f.setRotationPoint(-8F, 10F, 4F);
		Shape2f.setTextureSize(128, 128);
		Shape2f.mirror = true;
		this.setRotation(Shape2f, 0F, 0F, 0F);
		Shape2g = new ModelRenderer(this, 0, 79);
		Shape2g.addBox(0F, 0F, 0F, 16, 2, 3);
		Shape2g.setRotationPoint(-8F, 8F, 5F);
		Shape2g.setTextureSize(128, 128);
		Shape2g.mirror = true;
		this.setRotation(Shape2g, 0F, 0F, 0F);
		Shape3a = new ModelRenderer(this, 0, 51);
		Shape3a.addBox(0F, 0F, 0F, 3, 2, 10);
		Shape3a.setRotationPoint(5F, 8F, -5F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape3b = new ModelRenderer(this, 65, 27);
		Shape3b.addBox(0F, 0F, 0F, 5, 2, 4);
		Shape3b.setRotationPoint(3F, 16F, -2F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
		Shape3c = new ModelRenderer(this, 26, 40);
		Shape3c.addBox(0F, 0F, 0F, 4, 2, 8);
		Shape3c.setRotationPoint(4F, 10F, -4F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0F, 0F);
		Shape3d = new ModelRenderer(this, 104, 27);
		Shape3d.addBox(0F, 0F, 0F, 6, 4, 4);
		Shape3d.setRotationPoint(-8F, 18F, -2F);
		Shape3d.setTextureSize(128, 128);
		Shape3d.mirror = true;
		this.setRotation(Shape3d, 0F, 0F, 0F);
		Shape3e = new ModelRenderer(this, 0, 40);
		Shape3e.addBox(0F, 0F, 0F, 4, 2, 8);
		Shape3e.setRotationPoint(-8F, 10F, -4F);
		Shape3e.setTextureSize(128, 128);
		Shape3e.mirror = true;
		this.setRotation(Shape3e, 0F, 0F, 0F);
		Shape3f = new ModelRenderer(this, 0, 65);
		Shape3f.addBox(0F, 0F, 0F, 3, 2, 10);
		Shape3f.setRotationPoint(-8F, 8F, -5F);
		Shape3f.setTextureSize(128, 128);
		Shape3f.mirror = true;
		this.setRotation(Shape3f, 0F, 0F, 0F);
		Shape2av = new ModelRenderer(this, 0, 19);
		Shape2av.addBox(0F, 0F, 0F, 5, 4, 5);
		Shape2av.setRotationPoint(-8F, 12F, 3F);
		Shape2av.setTextureSize(128, 128);
		Shape2av.mirror = true;
		this.setRotation(Shape2av, 0F, 0F, 0F);
		Shape2gf = new ModelRenderer(this, 0, 30);
		Shape2gf.addBox(0F, 0F, 0F, 5, 4, 5);
		Shape2gf.setRotationPoint(3F, 12F, 3F);
		Shape2gf.setTextureSize(128, 128);
		Shape2gf.mirror = true;
		this.setRotation(Shape2gf, 0F, 0F, 0F);
		Shape3ddf = new ModelRenderer(this, 104, 37);
		Shape3ddf.addBox(0F, 0F, 0F, 6, 4, 4);
		Shape3ddf.setRotationPoint(2F, 18F, -2F);
		Shape3ddf.setTextureSize(128, 128);
		Shape3ddf.mirror = true;
		this.setRotation(Shape3ddf, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 85, 27);
		Shape3.addBox(0F, 0F, 0F, 5, 2, 4);
		Shape3.setRotationPoint(-8F, 16F, -2F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(List li, float phi)
	{
		Shape1.render(f5);
		Shape2.render(f5);
		Shape2a.render(f5);
		Shape2b.render(f5);
		Shape2c.render(f5);
		Shape2d.render(f5);
		Shape2e.render(f5);
		Shape2f.render(f5);
		Shape2g.render(f5);
		Shape3a.render(f5);
		Shape3b.render(f5);
		Shape3c.render(f5);
		Shape3d.render(f5);
		Shape3e.render(f5);
		Shape3f.render(f5);
		Shape2av.render(f5);
		Shape2gf.render(f5);
		Shape3ddf.render(f5);
		Shape3.render(f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
