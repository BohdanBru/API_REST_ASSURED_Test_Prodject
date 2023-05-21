package constants;

import static constants.Constants.Server.*;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class Constants {
    public static class RunVariable{
        public static String   server=JSON_PLACEHOLDER_URL;
        public static String path ="";
            }
     public static class Server{
        public static String SWAPI_URL = "https://swapi.dev/";
         public static String JSON_PLACEHOLDER_URL="https://jsonplaceholder.typicode.com/";

         public static String REQUESTBIN_URL="https://eo8azw3v4a3lsdy.m.pipedream.net";
        public static String GOOGLE_PLACES_URL;
     }
    public static class Path{
        public static String SWAPI_PATH ="api/";
        public static String GOOGLE_PLACES_PATH;
    }
    public static class Actions{
        //swapi
        public static String SWAPI_GET_PEOPLE="people/";

        //google places
        public static String GOOGLE_PLACES_PATH;
        // jsonplaceholder
        public static String JSONPLACEHOLDER_GET="comments/";
        public static String JSONPLACEHOLDER_PUT="posts/1";
        public static String JSONPLACEHOLDER_DELETE="posts/1";
        public static String JSONPLACEHOLDER_POST="posts/";

    }

}
