/********************************************************************************
** Form generated from reading ui file 'mainWin.jui'
**
** Created: mié 23. oct 23:42:00 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package com.wordpress.nrikee;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_mainWin implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QWidget centralwidget;
    public QVBoxLayout verticalLayout;
    public QHBoxLayout horizontalLayout_2;
    public QLabel labelPrimer;
    public QSpacerItem horizontalSpacer_2;
    public QLabel label_2;
    public QHBoxLayout horizontalLayout;
    public QLineEdit nickEdit;
    public QPushButton enviaBtn;
    public QPushButton RandBtn;
    public QSpacerItem horizontalSpacer;
    public QHBoxLayout horizontalLayout_3;
    public QSpacerItem horizontalSpacer_4;
    public QLabel label_3;
    public QLineEdit resultRandomEdit;
    public QPlainTextEdit resultListEdit;
    public QHBoxLayout horizontalLayout_4;
    public QLabel label_4;
    public QSpacerItem horizontalSpacer_3;
    public QLabel label_5;
    public QStatusBar statusbar;

    public Ui_mainWin() { super(); }

    public void setupUi(QMainWindow main)
    {
        main.setObjectName("main");
        main.resize(new QSize(800, 600).expandedTo(main.minimumSizeHint()));
        centralwidget = new QWidget(main);
        centralwidget.setObjectName("centralwidget");
        verticalLayout = new QVBoxLayout(centralwidget);
        verticalLayout.setObjectName("verticalLayout");
        horizontalLayout_2 = new QHBoxLayout();
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        labelPrimer = new QLabel(centralwidget);
        labelPrimer.setObjectName("labelPrimer");
        labelPrimer.setMaximumSize(new QSize(150, 16777215));

        horizontalLayout_2.addWidget(labelPrimer);

        horizontalSpacer_2 = new QSpacerItem(85, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_2.addItem(horizontalSpacer_2);

        label_2 = new QLabel(centralwidget);
        label_2.setObjectName("label_2");

        horizontalLayout_2.addWidget(label_2);


        verticalLayout.addLayout(horizontalLayout_2);

        horizontalLayout = new QHBoxLayout();
        horizontalLayout.setObjectName("horizontalLayout");
        nickEdit = new QLineEdit(centralwidget);
        nickEdit.setObjectName("nickEdit");
        nickEdit.setMaximumSize(new QSize(150, 16777215));

        horizontalLayout.addWidget(nickEdit);

        enviaBtn = new QPushButton(centralwidget);
        enviaBtn.setObjectName("enviaBtn");

        horizontalLayout.addWidget(enviaBtn);

        RandBtn = new QPushButton(centralwidget);
        RandBtn.setObjectName("RandBtn");

        horizontalLayout.addWidget(RandBtn);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout.addItem(horizontalSpacer);


        verticalLayout.addLayout(horizontalLayout);

        horizontalLayout_3 = new QHBoxLayout();
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        horizontalSpacer_4 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_3.addItem(horizontalSpacer_4);

        label_3 = new QLabel(centralwidget);
        label_3.setObjectName("label_3");

        horizontalLayout_3.addWidget(label_3);

        resultRandomEdit = new QLineEdit(centralwidget);
        resultRandomEdit.setObjectName("resultRandomEdit");
        resultRandomEdit.setMaximumSize(new QSize(250, 16777215));

        horizontalLayout_3.addWidget(resultRandomEdit);


        verticalLayout.addLayout(horizontalLayout_3);

        resultListEdit = new QPlainTextEdit(centralwidget);
        resultListEdit.setObjectName("resultListEdit");

        verticalLayout.addWidget(resultListEdit);

        horizontalLayout_4 = new QHBoxLayout();
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        label_4 = new QLabel(centralwidget);
        label_4.setObjectName("label_4");

        horizontalLayout_4.addWidget(label_4);

        horizontalSpacer_3 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_4.addItem(horizontalSpacer_3);

        label_5 = new QLabel(centralwidget);
        label_5.setObjectName("label_5");
        label_5.setTextFormat(com.trolltech.qt.core.Qt.TextFormat.RichText);
        label_5.setTextInteractionFlags(com.trolltech.qt.core.Qt.TextInteractionFlag.createQFlags(com.trolltech.qt.core.Qt.TextInteractionFlag.LinksAccessibleByMouse,com.trolltech.qt.core.Qt.TextInteractionFlag.TextSelectableByKeyboard));

        horizontalLayout_4.addWidget(label_5);


        verticalLayout.addLayout(horizontalLayout_4);

        main.setCentralWidget(centralwidget);
        statusbar = new QStatusBar(main);
        statusbar.setObjectName("statusbar");
        main.setStatusBar(statusbar);
        retranslateUi(main);

        main.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow main)
    {
        main.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("main", "MainWindow", null));
        labelPrimer.setText(com.trolltech.qt.core.QCoreApplication.translate("main", "Introduce tu nick de Steam", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("main", "Elige un juego aleatoriamente", null));
        enviaBtn.setText(com.trolltech.qt.core.QCoreApplication.translate("main", "Envia", null));
        RandBtn.setText(com.trolltech.qt.core.QCoreApplication.translate("main", "Voy a tener suerte", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("main", "El juego elegido aleatoriamente es: ", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("main", "Autor: @nrikee93", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("main", "http://nrikee.wordpress.com", null));
    } // retranslateUi

}

