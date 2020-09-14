package internship.dilthe.DLitheiInternCore;

public class InRole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dlithe consultancy");
		Holder student1=new Holder();
		student1.name="Arya";
		student1.mobile=998089771L;
		student1.cgpa=9.2;
		student1.confirm();
		}

}

class Holder
{
	String name,skill;
	Long mobile;
	Double cgpa;
	public void confirm() {
		System.out.println(this.name+" "+this.skill+" "+this.mobile+" "+this.cgpa);
	}
}
