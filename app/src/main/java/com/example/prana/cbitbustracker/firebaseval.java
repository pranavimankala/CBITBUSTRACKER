package com.example.prana.cbitbustracker;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by prana on 9/5/2018.
 */

public class firebaseval {
 public  double latitude,longitude;
 public  String busno1, date;
public firebaseval()
{

}

  public firebaseval(String busno1,String date, double latitude, double longitude)
{
     this.busno1=busno1;
     this.date = date;
     this.latitude=latitude;
     this.longitude=longitude;
}

}


