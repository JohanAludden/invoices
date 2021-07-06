package com.aldercape.invoices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class InvoiceTest {

    private Invoice invoice;

    @BeforeEach
    public void setUp() {
        invoice = new Invoice();
    }

    @Test
    public void testInvoiceHasAClient() {
        assertThat(invoice.client(), is("My client"));
    }

    @Test
    public void testInvoiceHasACompany() {
        assertThat(invoice.company(), is("My company"));
    }

    @Test
    public void testInvoiceHasATerm() {
        assertThat(invoice.term(), is(30));
    }
}
