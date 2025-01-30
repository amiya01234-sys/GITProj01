package p1;
import java.util.*;

public class C1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		try(s;){
			ArrayList<Integer> al=new ArrayList<Integer>();
			while(true) {
				System.out.println("===choice on Op of List<E>====\n\t 1-add(E)\n\t 2-add(index,E)\n\t 3-remove(object)"+
			     "\n\t4-remove(index)"+"\n\t5-get(index)"+"\n\t 6-set(index)"+"\n\t7-exit()|");
		
			
			
			System.out.println("enter your choice");
			
			int choice=s.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter the element to add to list<E>");
				al.add(new Integer(s.nextInt()));
				System.out.println("list"+al.toString());
				break;
			case 2:
				if(al.isEmpty()) {
					
				System.out.println("list is ampty");
				}
				else {
					System.out.println("Enter the index to add value");
					int i=s.nextInt();
					if(i>=0&& i<=al.size()-1) {
						System.out.println("enter the element to add");
						al.add(i,new Integer(s.nextInt()));
						System.out.println("list="+al.toString());
						
					}
					else {
						System.out.println("invalid index");
					}
				}
				break;
			case 3:
				if(al.isEmpty()) {
					System.out.println("list is empty");
				 }else
				 	{
					 System.out.println("enter the element to remove");
					 	if(al.remove(new Integer(s.nextInt()))) {
					 		System.out.println("element removed successfully");
					 		System.out.println("list="+al.toString());
					 	}
					 		else {
					 			System.out.println("element not found");
					 			}
				 	}
				break;
			case 4:
				if(al.isEmpty()) {
					System.out.println("list is empty");
				}else {
					System.out.println("enter the index");
					int i2=s.nextInt();
					if(i2>=0 && i2<=al.size()-1) {
						al.remove(i2);
						System.out.println("element removed succesfully from the given index");
						System.out.println("list="+al.toString());
					}else {
						System.out.println("invalid index");
					}
					
					
				}break;
			case 5:
				if(al.isEmpty()) {
					System.out.println("list is empty");
				}else {
					System.out.println("enter the index to get the element");
					int i3=s.nextInt();
					if(i3>=0 && i3<=al.size()-1) {
						Integer el=al.get(i3);
						System.out.println("element at the index\t"+i3+"\tis="+el.toString());
					}else {
						System.out.println("invalid index");
					}
				}break;
				
			case 6:
				if(al.isEmpty()) {
					System.out.println("list is empty");
				}else {
					System.out.println("enter the index to set");
					int i4=s.nextInt();
					if(i4>=0 && i4<=al.size()-1) {
						System.out.println("enter the element to set");
						al.set(i4, new Integer(s.nextInt()));
						System.out.println("List="+al.toString());
					}else {
						System.out.println("invalid index");
					}
				}break;
			case 7:
				System.out.println("operation stopped");
				System.exit(0);
			default:
				System.out.println("opertaion stopped");
			
			
			}}
			
			
			
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
