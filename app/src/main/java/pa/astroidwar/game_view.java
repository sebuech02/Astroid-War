package pa.astroidwar;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;

import java.util.ArrayList;

public class game_view extends View {
    public int height, width;
    public ArrayList<game_object> game_objects=new ArrayList<game_object>();
    public Bitmap input;


    public game_view(Context context){
        super(context);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        height = displayMetrics.heightPixels;
        width = displayMetrics.widthPixels;
        input=make_bitmap(R.drawable.carlrot, width/10, height/10);
        game_objects.add(new game_object(width/2,height/2,input));
        input=make_bitmap(R.drawable.mario_rechts, width/5, height/5);
        game_objects.add(new game_object(width/3,2*(height/3),input));

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        width = canvas.getWidth();
        height = canvas.getHeight();

        draw_game_objects(game_objects, canvas);
        Paint test = new Paint();
        test.setColor(Color.parseColor("#ff0000"));
        test.setStyle(Paint.Style.FILL);
        canvas.drawCircle(width,height,height/2,test);
    }

    public void draw_game_objects(ArrayList<game_object> go, Canvas canvas){
        for(game_object el: go){
            canvas.drawBitmap(el.img, el.drawx, el.drawy, null);
        }
    }

    public Bitmap make_bitmap(int i, float w, float h){
        Bitmap temp=BitmapFactory.decodeResource(getResources(), i);
        temp=Bitmap.createScaledBitmap(temp, (int)w, (int)h, false);
        return temp;
    }
}
