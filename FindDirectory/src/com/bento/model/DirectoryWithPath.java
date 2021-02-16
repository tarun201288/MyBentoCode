package com.bento.model;

public class DirectoryWithPath {
    private final String path;
    private final Directory directory;

    public DirectoryWithPath(String path, Directory directory) {
        this.path = path;
        this.directory = directory;
    }

    public String getPath() {
        return path;
    }

    public Directory getDirectory() {
        return directory;
    }
}
