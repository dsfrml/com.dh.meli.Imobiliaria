package com.example.imobiliaria.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
    public class Order {
    private Integer id;
    private BigDecimal totalValue;
    private List<Product> productList;


}