package contas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
class Arquivo4 {

    String vencimento, valor,tipo, dir, caminho4;
    int cont = 1;
    File banco, BDados;

    public void criarDir() throws IOException {
        dir = ("C:\\ContasPagar\\");
        BDados = new File(dir);
        BDados.mkdir();
    }

    public void novoArquivo() throws IOException {
        criarDir();
        banco = new File(dir + "ContasPagar" + cont + ".txt");
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

        bw.write(vencimento);
        bw.newLine();
        bw.write(valor);
        bw.newLine();
        bw.write(tipo);
        bw.newLine();
        bw.close();
        fw.close();
        System.out.println("Arquivo criado!");
    }
    public void editarArquivo() throws IOException{
        banco = new File(caminho4);
        if (!banco.exists()) {
            JOptionPane.showMessageDialog(null, "Arquivo não existe");
        } else {
            addInfo();
        }
    }
    public void removeArquivo() throws IOException {
        banco = new File(caminho4);
        if (!banco.exists()) {
            JOptionPane.showMessageDialog(null, "Arquivo não existe");
        } else {
            banco.delete();
            JOptionPane.showMessageDialog(null, "Conta removida com sucesso!");
        }
    }
}