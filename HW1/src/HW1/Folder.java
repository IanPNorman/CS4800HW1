package HW1;

import java.util.ArrayList;
import java.util.List;


public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void deleteFolder(String folderName) {
        subFolders.removeIf(folder -> folder.getName().equals(folderName));
    }

    public void print() {
        System.out.println(this.name);
        for (File file : files) {
            System.out.print("  - ");
            file.print();
        }
        for (Folder folder : subFolders) {
            System.out.print("  - ");
            folder.print();
        }
    }
}

