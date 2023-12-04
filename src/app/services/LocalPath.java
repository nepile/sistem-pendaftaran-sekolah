package app.services;

public class LocalPath {

    /**
     * Method to set path of file
     * 
     * @param pathFile
     * @return path
     */
    public static String setPath(String pathFile) {
        String path = "D:\\Java Journey\\sistem-pendaftaran-sekolah\\src\\app\\data\\" + pathFile;
        // String path = "D:\\sistem-pendaftaran-sekolah\\src\\app\\data\\" + pathFile;
        return path;
    }

    /**
     * Method to get path of file
     * 
     * @param fileWithExt
     * @return data method setPath()
     */
    public String getPath(String fileWithExt) {
        return setPath(fileWithExt);
    }
}