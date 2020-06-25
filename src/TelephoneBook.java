public class TelephoneBook {
    public static void main(String[] args){
        Phonebook book = new Phonebook();
        book.addContact("Roma", "363487");
        book.addContact("Rita", "870977");
        book.addContact("Kola", "544456");
        book.addContact("Roma", "877765");
        book.addContact("Sena", "877737");
        book.addContact("Sena", "877733");

        // ищем по имени
        book.findAndPrint("Roma");
        book.findAndPrint("Sena");
        book.findAndPrint("Kola");
    }
}
