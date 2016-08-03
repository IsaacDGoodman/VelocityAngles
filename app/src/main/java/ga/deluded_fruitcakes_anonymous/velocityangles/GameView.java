package ga.deluded_fruitcakes_anonymous.velocityangles;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Isaac on 8/3/2016.
 */
public class GameView extends View {
    float centerX, centerY;
    float borderHeight;


    public GameView(Context context, float sHeight, float sWidth) {
        super(context);
        borderHeight = sHeight * 0.7f;
        centerX = sWidth * 0.5f;
        centerY = sHeight * 0.9f;
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        // MotionEvent reports input details from the touch screen
        // and other input controls. In this case, you are only
        // interested in events where the touch position changed.

        float x = e.getX();
        float y = e.getY();
        if (y >= borderHeight) {
            switch (e.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    Toast.makeText(getContext(), "Screen Touched at " + (x - centerX) + ", " + (y - centerY), Toast.LENGTH_SHORT).show();

            }
        }
        return true;
    }
}
