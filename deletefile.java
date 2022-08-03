package com.company;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
class deletefile
{
    public static void delete() throws IOException , FileNotFoundException

    {
        try {
            File myfile = new File("C:\\Users\\ELCOT\\untitled1");
            boolean b = myfile.delete();
            if (b)
                System.out.println("File is Deleted");
            else
                System.out.println("File is not Deleted");;
        } catch (Exception e) {
            System.out.println("Given file name is wrong");
        }
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
	deletefile myobj = new deletefile();
    myobj.delete();
    }
}
