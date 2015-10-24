package contas;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
class Novo5 {
 public void addNovo(String n, String t, String v, String r) {
        ArrayList<String> l = new ArrayList<>();
        try{
            Arquivo5 arq = new Arquivo5();
            arq.nomedocliente = n;
            arq.tipo = t;
            arq.vencimento = v;
            arq.valor = r;
            arq.novoArquivo();
            l.add("ARQUIVO CRIADO COM SUCESSO!\n"+"\nNome do Cliente: "+n+"\nTipo: "+t+"\nVencimento: "+v+"\nValor: "+r+"\n");        
    }
    catch (IOException ex) {
            
        JOptionPane.showMessageDialog(null,"Arquivo não foi criado!");
     }
        JOptionPane.showMessageDialog(null, l.toArray());
  }
}
      

