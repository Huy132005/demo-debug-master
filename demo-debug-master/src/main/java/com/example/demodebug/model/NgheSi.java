package com.example.demodebug.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NgheSi {
    private int id;
    private String ten;
    private float luong;
    private boolean gioiTinh;

    public NgheSi(int i, String c, float v, boolean b) {
    }

    public int getId() {

        return 0;
    }
}