package org.tasafo.android.bizusafo;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.EditText;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.tasafo.android.bizusafo.model.User;

/**
 * Created by ramonrabello on 11/04/15.
 */
@RunWith(AndroidJUnit4.class)
public class AuthenticationActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity activity;

    public AuthenticationActivityTest() {
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();

        // Injecting the Instrumentation instance is required
        // for your test to run with AndroidJUnitRunner.
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        activity = getActivity();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    //@SmallTest
    @UiThreadTest
    public void shouldInstrumentUserInformingLoginPasswordCorrectly(){

        final User user = createUser();

        final EditText userField = (EditText) activity.findViewById(R.id.user_field);
        final EditText passwordField = (EditText) activity.findViewById(R.id.password_field);
        final Button signInButton = (Button) activity.findViewById(R.id.sign_in_button);


        // FIXME: correct to sleep screen while instrumenting
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {

                userField.setText(user.getName());
                passwordField.setText(user.getPassword());
                signInButton.performClick();

                Assert.assertEquals("ramon.rabello@gmail.com", userField.getText().toString());
                Assert.assertEquals("teste", passwordField.getText().toString());
            }
        });
        pauseFor(2000);
    }

    private void pauseFor(int period) {
        try {
            Thread.sleep(period);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private User createUser() {
        User user = new User();
        user.setName("ramon.rabello@gmail.com");
        user.setPassword("teste");
        return user;
    }
}
