package me.HacktronicsAavesh.HacktronicsAavesh;

import android.os.Parcel;
import android.os.Parcelable;

public class DayContentDesc implements Parcelable {
    public final String name;

    public DayContentDesc(String name){
        this.name = name;
    }

    protected DayContentDesc(Parcel in) {
        name = in.readString();
    }

    public static final Creator<DayContentDesc> CREATOR = new Creator<DayContentDesc>() {
        @Override
        public DayContentDesc createFromParcel(Parcel in) {
            return new DayContentDesc(in);
        }

        @Override
        public DayContentDesc[] newArray(int size) {
            return new DayContentDesc[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    parcel.writeString(name);
    }
}
