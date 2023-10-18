import java.util.Date;
public class Pet {
        private String name;
        private int age;
        public Pet()
        {
            this("Unnamed");
        }
        public Pet(String name)
        {
            name = "Unnamed";
        }
        public Pet(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public String getName()
        {
            return name;
        }
        public String getType()
        {
            return "Домашнее животное";
        }

        public boolean isCat() {
            return false;
        }

        public int getAge() {
            return age;
        }

    }
