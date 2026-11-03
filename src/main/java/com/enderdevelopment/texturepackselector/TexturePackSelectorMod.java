package com.enderdevelopment.texturepackselector;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class TexturePackSelectorMod implements ModInitializer {
    public static final String MOD_ID = "texturepackselector";
    private static KeyBinding openMenuKey;

    @Override
    public void onInitialize() {
        // Register key binding
        openMenuKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.texturepackselector.open_menu",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_R,
                "category.texturepackselector.texturepackselector"
        ));

        // Register client tick events
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openMenuKey.wasPressed()) {
                // Open the texture pack selection menu
                client.setScreen(new TexturePackSelectorScreen());
            }
        });
    }
}