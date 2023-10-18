import java.util.Date;
    public class Dog extends Pet
    {
        private Date lastWoofDate;
        public Dog()
        {
            this("Unnamed");
        }
        public Dog(String name)
        {
            super(name);
        }
        public Dog(String name, int age)
        {
            super(name, age);
        }
        @Override
        public String getType()
        {
            return "Собака";
        }
        public void meow()
        {
            System.out.println("Woof!");
            lastWoofDate = new Date();
        }
    }

