package Learning.Assignment5;

import java.util.HashMap;

public class ConvertBinarytoOctal {

    public static  void  octal(String str){
        if(str.length()%3==1){

            // append two zeros to it
            str="00"+str;
        }
        else if (str.length()%3==2)
        {
            str="0"+str;
        }
        HashMap<String, Integer> hashMap=new HashMap<>();
        hashMap.put("000",0);
        hashMap.put("001",1);
        hashMap.put("010",2);
        hashMap.put("011",3);
        hashMap.put("100",4);
        hashMap.put("101",5);
        hashMap.put("110",6);
        hashMap.put("111",7);

        String[] type=new String[3];
        int t=0;
        for (int i=0;i<str.length();i=i+3){
            String  bytepart=str.substring(i,i+3);
            type[t]=bytepart;

            if (hashMap.containsKey(type[t])){
                System.out.println(hashMap.get(type[t]));
            }
            t++;
        }




    }

    public static void main(String[] args) {
        String s = "111";
        System.out.println("Enter the binary number  :  "+s);

        System.out.printf("Binary Number Into Number:  ");
        octal(s);

    }
}
