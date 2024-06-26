package com.strahov.twitterclone.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class MentionAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMentionAllPropertiesEquals(Mention expected, Mention actual) {
        assertMentionAutoGeneratedPropertiesEquals(expected, actual);
        assertMentionAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMentionAllUpdatablePropertiesEquals(Mention expected, Mention actual) {
        assertMentionUpdatableFieldsEquals(expected, actual);
        assertMentionUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMentionAutoGeneratedPropertiesEquals(Mention expected, Mention actual) {
        assertThat(expected)
            .as("Verify Mention auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMentionUpdatableFieldsEquals(Mention expected, Mention actual) {
        assertThat(expected)
            .as("Verify Mention relevant properties")
            .satisfies(e -> assertThat(e.getContent()).as("check content").isEqualTo(actual.getContent()))
            .satisfies(e -> assertThat(e.getPicture()).as("check picture").isEqualTo(actual.getPicture()))
            .satisfies(
                e -> assertThat(e.getPictureContentType()).as("check picture contenty type").isEqualTo(actual.getPictureContentType())
            );
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMentionUpdatableRelationshipsEquals(Mention expected, Mention actual) {
        assertThat(expected)
            .as("Verify Mention relationships")
            .satisfies(e -> assertThat(e.getTweets()).as("check tweets").isEqualTo(actual.getTweets()))
            .satisfies(e -> assertThat(e.getHashtags()).as("check hashtags").isEqualTo(actual.getHashtags()));
    }
}
