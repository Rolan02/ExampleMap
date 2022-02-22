package org.jalafoundation.dev34.level1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("********* HashMap *********");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Casillas");
        map.put(15, null);
        map.put(3, "Pique");
        map.put(5, "Puyol");
        map.put(11, "Capdevila");
        map.put(14, "Xabi Alonso");
        map.put(16, "Busquets");
        map.put(null, "Xavi Hernandez");
        map.put(18, "Pedrito");
        map.put(null, "Iniesta");
        map.put(7, null);

        for (Map.Entry<Integer, String> player : map.entrySet()) {
            Integer key = player.getKey();
            String value = player.getValue();
            System.out.println("Key: " + key + "  ->  "+ "Value: " + value);
        }

        System.out.println(map.get(null));

        System.out.println("\n********* LinkedHashMap *********");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Casillas");
        linkedHashMap.put(15, "Ramos");
        linkedHashMap.put(3, "Pique");
        linkedHashMap.put(5, "Puyol");
        linkedHashMap.put(11, "Capdevila");
        linkedHashMap.put(14, "Xabi Alonso");
        linkedHashMap.put(16, "Busquets");
        linkedHashMap.put(8, "Xavi Hernandez");
        linkedHashMap.put(18, "Pedrito");
        linkedHashMap.put(6, "Iniesta");
        linkedHashMap.put(6, "Ronaldo");

        for (Map.Entry<Integer, String> player : linkedHashMap.entrySet()) {
            Integer key = player.getKey();
            String value = player.getValue();
            System.out.println("Key: " + key + "  ->  "+ "Value: " + value);
        }

        System.out.println("\n********* TreeMap *********");

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Casillas");
        treeMap.put(15, "Ramos");
        treeMap.put(3, "Pique");
        treeMap.put(5, "Puyol");
        treeMap.put(11, "Capdevila");
        treeMap.put(14, "Xabi Alonso");
        treeMap.put(16, "Busquets");
        treeMap.put(8, "Xavi Hernandez");
        treeMap.put(18, "Pedrito");
        treeMap.put(26, "Iniesta");

        for (Map.Entry<Integer, String> player : treeMap.entrySet()) {
            Integer key = player.getKey();
            String value = player.getValue();
            System.out.println("Key: " + key + "  ->  "+ "Value: " + value);
        }

        System.out.println("\n********* MOST USED METHODS FOR THE MAP *********");
        System.out.println("We show the number of elements that the treeMap has : treeMap.size() = " + treeMap.size());
        System.out.println("We see if the TreeMap is empty : treeMap.isEmpty() = " + treeMap.isEmpty());
        System.out.println("We get an element of the Map by passing the key 6 : treeMap.get(6) = " + treeMap.get(6));
        System.out.println("We delete an element from the Map : treeMap.remove(18)" + treeMap.remove(18));
        System.out.println("We see what happens if we want to obtain the key that does not exist : treeMap.get(18) = " + treeMap.get(18));

        System.out.println("\n\n********* LinkedHashMap with object and a string as a key *********");
        Map<String, Player> player = new LinkedHashMap<>();
        player.put("Casillas", new Player(1, "Casillas", "Portero"));
        player.put("Ramos", new Player(15, "Ramos", "Lateral Derecho"));
        player.put("Pique", new Player(13, "Pique", "Central"));
        player.put("Puyol", new Player(5, "Puyol", "Central"));
        player.put("Capdevila", new Player(11, "Capdevila", "Lateral Izquierdo"));
        player.put("Xabi", new Player(14, "Xabi Alonso", "Medio Centro"));
        player.put("Busquets", new Player(16, "Busquets", "Medio Centro"));
        player.put("Xavi", new Player(8, "Xavi Hernandez", "Centro Campista"));
        player.put("Pedrito", new Player(18, "Pedrito", "Interior Izquierdo"));
        player.put("Iniesta", new Player(6, "Iniesta", "Interior Derecho"));
        player.put(null, new Player(7, "Villa", "Delantero"));

        for (Map.Entry<String, Player> playerEntry : player.entrySet()) {
            String clave = playerEntry.getKey();
            Player valor = playerEntry.getValue();
            System.out.println(clave + "  ->  " + valor.toString());
        }

        System.out.println("\n\n********* HashMap with objects as a key *********");
        Map<Player, List<String>> playersGames = new HashMap<>() {{
            put(new Player(1, "Casillas", "Goalkeeper"), new ArrayList<>(Arrays.asList("Barcelona vs Real Madrid", "Barcelona vs Manchester", "Barcelona vs PSG")));
            put(new Player(14, "Xabi", "Center"), new ArrayList<>(Arrays.asList("Barcelona vs Juventus", "Barcelona vs Chelsea")));
            put(new Player(7, "Villa", "Forward"), new ArrayList<>(Arrays.asList("Barcelona vs PSG", "Barcelona vs Real Madrid")));
            put(new Player(6, "Iniesta", "Left Side"), new ArrayList<>(Arrays.asList("Barcelona vs Juventus", "Barcelona vs RealMadrid")));
            put(new Player(13, "Pique", "Center"), new ArrayList<>(Arrays.asList("Barcelona vs Manchester", "Barcelona vs Chelsea")));

            put(new Player(1, "Casillas", "Goalkeeper"), new ArrayList<>(Arrays.asList("Barcelona vs Real Madrid", "Barcelona vs Manchester")));
            put(new Player(14, "Xabi", "Center"), new ArrayList<>(Arrays.asList("Barcelona vs Juventus")));
        }};

        for (Map.Entry<Player, List<String>> entry : playersGames.entrySet()) {
            System.out.print(entry.getKey().getName());
            System.out.print(" -> ");
            System.out.println(entry.getValue());
        }

        System.out.println();
        System.out.print("Number of football games played of Xavi: ");
        System.out.println(playersGames.get(new Player(14, "Xabi", "Center")).size());
    }
}
