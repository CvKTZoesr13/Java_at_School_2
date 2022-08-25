package input_output_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteList {
	// Windows: C:/Data/test/flowers.data
	private static String file_path = "D:\\Downloads\\flowers.txt";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeFile();
		readFile();
	}
	// write file function
	private static void writeFile() throws IOException{
		ArrayList<String> flowers = new ArrayList<String>();
		// add elements to ArrayList
		flowers.add("Tulip");
		flowers.add("Hoa thủy tiên");
		flowers.add("Hoa anh túc đỏ");
		flowers.add("Hoa hướng dương");
		flowers.add("Hoa chuông xanh");
		File file = new File(file_path);
		file.getParentFile().mkdirs();
		OutputStream os = new FileOutputStream(file)
		;
		ObjectOutputStream oos = new ObjectOutputStream(os);
		// Write a String
		oos.writeUTF("Danh sách các loài hoa: ");
		// Write an Object
		oos.writeObject(flowers);
		oos.close();
	}
	// read file function
	@SuppressWarnings({ "unchecked"})
	private static void readFile() throws IOException, ClassNotFoundException {
	File file = new File(file_path);
	file.getParentFile().mkdirs();
	InputStream is = new FileInputStream(file);
	ObjectInputStream ois = new ObjectInputStream(is);
	// Read a String
	String info = ois.readUTF();
	// Read an Object
	List<String> flowers = (List<String>) ois.readObject();
	System.out.println(info);
	System.out.println();
	for (String s : flowers) {
	System.out.println(s);
	}
	ois.close();
	}
}
