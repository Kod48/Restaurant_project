package Restaurant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private String usersFile = "data/users.csv";
    private String dishesFile = "data/Dish.csv";
    private String desertFile = "data/Desert.csv";
    private String drinkFile = "data/Drink.csv";
    private String tablesFile = "data/tables.csv";

    // Kullanıcıları CSV dosyasından oku
    public List<String[]> readUsers() {
        List<String[]> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(usersFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                users.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    // Yemekleri CSV dosyasından oku
    public List<String[]> readDishes() {
        List<String[]> dishes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(dishesFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                dishes.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dishes;
    }

    // Tatlıları CSV dosyasından oku
    public List<String[]> readDeserts() {
        List<String[]> deserts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(desertFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                deserts.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return deserts;
    }

    // İçecekleri CSV dosyasından oku
    public List<String[]> readDrinks() {
        List<String[]> drinks = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(drinkFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                drinks.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return drinks;
    }

    // Masaları CSV dosyasından oku
    public List<String[]> readTables() {
        List<String[]> tables = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(tablesFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                tables.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tables;
    }

    // Kullanıcıyı CSV dosyasına ekle
    public void addUser(String[] user) {
        try (FileWriter writer = new FileWriter(usersFile, true)) {
            for (int i = 0; i < user.length; i++) {
                writer.append(user[i]);
                if (i != user.length - 1) {
                    writer.append(",");
                }
            }
            writer.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Yemeği CSV dosyasına ekle
    public void addDish(String[] dish) {
        try (FileWriter writer = new FileWriter(dishesFile, true)) {
            for (int i = 0; i < dish.length; i++) {
                writer.append(dish[i]);
                if (i != dish.length - 1) {
                    writer.append(",");
                }
            }
            writer.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Tatlıyı CSV dosyasına ekle
    public void addDesert(String[] desert) {
        try (FileWriter writer = new FileWriter(desertFile, true)) {
            for (int i = 0; i < desert.length; i++) {
                writer.append(desert[i]);
                if (i != desert.length - 1) {
                    writer.append(",");
                }
            }
            writer.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // İçeceği CSV dosyasına ekle
    public void addDrink(String[] drink) {
        try (FileWriter writer = new FileWriter(drinkFile, true)) {
            for (int i = 0; i < drink.length; i++) {
                writer.append(drink[i]);
                if (i != drink.length - 1) {
                    writer.append(",");
                }
            }
            writer.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Masayı CSV dosyasına ekle
    public void addTable(String[] table) {
        try (FileWriter writer = new FileWriter(tablesFile, true)) {
            for (int i = 0; i < table.length; i++) {
                writer.append(table[i]);
                if (i != table.length - 1) {
                    writer.append(",");
                }
            }
            writer.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Kullanıcıyı güncelleme
    public void updateUser(String userID, String[] newUser) {
        List<String[]> users = readUsers();
        for (int i = 0; i < users.size(); i++) {
            String[] user = users.get(i);
            if (user[1].equals(userID)) { // ID'ye göre kullanıcıyı bul
                users.set(i, newUser); // Yeni kullanıcı bilgileriyle güncelle
                break;
            }
        }
        // Tüm kullanıcıları dosyaya yeniden yaz
        try (FileWriter writer = new FileWriter(usersFile)) {
            for (String[] user : users) {
                for (int i = 0; i < user.length; i++) {
                    writer.append(user[i]);
                    if (i != user.length - 1) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Yemeği güncelleme
    public void updateDish(String dishID, String[] newDish) {
        List<String[]> dishes = readDishes();
        for (int i = 0; i < dishes.size(); i++) {
            String[] dish = dishes.get(i);
            if (dish[6].equals(dishID)) { // FoodID'ye göre yemeği bul
                dishes.set(i, newDish); // Yeni yemek bilgileriyle güncelle
                break;
            }
        }
        // Tüm yemekleri dosyaya yeniden yaz
        try (FileWriter writer = new FileWriter(dishesFile)) {
            for (String[] dish : dishes) {
                for (int i = 0; i < dish.length; i++) {
                    writer.append(dish[i]);
                    if (i != dish.length - 1) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Tatlıyı güncelleme
    public void updateDesert(String desertID, String[] newDesert) {
        List<String[]> deserts = readDeserts();
        for (int i = 0; i < deserts.size(); i++) {
            String[] desert = deserts.get(i);
            if (desert[6].equals(desertID)) { // FoodID'ye göre tatlıyı bul
                deserts.set(i, newDesert); // Yeni tatlı bilgileriyle güncelle
                break;
            }
        }
        // Tüm tatlıları dosyaya yeniden yaz
        try (FileWriter writer = new FileWriter(desertFile)) {
            for (String[] desert : deserts) {
                for (int i = 0; i < desert.length; i++) {
                    writer.append(desert[i]);
                    if (i != desert.length - 1) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // İçeceği güncelleme
    public void updateDrink(String drinkID, String[] newDrink) {
        List<String[]> drinks = readDrinks();
        for (int i = 0; i < drinks.size(); i++) {
            String[] drink = drinks.get(i);
            if (drink[6].equals(drinkID)) { // FoodID'ye göre içeceği bul
                drinks.set(i, newDrink); // Yeni içecek bilgileriyle güncelle
                break;
            }
        }
        // Tüm içecekleri dosyaya yeniden yaz
        try (FileWriter writer = new FileWriter(drinkFile)) {
            for (String[] drink : drinks) {
                for (int i = 0; i < drink.length; i++) {
                    writer.append(drink[i]);
                    if (i != drink.length - 1) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Masayı güncelleme
    public void updateTable(String tableID, String[] newTable) {
        List<String[]> tables = readTables();
        for (int i = 0; i < tables.size(); i++) {
            String[] table = tables.get(i);
            if (table[0].equals(tableID)) { // Masanın ID'sine göre masayı bul
                tables.set(i, newTable); // Yeni masa bilgileriyle güncelle
                break;
            }
        }
        // Tüm masaları dosyaya yeniden yaz
        try (FileWriter writer = new FileWriter(tablesFile)) {
            for (String[] table : tables) {
                for (int i = 0; i < table.length; i++) {
                    writer.append(table[i]);
                    if (i != table.length - 1) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Kullanıcıyı silme
    // Kullanıcıyı silme
    public void deleteUser(String userID) {
        List<String[]> users = readUsers();
        for (int i = 0; i < users.size(); i++) {
            String[] user = users.get(i);
            if (user[1].equals(userID)) { // ID'ye göre kullanıcıyı bul
                users.remove(i); // Kullanıcıyı listeden sil
                break;
            }
        }
        // Tüm kullanıcıları dosyaya yeniden yaz
        try (FileWriter writer = new FileWriter(usersFile)) {
            for (String[] user : users) {
                for (int i = 0; i < user.length; i++) {
                    writer.append(user[i]);
                    if (i != user.length - 1) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Yemeği silme
    public void deleteDish(String dishID) {
        List<String[]> dishes = readDishes();
        for (int i = 0; i < dishes.size(); i++) {
            String[] dish = dishes.get(i);
            if (dish[6].equals(dishID)) { // FoodID'ye göre yemeği bul
                dishes.remove(i); // Yemeği listeden sil
                break;
            }
        }
        // Tüm yemekleri dosyaya yeniden yaz
        try (FileWriter writer = new FileWriter(dishesFile)) {
            for (String[] dish : dishes) {
                for (int i = 0; i < dish.length; i++) {
                    writer.append(dish[i]);
                    if (i != dish.length - 1) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Tatlıyı silme
    public void deleteDesert(String desertID) {
        List<String[]> deserts = readDeserts();
        for (int i = 0; i < deserts.size(); i++) {
            String[] desert = deserts.get(i);
            if (desert[6].equals(desertID)) { // FoodID'ye göre tatlıyı bul
                deserts.remove(i); // Tatlıyı listeden sil
                break;
            }
        }
        // Tüm tatlıları dosyaya yeniden yaz
        try (FileWriter writer = new FileWriter(desertFile)) {
            for (String[] desert : deserts) {
                for (int i = 0; i < desert.length; i++) {
                    writer.append(desert[i]);
                    if (i != desert.length - 1) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // İçeceği silme
    public void deleteDrink(String drinkID) {
        List<String[]> drinks = readDrinks();
        for (int i = 0; i < drinks.size(); i++) {
            String[] drink = drinks.get(i);
            if (drink[6].equals(drinkID)) { // FoodID'ye göre içeceği bul
                drinks.remove(i); // İçeceği listeden sil
                break;
            }
        }
        // Tüm içecekleri dosyaya yeniden yaz
        try (FileWriter writer = new FileWriter(drinkFile)) {
            for (String[] drink : drinks) {
                for (int i = 0; i < drink.length; i++) {
                    writer.append(drink[i]);
                    if (i != drink.length - 1) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Masayı silme
    public void deleteTable(String tableID) {
        List<String[]> tables = readTables();
        for (int i = 0; i < tables.size(); i++) {
            String[] table = tables.get(i);
            if (table[0].equals(tableID)) { // Masanın ID'sine göre masayı bul
                tables.remove(i); // Masayı listeden sil
                break;
            }
        }
        // Tüm masaları dosyaya yeniden yaz
        try (FileWriter writer = new FileWriter(tablesFile)) {
            for (String[] table : tables) {
                for (int i = 0; i < table.length; i++) {
                    writer.append(table[i]);
                    if (i != table.length - 1) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}