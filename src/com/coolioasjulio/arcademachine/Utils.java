package com.coolioasjulio.arcademachine;

public class Utils {
    public static int clamp(int num, int low, int high) {
        return Math.min(Math.max(num, low), high - 1);
    }
}
