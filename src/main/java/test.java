import info.bliki.wiki.tags.SourceTag;

import java.util.regex.Pattern;

/**
 * Created by freiheiter on 2017/4/12.
 */
public class test
{
    public static void main(String[] args) {
        String s = "Procedure of obtaining duplicate ssc hsc certificates of maharashtra board      I have lost         my ssc examinitation certificate ( year 1987 ) Tel me procedure how to get duplicate certifi        cate ? sunil kulkarni mobile no : 9881412017 Answer: The basic requirement to get Duplicate         SSC or HSC certificate from Pune Board is that you will require a letter from the respective         school in case of SSC and College for HSC through which you appeared . The School letter sh        ould be addressed to the Divisional Secretary , Maharashtra State Board, Shivajinagar Pune,         requesting that the following student was a Ex Student of our school / college and a duplica        te SSC or HSC certificate may be issued to him and then mention Name of the Student , Year a        nd month passed in, Seat No, Centre No. , School code. Even if you forget the Seat number an        d other details the school records will definitely have all the details if you provide Year         of passing and Name . The letter from school / college is compulsory and should clearly ment        ion all the above details. Take this original letter to Pune State board office at Shivajina        gar Pune. Fill in a form pay the fees. The fees are Rs 102/- for certificate upto last ten y        ears / Rs 202/- for beyond Last 10 years and Pay additional fees of Rs 100/- if you want it         within 48 hours. Timings are 10.am to 1pm and 2pm to 4 pm. Certificate can be collected on r        espective dates from 4.30pm to 5.30pm. Take this certificate back to school / college office         and get it stamped and signed from the principal.";
        System.out.println(s.split(" ").length);



        System.out.println(isANumber("a n"));
    }

    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9.]*");
        return pattern.matcher(str).matches();
    }



    private static boolean isANumber( String s ) {
        return s.matches( "[-+]?\\d*\\.?\\d+" );
    }
}
