/*Address book problem for ADD,UPDATE,DELETE,PRINT ALL DATA*/

package AddressBook;
import java.util.Scanner;

class Detail
{
	
	 private String firstName;
	 private String lastName;
	 private String address;
	 private String city;
	 private String state;
	 private int zip;
	 private long phoneNo;
	
	public Detail(String firstName, String lastName, String address, String city, String state, int zip, long phoneNo)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
	}
	
	
	 
 
	 
     @Override
	public String toString() {
		return "Detail [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", toString()=" + super.toString()
				+ "]";
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public int getZip() 
	{
		return zip;
	}
	public void setZip(int zip)
	{
		this.zip = zip;
	}
	public long getPhoneNo()
	{
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) 
	{
		this.phoneNo = phoneNo;
	}
	
}


public class Addressbook
{

	public static void main(String[] args)
	{
		 String firstName;
		 String lastName;
		 String address;
		 String city;
		 String state;
		 int zip;
		 long phoneNo;
		 Detail info[]=new Detail[100];
		 Scanner sc=new Scanner(System.in);
		 int count=0,Book;
		 while(true)
		 {
			System.out.println("WELCOME TO ADDRESS BOOK");
			System.out.println("1.Add Record \n 2.Update Record \n 3.Delete Record \n 4. Display all Record \n 5.exit");
			System.out.println("Enter your choice  : ");
			int choice = sc.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("ADD RECORD");
				System.out.println(" ");
				System.out.println("Enter number of infos to be entered");
				Book = sc.nextInt();
				for(int i=0;i<Book;i++)
				{
					System.out.println("Enter First Name :");
					firstName=sc.next();
					System.out.println("Enter Last Name :");
					lastName=sc.next();
					System.out.println("Enter Address :");
					address=sc.next();
					System.out.println("Enter State :");
					state=sc.next();
					System.out.println("Enter City :");
					city=sc.next();
					System.out.println("Enter Zip Code :");
					zip=sc.nextInt();
					System.out.println("Enter Phone Number:");
					phoneNo=sc.nextLong();
					info[count++]=new Detail(firstName, lastName, address, city, state, zip, phoneNo);
					System.out.println("Record added sucessfully.");
					System.out.println(" ");

				}
				break;
			case 2:
				   System.out.println("UPDATE RECORD");
				   System.out.println("Enter Phone Number for updation of record : ");
					phoneNo = sc.nextLong();
					for (int i = 0; i <= count; i++)
					{

						if (info[i] != null && info[i].getPhoneNo()==phoneNo) 
						{
							System.out.println("Enter First Name :");
							firstName=sc.next();
							info[i].setFirstName(firstName);
							System.out.println("Enter Last Name :");
							lastName=sc.next();
							info[i].setLastName(lastName);
							System.out.println("Enter Address :");
							address=sc.next();
							info[i].setAddress(address);
							System.out.println("Enter State :");
							state=sc.next();
							info[i].setState(state);
							System.out.println("Enter City :");
							city=sc.next();
							info[i].setCity(city);
							System.out.println("Enter Zip Code :");
							zip=sc.nextInt();
							info[i].setZip(zip);
							System.out.println("AddressBook Updated by PhoneNumber"+phoneNo);
						}
					}
					break;

			case 3:
				System.out.println("DELETE TO RECORD");
				System.out.println(" ");
				System.out.println("Enter phone number for deletion : ");
				phoneNo= sc.nextLong();
				for (int i = 0; i <= count; i++) 
				{

					if (info[i] != null && info[i].getPhoneNo()== phoneNo)
					{
						info[i] = null;
						System.out.println("Record deleted successfully");
					}
				}

				break;

			case 4:

				System.out.println("Display all Addressbook record");
				System.out.println(" ");

				for (int i = 0; i <count; i++)
				{

					System.out.println(info[i]);

				}

				break;

			case 5:

				System.exit(0);

			default:
				System.out.println("Please enter correct choice");


			}
	 }


}



}




