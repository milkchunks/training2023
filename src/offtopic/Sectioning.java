package offtopic;

import java.lang.StringBuilder;
import java.util.Arrays;
/*
    A file to conjugate the verb

    getVerbStem() - returns the verb stem as a string, and modifies the stem if the verb is truly irregular
    attachEnding() - returns the conjugated verb. any stem changes beyond truly irregular changes take place here
 */
public class Sectioning {
    /**
     * @param verb the verb that you are grabbing the stem from
     * @return the verb stem
     */
    public static String getVerbStem(String verb) {
        //delete ar er ir
        StringBuilder sb = new StringBuilder(verb);
        sb.deleteCharAt(verb.length() - 1);
        sb.deleteCharAt(verb.length() - 2);
        //-cir verbs c -> j stem change
        if (Arrays.asList(References.trulyIrregs).contains(verb)) {
            if (verb.endsWith("cir")) {
                sb.replace(sb.length() - 1, sb.length(), "j");
            }
            //truly irreg stems
            switch (verb) {
                case "decir":
                    return "dij";
                case "querer":
                    return "quis";
                case "hacer":
                    return (Main.subject == 2 ? "hiz" : "hic");
                case "poner":
                    return "pus";
                case "poder":
                    return "pud";
                case "tener":
                    return "tuv";
                case "estar":
                    return "estuv";
                case "traer":
                    return "traj";
                case "caber":
                    return "cup";
                case "saber":
                    return "sup";
                case "andar":
                    return "anduv";
                default:
                    return "Error: Irregular verb not in switch statement";
            }
        }
        verb = sb.toString();
        return verb;
    }
//a whole bunch of nasty if statements for all the ending conditions

    /**
     * @param verb the verb to conjugate
     * @return the conjugated verb
     */
    public static String attachEnding(String verb) {
        StringBuilder sb = new StringBuilder(getVerbStem(verb));
        //reir and sonreir conjugation
        if (verb.equals("reír") ||  verb.equals("sonreír")) {
            if (Main.subject == 2) {
                return (verb.equals("reír") ? "rió" : "sonrió");
            } else if (Main.subject == 5) {
                return (verb.equals("reír") ? "rieron" : "sonrieron");
            }
            else {
                return getVerbStem(verb) + References.accentedIrEndings[Main.subject];
            }
            //decir 3p irregularity
        } else if (verb.equals("decir") && Main.subject == 5) {
            return "dijeron";
        }
        //ir/ser irregularity
        else if (verb.equals("ir") || verb.equals("ser")) {
            return References.serIr[Main.subject];
        }
        //dar/ver no accents
        else if (verb.equals("dar") || verb.equals("ver")) {
            return (verb.equals("dar") ? "d" + References.darVer[Main.subject] : "v" + References.darVer[Main.subject]);
        }
        //stem changers
        if (Arrays.asList(References.eToI).contains(verb) && (Main.subject == 2 || Main.subject == 5)) {
            sb.replace(sb.lastIndexOf("e"), sb.lastIndexOf("e") + 1, "i");
            return sb + References.erIrEndings[Main.subject];
        } else if (Arrays.asList(References.oToU).contains(verb) && (Main.subject == 2 || Main.subject == 5)) {
            sb.replace(sb.lastIndexOf("o"), sb.lastIndexOf("o") + 1, "u");
            return sb + References.erIrEndings[Main.subject];
        }
        //truly irregulars
        if (Arrays.asList(References.trulyIrregs).contains(verb)) {
            //-cir verbs and traer
            if (verb.endsWith("cir") || verb.equals("traer") || getVerbStem(verb).endsWith("j")) {
                return (Main.subject == 5 ? getVerbStem(verb) + "eron" : getVerbStem(verb) + References.irregularEndings[Main.subject]);
            }
            return getVerbStem(verb) + References.irregularEndings[Main.subject];
        }
        //regular ar verbs and car/gar/zar
        if (verb.endsWith("ar")) {
            //if verb is car gar zar, then use stringbuilder to delete the c/g/z, then attach the correct ending if the subject if 1s
            if (verb.endsWith("car")) {
                sb.deleteCharAt(sb.length() - 1);
                return (Main.subject == 0 ? sb + "qué" : getVerbStem(verb) + References.arEndings[Main.subject]);
            } else if (verb.endsWith("gar")) {
                sb.deleteCharAt(sb.length() - 1);
                return (Main.subject == 0 ? sb + "gué" : getVerbStem(verb) + References.arEndings[Main.subject]);
            } else if (verb.endsWith("zar")) {
                sb.deleteCharAt(sb.length() - 1);
                return (Main.subject == 0 ? sb + "cé" : getVerbStem(verb) + References.arEndings[Main.subject]);
            } else {
                //else return regular ar endings
                return getVerbStem(verb) + References.arEndings[Main.subject];
            }
            //i to y verbs. checked after ar verbs because there are no ar i to y (i think)
        } else if (Arrays.asList(References.iToY).contains(verb)) {
            if (Main.subject == 2) {
                return getVerbStem(verb) + "yó";
            } else if (Main.subject == 5) {
                return getVerbStem(verb) + "yeron";
            } else {
                return getVerbStem(verb) + References.accentedIrEndings[Main.subject];
            }
            //regular er and ir verbs
        } else if (verb.endsWith("er") || verb.endsWith("ir")) {
            return getVerbStem(verb) + References.erIrEndings[Main.subject];
        }
        return "Error: Verb in master list but not in classification lists";
        }
    }