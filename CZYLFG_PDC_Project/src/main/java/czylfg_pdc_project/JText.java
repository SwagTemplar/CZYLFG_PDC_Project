
package czylfg_pdc_project;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
/*
 * @author "Connor Stewart 17982915"
 */

public class JText {
    public static void main(String[] args) {
        JFileChooser fc = new JFileChooser();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextArea jtArea = new JTextArea(20,100);
        
        JButton readButton = new JButton("OPEN FILE");
        readButton.addActionListener(ev -> {
        int returnValue = fc.showOpenDialog(frame);
        if(returnValue == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            try{
                BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                jtArea.read(input, "Reading file");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            System.out.println("Failed");
        }
        });
        
        frame.getContentPane().add(jtArea, BorderLayout.CENTER);
        frame.getContentPane().add(readButton, BorderLayout.PAGE_END);
        frame.pack();
        frame.setVisible(true);
        
    }
}
