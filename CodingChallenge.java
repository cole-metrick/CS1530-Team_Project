public class CodingChallenge {
   String title, desc, diff, lang;

    public CodingChallenge(String title, String desc, String diff, String lang) {
        this.title = title; 
        this.desc = desc;
        this.diff = diff;
        this.lang = lang;
        
    }

    public String toString(){
        String s = "";
        s += "--CodingChallenge--\n";
        s += "Title: " + title+"\n";;
        s += "Description: " + desc + "\n";
        s += "Difficulty: " + diff + "\n";
        s += "Language: " + lang + "\n";

        return s;
    }
    }
