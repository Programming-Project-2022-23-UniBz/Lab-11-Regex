package ex1;

public class Validator {

  /**
   * Returns true if the string as a whole is a date formatted as 30/12/2020.
   *
   * <p>See src/test/resources/ex1/dates.txt for a set of valid and invalid dates.
   */
  public static boolean validateDate(String date) {
    return false;
  }

  /**
   * Returns true if the string as a whole is an italian address, that is, it contains a street
   * type, a street name, a number, a postal code, a city, and a province. Possible street types are
   * Via, Viale, Corso, or Piazza. Street names may contain characters with accents (e.g. ä, á, à,
   * é).
   *
   * <p>Here is an example of a valid address: Piazza Università, 1, 39100 Bolzano BZ
   *
   * <p>See src/test/resources/ex1/addresses.txt for a set of valid and invalid addresses.
   */
  public static boolean validateAddress(String address) {
    return false;
  }

  /**
   * Returns true if the string as a whole is a valid username, which must comply with the following
   * conditions: have between 3 and 12 characters, start with a letter, contain only letters,
   * numbers, underscores (_), dots (.) and ats (@).
   *
   * <p>See src/test/resources/ex1/usernames.txt for a set of valid and invalid usernames.
   */
  public static boolean validateUsername(String username) {
    return false;
  }

  /**
   * Returns true if the string as a whole is a valid floating point. Discover the rules for
   * floating points by going through the positive and negative examples in
   * src/test/resources/ex1/floats.txt.
   */
  public static boolean validateFloatingPoint(String number) {
    return false;
  }
}
