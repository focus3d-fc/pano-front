package com.focus3d.pano.model.ibator;

import com.focustech.cief.ibatis.annotation.Column;
import com.focustech.cief.ibatis.annotation.PrimaryKey;
import com.focustech.cief.ibatis.annotation.SqlMap;
import com.focustech.cief.ibatis.annotation.Xss;
import java.util.Date;

@Xss
@SqlMap(Name = "pano_project_package_type", Class = PanoProjectPackageType.class)
public class PanoProjectPackageType<T, U> {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_package_type.SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    @PrimaryKey
    @Column
    private Long sn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_package_type.NAME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    @Column
    private String name;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_package_type.SPACE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    @Column
    private Long spaceSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_package_type.HOUSE_PACKAGE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    @Column
    private Long housePackageSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_package_type.ADDER_SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    @Column
    private Long adderSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_package_type.ADDER_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    @Column
    private String adderName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_package_type.ADD_TIME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    @Column
    private Date addTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_package_type.UPDATER_SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    @Column
    private Long updaterSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_package_type.UPDATER_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    @Column
    private String updaterName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_package_type.UPDATE_TIME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    @Column
    private Date updateTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_package_type.encryptSn
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    @Column
    private String encryptSn;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_package_type.SN
     *
     * @return the value of pano_project_package_type.SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public Long getSn() {
        return sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_package_type.SN
     *
     * @param sn the value for pano_project_package_type.SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public void setSn(Long sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_package_type.NAME
     *
     * @return the value of pano_project_package_type.NAME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_package_type.NAME
     *
     * @param name the value for pano_project_package_type.NAME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_package_type.SPACE_SN
     *
     * @return the value of pano_project_package_type.SPACE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public Long getSpaceSn() {
        return spaceSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_package_type.SPACE_SN
     *
     * @param spaceSn the value for pano_project_package_type.SPACE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public void setSpaceSn(Long spaceSn) {
        this.spaceSn = spaceSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_package_type.HOUSE_PACKAGE_SN
     *
     * @return the value of pano_project_package_type.HOUSE_PACKAGE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public Long getHousePackageSn() {
        return housePackageSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_package_type.HOUSE_PACKAGE_SN
     *
     * @param housePackageSn the value for pano_project_package_type.HOUSE_PACKAGE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public void setHousePackageSn(Long housePackageSn) {
        this.housePackageSn = housePackageSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_package_type.ADDER_SN
     *
     * @return the value of pano_project_package_type.ADDER_SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public Long getAdderSn() {
        return adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_package_type.ADDER_SN
     *
     * @param adderSn the value for pano_project_package_type.ADDER_SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public void setAdderSn(Long adderSn) {
        this.adderSn = adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_package_type.ADDER_NAME
     *
     * @return the value of pano_project_package_type.ADDER_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public String getAdderName() {
        return adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_package_type.ADDER_NAME
     *
     * @param adderName the value for pano_project_package_type.ADDER_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public void setAdderName(String adderName) {
        this.adderName = adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_package_type.ADD_TIME
     *
     * @return the value of pano_project_package_type.ADD_TIME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_package_type.ADD_TIME
     *
     * @param addTime the value for pano_project_package_type.ADD_TIME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_package_type.UPDATER_SN
     *
     * @return the value of pano_project_package_type.UPDATER_SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public Long getUpdaterSn() {
        return updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_package_type.UPDATER_SN
     *
     * @param updaterSn the value for pano_project_package_type.UPDATER_SN
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public void setUpdaterSn(Long updaterSn) {
        this.updaterSn = updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_package_type.UPDATER_NAME
     *
     * @return the value of pano_project_package_type.UPDATER_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_package_type.UPDATER_NAME
     *
     * @param updaterName the value for pano_project_package_type.UPDATER_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_package_type.UPDATE_TIME
     *
     * @return the value of pano_project_package_type.UPDATE_TIME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_package_type.UPDATE_TIME
     *
     * @param updateTime the value for pano_project_package_type.UPDATE_TIME
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_package_type.encryptSn
     *
     * @return the value of pano_project_package_type.encryptSn
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public String getEncryptSn() {
        return encryptSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_package_type.encryptSn
     *
     * @param encryptSn the value for pano_project_package_type.encryptSn
     *
     * @ibatorgenerated Thu Aug 24 18:57:44 CST 2017
     */
    public void setEncryptSn(String encryptSn) {
        this.encryptSn = encryptSn;
    }
}