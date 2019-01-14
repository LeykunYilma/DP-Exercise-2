import java.util.ArrayList;
import java.util.List;

public class Teacher{
		private String name;
		private String department;
		private int salary;
		private List<Teacher> subordinates;
		private List<Teacher> director;

		public Teacher(String name,String dept,int salary){
				this.name = name;
				this.dept = department;
				this.salary = sal;
				subordinates = new ArrayList<Teacher>();
				director = new ArrayList<Teacher>();

		}

		public void add(Teacher t) {
			subordinates.add(t);
			if(!(t.director.contains(this)) && this.subordinates.contains(t)){
				t.director.add(this);
			} 
		}
		public void remove(Teacher t){
				subordinates.remove(t);

		}
		public List<Teacher>getSubordinates(){
				return subordinates;

		}
		public int getSubordinatesTotalSalary(){
				int Salary = 0;
				for(Teacher teacher:subordinates){
					for(int i = 0; i < teacher.getSubordinates().size(); i++){
						if(teacher.getSubordinates().size()>0){
							Salary += teacher.getSubordinates().get(i).salary;
						}
					}
				}
				for (int i = 0; i < subordinates.size(); i++){
						Salary += subordinates.get(i).salary;

				}
				return Salary;

		}
			public List <Teacher> getDirector(){
					return this.director;
			}
}