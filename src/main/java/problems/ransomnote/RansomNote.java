package problems.ransomnote;

public class RansomNote {

    public void test() {
        System.out.println("Should return FALSE: " + shouldFail());
    }

    private boolean shouldFail() {
        String word = "tex";
        String[] magazine = {"t", "e", "s", "o", "n", "p"};

        return canSpell(magazine, word);
    }

    public boolean canSpell(String[] magazine, String word) {
        boolean found = true;
        for (char c : word.toCharArray()) {
            if (!found) return false;

            found = false;
            for (String m : magazine) {
                if (m.charAt(0) == c) {
                    System.out.println(m + " equals " + c);
                    found = true;
                    break;
                }
            }
        }

        return found;
    }
}
