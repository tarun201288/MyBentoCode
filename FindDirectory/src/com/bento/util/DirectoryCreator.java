package com.bento.util;

import com.bento.model.Directory;
import com.bento.model.DirectoryFile;

import java.util.ArrayList;
import java.util.Arrays;

public class DirectoryCreator {

    public static Directory createDirectories() {
        DirectoryFile file1 = new DirectoryFile("file_A", "content_A", 2);
        DirectoryFile file2 = new DirectoryFile("file_B", "content_A", 3);
        DirectoryFile file3 = new DirectoryFile("file_C", "content_A", 1);
        DirectoryFile file4 = new DirectoryFile("file_D", "content_A", 8);
        DirectoryFile file5 = new DirectoryFile("file_E", "content_A", 9);
        DirectoryFile file6 = new DirectoryFile("file_F", "content_A", 2);
        DirectoryFile file7 = new DirectoryFile("file_I", "content_A", 5);
        DirectoryFile file8 = new DirectoryFile("file_J", "content_A", 6);
        DirectoryFile file9 = new DirectoryFile("file_K", "content_A", 10);
        DirectoryFile file10 = new DirectoryFile("file_L", "content_A", 9);

        Directory directory5 = new Directory("directory_5", new ArrayList<>(), Arrays.asList(file8, file9, file10));
        Directory directory4 = new Directory("directory_D", Arrays.asList(directory5), Arrays.asList(file6, file7));
        Directory directory3 = new Directory("directory_C", Arrays.asList(directory4), Arrays.asList(file4, file5));
        Directory directory2 = new Directory("directory_B", new ArrayList<>(), Arrays.asList(file3, file4));
        Directory directory1 = new Directory("directory_A", Arrays.asList(directory2, directory3), Arrays.asList(file1, file2));

        return directory1;
    }
}
