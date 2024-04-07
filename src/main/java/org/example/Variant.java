package org.example;

public class Variant {
    private String chr;
    private Integer pos;
    private String ref;
    private String alt;


    public Variant(String chr, Integer pos, String ref, String alt) {
        this.chr = chr;
        this.pos = pos;
        this.ref = ref;
        this.alt = alt;

    }


    public String getVariantAsString() {
        return chr + "-" + pos + "-" + ref + "-" + alt;
    }


    private Integer calculatePosHG38(Integer posOriginal) {
        return posOriginal + 1000;

    }
    public String getVariantAsStringHG38() {
        return chr + "-" + calculatePosHG38(pos) + "-" + ref + "-" + alt;
    }

    public String getChr() {
        return chr;
    }

    public void setChr(String chr) {
        this.chr = chr;

    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;

    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;

    }
}






