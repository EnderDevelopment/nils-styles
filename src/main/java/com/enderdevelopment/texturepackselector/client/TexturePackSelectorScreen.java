package com.enderdevelopment.texturepackselector.client;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class TexturePackSelectorScreen extends Screen {
    public TexturePackSelectorScreen() {
        super(Text.literal("Texture Pack Selector"));
    }

    @Override
    protected void init() {
        // Add buttons for different texture pack options
        this.addDrawableChild(new ButtonWidget.Builder(Text.literal("Install Texture Pack"), button -> {
            // Handle install texture pack action
        }).dimensions(this.width / 2 - 100, this.height / 2 - 30, 200, 20).build());

        this.addDrawableChild(new ButtonWidget.Builder(Text.literal("Select Skin"), button -> {
            // Handle select skin action
        }).dimensions(this.width / 2 - 100, this.height / 2, 200, 20).build());

        this.addDrawableChild(new ButtonWidget.Builder(Text.literal("Close"), button -> {
            this.client.setScreen(null);
        }).dimensions(this.width / 2 - 100, this.height / 2 + 30, 200, 20).build());
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
    }
}