package dz6;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class HoweWork {
    public static void main (String[] args){
        try {
            FileOutputStream textOne = new FileOutputStream("text_1.txt");
                PrintStream textOnePS = new PrintStream("text_1.txt");
                textOnePS.println(" Настоящие тюлени — семейство хищных млекопитающих из парвотряда ластоногих подотряда собакообразных. \n Длина тела и масса сильно варьируются: от 1,25 до 6,5 м и от 90 кг до 3,5 т.\n Кольчатая нерпа — наименьшая, а морские слоны — наибольшие среди настоящих тюленей.\n Половой диморфизм в той или иной мере выражен у многих видов — хохлач, крылатка.\n Но экстремально проявляется у морских слонов, самцы которых являются самыми крупными тюленями.\n");
                textOnePS.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        try {
            FileOutputStream textTwo = new FileOutputStream("text_2.txt");
            String text = "Форма тела веретенообразная; голова заметно суживается спереди. " +
                    "Шея короткая, малоподвижная. Наружные ушные раковины отсутствуют. " +
                    "На верхней губе 6—10 рядов вибрисс, менее жёстких, чем у моржей. Хвост короткий, но хорошо выраженный. " +
                    "Передние ласты составляют меньше 25 % длины тела и заметно меньше задних. " +
                    "По сравнению с ушастыми тюленями и моржами у настоящих тюленей они расположены ближе к голове. " +
                    "Задние ласты всегда вытянуты назад, поскольку не сгибаются в пяточном сочленении и не могут служить опорой при передвижении по суше. " +
                    "Когти у большинства видов хорошо развиты на всех ластах; " +
                    "только у тюленя Росса они редуцированы до небольших бугорков. " +
                    "Ласты не имеют кожно-хрящевой оторочки, поддерживающей их края.";
            byte[] text_2 = text.getBytes();
            textTwo.write(text_2);
            textTwo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Склеиваем 2 файла
        try {
            FileOutputStream textAll = new FileOutputStream("text_1 + text_2.txt");
            FileInputStream inputOne = new FileInputStream("text_1.txt");
            FileInputStream inputTwo = new FileInputStream("text_2.txt");
//            Чтение файла с русским текстом c выводом в консоль
//            InputStreamReader readerOne = new InputStreamReader(inputOne,"UTF-8");
//            int readOne
//            while((readOne = readerOne.read()) != -1) {
//                System.out.print((char) readOne);
//            }
//            readerOne.close();
            int out;
            while((out = inputOne.read()) != -1){
                textAll.write(out);
            }
            inputOne.close();
            while ((out = inputTwo.read()) != -1){
                textAll.write(out);
            }
            inputTwo.close();
            textAll.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Поиск слова в тексте

        Scanner world = new Scanner(System.in);
        System.out.println("Введите слово для поиска");
        final String  WORLD = world.next() ;

        try {
            FileInputStream textFindWorld = new FileInputStream("text_1 + text_2.txt");
            StringBuilder textFindWorldSB = new StringBuilder();
            InputStreamReader readerFindWorld = new InputStreamReader(textFindWorld, "UTF-8");
            int out;
            while((out= readerFindWorld.read()) != -1) {
                textFindWorldSB.append((char) out);
            }
            textFindWorld.close();
            readerFindWorld.close();
            if(textFindWorldSB.toString().contains(WORLD)){
                System.out.println("Cлово " + "'" + WORLD + "'" + " найдено в файле!");
            }else {
                System.out.println("Cлова " + "'" + WORLD + "'" +  " нет в файле!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Поиск слова в папке
    public static void findWorld (String dir, String world){
        boolean find;
        File directory  = new File(dir);
        for (File someFile : directory.listFiles()){
            try {
                FileInputStream someFileIS = new FileInputStream(someFile.getAbsolutePath());
                InputStreamReader readerSomeFileIS = new InputStreamReader(someFileIS,"UTF-8");
                StringBuilder someFileSB = new StringBuilder();
                int out;
                while ((out = readerSomeFileIS.read()) != -1) {
                    someFileSB.append((char) out);
                }
                if(someFileSB.toString().contains(world)){
                    System.out.println("Cлово " + "'" +  world + "'" + " найдено в файле " + someFile.getName());
                    find = true;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(find = false){
            System.out.println("Cлова " + "'" +  world + "'" + " нет в папке " + directory.getAbsolutePath());
        }
    }
}
