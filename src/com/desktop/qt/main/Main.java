package com.desktop.qt.main;

import com.desktop.qt.components.Ui_MainWindow;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;

import java.io.IOException;

/**
 * Created by papillon on 3/13/2017.
 */
public class Main {

    public static void main(String args[]) throws IOException{
        QApplication.initialize(args);
        QMainWindow mainWindow = new QMainWindow();
        Ui_MainWindow mainUIWindow = new Ui_MainWindow();
        mainUIWindow.setupUi(mainWindow);
        mainWindow.show();
        QApplication.execStatic();
    }
}
