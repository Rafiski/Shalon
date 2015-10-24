package contas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
class Arquivo5 {

    String nomedocliente, tipo, vencimento, valor, dir, caminho5;
    int cont = 1;
    File banco, BDados;

    public void criarDir() throws IOException {
        dir = ("C:\\ContasReceber\\");
        BDados = new File(dir);
        BDados.mkdir();
    }

    public void novoArquivo() throws IOException {
        criarDir();
        banco = new File(dir + "ContasReceber" + cont + ".txt");
        criarArquivo();
    }

    public void criarArquivo() throws IOException {
        if (!banco.exists()) {
            banco.createNewFile();
            addInfo();
        
        } else {
            
            cont++;
            banco.createNewFile();
            novoArquivo();

        }
    }
    public void addInfo() throws IOException {
        FileWriter fw = new FileWriter(banco);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(nomedocliente);
        bw.newLine();
        bw.write(tipo);
        bw.newLine();
        bw.write(vencimento);
        bw.newLine();
        bw.write(valor);
        bw.newLine();
        bw.close();
        fw.close();
        System.out.println("Arquivo criado!");
    }
     public void editarArquivo() throws IOException{
        banco = new File(caminho5);
        if (!banco.exists()) {
            JOptionPane.showMessageDialog(null, "Arquivo não existe");
        } else {
            addInfo();
        }
    }
      public void removeArquivo() throws IOException {
        banco = new File(caminho5);
        if (!banco.exists()) {
            JOptionPane.showMessageDialog(null, "Arquivo não existe");
        } else {
            banco.delete();
            JOptionPane.showMessageDialog(null, "Conta removida com sucesso!");
        }
      }
}