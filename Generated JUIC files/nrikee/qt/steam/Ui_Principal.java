/********************************************************************************
** Form generated from reading ui file 'Principal.jui'
**
** Created: mar 4. feb 00:19:40 2014
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package nrikee.qt.steam;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Principal implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QWidget centralwidget;
    public QVBoxLayout verticalLayout;
    public QHBoxLayout horizontalLayout_2;
    public QLabel labelPrimer;
    public QSpacerItem horizontalSpacer_2;
    public QLabel label_2asdasdfa;
    public QHBoxLayout horizontalLayout;
    public QLineEdit nickEdit;
    public QPushButton enviaBtn;
    public QPushButton RandBtn;
    public QSpacerItem horizontalSpacer;
    public QHBoxLayout horizontalLayout_3;
    public QLabel numJuegos;
    public QSpacerItem horizontalSpacer_4;
    public QLabel label_3;
    public QLineEdit resultRandomEdit;
    public QPlainTextEdit resultListEdit;
    public QHBoxLayout horizontalLayout_4;
    public QSpacerItem horizontalSpacer_3;
    public QLabel label_5;

    public Ui_Principal() { super(); }

    public void setupUi(QMainWindow Principal)
    {
        Principal.setObjectName("Principal");
        Principal.resize(new QSize(800, 411).expandedTo(Principal.minimumSizeHint()));
        Principal.setWindowIcon(new QIcon(new QPixmap("classpath:nrikee/qt/steam/asd.png")));
        Principal.setToolButtonStyle(com.trolltech.qt.core.Qt.ToolButtonStyle.ToolButtonTextBesideIcon);
        Principal.setAnimated(false);
        centralwidget = new QWidget(Principal);
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

        label_2asdasdfa = new QLabel(centralwidget);
        label_2asdasdfa.setObjectName("label_2asdasdfa");

        horizontalLayout_2.addWidget(label_2asdasdfa);


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
        numJuegos = new QLabel(centralwidget);
        numJuegos.setObjectName("numJuegos");
        numJuegos.setTextFormat(com.trolltech.qt.core.Qt.TextFormat.RichText);

        horizontalLayout_3.addWidget(numJuegos);

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
        resultListEdit.setEnabled(false);
        resultListEdit.setUndoRedoEnabled(false);
        resultListEdit.setTextInteractionFlags(com.trolltech.qt.core.Qt.TextInteractionFlag.createQFlags(com.trolltech.qt.core.Qt.TextInteractionFlag.TextEditable,com.trolltech.qt.core.Qt.TextInteractionFlag.TextSelectableByKeyboard));

        verticalLayout.addWidget(resultListEdit);

        horizontalLayout_4 = new QHBoxLayout();
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        horizontalSpacer_3 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_4.addItem(horizontalSpacer_3);

        label_5 = new QLabel(centralwidget);
        label_5.setObjectName("label_5");
        label_5.setTextFormat(com.trolltech.qt.core.Qt.TextFormat.RichText);
        label_5.setTextInteractionFlags(com.trolltech.qt.core.Qt.TextInteractionFlag.createQFlags(com.trolltech.qt.core.Qt.TextInteractionFlag.LinksAccessibleByMouse,com.trolltech.qt.core.Qt.TextInteractionFlag.TextSelectableByKeyboard));

        horizontalLayout_4.addWidget(label_5);


        verticalLayout.addLayout(horizontalLayout_4);

        Principal.setCentralWidget(centralwidget);
        retranslateUi(Principal);

        Principal.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow Principal)
    {
        Principal.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Random game launcher", null));
        labelPrimer.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Introduce tu nick de Steam", null));
        label_2asdasdfa.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Elige un juego aleatoriamente", null));
        enviaBtn.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Envia", null));
        RandBtn.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Voy a tener suerte", null));
        numJuegos.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "Tienes 1000 juegos", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "El juego elegido aleatoriamente es: ", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Principal", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"+
"<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"+
"p, li { white-space: pre-wrap; }\n"+
"</style></head><body style=\" font-family:'MS Shell Dlg 2'; font-size:8.25pt; font-weight:400; font-style:normal;\">\n"+
"<p style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-size:8pt;\">http://nrikee.com/wordpress</span></p></body></html>", null));
    } // retranslateUi

}

