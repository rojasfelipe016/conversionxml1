package com.cencosudscotiabank.conversionxml1.conversionxml1.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor

public class Request implements Serializable {

    @JacksonXmlProperty(localName = "SRVREC")
    private Integer srvrec;

    @JacksonXmlProperty(localName = "MONTO")
    private Integer monto;

    @JacksonXmlProperty(localName = "GLOSA")
    private String glosa;

    @JacksonXmlProperty(localName = "CANTIDAD")
    private Integer cantidad;

    @JacksonXmlProperty(localName = "PRECIO")
    private Integer precio;

    @JacksonXmlProperty(localName = "DATOADIC")
    private String datoadic;
}