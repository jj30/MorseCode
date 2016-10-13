package net.buildingfive.jj.morsecode;

import java.util.ArrayList;

public class MorseString {
    private final double dotLength = 0.1;
    private final double dashLength = 0.5;

    // public final double[] a = { dotLength, dashLength };
    // public final double[] b = { dashLength, dotLength, dotLength, dotLength };
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

    public ArrayList<Double> code(String incoming) {
        ArrayList<Double> morse = new ArrayList<Double>();
        incoming = incoming.toLowerCase();

        for (Character car : incoming.toCharArray()) {
            switch (car.toString()) {
                case "a":
                    morse.addAll(a);
                    break;
                case "b":
                    morse.addAll(b);
                    break;
                case "c":
                    morse.addAll(c);
                    break;
                case "d":
                    morse.addAll(d);
                    break;
                case "e":
                    morse.addAll(e);
                    break;
                case "f":
                    morse.addAll(f);
                    break;
                case "g":
                    morse.addAll(g);
                    break;
                case "h":
                    morse.addAll(h);
                    break;
                case "i":
                    morse.addAll(i);
                    break;
                case "j":
                    morse.addAll(j);
                    break;
                case "k":
                    morse.addAll(k);
                    break;
                case "l":
                    morse.addAll(l);
                    break;
                case "m":
                    morse.addAll(m);
                    break;
                case "n":
                    morse.addAll(n);
                    break;
                case "o":
                    morse.addAll(o);
                    break;
                case "p":
                    morse.addAll(p);
                    break;
                case "q":
                    morse.addAll(q);
                    break;
                case "r":
                    morse.addAll(r);
                    break;
                case "s":
                    morse.addAll(s);
                    break;
                case "t":
                    morse.addAll(t);
                    break;
                case "u":
                    morse.addAll(u);
                    break;
                case "v":
                    morse.addAll(v);
                    break;
                case "w":
                    morse.addAll(w);
                    break;
                case "x":
                    morse.addAll(x);
                    break;
                case "y":
                    morse.addAll(y);
                    break;
                case "z":
                    morse.addAll(z);
                    break;
                default:
                    break;
            }
        }

        return morse;
    }
}