package com.lira.menggambardemografis;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ourView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        draw();

        setContentView(ourView);
    }

    public void draw() {
        Bitmap blankBitmap;
        blankBitmap = Bitmap.createBitmap(600,600,Bitmap.Config.ARGB_8888);

        Canvas canvas;
        canvas = new Canvas(blankBitmap);

        ourView = new ImageView(this);
        ourView.setImageBitmap(blankBitmap);

        Paint paint;
        paint = new Paint();

        canvas.drawColor(Color.argb(255,255,255,255));


        Bitmap bitmapEinstein;
        bitmapEinstein = BitmapFactory.decodeResource(this.getResources(), R.drawable.einstein);

        // Background
        paint.setColor(Color.argb(255,214, 36, 69));
        canvas.drawRect(50, 50, 550, 550, paint);

        // Papan Tulis
        paint.setColor(Color.argb(255,30, 30, 30));
        canvas.drawRect(290, 190, 510, 360, paint);
        paint.setColor(Color.argb(255,255, 255, 255));
        canvas.drawRect(300, 200, 500, 350, paint);
        paint.setColor(Color.argb(255,30, 30, 30));
        canvas.drawText("E = M.C^2", 360, 275, paint);

        // Jam Dinding
        paint.setColor(Color.argb(255,255, 219, 231));
        canvas.drawCircle(430,120, 50,paint);
        paint.setColor(Color.argb(255,30, 30, 30));
        canvas.drawLine(430, 120, 430, 80, paint);
        canvas.drawLine(430, 120, 460, 120, paint);

        // Gambar Einstein
        canvas.drawBitmap(bitmapEinstein, 0,150, paint);
    }
}