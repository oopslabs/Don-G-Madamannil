class Qn5{
	 float price;
	 public Qn5(float price)
	 {
		 this.price=price;
	 }

	 class processor{
		 int no_of_cores;
		 String manufacturer;
		 public processor(int no_of_cores,String manufacturer)
		 {
			 this.no_of_cores=no_of_cores;
			 this.manufacturer=manufacturer;
			
		 }
		 void display()
		 {
			 System.out.println("no of cores: "+no_of_cores);
			 System.out.println("manufacturer: "+manufacturer);
		 }
	 }
	 public static class ram{
		  static int memory;
		static String manufacturer;
		 static public void ramdata(int memory1,String manufacturer1)
		 {
			 memory=memory1;
			 manufacturer=manufacturer1;
		 }
		 static void display()
		 {
			 System.out.println("memory: "+memory);
			 System.out.println("manufacturer: "+manufacturer);
		 }
	 }
	 public static void main(String args[])
	 {
		 Qn5.processor obj=new Qn5(20000).new processor(4,"intel");
		 obj.display();
		 Qn5.ram.ramdata(600,"asus");
		 Qn5.ram.display();
		 
	 }
 }