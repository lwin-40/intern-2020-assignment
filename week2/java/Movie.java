
public class Movie {
 private String name;


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public static void main( String [] args) {
	Movie movie=new Movie();
	movie.setName("Sanam Teri Kasam");
	System.out.println("Movie name:"+movie.getName());
}

}