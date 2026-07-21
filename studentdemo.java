public class studentdemo{
static class student{
int rollNo;
String name;
student(int r,String n)
{
rollNo=r;
name=n;
System.out.println("Constructor called for roll no:"+rollNo);
}
void display()
{
System.out.println("roll no:"+rollNo+"\tname:"+name);
}
protected void finalize(){
System.out.println("Destructor(finalize)called for roll no:"+rollNo);
}
}
public static void main(String[] args)throws InterruptedExecption{
System.out.println("-------Creating array of objects-------");
student[]s=new student[3];
s[0]=new student(101,"Arun");
s[1]=new student(102,"Bala");
s[2]=new student(103,"Chitra");
System.out.println("\n-------Displaying student details------");
for(int i=0;i<s.length;i++)
s[i].display();
System.out.println("\n--------Dereferencing objects and requesting garbage collection--------");
for(int i=0;i<s.length;i++)
s[i]=null;
System.gc();
Thread.sleep(500);
}
}