package com.okeyen.bindtest;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    public static String NAME = "Think";
    private int s_id;
    private String s_name;
    private String s_gender;

    protected Student(Parcel in) {
        s_id = in.readInt();
        s_name = in.readString();
        s_gender = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(s_id);
        dest.writeString(s_name);
        dest.writeString(s_gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_gender='" + s_gender + '\'' +
                '}';
    }
}
