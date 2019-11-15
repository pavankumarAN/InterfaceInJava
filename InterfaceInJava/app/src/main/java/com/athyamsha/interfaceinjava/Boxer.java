package com.athyamsha.interfaceinjava;

public class Boxer implements Fighting {
    @Override
    public String throwJab() {
        return "Box Jab";
    }

    @Override
    public String throwCross() {
        return "Box Cross";
    }

    @Override
    public String throwHook() {
        return "box Hook";
    }

    @Override
    public String throwUpperCut() {
        return "Box UpperCut";
    }
}
