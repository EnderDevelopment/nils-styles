package com.enderdevelopment.texturepackselector.client;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class SkinSelectorScreen extends Screen {
    private final String itemType;

    public SkinSelectorScreen(String itemType) {
        super(Text.literal("Skin Selector"));
        this.itemType = itemType;
    }

    @Override
    protected void init() {
        // Add buttons for different skin options
        this.addDrawableChild(new ButtonWidget.Builder(Text.literal("Skin 1"), button -> {
            // Apply skin 1
        }).dimensions(this.width / 2 - 100, this.height / 2 - 30, 200, 20).build());

        this.addDrawableChild(new ButtonWidget.Builder(Text.literal("Skin 2"), button -> {
            // Apply skin 2
        }).dimensions(this.width / 2 - 100, this.height / 2, 200, 20).build());

        this.addDrawableChild(new ButtonWidget.Builder(Text.literal("Back"), button -> {
            this.client.setScreen(new TexturePackSelectorScreen());
        }).dimensions(this.width / 2 - 100, this.height / 2 + 30, 200, 20).build());
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
    }
}