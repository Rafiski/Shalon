package contas;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
class Novo4 {

    public void addNovo(String v, String r, String t) {
        ArrayList<String> l = new ArrayList<>();
        try{
            Arquivo4 arq = new Arquivo4();
            arq.vencimento = v;
            arq.valor = r;
            arq.tipo = t;
            arq.novoArquivo();
            l.add("ARQUIVO CRIADO COM SUCESSO!\n"+"\nVencimento: "+v+"\nValor: "+r+"\nTipo: "+t+"\n");        
    }
    catch (IOException ex) {
            
        JOptionPane.showMessageDialog(null,"Arquivo não foi criado!");
     }
        JOptionPane.showMessageDialog(null, l.toArray());
  }
}
    
    
    
    
    
    
    
    
    
