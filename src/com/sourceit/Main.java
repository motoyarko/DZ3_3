/*3) � ������������ ����� ��������� ������������ ����� 13, � � �������� � 4. ����� �������������� ��������
        ���� ���������� ����� ����� ��������� ������ ������ �������, ���������� ����� 4 ��� 13
        (��������, 40123, 13313, 12345 ��� 13040), ����� �� ������� ����������� ������.
        ���� � ������������ ����� ������� 100 ���. ������ ������ ������� � ������ ������ ������
        ����� ����� �� 00001 �� 99999, �� ������� ����� ������� ������� ���������? ������ ������ � �� ������ ?*/




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
