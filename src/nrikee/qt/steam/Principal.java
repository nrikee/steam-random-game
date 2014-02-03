package nrikee.qt.steam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QMainWindow;
import com.trolltech.qt.gui.QPlainTextEdit;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextCursor;
import com.trolltech.qt.gui.QWidget;

public class Principal extends QMainWindow {
    Ui_Principal ui = new Ui_Principal();
    QLineEdit 		qNick,
    				qRndResult;
    QPlainTextEdit	qListResult;
    QPushButton		qEnviaBtn,
					qRndBtn;
    QLabel			numJuegos;
    
    
    public static void main(String[] args) {
        QApplication.initialize(args);

        Principal testPrincipal = new Principal();
        testPrincipal.show();

        QApplication.exec();
    }

    public Principal() {
        ui.setupUi(this);
             
        qNick 		= ui.nickEdit;
		qRndResult 	= ui.resultRandomEdit;
        qListResult = ui.resultListEdit;
        qEnviaBtn	= ui.enviaBtn;
		qRndBtn		= ui.RandBtn;
		numJuegos	= ui.numJuegos;

        qEnviaBtn	.clicked.connect( this, "envia()" );
        qRndBtn		.clicked.connect( this, "rand()" );
        numJuegos	.clear();
    }

    public Principal(QWidget parent) {
        super(parent);
        ui.setupUi(this);
        
        qNick 		= ui.nickEdit;
		qRndResult 	= ui.resultRandomEdit;
        qListResult = ui.resultListEdit;
        qEnviaBtn	= ui.enviaBtn;
		qRndBtn		= ui.RandBtn;

        qEnviaBtn	.clicked.connect( this, "envia()" );
        qRndBtn		.clicked.connect( this, "rand()" );
    }
    
    public String envia(){
    	try {
    		if ( qNick.text().isEmpty() )
    			return null;
			qListResult.clear();
			
			String str = readLista( qNick.text().trim() );
			String 	listaJuegos = "",
					listaIDs	= "",
					aux			= "",
					tmp			= str;
			
			while( tmp.indexOf("\t")!=-1 ){
				aux 		 = tmp.substring( 0, tmp.indexOf("\n") );
				listaIDs 	+= aux.substring( aux.indexOf("\t"), aux.length() ).trim() + "\n";
				listaJuegos	+= aux.substring( 0, aux.indexOf("\t") ) + "\n";
				tmp			 = tmp.substring( tmp.indexOf("\n") + 1, tmp.length() );
			}
			
            qListResult.appendPlainText( listaJuegos );
            numJuegos	.setText( "Tienes " + listaJuegos.split("\n").length + " juegos." );
            qListResult.setDisabled( false );
            QTextCursor q = qListResult.textCursor();
            q.setPosition( 0 );
            qListResult.setTextCursor( q );
            
            return listaIDs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
    
    public void rand(){
    	try {
    		String sID = "";
    		if( !qListResult.isEnabled() || sID.isEmpty() || sID == null ) 
    			sID = envia();
			String[] str = qListResult.toPlainText().split( "\n" );
			int n = (int) ( Math.random()*str.length );
			qRndResult.setText( str[n] );
			
			String exec = "cmd /c start steam://rungameid/" + sID.split("\n")[n];
			Runtime.getRuntime().exec( exec );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public String readLista(String arg) throws Exception{     
        String str = "http://steamcommunity.com/id/" + arg + "/games?tab=all&xml=1";
        str = getContenidoHTML(str);
        
        String ori = "";
        String fin = "";
        String id  = "";
        
        while ( str.indexOf("\n")!=-1 ){
            ori = str.substring(0,str.indexOf("\n"));
            str = str.substring(str.indexOf("\n")+1,str.length());
            
            int x = ori.indexOf("name><![CDATA["),
                y = ori.indexOf("]]></name"),
                z = ori.indexOf("appID>"),
                w = ori.indexOf("</app");
            
            if (z!=-1 && w!=-1)
            	id   = ori.substring(z+6, w);
            if (x!=-1 && y!=-1){ 
                fin += ori.substring(x+14,y);
                if (id != "" )
                	fin += "\t\t" + id + "\n";
            	else
            		fin += "\n";
            }
        }
        
        return fin;
    }
    
    private String getContenidoHTML(String u) throws IOException {
            URL url = new URL(u);
            URLConnection uc = url.openConnection();
            uc.connect();
            
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String inputLine;
            String contenido = "";
            while ((inputLine = in.readLine()) != null) {
                contenido += inputLine + "\n";
            }
            in.close();
            return contenido;
    }
}