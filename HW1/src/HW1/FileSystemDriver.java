package HW1;

public class FileSystemDriver {

    public static void main(String[] args) {
    	
        Folder root = new Folder("SourceFiles");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder models = new Folder("models");
        
        Folder publicFolder = new Folder("public");
        Folder cache = new Folder("cache");
        

        root.addFolder(phalcon);
        root.addFolder(app);
        root.addFolder(cache);
        root.addFolder(publicFolder);
        
        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(models);

        publicFolder.addFile(new File(".htaccess"));
        publicFolder.addFile(new File(".hrouter.php"));
        publicFolder.addFile(new File("index.html"));


        System.out.println("\nStructure of file system:");
        root.print();

        root.deleteFolder("app");
        System.out.println("\nPrinting after removing the app folder:");
        root.print();

        root.deleteFolder("public");
        System.out.println("\nPrinting after removing the public folder:");
        root.print();
    }
}
