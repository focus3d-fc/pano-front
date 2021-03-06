package com.focus3d.pano.model.ibator;

import com.focustech.cief.ibatis.annotation.Column;
import com.focustech.cief.ibatis.annotation.PrimaryKey;
import com.focustech.cief.ibatis.annotation.SqlMap;
import com.focustech.cief.ibatis.annotation.Xss;
import java.util.Date;

@Xss
@SqlMap(Name = "pano_user_bankcard", Class = PanoUserBankcard.class)
public class PanoUserBankcard<T, U> {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_user_bankcard.SN
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    @PrimaryKey
    @Column
    private Long sn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_user_bankcard.USER_SN
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    @Column
    private Long userSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_user_bankcard.USER_NAME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    @Column
    private String userName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_user_bankcard.CERT_NO
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    @Column
    private String certNo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_user_bankcard.CARD_NO
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    @Column
    private String cardNo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_user_bankcard.ADDER_SN
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    @Column
    private Long adderSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_user_bankcard.ADDER_NAME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    @Column
    private String adderName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_user_bankcard.ADD_TIME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    @Column
    private Date addTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_user_bankcard.UPDATER_SN
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    @Column
    private Long updaterSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_user_bankcard.UPDATER_NAME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    @Column
    private String updaterName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_user_bankcard.UPDATE_TIME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    @Column
    private Date updateTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_user_bankcard.encryptSn
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    @Column
    private String encryptSn;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_user_bankcard.SN
     *
     * @return the value of pano_user_bankcard.SN
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public Long getSn() {
        return sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_user_bankcard.SN
     *
     * @param sn the value for pano_user_bankcard.SN
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public void setSn(Long sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_user_bankcard.USER_SN
     *
     * @return the value of pano_user_bankcard.USER_SN
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public Long getUserSn() {
        return userSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_user_bankcard.USER_SN
     *
     * @param userSn the value for pano_user_bankcard.USER_SN
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public void setUserSn(Long userSn) {
        this.userSn = userSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_user_bankcard.USER_NAME
     *
     * @return the value of pano_user_bankcard.USER_NAME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_user_bankcard.USER_NAME
     *
     * @param userName the value for pano_user_bankcard.USER_NAME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_user_bankcard.CERT_NO
     *
     * @return the value of pano_user_bankcard.CERT_NO
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_user_bankcard.CERT_NO
     *
     * @param certNo the value for pano_user_bankcard.CERT_NO
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_user_bankcard.CARD_NO
     *
     * @return the value of pano_user_bankcard.CARD_NO
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_user_bankcard.CARD_NO
     *
     * @param cardNo the value for pano_user_bankcard.CARD_NO
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_user_bankcard.ADDER_SN
     *
     * @return the value of pano_user_bankcard.ADDER_SN
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public Long getAdderSn() {
        return adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_user_bankcard.ADDER_SN
     *
     * @param adderSn the value for pano_user_bankcard.ADDER_SN
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public void setAdderSn(Long adderSn) {
        this.adderSn = adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_user_bankcard.ADDER_NAME
     *
     * @return the value of pano_user_bankcard.ADDER_NAME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public String getAdderName() {
        return adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_user_bankcard.ADDER_NAME
     *
     * @param adderName the value for pano_user_bankcard.ADDER_NAME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public void setAdderName(String adderName) {
        this.adderName = adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_user_bankcard.ADD_TIME
     *
     * @return the value of pano_user_bankcard.ADD_TIME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_user_bankcard.ADD_TIME
     *
     * @param addTime the value for pano_user_bankcard.ADD_TIME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_user_bankcard.UPDATER_SN
     *
     * @return the value of pano_user_bankcard.UPDATER_SN
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public Long getUpdaterSn() {
        return updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_user_bankcard.UPDATER_SN
     *
     * @param updaterSn the value for pano_user_bankcard.UPDATER_SN
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public void setUpdaterSn(Long updaterSn) {
        this.updaterSn = updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_user_bankcard.UPDATER_NAME
     *
     * @return the value of pano_user_bankcard.UPDATER_NAME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_user_bankcard.UPDATER_NAME
     *
     * @param updaterName the value for pano_user_bankcard.UPDATER_NAME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_user_bankcard.UPDATE_TIME
     *
     * @return the value of pano_user_bankcard.UPDATE_TIME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_user_bankcard.UPDATE_TIME
     *
     * @param updateTime the value for pano_user_bankcard.UPDATE_TIME
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_user_bankcard.encryptSn
     *
     * @return the value of pano_user_bankcard.encryptSn
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public String getEncryptSn() {
        return encryptSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_user_bankcard.encryptSn
     *
     * @param encryptSn the value for pano_user_bankcard.encryptSn
     *
     * @ibatorgenerated Mon Aug 28 18:42:06 CST 2017
     */
    public void setEncryptSn(String encryptSn) {
        this.encryptSn = encryptSn;
    }
}