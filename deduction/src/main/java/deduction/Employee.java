package deduction;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Employee implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("ID")
	private String id;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;

	@org.kie.api.definition.type.Label("Salary")
	private int salary;

	private java.lang.String grade;

	private java.lang.String fitnessTimeLastYear;

	private int requestPending;

	public Employee() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getGrade() {
		return this.grade;
	}

	public void setGrade(java.lang.String grade) {
		this.grade = grade;
	}

	public java.lang.String getFitnessTimeLastYear() {
		return this.fitnessTimeLastYear;
	}

	public void setFitnessTimeLastYear(java.lang.String fitnessTimeLastYear) {
		this.fitnessTimeLastYear = fitnessTimeLastYear;
	}

	public int getRequestPending() {
		return this.requestPending;
	}

	public void setRequestPending(int requestPending) {
		this.requestPending = requestPending;
	}

	public Employee(java.lang.String id, java.lang.String name, int salary, java.lang.String grade,
			java.lang.String fitnessTimeLastYear, int requestPending) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.fitnessTimeLastYear = fitnessTimeLastYear;
		this.requestPending = requestPending;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", grade=" + grade
				+ ", fitnessTimeLastYear=" + fitnessTimeLastYear + ", requestPending=" + requestPending + "]";
	}
}