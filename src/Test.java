public class Test {
    public static interface A{
        public static final String hair = "短头发";
    }
    public static interface B{
        public static final String school = "重庆邮电大学";
    }
    public static interface C extends A,B{
        public static final String glass = "戴眼镜";
        public abstract void printC();
    }
    abstract static class Person{
        private String name;
        private int height;
        private int weight;
        private int age;
        Person(){ }
        public String getName(){
            return name;
        }
        public int getHeight(){
            return height;
        }
        public int getWeight(){
            return weight;
        }
        public int getAge(){
            return age;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setHeight(int height){
            this.height = height;
        }
        public void setWeight(int weight){
            this.weight = weight;
        }
        public void setAge(int age){
            this.age = age;
        }
        public abstract void getInfo();
    }
    public static class Girl extends Person implements C{
        public Girl(String name,int age,int height,int weight){
            super.name = name;
            super.age = age;
            super.height = height;
            super.weight = weight;
        }
        public void printC(){
            System.out.println("我是" + hair + ",我在" + school + "读书，我" + glass);
        }
        public void getInfo(){
            System.out.println("我叫" + getName() + ",年龄" + getAge()
                    + ",体重" + getWeight() + ",身高" + getHeight());
        }
    }
}