/*3) В американской армии считается несчастливым число 13, а в японской — 4. Перед международными учениями
        штаб российской армии решил исключить номера боевой техники, содержащие числа 4 или 13
        (например, 40123, 13313, 12345 или 13040), чтобы не смущать иностранных коллег.
        Если в распоряжении армии имеется 100 тыс. единиц боевой техники и каждая боевая машина
        имеет номер от 00001 до 99999, то сколько всего номеров придётся исключить? решить прямым и не прямым ?*/




package com.sourceit;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int[] massiv = new int[99998];
        String number;
        int counter = 0;



        for (int i = 0; i < 99998; i++) {
            massiv[i] = i;

        }
        //System.out.println(massiv[66]);


        for (int i = 0; i < 99998; i++) {

            number = Integer.toString(massiv[i]);

            if (number.contains("4") || number.contains("13")){
                counter++;
            }

        }

        System.out.println(counter);

    }
}
