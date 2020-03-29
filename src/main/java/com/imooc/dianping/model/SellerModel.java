package com.imooc.dianping.model;

import java.math.BigDecimal;
import java.util.Date;

public class SellerModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.id
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.name
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.created_at
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.updated_at
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.remark_score
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    private BigDecimal remarkScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.disabled_flag
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    private Integer disabledFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.id
     *
     * @return the value of seller.id
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.id
     *
     * @param id the value for seller.id
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.name
     *
     * @return the value of seller.name
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.name
     *
     * @param name the value for seller.name
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.created_at
     *
     * @return the value of seller.created_at
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.created_at
     *
     * @param createdAt the value for seller.created_at
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.updated_at
     *
     * @return the value of seller.updated_at
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.updated_at
     *
     * @param updatedAt the value for seller.updated_at
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.remark_score
     *
     * @return the value of seller.remark_score
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    public BigDecimal getRemarkScore() {
        return remarkScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.remark_score
     *
     * @param remarkScore the value for seller.remark_score
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    public void setRemarkScore(BigDecimal remarkScore) {
        this.remarkScore = remarkScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.disabled_flag
     *
     * @return the value of seller.disabled_flag
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    public Integer getDisabledFlag() {
        return disabledFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.disabled_flag
     *
     * @param disabledFlag the value for seller.disabled_flag
     *
     * @mbg.generated Sat Mar 28 22:30:03 CST 2020
     */
    public void setDisabledFlag(Integer disabledFlag) {
        this.disabledFlag = disabledFlag;
    }
}