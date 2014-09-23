package waliax.RPower;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import waliax.RPower.proxy.IProxy;
import waliax.RPower.referance.Reference;


@Mod(modid= Reference.MOD_ID , name=Reference.MOD_NAME, version=Reference.MOD_VERSION)
public class RPower {
    @Mod.Instance(Reference.MOD_ID)
    public static RPower instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInt(FMLPreInitializationEvent event){


    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event){


    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event){

    }

}


