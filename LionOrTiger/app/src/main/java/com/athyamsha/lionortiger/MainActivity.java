package com.athyamsha.lionortiger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    enum Player {
        ONE, TWO, No
    }


    Player currentPlayer = Player.ONE;
    int pl1 = 0, pl2 = 0;

    Player[] playerChoices = new Player[9];
    int[][] winnerRowsColumns = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerChoices[0] = Player.No;
        playerChoices[1] = Player.No;
        playerChoices[2] = Player.No;
        playerChoices[3] = Player.No;
        playerChoices[4] = Player.No;
        playerChoices[5] = Player.No;
        playerChoices[6] = Player.No;
        playerChoices[7] = Player.No;
        playerChoices[8] = Player.No;
    }

    public void imgViewTapped(View imageView) {
        ImageView tappedImageView = (ImageView) imageView;
        tappedImageView.setTranslationX(-2000);
        int tiTag = Integer.parseInt(tappedImageView.getTag().toString());
        if (currentPlayer == Player.ONE) {
            tappedImageView.setImageResource(R.drawable.lion);
            pl1++;
            currentPlayer = Player.TWO;
        } else if (currentPlayer == Player.TWO) {
            tappedImageView.setImageResource(R.drawable.tiger);
            currentPlayer = Player.ONE;
            pl2++;
        }
        tappedImageView.animate().translationXBy(2000).alpha(1).rotation(3600).setDuration(2000);
        Toast.makeText(this, tappedImageView.getTag().toString(), Toast.LENGTH_SHORT).show();

        for (int[] winnerColumns : winnerRowsColumns) {
            if (playerChoices[winnerColumns[0]] == playerChoices[winnerColumns[1]]
                    && playerChoices[winnerColumns[1]] == playerChoices[winnerColumns[2]]
                    && playerChoices[winnerColumns[0]] != Player.No) {
                if (currentPlayer == Player.ONE) {
                    Toast.makeText(this, "Winner is player two", Toast.LENGTH_LONG).show();
                }else if(currentPlayer == Player.TWO) {
                    Toast.makeText(this, "Winner is player one", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
