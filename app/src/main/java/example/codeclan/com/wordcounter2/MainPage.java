package example.codeclan.com.wordcounter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {

    EditText sentenceText;
    Button wordCountButton;
    TextView wordCountAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        sentenceText = (EditText)findViewById(R.id.sentence_text);
        wordCountButton = (Button) findViewById(R.id.word_count_button);
        wordCountAnswer = (TextView) findViewById(R.id.word_count_answer);
    }

    public void onWordCountButtonClicked(View button) {
        String sentence = sentenceText.getText().toString();
        Log.d(getClass().toString(), "onWordCountButton was clicked");
        Log.d(getClass().toString(), "The sentence submitted was '" + sentence + "'");
        WordCounter wordCounter = new WordCounter();
        String count = wordCounter.getWordCount(sentence);
        wordCountAnswer.setText(count);

    }
}
