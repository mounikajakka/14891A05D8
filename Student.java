import java.util.Date;
import java.util.*;

/**
 * Class that stores information about the concrete student
 *
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 *
 */
public class Student implements Comparable {

	/**
	 * student id
	 */
	private int id;

	/**
	 * student name and surname separated by the whitespace for example:
	 * fullName = "David Luis";
	 */
	private String fullName;

	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date birthDate;

	/**
	 * student average mark
	 */
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}

	public int getId() {
	    int n,ar[],nextLine;
	    int[] ar1=new int[n];
	    int i;
	    Scanner in=new Scanner(System.in);
	    for(i=0;i<n;i++)
	    System.out.println("enter any number");
		ar1[i]=in.nextLine();
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
	    int i,ar[],nextLine;
	   int n;
    int[] ar2=new int[n];
     Scanner in=new Scanner(System.in);
     for(i=0;i<n;i++)
        System.out.println("enter name");
     ar[i]=in.nextLine(int.student);
return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDate() {


		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getAvgMark() {
	    int total,n,ar[],nextLine;
	    int AvgMark;
	    Scanner in=new Scanner(System.in);
System.out.println("enter total marks");
	    ar[total]=in.nextLine();
System.out.println("enter n");
	    ar[n]=in.nextLine;
	    AvgMark=(total/n);
	    ar[AvgMark]=in.nextLine();
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}


	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}


	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}
