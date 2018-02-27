package Uzduotis25;

import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;
import com.ibm.icu.util.ULocale;

public class Main {
    public static void main(String loc, String args1, String args2) {


        ULocale locale = new ULocale(loc);

       // String input = "0.00000001";
        Double d = Double.parseDouble(args1);
        NumberFormat formatter = new RuleBasedNumberFormat(locale, RuleBasedNumberFormat.SPELLOUT);
        String result = formatter.format(d);

        System.out.println(result);

        Double dd = Double.parseDouble(args2);
        NumberFormat formatterr = new RuleBasedNumberFormat(locale, RuleBasedNumberFormat.SPELLOUT);
        String resultt = formatter.format(d);

        System.out.println(resultt);
    }
}
