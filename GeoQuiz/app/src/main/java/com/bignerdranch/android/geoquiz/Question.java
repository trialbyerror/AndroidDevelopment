package com.bignerdranch.android.geoquiz;

/**
 * Created by mickey on 2017-03-25.
 */

public class Question {

    private int mTextResId;
    //int because it holds the resource id of a question
    //resource ids are always ints
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
