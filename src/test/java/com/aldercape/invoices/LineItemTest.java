package com.aldercape.invoices;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class LineItemTest {

    private LineItem a1 = new LineItem("A", 1, 2);
    private LineItem a2 = new LineItem("A", 1, 2);
    private LineItem c1 = new LineItem("C", 1, 2);
    private LineItem c2 = new LineItem("C", 2, 2);
    private LineItem c3 = new LineItem("C", 1, 3);

    @Test
    public void testReflexive() {
        assertThat(a1.equals(a1), is(true));
    }

    @Test
    public void testSymmetric() {
        assertThat(a1, is(a2));
        assertThat(a2, is(a1));
    }

    @Test
    public void testSymmetricOnDescription() {
        assertThat(a1, not(c1));
        assertThat(c1, not(a1));
    }

    @Test
    public void testSymmetricOnQuantity() {
        assertThat(a1, not(c2));
        assertThat(c2, not(a1));
    }

    @Test
    public void testSymmetricOnUnitPrice() {
        assertThat(a1, not(c3));
        assertThat(c3, not(a1));
    }

    @Test
    public void testHashCode() {
        assertThat(a1.hashCode(), is(a2.hashCode()));
    }
}
