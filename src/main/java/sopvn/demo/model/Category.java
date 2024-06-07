package sopvn.demo.model;

public class Category {
	 private int idc;
	 private String name_c;
	 private int active;
	 
	 public static String IDC = "idc";
	 public static String NAME_C = "name_c";
	 public static String ACTIVE = "active";
	 
	 public Category(int idc, String name_c, int active ) {
		 super();
		 this.idc = idc;
		 this.name_c = name_c;
		 this.active = active;
	 }
	 
	 public Category() {
		 super();
		 this.idc = 0;
		 this.name_c = "";
		 this.active = 0;
	 }
	 
	 public int getIdc() {
		 return idc;
	 } 
	 
	 public void setIdc(int idc) {
		 this.idc = idc;
	 }
	 
	 public String getName_c() {
		 return name_c;
	 }
	 
	 public void setName_c(String name_c) {
		 this.name_c = name_c;
	 }
	 
	 public int getActive() {
		 return active;
	 }
	 
	 public void setActive(int active) {
		 this.active = active;
	 }
}
