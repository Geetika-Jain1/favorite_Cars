package org.example;

public class Main {
    public static void main(String[] args) {

           var myVolvo = new Car("Volvo","s90", 2023);



        var db = new DataBase();

         var res = db.saveCar(myVolvo);

         if (res){
             System.out.println("car saved!");
         }else{
             System.out.println("car not saved!");
         }
    }
}