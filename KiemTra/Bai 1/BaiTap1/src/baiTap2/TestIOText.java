package baiTap2;

import java.io.*;

public class TestIOText {
    public static void main(String[] args) {
        File file = new File("list_song.txt");
        String[] arraySong = new String[]{"Hello Califonia", "We don't talk any more", "Nắng ấm xa dần", "Em của ngày hôm qua", "Thất tình"};
        try {
//Normal
            FileWriter writeDataToFileWithFileWriter = new FileWriter(file);
            for (String song : arraySong) {
                writeDataToFileWithFileWriter.write("\n" + song);
            }
            writeDataToFileWithFileWriter.close();
            FileReader readDataToFileWithFileReader = new FileReader(file);
            int character;
            while ((character = readDataToFileWithFileReader.read()) != -1) {
                System.out.println((char) character);
            }
            readDataToFileWithFileReader.close();
            //buffered
            BufferedWriter writeDataToFileWithBufferedWriter = new BufferedWriter(new FileWriter(file));
            for (String songs : arraySong) {
                writeDataToFileWithBufferedWriter.write("\n" + songs);
            }
            writeDataToFileWithBufferedWriter.close();

            String chars;
            BufferedReader readDataToFileWithBufferReader = new BufferedReader(new FileReader(file));
            while ((chars = readDataToFileWithBufferReader.readLine()) != null){
                System.out.println(chars);
            }
            readDataToFileWithBufferReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}