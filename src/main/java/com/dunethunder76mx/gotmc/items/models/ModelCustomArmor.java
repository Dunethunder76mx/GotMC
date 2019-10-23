package com.dunethunder76mx.gotmc.items.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCustomArmor extends ModelBiped

{
	public ModelRenderer shape15;
	private Object bipedLegs;
	private Object bipedFeet;
	
	public ModelCustomArmor() {
		this.textureWidth = 128;
		this.textureHeight = 128;
			this.shape15 = new ModelRenderer(this, 82, 0);
			this.shape15.setRotationPoint(-4.0f, -8.0f, -4.0f);
			this.shape15.addBox(-1.0f, -5.0F, -1.0F, 10, 5, 12, 0.0F);
			
			this.bipedHead.addChild(shape15);
			this.bipedBody.addChild(shape15);
			((ModelRenderer) this.bipedLegs).addChild(shape15);
			((ModelRenderer) this.bipedFeet).addChild(shape15);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	
	{
	super.render(entity, f, f1, f2, f3, f4, f5);
	
	}
		

		
}
