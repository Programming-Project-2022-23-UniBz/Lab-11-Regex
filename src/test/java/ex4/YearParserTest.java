package ex4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static ex4.Parser.extractYear;

class YearParserTest {

  @Test
  @DisplayName("Should extract '1997'")
  void shouldExtractGuarino() {
    final String citation1 =
        "Guarino, N. (1997). Understanding, building and using ontologies. "
            + "International journal of human-computer studies, 46(2-3), 293-310.";

    assertThat(extractYear(citation1)).isEqualTo("1997");
  }

  @Test
  @DisplayName("Should extract '2015'")
  void shouldExtractGuizzardiEtAl() {
    final String citation2 =
        "Guizzardi, G., Wagner, G., Almeida, J. P. A., & Guizzardi, R. S. (2015). "
            + "Towards ontological foundations for conceptual modeling: "
            + "The Unified Foundational Ontology (UFO) story. "
            + "Applied ontology, 10(3-4), 259-271.";

    assertThat(extractYear(citation2)).isEqualTo("2015");
  }

  @Test
  @DisplayName("Should extract '2010'")
  void shouldExtractMontaliEtAl() {
    final String citation3 =
        "Montali, M., Pesic, M., Aalst, W. M. V. D., Chesani, F., Mello, P., & Storari, S. (2010). "
            + "Declarative specification and verification of service choreographiess. "
            + "ACM Transactions on the Web, 4(1), 1-62.";

    assertThat(extractYear(citation3)).isEqualTo("2010");
  }

  @Test
  @DisplayName("Should extract '2015'")
  void shouldExtractSalesAndGuizzardi() {
    final String citation4 =
        "Sales, T. P., & Guizzardi, G. (2015). Ontological anti-patterns: Empirically uncovered "
            + "error-prone structures in ontology-driven conceptual models. Data & Knowledge Engineering, 99, 72-104.";

    assertThat(extractYear(citation4)).isEqualTo("2015");
  }

  @Test
  @DisplayName("Should extract '2018'")
  void shouldExtractWilkinsonEtAl() {
    final String citation5 =
        "Wilkinson, M. D., Sansone, S. A., Schultes, E., Doorn, P., da Silva Santos, "
            + "L. O. B., & Dumontier, M. (2018). A design framework and exemplar metrics for FAIRness. "
            + "Scientific data, 5(1), 1-4.";

    assertThat(extractYear(citation5)).isEqualTo("2018");
  }

  @Test
  @DisplayName("Should extract '1990'")
  void shouldExtractMylopoulosEtAl() {
    final String citation6 =
        "Mylopoulos, J., Borgida, A., Jarke, M., & Koubarakis, M. (1990). "
            + "Telos: Representing knowledge about information systems. "
            + "ACM Transactions on Information Systems (TOIS), 8(4), 325-362.";

    assertThat(extractYear(citation6)).isEqualTo("1990");
  }

  @Test
  @DisplayName("Should extract '2002'")
  void shouldExtractJackson() {
    final String citation7 =
        "Jackson, D. (2002). Alloy: a lightweight object modelling notation. "
            + "ACM Transactions on Software Engineering and Methodology (TOSEM), 11(2), 256-290.";

    assertThat(extractYear(citation7)).isEqualTo("2002");
  }
}
