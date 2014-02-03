import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import Ui_mainWin;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QMainWindow;
import com.trolltech.qt.gui.QPlainTextEdit;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

public class mainWin extends QMainWindow {

    Ui_mainWin ui = new Ui_mainWin();
    QLineEdit 		qNick 		,
    			qRndResult 	;
    QPlainTextEdit	qListResult ;
    QPushButton		qEnviaBtn	,
			qRndBtn		;
    
    
    public static void main(String[] args) {
        QApplication.initialize(args);

        mainWin testmain = new mainWin();
        testmain.show();
    }

    public mainWin() {
        ui.setupUi(this);
        
        qNick 		= ui.nickEdit;
	qRndResult 	= ui.resultRandomEdit;
        qListResult     = ui.resultListEdit;
        qEnviaBtn	= ui.enviaBtn;
	qRndBtn		= ui.RandBtn;

        qEnviaBtn	.clicked.connect(this, "envia()");
        qRndBtn		.clicked.connect(this, "rand()");
        
        qListResult.setVisible(false);
    }

    public mainWin(QWidget parent) {
        super(parent);
        ui.setupUi(this);
    }
    
    public void envia(){
    	try {
			qListResult.clear();
            qListResult.appendPlainText( readLista( qNick.text().trim() ) );
			qListResult.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void rand(){
    	try {
			String[] str = readLista(qNick.text().trim()).split("\n");
			
			qRndResult.setText(  str[(int) Math.random()*str.length]  );
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public String readLista(String arg) throws Exception{     
        String str = "http://steamcommunity.com/id/" + arg + "/games?tab=all&xml=1";
        str = getContenidoHTML(str);
        
        String ori = "";
        String fin = "";
        
        while ( str.indexOf("\n")!=-1 ){
            ori = str.substring(0,str.indexOf("\n"));
            str = str.substring(str.indexOf("\n")+1,str.length());
            int x = ori.indexOf("name><![CDATA["),
                y = ori.indexOf("]]></name");
            if (x==-1 || y==-1){ 
                continue; }
            fin += ori.substring(x+14,y) + "\n";
        }
        
        return fin;
    }
        
    private String getContenidoHTML(String u) throws IOException {
            URL url = new URL(u);
            URLConnection uc = url.openConnection();
            uc.connect();
            //Creamos el objeto con el que vamos a leer
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
