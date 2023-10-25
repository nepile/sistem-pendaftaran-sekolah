package app.services;

public class LocalPath {

    /**
     * Method to set path of title file
     * 
     * @param pathFile
     * @return path
     */
    public static String setPathTitle(String pathFile) {
        String path = "D:\\Java Journey\\sistem-pendaftaran-sekolah\\src\\app\\data\\" + pathFile;
        return path;
    }

    /**
     * Method to get path of title file
     * 
     * @param fileWithExt
     * @return data method setPathTitle()
     */
    public String getPathTitle(String fileWithExt) {
        return setPathTitle(fileWithExt);
    }
}