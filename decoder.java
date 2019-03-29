
public class decoder {
    static private String Alph = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    static private char[] Alph_m = Alph.toCharArray();

    public static char[] decode(String st, int ver) {
        char[] decode_st;
        decode_st = st.toCharArray();
        char[] decode_real = new char [decode_st.length];
        for (int t = 0; t < decode_st.length; t++) {
            for (int j = 0; j < Alph_m.length; j++) {
                if (Alph_m[j] == decode_st[t])
                {
                    if ((j + ver) < 0) {
                        decode_real[t] = Alph_m[Alph_m.length - j - ver];
                    } else if ((j + ver) >= 33) {
                        decode_real[t] = Alph_m[(j + ver) - Alph_m.length];
                    }
                    else{
                        decode_real[t] = Alph_m[j + ver];
                    }

                }
            }
        }
        return decode_real;
    }
}
