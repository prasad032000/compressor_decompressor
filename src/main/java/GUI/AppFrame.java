/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import comp_decomp.compressor;
import comp_decomp.decompressor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class AppFrame extends JFrame implements ActionListener{
    
    JButton compressButton;
    JButton decompressButton;
    
    AppFrame(){
        
        
        
        compressButton =new JButton("Select file to Compress");
        compressButton.setBounds(20,100,200,30);
        compressButton.addActionListener(this);

        
        decompressButton =new JButton("Select file to DeCompress");
        decompressButton.setBounds(20,100,200,30);
        decompressButton.addActionListener(this);
        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(1000,500);
        this.getContentPane().setBackground(Color.black);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==compressButton){
            System.out.println("Hello Prasad, in Compression");
            JFileChooser fileChooser=new JFileChooser();
            int response=fileChooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file =new File(fileChooser.getSelectedFile().getAbsolutePath());
                
                try{
                    compressor.method(file);
                }catch(Exception ee){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
            System.out.println("DOne Prasad");
        }
        
        if(e.getSource()==decompressButton){
            System.out.println("Hello Prasad, in the decompression");
            JFileChooser fileChooser=new JFileChooser();
            int response=fileChooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file =new File(fileChooser.getSelectedFile().getAbsolutePath());
                try{
                    decompressor.method(file);
                }catch(Exception ef){
                    JOptionPane.showMessageDialog(null, ef.toString());
                }
            }
            System.out.println("Done Prasad");
        }
    }
}
