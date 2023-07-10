package pa.astroidwar;

import android.graphics.Bitmap;

public class game_object {
    public float width;
    public float height;
    public float drawx;
    public float drawy;
    public float realx;
    public float realy;
    public Bitmap img;

    public game_object(float x, float y, Bitmap b){
        this.width=b.getWidth();
        this.height=b.getHeight();
        this.realx=x;
        this.realy=y;
        this.drawx=x-(this.width/2);
        this.drawy=y-(this.height/2);
        this.img=b;
    }

    public class meteor extends game_object{

        public meteor(float x, float y, Bitmap b) {
            super(x, y, b);
        }
    }
}
