package com.aldercape.invoices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class InvoiceTest {

    private Invoice invoice = new Invoice();

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

    @Test
    public void testNewInvoiceDoesNotHaveLineItems() {
        assertThat(invoice.lineItems().isEmpty(), is(true));
    }

    @Test
    public void testAfterAddingLineItemToInvoiceTheInvoiceHasLineItems() {
        invoice.addLineItem("Description", 10, 25);
        assertThat(invoice.lineItems().isEmpty(), is(false));
    }

    @Test
    public void testAddedLineItemHasTheCorrectLineItem() {
        invoice.addLineItem("The description", 3, 25);
        assertThat(
                invoice.lineItems().get(0),
                is(new LineItem("The description", 3, 25)));
    }
}
