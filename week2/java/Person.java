class UniInfo {
	protected String uniName = "University ";// protect modifier can use by extending subclass

	public void getlocation() {
		System.out.println("University Of Computer Studies Thaton");
	}
}

class Person extends UniInfo {
	String name = "Lwin Nandar Oo";// default modifier cann't access outside package
	public String work = "Student";// public modifier can access everywhere
	private String subject = "Software";// private modifier can only use inside class
	private String section = "Section-B";

	public static void main(String[] args) {
		Person person = new Person();
		person.getlocation();
		System.out.println("Name:" + person.name + '\n' + "work:" + person.work + '\n' + "Subject:" + person.subject
				+ '\n' + "Section:" + person.section);
	}
}
