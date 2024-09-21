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
import scala.Int;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class ChangerGUI extends GuiScreen {

    private final GuiScreen previousScreen;
    private String status = "";
    private GuiTextField nameField;
    private GuiTextField skinField;
    private ScaledResolution sr;
    private ArrayList<GuiTextField> textFields = new ArrayList<>();

    public ChangerGUI(GuiScreen previousScreen) {
        this.previousScreen = previousScreen;
    }
