public class Main {
    public static void main(String[] args) throws Exception {
        Pet typicalFamilyDog = new  Pet();
        Pet riley = new Pet("Riley", 13, "sofa", "Toy Poodle");
        Pet daisy = new Pet("Daisy", 10, "wherever the food is", "Cat");
        System.out.println(riley.getName());

        TV defaultTV = new TV();
        System.out.println("               Brand: " + defaultTV.getBrand());
        System.out.println("         Screen Size: " + defaultTV.getSizeInches());
        System.out.println("Backlight Technology: " + defaultTV.getBacklightTechnology());
        System.out.println("        Large Screen: " + defaultTV.isLargeScreen());
    }
}
