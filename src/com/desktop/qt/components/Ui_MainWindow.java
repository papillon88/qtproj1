package com.desktop.qt.components; /********************************************************************************
 ** Form generated from reading ui file 'Qt2.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.desktop.qt.pathproc.Pathprocessor;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

import java.io.IOException;

public class Ui_MainWindow implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QWidget centralwidget;
    public QWidget widget;
    public QVBoxLayout verticalLayout;
    public QHBoxLayout horizontalLayout;
    public QLabel label;
    private QLineEdit lineEdit;
    public QPushButton pushButton;
    public QTextBrowser textBrowser;
    public QMenuBar menubar;
    public QStatusBar statusBar;

    public Ui_MainWindow() { super(); }

    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(326, 365).expandedTo(MainWindow.minimumSizeHint()));
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        widget = new QWidget(centralwidget);
        widget.setObjectName("widget");
        widget.setGeometry(new QRect(31, 31, 258, 251));
        verticalLayout = new QVBoxLayout(widget);
        verticalLayout.setObjectName("verticalLayout");
        horizontalLayout = new QHBoxLayout();
        horizontalLayout.setObjectName("horizontalLayout");
        label = new QLabel(widget);
        label.setObjectName("label");

        horizontalLayout.addWidget(label);

        lineEdit = new QLineEdit(widget);
        lineEdit.setObjectName("lineEdit");

        horizontalLayout.addWidget(lineEdit);


        verticalLayout.addLayout(horizontalLayout);

        pushButton = new QPushButton(widget);
        pushButton.setObjectName("pushButton");
        pushButton.clicked.connect(this,"processPath()");

        verticalLayout.addWidget(pushButton);

        textBrowser = new QTextBrowser(widget);
        textBrowser.setObjectName("textBrowser");

        verticalLayout.addWidget(textBrowser);

        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 326, 21));
        MainWindow.setMenuBar(menubar);
        statusBar = new QStatusBar(MainWindow);
        statusBar.setObjectName("statusBar");
        MainWindow.setStatusBar(statusBar);
        label.setBuddy(lineEdit);
        retranslateUi(MainWindow);

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Path", null));
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "GET", null));
    } // retranslateUi

    public void processPath() throws IOException {
        String path = lineEdit.text();
        textBrowser.append(Pathprocessor.processPathString(path));
    }

}

