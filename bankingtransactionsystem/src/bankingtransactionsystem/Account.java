package bankingtransactionsystem;

public class Account {
private String Accountname,email;
private int bal;
public String getname() {
	return Accountname;
}
public void setname(String name) {
	this.Accountname=name;
}
public String getemail() {
	return email;
}
public void setemail(String email) {
	this.email=email;
}
public int getbal() {
	return bal;
}
public void setbal(int bal) {
	this.bal=bal;
}
public String toString() {
	return  "AccountDetails [Accountname = "+Accountname +", email = "+email+", balance = "+bal+"]";
}
}
