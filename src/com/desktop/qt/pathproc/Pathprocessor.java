package com.desktop.qt.pathproc;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by papillon on 3/13/2017.
 */
public class Pathprocessor {

    public static String processPathString(String path) throws IOException {
        Path newPath = Paths.get(path);
        StringBuilder sb = new StringBuilder();
        if(Files.isDirectory(newPath)){
            DirectoryStream<Path> directoryStream =
                    Files.newDirectoryStream(newPath);
            for(Path p : directoryStream){
                sb.append(String.format("%s%n",p));
            }
        }
        return sb.toString();
    }
}
