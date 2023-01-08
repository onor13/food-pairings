package onor.food;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import onor.food.databinding.ActivityMainBinding;
import onor.food.domain.dataImporter.IngredientImporter;
import onor.food.domain.dataImporter.dto.IngredientDto;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    MultiAutoCompleteTextView multiAutoCompleteTextViewDefault;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        IngredientImporter ingredientImporter = new IngredientImporter();
        List<IngredientDto> ingredients;
        try {
            ingredients = ingredientImporter.loadIngredients(this.getResources().openRawResource(R.raw.ingredients));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        multiAutoCompleteTextViewDefault = findViewById(R.id.multiAutoCompleteTextViewDefault);

        // In order to show the substring options in a dropdown, we need ArrayAdapter
        // and here it is using simple_list_item_1
        ArrayAdapter<String> randomArrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                ingredients.stream().map(ingredientDto -> ingredientDto.getName()).collect(Collectors.toList()));
        multiAutoCompleteTextViewDefault.setAdapter(randomArrayAdapter);

        // setThreshold() is used to specify the number of characters after which
        // the dropdown with the autocomplete suggestions list would be displayed.
        // For multiAutoCompleteTextViewDefault, after 2 character, the dropdown shows substring
        multiAutoCompleteTextViewDefault.setThreshold(2);

        // Default CommaTokenizer is used here
        multiAutoCompleteTextViewDefault.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


    }

}