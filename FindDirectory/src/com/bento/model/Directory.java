package com.bento.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Directory extends DirectoryParent {

    private final String name;
    private final List<Directory> subdirectories;
    private final List<DirectoryFile> directoryFiles;
    private List<DirectoryParent> directories;

    public Directory(String name, List<Directory> subdirectories, List<DirectoryFile> directoryFiles) {
        this.name = name;
        this.subdirectories = subdirectories;
        this.directoryFiles = directoryFiles;
        this.directories = new ArrayList<>();
        directories.addAll(directoryFiles);
        directories.addAll(subdirectories);
    }

    public String getName() {
        return name;
    }

    public List<Directory> getSubdirectories() {
        return subdirectories == null ? Collections.emptyList() : subdirectories;
    }

    public List<DirectoryFile> getDirectoryFiles() {
        return directoryFiles == null ? Collections.emptyList() : directoryFiles;
    }

    public List<DirectoryParent> getContent() {
        return directories;
    }

    @Override
    public int getSize() {
        return getContent().stream()
                .mapToInt(DirectoryParent::getSize)
                .sum();
    }
}
