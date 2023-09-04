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


@RunWith(AndroidJUnit4.class)
public class MyEspressoTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);


    @Test
    public void testMultiplicationCalculation() {
        // Ingrese los números para la multiplicación, por ejemplo, 6 y 4

        Espresso.onView(ViewMatchers.withId(R.id.editText1))
                .perform(ViewActions.typeText("6"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.editText2))
                .perform(ViewActions.typeText("4"), ViewActions.closeSoftKeyboard());

        // Haga clic en el botón "MULTIPLICACION"
        Espresso.onView(ViewMatchers.withId(R.id.btn_multi))
                .perform(ViewActions.click());

        // Verifique que el resultado en el TextView sea el valor esperado
        Espresso.onView(ViewMatchers.withId(R.id.resultado))
                .check(ViewAssertions.matches(ViewMatchers.withText("Resultado: 24"))); // Cambie el valor esperado según su aplicación
    }
}
