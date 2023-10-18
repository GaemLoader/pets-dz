import java.util.Date;

        public class Cat extends Pet {
            private Date lastMeowDate;

            public Cat() {
                this("Unnamed");
            }

            public Cat(String name) {
                super(name);
            }

            public Cat(String name, int age) {
                super(name, age);
            }

            @Override
            public String getType() {
                return "Кот";
            }

            public void meow() {
                System.out.println("Meow!");
                lastMeowDate = new Date();
            }

            public boolean isCat() {
                return true;
            }

            public boolean isAge(int age) {
                return this.getAge() == age;
            }
        }
