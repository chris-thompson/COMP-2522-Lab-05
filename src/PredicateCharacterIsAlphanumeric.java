import java.util.function.Predicate;

/**
 * A template (sample) predicate for students in COMP 2522.
 *
 * @author BCIT
 * @version 2020
 */
public class PredicateCharacterIsAlphanumeric implements Predicate<Character> {

    /**
     * Returns true if the Character is alphanumeric, else false.
     * @param character a Character
     * @return true if character is alphanumeric, else false.
     */
    @Override
    public boolean test(final Character character) {
        return Character.isLetterOrDigit(character);
    }
}
