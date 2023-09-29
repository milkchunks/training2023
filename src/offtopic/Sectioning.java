package offtopic;

import java.lang.StringBuilder;
import java.util.Arrays;

public class Sectioning {
    public static int getVerbEnding(String verb) {
        String endingType = "";
        String ending = verb.charAt(verb.length() - 2) + String.valueOf(verb.charAt(verb.length() - 1));
        switch (ending) {
            case "ar":
                return 0;
            case "er":
                return 1;
            case "ir":
                return 2;
            default:
                return 3;
        }
    }

    public static String getVerbStem(String verb) {
        StringBuilder sb = new StringBuilder(verb);
        sb.deleteCharAt(verb.length() - 1);
        sb.deleteCharAt(verb.length() - 2);
        if (Arrays.asList(References.eToI).contains(verb)) {
            //TODO switch last e to an i IFF Main.subject = 2 or 5
        } else if (Arrays.asList(References.oToU).contains(verb)) {
            //same thing
        }
        if (Arrays.asList(References.trulyIrregs).contains(verb)) {
            switch (verb) {
                case "decir":
                    return "dij";
                case "hacer":
                    return "hic";
                //TODO unless 3s
                case "poner":
                    return "pus";
                case "poder":
                    return "pud";
                case "tener":
                    return "tuv";
                case "estar":
                    return "estuv";
                default:
                    return "how the hell";
            }
        }
        verb = sb.toString();
        return verb;
    }
//a whole bunch of nasty if statements for all the ending conditions (not to mention reir and sonreir)
    public static String attachEnding(String verb) {
        StringBuilder sb = new StringBuilder(getVerbStem(verb));
        if (Arrays.asList(References.arVerbs).contains(verb)) {
            //if verb is car gar zar, then use stringbuilder to delete the c/g/z, then attach the correct ending if the subject if 1s
            if (Arrays.asList(References.car).contains(verb)) {
                sb.deleteCharAt(sb.length() - 1);
                return (Main.subject == 0 ? sb.toString() + "qué" : getVerbStem(verb) + References.arEndings[Main.subject]);
            } else if (Arrays.asList(References.gar).contains(verb)) {
                sb.deleteCharAt(sb.length() - 1);
                return (Main.subject == 0 ? sb.toString() + "gué" : getVerbStem(verb) + References.arEndings[Main.subject]);
            } else if (Arrays.asList(References.zar).contains(verb)) {
                sb.deleteCharAt(sb.length() - 1);
                return (Main.subject == 0 ? sb.toString() + "cé" : getVerbStem(verb) + References.arEndings[Main.subject]);
            } else {
                return getVerbStem(verb) + References.arEndings[Main.subject];
            }
        } else if (Arrays.asList(References.iToY).contains(verb)) {
            if (Main.subject == 2) {
                return getVerbStem(verb) + "yó";
            } else if (Main.subject == 5) {
                return getVerbStem(verb) + "yeron";
            }
        } else if (Arrays.asList(References.trulyIrregs).contains(verb)) {
            return getVerbStem(verb) + References.irregularEndings[Main.subject];
        } else if (Arrays.asList(References.erVerbs).contains(verb) || Arrays.asList(References.irVerbs).contains(verb)) {
            return getVerbStem(verb) + References.erIrEndings[Main.subject];
        }
        return "how the hell";
        }
    }