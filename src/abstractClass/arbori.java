package abstractClass;

/**
 * arbori
 */
public abstract class arbori {
    private String mFormaFrunza;
    private String mCategInaltime;
    private String mSol;
    private String mNume;

    /**
     * @param
     *      @param categInaltime : mic, mediu, mare
     *      @param sol           : brune de padure, aluviale, de padure, cenusii, etc.
     *      @param formaFrunza   : eliptica, ovala, circulara, etc.
     *      @param nume          : brad, pin, molid, etc.
     */
    protected arbori(String formaFrunza, String categInaltime, String sol, String nume) {
        this.mFormaFrunza = formaFrunza;
        this.mCategInaltime = categInaltime;
        this.mSol = sol;
        this.mNume = nume;
    }

    
    public abstract String printDetails();


    /**
     * getteri si setteri
     */
    public String getCategInaltime() {
        return mCategInaltime;
    }
    /**
     * getteri si setteri
     */
    public void setCategInaltime(String categInaltime) {
        this.mCategInaltime = categInaltime;
    }
    /**
     * getteri si setteri
     */
    public String getSol() {
        return mSol;
    }
    /**
     * getteri si setteri
     */
    public void setSol(String sol) {
        this.mSol = sol;
    }
    /**
     * getteri si setteri
     */
    public void setmNume(String mNume) {
        this.mNume = mNume;
    }
    /**
     * getteri si setteri
     */
    public String getmFormaFrunza() {
        return mFormaFrunza;
    }
    /**
     * getteri si setteri
     */
    public void setmFormaFrunza(String mFormaFrunza) {
        this.mFormaFrunza = mFormaFrunza;
    }
    /**
     * getteri si setteri
     */
    public String getmNume() {
        return mNume;
    }
}
