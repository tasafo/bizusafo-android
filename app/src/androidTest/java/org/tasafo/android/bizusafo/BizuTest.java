package org.tasafo.android.bizusafo;

import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.tasafo.android.bizusafo.model.Bizu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramonrabello on 11/04/15.
 */
@RunWith(AndroidJUnit4.class)
public class BizuTest extends AndroidTestCase {

    @Test
    public void shouldListAllBizus() {
        Assert.assertTrue(1 == createBizus().size());
    }

    private List<Bizu> createBizus(){
        List<Bizu> bizus=new ArrayList<>();
        bizus.add(new Bizu("http://google.com", "Buscas online", "Link", null, "Primeiro comentário"));
        return bizus;
    }
}
