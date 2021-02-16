package com.bento;

import com.bento.model.Directory;
import com.bento.model.DirectoryParent;
import com.bento.model.DirectoryWithPath;
import com.bento.util.DirectoryCreator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Show Directory Content provides a method that returns the contents of Directory and subdirectory
 * Assumptions: Directory Structure does not exists and we get a list of all directoreis present
 */
public class ShowDirectoryContent {
    public static void main(String[] args) {
        Directory rootDirectory = DirectoryCreator.createDirectories();
        printDirectoryContent("directory_C", rootDirectory);
    }

    private static void printDirectoryContent(String directory, Directory rootDirectory) {
        Optional<DirectoryWithPath> foundDirectory = findDirectoryWithName(directory, rootDirectory, "");
        if (foundDirectory.isPresent()) {
            DirectoryWithPath directoryWithPath = foundDirectory.get();
            String path = directoryWithPath.getPath();
            printContent(path, directoryWithPath.getDirectory().getContent());
        } else {
            System.out.println(String.format("Directory with name=%s is not present", directory));
        }
    }

    private static Optional<DirectoryWithPath> findDirectoryWithName(String directory, Directory currentDirectory, String path) {
        if (currentDirectory.getName().equals(directory))
            return Optional.of(new DirectoryWithPath(path + "/" + currentDirectory.getName(), currentDirectory));

        Optional<DirectoryWithPath> result = Optional.empty();
        for (Directory dir : currentDirectory.getSubdirectories()) {
            result = findDirectoryWithName(directory, dir, path + "/" + currentDirectory.getName());
            if (result.isPresent())
                break;
        }

        return result;
    }

    private static void printContent(String path, List<DirectoryParent> content) {
        Collections.sort(content, Comparator.comparingInt(DirectoryParent::getSize));
        for (DirectoryParent directory : content)
            System.out.println(String.format("FileName: %s/%s \t Size: %s", path, directory.getName(), directory.getSize()));
    }
}
