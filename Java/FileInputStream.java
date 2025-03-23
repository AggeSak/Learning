class FileInputStream {
    public static void main(String[] args) {

        SeeFile("filename.txt");

        }

public static void SeeFile(String filename) {
    File myObj = new File(filename);
    if (myObj.exists()) {
        System.out.println("File name: " + myObj.getName());
        System.out.println("Absolute path: " + myObj.getAbsolutePath());
        System.out.println("Writeable: " + myObj.canWrite());
        System.out.println("Readable: " + myObj.canRead());
        System.out.println("File size in bytes: " + myObj.length());
    } else {
        System.out.println("The file does not exist.");
    }
