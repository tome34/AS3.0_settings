package ${PACKAGE_NAME};

import android.app.Activity;
import android.os.Bundle;

#parse("File Header.java")
public class ${NAME} extends Activity {
private static final String TAG = "${NAME}";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}