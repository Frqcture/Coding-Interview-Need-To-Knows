import java.util.HashMap;

class A {
    public static void main(String[] args) {
        //=====================================================================================================================
        //DEFINE A NEW HASHMAP
        //=====================================================================================================================

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        //=====================================================================================================================
        //ALL ACTION FOR HASHMAP
        //=====================================================================================================================

        map.put("key", 1);                      //Add a value to the hashmap, this will also overwrite existing values
        map.get("key");                               //Get a value from the hashmap
        map.remove("key");                            //Remove a value from the hashmap
        map.clear();                                      //Clear the hashmap
        map.size();                                       //Get the size of the hashmap
        map.containsKey("key");                       //Check if the hashmap contains a key
        map.containsValue(7);                       //Check if the hashmap contains a value
        map.keySet();                                     //Get all the keys from the hashmap
        map.values();                                     //Get all the values from the hashmap

        //=====================================================================================================================
        //LOOP THROUGH HASHMAP
        //=====================================================================================================================

        //Loop through all the keys
        for (String i : map.keySet()) {
            System.out.println(i);
        }

        //Loop through all the values
        for (Integer i : map.values()) {
            System.out.println(i);
        }
    }
}