/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;



/**
 *
 * @author ASUS
 */
public class decompressor {
    public static void method(File file) throws IOException{
        String fileDirectory=file.getParent();
        
        FileInputStream fin =new FileInputStream(file);
        GZIPInputStream gzip =new GZIPInputStream(fin);
        FileOutputStream fout =new FileOutputStream(fileDirectory+"/DeCompressedFile");
        
        byte[] buffer =new byte[1024];
        int len;
        
        while((len=gzip.read(buffer))!=-1){
            fout.write(buffer,0,len);
        }
        gzip.close();
        fout.close();
        fin.close();
        System.out.println("Decompressed Succesfully");
    }
    
    
}
