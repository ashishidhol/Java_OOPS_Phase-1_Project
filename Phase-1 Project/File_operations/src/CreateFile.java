		
		import java.io.DataInputStream;
		import java.io.File;
		import java.util.Arrays;
		import java.io.FileOutputStream;
		import java.util.Scanner;
		import java.util.ArrayList;
		import java.util.List;
		import java.util.*;
		public class CreateFile  {
			
			public static void Operations () throws Exception
			{
				int op; 
				  Scanner sc = new Scanner(System.in);
				  System.out.println("Enter the Business operation number:\r\n"
				  		+ "1: Option for Arrange files in Asscending order,\r\n"+ "2:Option for different file operation like create, delete, search operation");
				  op = sc.nextInt();
				  
				     switch (op) {
				     case 1: 
						  File file = new File("C:\\\\Users\\\\user\\\\eclipse-workspace\\\\File_operations");
						  	
						  String[] fileList = file.list();
						  for(String str : fileList) {
						List<String> al = new ArrayList<String>();
						  	al = Arrays.asList(str);
						  	for(String s: al){
						  	   
						  	}
						  	  Collections.sort(al);
						  	   
						  	  
		System.out.println("Sorted FileList"+ " in Ascending order"+ al);
						         }
						  break;  
				     case 2:
				    	  System.out.println("Enter the File Operation you want to perform: press 21-for Creating file,\r\n" 
				    	  		+ " press 22-for delete, press 23-for Search file");
						 int op1 = sc.nextInt();
				    	 switch (op1) {
					     case 21: 
				    	 sc.nextLine();
						  System.out.println("Enter File name to be Created with filetype");
						  String name1=sc.nextLine();
						  File f1 = new File(name1);
					      if (f1.createNewFile()) {
					        System.out.println("File created: " + f1.getName());
					        DataInputStream dis = new DataInputStream(System.in); 
							FileOutputStream fos = new FileOutputStream(name1,true); 
							System.out.println("Enter the data in the created file");
							int ch;
							while((ch=dis.read()) != '\n') {	
								System.out.print(ch);
								fos.write(ch);
					        
					      }
					      }
					       else {
					        System.out.println("File already exists.write in existing file");
					         DataInputStream dis = new DataInputStream(System.in); 
							FileOutputStream fos = new FileOutputStream(name1,true); 
							System.out.println("Enter the data");
							int ch;
							while((ch=dis.read()) != '\n') {	
								System.out.print(ch);
								fos.write(ch);
								
							}
					     
					       }
					      break;
					     case 22:   sc.nextLine();
						  System.out.println("Enter File name to be deleted with filetype");
						  String name2=sc.nextLine();
						  File Obj = new File(name2); 
						    if (Obj.delete()) { 
						      System.out.println("Deleted the file: " + Obj.getName());
						    } else {
						      System.out.println("File Not Found so failed to delete the file.");
			        	    }
						    break;
					     case 23:	    
					  sc.nextLine();
						  System.out.println("Enter File name to search with filetype");
						  String name3=sc.nextLine();
						  File directory = new File("C:\\Users\\user\\eclipse-workspace\\File_operations");
						  String[] flist = directory.list();
					        int flag = 0;
					        if (flist == null) {
					            System.out.println("Empty directory.");
					        }
					        else {
					  
					            
					            for (int i = 0; i < flist.length; i++) {
					                String filename = flist[i];
					                if (filename.equals(name3)) {
					                    System.out.println(filename + " file is found");
					                    flag = 1;
					                    
					                }
					            }
					        }
					  
					        if (flag == 0) {
					            System.out.println("File Not Found");
					         }
					        break; 
					      }	
				     }
				     } 
		  public static void main(String[] args) throws Exception {
			  Operations ();
			  System.out.println(" Navigate back to Main context");
			  System.out.println(" Closing the application....");
			  System.exit(0);	  
		}
		  
		}
		  
		