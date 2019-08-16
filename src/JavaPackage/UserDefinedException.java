package JavaPackage;

public class UserDefinedException {

			public static void empinfo(int empId,String empName)throws UserClass{
				
				if(empId==1&&empName=="ABC") {
					System.out.println("passed");
				}
				else
				{
					throw new UserClass("not a valid name or id");
					
				}
				
			}
		public static void main(String[] args) throws UserClass {
			empinfo(1,"ABC");
			System.out.println("Test");
		}
		
	}


