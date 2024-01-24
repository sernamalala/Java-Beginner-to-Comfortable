
public class Class {
    public static void main(String[] args) {
        
        Person p1 = new Person("Serna", 20, "Amazon");
    System.out.println(p1);
    }
    
    static class Person{
        private String name;
        private int age;
        private String job;

        public Person(String name, int age, String job){

            this.name = name;
            this.age = age;
            this.job = job;
        }
        public int getAge() {
            return age;
        }
        public String getJob() {
            return job;
        }
        public String getName() {
            return name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setJob(String job) {
            this.job = job;
        }
        public void setName(String name) {
            this.name = name;
        }
    
        public String toString() {
            // TODO Auto-generated method stub
            return "Hi!\nMy name is "+name+".\nI am "+age+" Years old.\nI work in "+job;
        }
    }
}
