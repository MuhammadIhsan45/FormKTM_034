/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.FormKTM;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author hp
 */
@Controller
public class controllerKTM {
   @RequestMapping("/hallo")
   @ResponseBody
   public String getData(@RequestParam("nama") String nama,
           @RequestParam("NIM") String nim,
           @RequestParam("Prodi") String prodi,
           @RequestParam("gambar") MultipartFile gambar
   ) throws IOException{
       nama = textProcess(nama);
       nim = textProcess(nim);
       prodi = textProcess(prodi);
       
       String blob = Base64.encodeBase64String(gambar.getBytes());
       return nama + nim + prodi + "<br><img src='data:image/jpeg;base64,"+blob+" ' />";
   }
   private String textProcess(String nama,){
       String result ="";
       return result;
   }
}
