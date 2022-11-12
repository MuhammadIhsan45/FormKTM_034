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
import org.springframework.ui.Model;
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
   @RequestMapping("/viewpage")
   public String getData(@RequestParam("nama") String nama,
           @RequestParam("nim") String nim,
           @RequestParam("prodi") String prodi,
           @RequestParam("gambar") MultipartFile gambar,
           Model ktm
   ) throws IOException{
        String blob = Base64.encodeBase64String(gambar.getBytes());
        String gambarasal= "data:image/jpg;base64,".concat(blob);
        
        ktm.addAttribute("nma", nama);
        ktm.addAttribute("nim", nim);
        ktm.addAttribute("prd", prodi);
        ktm.addAttribute("gbr", gambarasal);
        
        return "viewpage";
   }
}
