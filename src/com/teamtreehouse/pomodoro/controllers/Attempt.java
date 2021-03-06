package com.teamtreehouse.pomodoro.controllers;

/**
 * Created by YW on 11/23/15.
 */
public class Attempt {
    private AttemptKind mKind;
    private String mMessage;
    private int mRemainingSeconds;

    public Attempt(AttemptKind kind, String message) {
        mMessage=message;
        mKind = kind;
        mRemainingSeconds = kind.getTotalSeconds();

    }

    public AttemptKind getKind() {
        return mKind;
    }

    public String getMessage() {
        return mMessage;
    }

    public int getRemainingSeconds() {
        return mRemainingSeconds;
    }

    public void tick() {
        mRemainingSeconds--;
    }

    public void save() {
        System.out.printf("Saving: %s %n", this);
    }

    @Override
    public String toString() {
        return "Attempt{" +
                "mKind=" + mKind +
                ", mMessage='" + mMessage + '\'' +
                ", mRemainingSeconds=" + mRemainingSeconds +
                '}';
    }

    public void setMessage(String message) {
        mMessage = message;
    }
}
