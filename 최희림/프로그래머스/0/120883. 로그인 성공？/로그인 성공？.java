import java.util.HashMap;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> map = new HashMap<>();

        for (String[] user : db) {
            map.put(user[0], user[1]);
        }

        if (!map.containsKey(id_pw[0])) {
            return "fail";
        }

        if (map.get(id_pw[0]).equals(id_pw[1])) {
            return "login";
        }

        return "wrong pw";
    }
}