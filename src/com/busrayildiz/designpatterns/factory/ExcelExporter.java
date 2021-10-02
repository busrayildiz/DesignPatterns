package com.busrayildiz.designpatterns.factory;

 class ExcelExporter implements FileExporter{

    @Override
    public String export(String content) {
        return "Excel->" + content;

    }
}
