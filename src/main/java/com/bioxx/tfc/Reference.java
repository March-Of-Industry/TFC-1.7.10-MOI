package com.bioxx.tfc;

public class Reference {
    public static final String MOD_ID = "GRADLETOKEN_MODID";
    public static final String MOD_NAME = "GRADLETOKEN_MODNAME";
    public static final String MOD_VERSION = "GRADLETOKEN_VERSION";
    public static final String GROUPNAME = "GRADLETOKEN_GROUPNAME";

    public static final String MOD_DEPENDENCIES = "required-after:tfc_coremod";
    public static final String MOD_CHANNEL = "TerraFirmaCraft";
    public static final String SERVER_PROXY_CLASS = "com.bioxx.tfc.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "com.bioxx.tfc.ClientProxy";

    public static final String ASSET_PATH = "/assets/" + MOD_ID + "/";
    public static final String ASSET_PATH_GUI = "textures/gui/";

    public static final String GUI_FACTORY = "com.bioxx.tfc.Core.Config.TFC_GuiFactory";
}
