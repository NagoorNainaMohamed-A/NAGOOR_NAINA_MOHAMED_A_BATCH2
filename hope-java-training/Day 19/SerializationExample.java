// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectOutputStream;
// import java.io.Serializable;
// class Student implements Serializable{
//     String name;
//     int mark;
//     Student(String name,int mark)
//     {
//         this.name=name;
//         this.mark=mark;
//     }
// }
// public class Serialization{
//     public static void main(String[] args) throws IOException
//     {
//         Student s=new Student("XYZ",44);
//         FileOutputStream fo=new FileOutputStream("student.txt");//open file
//         ObjectOutputStream objStream=new ObjectOutputStream(fo);//obj to byte stream
//         objStream.writeObject(s);//writing on file
//         fo.close();
//         objStream.close();
//     }

// }
import java.io.*;
class Student implements Serializable{
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{
    public CustomObjectOutputStream(OutputStream out) throws IOException{
        super(out);
    }
    @Override   
    protected void writeStreamHeader() throws IOException{
        //do nothing to avoid writing header again
    }
}
public class SerializationExample{
    public static void main(String[] args) throws IOException{
        //Serialization
        Student s=new Student("pokemon",44);
        //FileOutputStream fos=new FileOutputStream("student.txt",true);//open file,true for append
        File file=new File("student.txt");
        FileOutputStream fos=new FileOutputStream(file,true);
        //ObjectOutputStream oos=new ObjectOutputStream(fos);//obj to byte stream
        ObjectOutputStream oos;
        if(file.length()==0){
            oos=new ObjectOutputStream(fos);//first time serializing
        }
        else{
            oos=new CustomObjectOutputStream(fos);//appending to the existing serialization file
        }
        oos.writeObject(s);//writing on files
        fos.close();
        oos.close();
    }
}