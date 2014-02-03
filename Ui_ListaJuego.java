/********************************************************************************
** Form generated from reading ui file 'ListaJuego.jui'
**
** Created: mié 23. oct 23:34:22 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package com.wordpress.nrikee;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_ListaJuego implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QMenuBar menubar;
    public QWidget centralwidget;
    public QStatusBar statusbar;

    public Ui_ListaJuego() { super(); }

    public void setupUi(QMainWindow ListaJuego)
    {
        ListaJuego.setObjectName("ListaJuego");
        ListaJuego.resize(new QSize(800, 600).expandedTo(ListaJuego.minimumSizeHint()));
        menubar = new QMenuBar(ListaJuego);
        menubar.setObjectName("menubar");
        ListaJuego.setMenuBar(menubar);
        centralwidget = new QWidget(ListaJuego);
        centralwidget.setObjectName("centralwidget");
        ListaJuego.setCentralWidget(centralwidget);
        statusbar = new QStatusBar(ListaJuego);
        statusbar.setObjectName("statusbar");
        ListaJuego.setStatusBar(statusbar);
        retranslateUi(ListaJuego);

        ListaJuego.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow ListaJuego)
    {
        ListaJuego.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("ListaJuego", "MainWindow", null));
    } // retranslateUi

}

