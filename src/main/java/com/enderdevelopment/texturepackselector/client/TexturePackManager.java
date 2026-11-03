package com.enderdevelopment.texturepackselector.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.ResourcePackManager;
import net.minecraft.resource.ResourcePackProfile;

import java.nio.file.Path;
import java.util.List;

public class TexturePackManager {
    private static final MinecraftClient client = MinecraftClient.getInstance();

    public static void installTexturePack(Path packPath) {
        // Logic to install texture pack from path
    }

    public static void applyTexturePack(String packName) {
        // Logic to apply selected texture pack
    }

    public static List<ResourcePackProfile> getAvailableTexturePacks() {
        ResourcePackManager packManager = client.getResourcePackManager();
        return packManager.getProfiles().stream().toList();
    }
}