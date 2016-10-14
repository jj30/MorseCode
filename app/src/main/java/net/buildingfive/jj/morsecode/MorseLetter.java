package net.buildingfive.jj.morsecode;

import java.util.ArrayList;

public class MorseLetter extends ArrayList<Double> {
    private final double dotLength = 0.1;
    private final double dashLength = 0.3;

    private final ArrayList<Double> a = new ArrayList<Double>() {{ add(dotLength); add(dashLength); }};
    private final ArrayList<Double> b = new ArrayList<Double>() {{ add(dashLength); add(dotLength); add(dotLength); add(dotLength); }};
    private final ArrayList<Double> c = new ArrayList<Double>() {{ add(dashLength); add(dotLength); add(dashLength); add(dotLength); }};
    private final ArrayList<Double> d = new ArrayList<Double>() {{ add(dashLength); add(dotLength); add(dotLength); }};
    private final ArrayList<Double> e = new ArrayList<Double>() {{ add(dotLength); }};
    private final ArrayList<Double> f = new ArrayList<Double>() {{ add(dotLength); add(dotLength); add(dashLength); add(dotLength); }};
    private final ArrayList<Double> g = new ArrayList<Double>() {{ add(dashLength); add(dashLength); add(dotLength); }};
    private final ArrayList<Double> h = new ArrayList<Double>() {{ add(dashLength); add(dotLength); add(dotLength); add(dotLength); }};
    private final ArrayList<Double> i = new ArrayList<Double>() {{ add(dotLength); add(dotLength); add(dotLength); add(dotLength); }};
    private final ArrayList<Double> j = new ArrayList<Double>() {{ add(dotLength); add(dotLength); }};
    private final ArrayList<Double> k = new ArrayList<Double>() {{ add(dashLength); add(dotLength); add(dashLength); }};
    private final ArrayList<Double> l = new ArrayList<Double>() {{ add(dotLength); add(dashLength); add(dotLength); add(dotLength); }};;
    private final ArrayList<Double> m = new ArrayList<Double>() {{ add(dashLength); add(dashLength); }};
    private final ArrayList<Double> n = new ArrayList<Double>() {{ add(dashLength); add(dotLength); }};
    private final ArrayList<Double> o = new ArrayList<Double>() {{ add(dashLength); add(dashLength); add(dashLength); }};
    private final ArrayList<Double> p = new ArrayList<Double>() {{ add(dotLength); add(dashLength); add(dashLength); add(dotLength); }};
    private final ArrayList<Double> q = new ArrayList<Double>() {{ add(dashLength); add(dashLength); add(dotLength); add(dashLength); }};
    private final ArrayList<Double> r = new ArrayList<Double>() {{ add(dotLength); add(dashLength); add(dotLength); }};
    private final ArrayList<Double> s = new ArrayList<Double>() {{ add(dotLength); add(dotLength); add(dotLength); }};
    private final ArrayList<Double> t = new ArrayList<Double>() {{ add(dashLength); }};
    private final ArrayList<Double> u = new ArrayList<Double>() {{ add(dotLength); add(dotLength); add(dashLength); }};
    private final ArrayList<Double> v = new ArrayList<Double>() {{ add(dotLength); add(dotLength); add(dotLength); add(dashLength); }};
    private final ArrayList<Double> w = new ArrayList<Double>() {{ add(dotLength); add(dashLength); add(dashLength); }};
    private final ArrayList<Double> x = new ArrayList<Double>() {{ add(dashLength); add(dotLength); add(dotLength); add(dashLength); }};
    private final ArrayList<Double> y = new ArrayList<Double>() {{ add(dashLength); add(dotLength); add(dashLength); add(dashLength); }};
    private final ArrayList<Double> z = new ArrayList<Double>() {{ add(dashLength); add(dashLength); add(dotLength); add(dotLength); }};

    public MorseLetter(Character inbound) {
        switch (inbound.toString()) {
            case "a":
                addAll(a);
                break;
            case "b":
                addAll(b);
                break;
            case "c":
                addAll(c);
                break;
            case "d":
                addAll(d);
                break;
            case "e":
                addAll(e);
                break;
            case "f":
                addAll(f);
                break;
            case "g":
                addAll(g);
                break;
            case "h":
                addAll(h);
                break;
            case "i":
                addAll(i);
                break;
            case "j":
                addAll(j);
                break;
            case "k":
                addAll(k);
                break;
            case "l":
                addAll(l);
                break;
            case "m":
                addAll(m);
                break;
            case "n":
                addAll(n);
                break;
            case "o":
                addAll(o);
                break;
            case "p":
                addAll(p);
                break;
            case "q":
                addAll(q);
                break;
            case "r":
                addAll(r);
                break;
            case "s":
                addAll(s);
                break;
            case "t":
                addAll(t);
                break;
            case "u":
                addAll(u);
                break;
            case "v":
                addAll(v);
                break;
            case "w":
                addAll(w);
                break;
            case "x":
                addAll(x);
                break;
            case "y":
                addAll(y);
                break;
            case "z":
                addAll(z);
                break;
            default:
                break;
        }
    }
}

