package com.cencosudscotiabank.conversionxml1.conversionxml1.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@JacksonXmlRootElement(localName = "MPINI")
@JsonPropertyOrder({"idcom","idtrx","total","nropagos","requests"})
public class Client implements Serializable {

    @JacksonXmlProperty(localName = "IDCOM")
    private Integer idcom;


    @JacksonXmlProperty(localName = "IDTRX")
    private String  idtrx;


    @JacksonXmlProperty(localName = "TOTAL")
    private Integer total;


    @JacksonXmlProperty(localName = "NROPAGOS")
    private Integer nropagos;


    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "DETALLE")
    private List<Request> requests= new ArrayList<>();

}
