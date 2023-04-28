package ex4;

import java.util.List;

public class Parser {

  /**
   * Returns a string containing the authors of the paper.
   *
   * <p>For instance, given "Jackson, D. (2002). Alloy: a lightweight object modelling notation. ACM
   * Transactions on Software Engineering and Methodology (TOSEM), 11(2), 256-290.", the method
   * returns "Jackson, D."
   */
  public static String extractAuthors(String citation) {
    return null;
  }

  /**
   * Returns a string containing the year when the paper was published.
   *
   * <p>For instance, given "Jackson, D. (2002). Alloy: a lightweight object modelling notation. ACM
   * Transactions on Software Engineering and Methodology (TOSEM), 11(2), 256-290.", the method
   * returns "2002"
   */
  public static String extractYear(String citation) {
    return null;
  }

  /**
   * Returns a string containing the title of the paper.
   *
   * <p>For instance, given "Jackson, D. (2002). Alloy: a lightweight object modelling notation. ACM
   * Transactions on Software Engineering and Methodology (TOSEM), 11(2), 256-290.", the method
   * returns "Alloy: a lightweight object modelling notation"
   */
  public static String extractTitle(String citation) {
    return null;
  }

  /**
   * Returns a string containing the title of the journal where the paper was published.
   *
   * <p>For instance, given "Jackson, D. (2002). Alloy: a lightweight object modelling notation. ACM
   * Transactions on Software Engineering and Methodology (TOSEM), 11(2), 256-290.", the method
   * returns "ACM Transactions on Software Engineering and Methodology (TOSEM)"
   */
  public static String extractJournalTitle(String citation) {
    return null;
  }

  /**
   * Returns an integer that identifies the volume in which the paper was published.
   *
   * <p>For instance, given "Jackson, D. (2002). Alloy: a lightweight object modelling notation. ACM
   * Transactions on Software Engineering and Methodology (TOSEM), 11(2), 256-290.", the method
   * returns 11
   */
  public static Integer extractVolume(String citation) {
    return null;
  }

  /**
   * Returns a string that identifies the issue of the volume in which the paper was published.
   *
   * <p>For instance, given "Jackson, D. (2002). Alloy: a lightweight object modelling notation. ACM
   * Transactions on Software Engineering and Methodology (TOSEM), 11(2), 256-290.", the method
   * returns "2"
   */
  public static String extractNumber(String citation) {
    return null;
  }

  /**
   * Returns a list with two integers identifying the pages of the issue in which the paper was
   * published.
   *
   * <p>For instance, given "Jackson, D. (2002). Alloy: a lightweight object modelling notation. ACM
   * Transactions on Software Engineering and Methodology (TOSEM), 11(2), 256-290.", the method
   * returns [256, 290]
   */
  public static List<Integer> extractPages(String citation) {
    return null;
  }
}
