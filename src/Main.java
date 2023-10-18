import java.util.ArrayList;
import java.util.List;

    public class Main
    {
        public static void main(String[] args)
        {
            List<Pet> pets = new ArrayList<>();

            pets.add(new Dog("dog", 3));
            pets.add(new Dog("pes", 5));
            pets.add(new Dog("sobaka", 2));

            pets.add(new Cat("kot", 4));
            pets.add(new Cat("kotyara", 2));
            pets.add(new Cat("koshak", 1));

            int desiredAge = 2;
            List<Cat> catsByAge = new ArrayList<>();
            for (Pet pet : pets)
            {
                if (pet.isCat() && ((Cat) pet).isAge(desiredAge))
                {
                    catsByAge.add((Cat) pet);
                }
            }

            System.out.println("Cats with age " + desiredAge + ":");
            for (Cat cat : catsByAge)
            {
                System.out.println("Name: " + cat.getName() + ", Type: " + cat.getType());
            }
        }
    }

