import javax.swing.*;
public class CompositePattern{
		public static void main(String[] args){
			Teacher Director = new Director("Tekle","Director",50,000);
			Teacher Biology = new Teacher("ketema","biology",5000);
			Teacher Chemistry = new Teacher("Abebe","Chemistry",5000);
			Teacher Physics = new Teacher("Girmachew","Physics",8000);

			Director.add(Physics);
			Director.add(Biology);
			Director.add(Chemistry);

			Biology.add(labAssistant1);
			Chemistry.add(labAssistant2);
			System.out.println("Subordinates of Teacher Director");
			for(Teacher director: Director.getSubordinates()){
					System.out.println(director);
					for(Teacher teacher: director.getSubordinates()){
						System.out.println(teacher);

					}
			}
			System.out.println("\n Salary of subordinates under director " + director.getSubordinatesSalary());

				System.out.println("\n Directors of labAssistants are \n");
					for (Teacher teach : labAssistant1.getDirector()){
						System.out.prinln(teach);

						for(Teacher t : teach.getDirector()){
							System.out.println(t);
						}
					}


		}
}