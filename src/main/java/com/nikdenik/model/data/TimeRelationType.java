package com.nikdenik.model.data;

public enum TimeRelationType {
    TIME_WINDOW("TRA"),
    SPECIFIC_MOMENT("ALLE ORE");

    private final String naturalText;

    TimeRelationType(String naturalText) {
        this.naturalText = naturalText;
    }

    public String naturalText() {
        return naturalText;
    }

    public static String[] timeRelationTexts() {
        String[] arrayTexts = new String[TimeRelationType.values().length];
        for (int i = 0; i < TimeRelationType.values().length; i++) {
             arrayTexts[i] = TimeRelationType.values()[i].naturalText();
        }
        return arrayTexts;
    }
}