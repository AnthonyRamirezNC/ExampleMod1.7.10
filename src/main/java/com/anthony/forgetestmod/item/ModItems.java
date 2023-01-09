package com.anthony.forgetestmod.item;

import com.anthony.forgetestmod.item.ExampleItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class ModItems {
    public static void registerAllItems(){
        //register Example Item
        ExampleItem exampleItem = (ExampleItem) new ExampleItem().setUnlocalizedName("ExampleItem").setTextureName("tm:exampleItem");
        GameRegistry.registerItem(exampleItem, exampleItem.getUnlocalizedName().substring(5));
    }
}
