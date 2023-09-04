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
public class TestEspressoPrueba {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testPowerCalculation() {
        // Ingrese el número base 6 en el primer campo de entrada de texto
        Espresso.onView(ViewMatchers.withId(R.id.editText1))
                .perform(ViewActions.typeText("6"), ViewActions.closeSoftKeyboard());

        // Ingrese el exponente 4 en el segundo campo de entrada de texto
        Espresso.onView(ViewMatchers.withId(R.id.editText2))
                .perform(ViewActions.typeText("4"), ViewActions.closeSoftKeyboard());

        // Haga clic en el botón "POTENCIA"
        Espresso.onView(ViewMatchers.withId(R.id.btn_potencia))
                .perform(ViewActions.click());

        // Verifique que el resultado en el TextView sea el valor esperado
        Espresso.onView(ViewMatchers.withId(R.id.resultado))
                .check(ViewAssertions.matches(ViewMatchers.withText("Resultado: 256.0"))); // Cambie el valor esperado según su aplicación
    }
}
