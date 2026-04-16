import java.io.FileWriter;
import java.io.IOException;


public class Write {
    public static void main(String[] args) {
        try {
            FileWriter writter=new FileWriter("text.txt");
            writter.write("Write using FileWriter");
            // writter.close();
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;


// public class Write {
//     public static void main(String[] args) {
//         try {
//             BufferedWriter writer=new BufferedWriter(new FileWriter("text.txt"));
//             writer.write("Write using FileWriter");
//             writer.newLine();
//             writer.write("Write using FileWriter");
//             writer.newLine();
//             writer.write("Write using FileWriter");
//             writer.write("Write using FileWriter");
//             // writer.close();
//         } 
//         catch (IOException e) {
//             System.out.println(e);
//         }
//     }
// }