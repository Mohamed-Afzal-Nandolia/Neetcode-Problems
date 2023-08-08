package BinarySearch.TimeBasedKeyValueStore;

public class timeBasedKeyValueStore {
      Map<String, TreeMap<Integer, String>> map = new HashMap<>();

    public void set(String key, String value, int timestamp) {
    map.putIfAbsent(key, new TreeMap<>());
//If the key does not already exist in the map,
//the putIfAbsent method adds a new entry to the map with the key and the specified value, which is a new instance of TreeMap<Integer, String>.

    map.get(key).put(timestamp, value);//map.get(key) will return a new TreeMap and putting the timestamp, value to it
  }

  public String get(String key, int timestamp) {
    if (!map.containsKey(key)) return "";
    Integer timestampPrev = map.get(key).floorKey(timestamp);
/*
map.get(key) retrieves the TreeMap associated with the given key from the map.

floorKey(timestamp) is called on the retrieved TreeMap, passing the timestamp as an argument. This method returns the greatest key (timestamp) in the TreeMap that is less than or equal to the given timestamp.

The resulting value is assigned to the variable timestampPrev. If there is no key in the TreeMap that satisfies the condition (i.e., no key less than or equal to the given timestamp), timestampPrev will be null.
*/
    return timestampPrev != null ? map.get(key).get(timestampPrev) : "";
  }
}
