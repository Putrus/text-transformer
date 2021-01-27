package pl.put.poznan.transformer.test;

import org.junit.Before;
import org.junit.Test;
import pl.put.poznan.transformer.logic.*;
import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

public class TextTransformerMockTest {
    public InterfaceTextTransformer mockTransformer;

    @Before
    public void setUp() { mockTransformer = mock(InterfaceTextTransformer.class);}

    @Test
    public void uppertest() {
        when(mockTransformer.transform("test")).thenReturn("TEST");
        UpperTransformer tran = new UpperTransformer(mockTransformer);
        String res = tran.transform("test");
        verify(mockTransformer).transform("test");
        assertEquals("TEST",mockTransformer.transform("test"));
    }

    @Test
    public void lowertest() {
        when(mockTransformer.transform("TEST")).thenReturn("test");
        LowerTransformer tran = new LowerTransformer(mockTransformer);
        String res = tran.transform("TEST");
        verify(mockTransformer).transform("TEST");
        assertEquals("test",mockTransformer.transform("TEST"));
    }

    @Test
    public void capitalizetest() {
        when(mockTransformer.transform("test")).thenReturn("Test");
        CapitalizeTransformer tran = new CapitalizeTransformer(mockTransformer);
        String res = tran.transform("test");
        verify(mockTransformer).transform("test");
        assertEquals("Test",mockTransformer.transform("test"));
    }

    @Test
    public void duplicatetest() {
        when(mockTransformer.transform("do do do")).thenReturn("do");
        DuplicatesTransformer tran = new DuplicatesTransformer(mockTransformer);
        String res = tran.transform("do do do");
        verify(mockTransformer).transform("do do do");
        assertEquals("do",mockTransformer.transform("do do do"));
    }

    @Test
    public void fullformtest() {
        when(mockTransformer.transform("na przykład")).thenReturn("np.");
        FullFormTransformer tran = new FullFormTransformer(mockTransformer);
        String res = tran.transform("na przykład");
        verify(mockTransformer).transform("na przykład");
        assertEquals("np.",mockTransformer.transform("na przykład"));
    }

    @Test
    public void inversetest() {
        when(mockTransformer.transform("test")).thenReturn("tset");
        InverseTransformer tran = new InverseTransformer(mockTransformer);
        String res = tran.transform("test");
        verify(mockTransformer).transform("test");
        assertEquals("tset",mockTransformer.transform("test"));
    }

    @Test
    public void latextest() {
        when(mockTransformer.transform("&")).thenReturn("\\&");
        LatexFormatTransformer tran = new LatexFormatTransformer(mockTransformer);
        String res = tran.transform("&");
        verify(mockTransformer).transform("&");
        assertEquals("\\&",mockTransformer.transform("&"));
    }

    @Test
    public void numbertest() {
        when(mockTransformer.transform("10")).thenReturn("dziesięć");
        NumbersToTextTransformer tran = new NumbersToTextTransformer(mockTransformer);
        String res = tran.transform("10");
        verify(mockTransformer).transform("10");
        assertEquals("dziesięć",mockTransformer.transform("10"));
    }

    @Test
    public void shorttest() {
        when(mockTransformer.transform("profesor")).thenReturn("prof.");
        ShortFormTransformer tran = new ShortFormTransformer(mockTransformer);
        String res = tran.transform("profesor");
        verify(mockTransformer).transform("profesor");
        assertEquals("prof.",mockTransformer.transform("profesor"));
    }

    @Test
    public void shorttest2() {
        when(mockTransformer.transform("na przykład")).thenReturn("np.");
        ShortFormTransformer tran = new ShortFormTransformer(mockTransformer);
        String res = tran.transform("na przykład");
        verify(mockTransformer).transform("na przykład");
        assertEquals("np.",mockTransformer.transform("na przykład"));
    }
}
