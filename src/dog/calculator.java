package dog;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;


public class calculator {

	public static void main(String[] args) throws IOException {
		File f=new File("E:\\Folder1\\fol1\\fol\\NewFile.txt");
		FileUtils.write(f, "java class satrted");
		FileUtils.write(f, "Python class Started",false);
		FileUtils.write(f, "Selenium class Started", true);
		System.out.println("done.......");
		List<String> l = FileUtils.readLines(f);
		for (String x : l) {
			System.out.println(x);
		}
	}
}