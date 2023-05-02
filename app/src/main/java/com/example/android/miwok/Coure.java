package com.example.android.miwok;



/**
 * {@link Coure} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */
public class Coure {

    /** Default translation for the word */
    private String mCoureTitle;

    /** Miwok translation for the word */
    private String mLessonTitle;

    /** Image resource ID for the word */
    private String mTestTitle;


    /** Miwok class for lesson */
    private Class lessonclass;
    /** Miwok class for lesson */
    private Class testclass;
    /**
     * Create a new Word object.
     *
     * @param CoureTitle is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param LessonTitle is the word in the Miwok language
     */

    public Coure(String CoureTitle, String TestTitle ,String LessonTitle, Class LessonClass, Class TestClass) {
        mCoureTitle = CoureTitle;
        mLessonTitle = LessonTitle;
        mTestTitle = TestTitle;
        lessonclass = LessonClass;
        testclass = TestClass;

        /** Miwok translation for the word */

    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */

    /**
     * Get the default translation of the word.
     */
    public String getCoureTitle() {
        return mCoureTitle;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getLessonTitle() {
        return mLessonTitle;
    }

    /**
     * Return the image resource ID of the word.
     */
    public String getTestTitle() {
        return mTestTitle;
    }
    /**
     * Return the image resource ID of the word.
     */
    public Class getLessonClass() {
        return lessonclass;
    }
    /**
     * Return the image resource ID of the word.
     */
    public Class getTestclass() {
        return testclass;
    }

}