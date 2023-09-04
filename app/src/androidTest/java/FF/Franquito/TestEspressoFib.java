package FF.Franquito;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import FF.Franquito.MainActivity;

@RunWith(AndroidJUnit4.class)
public class TestEspressoFib {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testFibonacciCalculation() {
        // Ingrese el número para calcular Fibonacci, por ejemplo, 5
        Espresso.onView(ViewMatchers.withId(R.id.editText1))
                .perform(ViewActions.typeText("5"), ViewActions.closeSoftKeyboard());

        // Haga clic en el botón "FIBONACCI"
        Espresso.onView(ViewMatchers.withId(R.id.btn_fibonnaci))
                .perform(ViewActions.click());

        // Verifique que el resultado en el TextView sea el valor esperado
        Espresso.onView(ViewMatchers.withId(R.id.resultado))
                .check(ViewAssertions.matches(ViewMatchers.withText("Resultado: 5"))); // Cambie el valor esperado según su aplicación
    }

}
