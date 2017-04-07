package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // vaihda oma opiskelijanumerosi seuraavaan, ÄLÄ kuitenkaan laita githubiin omaa opiskelijanumeroasi
        String studentNr = "000000000";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";
        String courseUrl = "https://ohtustats2017.herokuapp.com/courses/1.json";

        String bodyText = Request.Get(url).execute().returnContent().asString();
        String courseBodyText = Request.Get(courseUrl).execute().returnContent().asString();

        //System.out.println("json-muotoinen data:");
        //System.out.println( bodyText );
        
        System.out.println("opiskelijanumero: " + studentNr);
        System.out.println();

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
        Course course = mapper.fromJson(courseBodyText, Course.class);
        
        System.out.println(course.toString());
        
        int tehtavia = 0;
        int tunteja = 0;
        
        for (Submission submission : subs) {
            submission.generatePointsAndExercises();
            System.out.println("viikko "+ submission.getWeek() + ": tehtyjä "
                    + "tehtäviä yhteensä: "+ submission.getCount() + " (maksimi "
                    + ""+ course.getWeek(Integer.parseInt(submission.getWeek())) 
                    + "), aikaa kului " + submission.getHours() + " tuntia, "
                    + "tehdyt tehtävät: " + submission.exercises());
            tehtavia += submission.getCount();
            tunteja += Integer.parseInt(submission.getHours());
        }
        
        System.out.println();
        
        System.out.println("yhteensä: " + tehtavia + " tehtävää " + tunteja + " tuntia");

    }
}