package com.bento.model;

public class DirectoryFile extends DirectoryParent {
    private String name;
    private String content;
    private int size;

    public DirectoryFile(String name, String content, int size) {
        this.name = name;
        this.content = content;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
