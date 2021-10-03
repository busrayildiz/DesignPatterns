package com.busrayildiz.designpatterns.builder;

import com.busrayildiz.designpatterns.factory.FileExporterFactory;

public class BuilderRun {

        public static void main(String[] args) {
                Product product = new Product.ProductBuilder().id(12L).build();
        }

}
