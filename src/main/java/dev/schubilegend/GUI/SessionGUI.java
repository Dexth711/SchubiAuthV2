package dev.schubilegend.GUI;

import dev.schubilegend.SchubiAuth;
import dev.schubilegend.Utils.APIUtils;
import dev.schubilegend.Utils.SessionChanger;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.Session;
import org.lwjgl.input.Keyboard;

import java.awt.*;
import java.io.IOException;

public class SessionGUI extends GuiScreen {

    private GuiScreen previousScreen;
    private String status = "Session";
    private GuiTextField sessionField;
    private ScaledResolution sr;

    public SessionGUI(GuiScreen previousScreen) {
        this.previousScreen = previousScreen;
    }
