package tech.linjiang.pandora.sandbox;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tech.linjiang.pandora.util.Utils;

/**
 * Created by linjiang on 04/06/2018.
 */

public class Sandbox {

    private static String ROOT_PATH = Utils.getContext().getApplicationInfo().dataDir;

    public static List<File> getRootFiles() {
        return getFiles(new File(ROOT_PATH));
    }

    public static List<File> getFiles(File curFile) {
        List<File> descriptors = new ArrayList<>();
        if (curFile.isDirectory() && curFile.exists()) {
            descriptors.addAll(Arrays.asList(curFile.listFiles()));
        }
        return descriptors;
    }
}
