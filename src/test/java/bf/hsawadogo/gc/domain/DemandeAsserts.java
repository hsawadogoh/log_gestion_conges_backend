package bf.hsawadogo.gc.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class DemandeAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDemandeAllPropertiesEquals(Demande expected, Demande actual) {
        assertDemandeAutoGeneratedPropertiesEquals(expected, actual);
        assertDemandeAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDemandeAllUpdatablePropertiesEquals(Demande expected, Demande actual) {
        assertDemandeUpdatableFieldsEquals(expected, actual);
        assertDemandeUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDemandeAutoGeneratedPropertiesEquals(Demande expected, Demande actual) {
        assertThat(expected)
            .as("Verify Demande auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDemandeUpdatableFieldsEquals(Demande expected, Demande actual) {
        assertThat(expected)
            .as("Verify Demande relevant properties")
            .satisfies(e -> assertThat(e.getMotif()).as("check motif").isEqualTo(actual.getMotif()))
            .satisfies(e -> assertThat(e.getDateDebut()).as("check dateDebut").isEqualTo(actual.getDateDebut()))
            .satisfies(e -> assertThat(e.getDateFin()).as("check dateFin").isEqualTo(actual.getDateFin()))
            .satisfies(e -> assertThat(e.getEtat()).as("check etat").isEqualTo(actual.getEtat()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDemandeUpdatableRelationshipsEquals(Demande expected, Demande actual) {
        assertThat(expected)
            .as("Verify Demande relationships")
            .satisfies(e -> assertThat(e.getAgent()).as("check agent").isEqualTo(actual.getAgent()));
    }
}
