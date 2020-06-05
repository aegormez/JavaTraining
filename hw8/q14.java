package hw8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class q14 {
	public void print() {
		try {
			throw new FileNotFoundException();
		} catch(IOException e) {
			System.out.print("Z");
		}catch(FileNotFoundException enfe) {
			System.out.print("X");
		}finally {
			System.out.print("Y");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new q14().print();
	}

}
