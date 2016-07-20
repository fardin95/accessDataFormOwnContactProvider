package saidul.com.accessdataformowncontactprovider;

import android.net.Uri;

/**
 * Created by Prime Tech on 7/20/2016.
 */
public class ContactProviderStatus {
    // store package name
    public static  final  String AUTH = "saidul.com.creatingthecontentproviderclass";

    // main content
    static final String URL = "content://" + AUTH + "/" + "member";

    // store CONTENT_URI
    public static final Uri CONTENT_URI = Uri.parse(URL);


    public static final int members =1;
    public static final int member_id =2;
}
