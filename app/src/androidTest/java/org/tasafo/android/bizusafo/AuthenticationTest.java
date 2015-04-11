package org.tasafo.android.bizusafo;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.tasafo.android.bizusafo.model.User;

/**
 * Test Case for authentication scenarios.
 */
public class AuthenticationTest extends TestCase {

    private User user;

    @Override
    protected void setUp() throws Exception {
        user = new User();
    }

    @Override
    protected void tearDown() throws Exception {
        user = null;
    }

    public void testAuthenticateUserSuccessful(){
        user.setName("ramon.rabello@gmail.com");
        user.setPassword("teste");
        Assert.assertEquals(user.getName(), "ramon.rabello@gmail.com");
        Assert.assertEquals(user.getPassword(), "teste");
    }

    public void testAuthenticateUserWrongPassword(){
        user.setName("ramon.rabello@gmail.com");
        user.setPassword("testi");
        Assert.assertEquals(user.getName(), "ramon.rabello@gmail.com");
        Assert.assertEquals(user.getPassword(), "testi");
    }
}