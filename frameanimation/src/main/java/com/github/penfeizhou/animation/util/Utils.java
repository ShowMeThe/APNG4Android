package com.github.penfeizhou.animation.util;

public class Utils {

   public static void tryGc(){
      try {
         Runtime.getRuntime().gc();
      }catch (Exception e){
         e.printStackTrace();
      }
   }

}
