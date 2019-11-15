package com.athyamsha.interfaceinjava;

public class KickBoxer implements Fighting {
    @Override
    public String throwJab() {
        return "Kick Jab";
    }

    @Override
    public String throwCross() {
        return "Kick Cross";
    }

    @Override
    public String throwHook() {
        return "Kick Hook";
    }

    @Override
    public String throwUpperCut() {
        return "Kick UpperCut";
    }
}
