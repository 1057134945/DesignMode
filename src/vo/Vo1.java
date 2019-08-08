package vo;

public class Vo1 {

    private String mblNo;
    private String idNo;
    private String userName;

    public Vo1(String mblNo, String idNo, String userName) {
        super();
        this.mblNo = mblNo;
        this.idNo = idNo;
        this.userName = userName;
    }

    public String getMblNo() {
        return mblNo;
    }

    public void setMblNo(String mblNo) {
        this.mblNo = mblNo;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
