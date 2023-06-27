/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author ASUS
 */
public class compressor {
    public static void method(File file)throws IOException{
        String fileDirectory=file.getParent();
        
        FileInputStream fin = new FileInputStream(file);
        FileOutputStream fout = new FileOutputStream(fileDirectory+"/CompressFile.gz");
        GZIPOutputStream gzip =new GZIPOutputStream(fout);
        
        byte[] buffer =new byte[1024];
        int len;
        
        while((len=fin.read(buffer))!=-1){
            gzip.write(buffer,0,len);
        }
        gzip.close();
        fout.close();
        fin.close();
    }
    
    
}
