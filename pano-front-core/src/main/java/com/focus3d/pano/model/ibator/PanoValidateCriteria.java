package com.focus3d.pano.model.ibator;

import com.focustech.cief.ibatis.annotation.SqlMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SqlMap(Name = "pano_validate", Class = PanoValidate.class)
public class PanoValidateCriteria {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    protected List oredCriteria;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    protected Object record;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    public PanoValidateCriteria() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    public PanoValidateCriteria(PanoValidateCriteria example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    public PanoValidateCriteria(Object record, PanoValidateCriteria example) {
        this.record = record;
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table pano_validate
     *
     * @ibatorgenerated Tue Aug 22 18:33:21 CST 2017
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List dateList = new ArrayList();
            Iterator iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(((Date)iter.next()).getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSnIsNull() {
            addCriterion("SN is null");
            return this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("SN is not null");
            return this;
        }

        public Criteria andSnEqualTo(Long value) {
            addCriterion("SN =", value, "sn");
            return this;
        }

        public Criteria andSnNotEqualTo(Long value) {
            addCriterion("SN <>", value, "sn");
            return this;
        }

        public Criteria andSnGreaterThan(Long value) {
            addCriterion("SN >", value, "sn");
            return this;
        }

        public Criteria andSnGreaterThanOrEqualTo(Long value) {
            addCriterion("SN >=", value, "sn");
            return this;
        }

        public Criteria andSnLessThan(Long value) {
            addCriterion("SN <", value, "sn");
            return this;
        }

        public Criteria andSnLessThanOrEqualTo(Long value) {
            addCriterion("SN <=", value, "sn");
            return this;
        }

        public Criteria andSnIn(List values) {
            addCriterion("SN in", values, "sn");
            return this;
        }

        public Criteria andSnNotIn(List values) {
            addCriterion("SN not in", values, "sn");
            return this;
        }

        public Criteria andSnBetween(Long value1, Long value2) {
            addCriterion("SN between", value1, value2, "sn");
            return this;
        }

        public Criteria andSnNotBetween(Long value1, Long value2) {
            addCriterion("SN not between", value1, value2, "sn");
            return this;
        }

        public Criteria andSendObjIsNull() {
            addCriterion("SEND_OBJ is null");
            return this;
        }

        public Criteria andSendObjIsNotNull() {
            addCriterion("SEND_OBJ is not null");
            return this;
        }

        public Criteria andSendObjEqualTo(String value) {
            addCriterion("SEND_OBJ =", value, "sendObj");
            return this;
        }

        public Criteria andSendObjNotEqualTo(String value) {
            addCriterion("SEND_OBJ <>", value, "sendObj");
            return this;
        }

        public Criteria andSendObjGreaterThan(String value) {
            addCriterion("SEND_OBJ >", value, "sendObj");
            return this;
        }

        public Criteria andSendObjGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_OBJ >=", value, "sendObj");
            return this;
        }

        public Criteria andSendObjLessThan(String value) {
            addCriterion("SEND_OBJ <", value, "sendObj");
            return this;
        }

        public Criteria andSendObjLessThanOrEqualTo(String value) {
            addCriterion("SEND_OBJ <=", value, "sendObj");
            return this;
        }

        public Criteria andSendObjLike(String value) {
            addCriterion("SEND_OBJ like", value, "sendObj");
            return this;
        }

        public Criteria andSendObjNotLike(String value) {
            addCriterion("SEND_OBJ not like", value, "sendObj");
            return this;
        }

        public Criteria andSendObjIn(List values) {
            addCriterion("SEND_OBJ in", values, "sendObj");
            return this;
        }

        public Criteria andSendObjNotIn(List values) {
            addCriterion("SEND_OBJ not in", values, "sendObj");
            return this;
        }

        public Criteria andSendObjBetween(String value1, String value2) {
            addCriterion("SEND_OBJ between", value1, value2, "sendObj");
            return this;
        }

        public Criteria andSendObjNotBetween(String value1, String value2) {
            addCriterion("SEND_OBJ not between", value1, value2, "sendObj");
            return this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return this;
        }

        public Criteria andCodeIn(List values) {
            addCriterion("CODE in", values, "code");
            return this;
        }

        public Criteria andCodeNotIn(List values) {
            addCriterion("CODE not in", values, "code");
            return this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return this;
        }

        public Criteria andExpireIsNull() {
            addCriterion("EXPIRE is null");
            return this;
        }

        public Criteria andExpireIsNotNull() {
            addCriterion("EXPIRE is not null");
            return this;
        }

        public Criteria andExpireEqualTo(Integer value) {
            addCriterion("EXPIRE =", value, "expire");
            return this;
        }

        public Criteria andExpireNotEqualTo(Integer value) {
            addCriterion("EXPIRE <>", value, "expire");
            return this;
        }

        public Criteria andExpireGreaterThan(Integer value) {
            addCriterion("EXPIRE >", value, "expire");
            return this;
        }

        public Criteria andExpireGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPIRE >=", value, "expire");
            return this;
        }

        public Criteria andExpireLessThan(Integer value) {
            addCriterion("EXPIRE <", value, "expire");
            return this;
        }

        public Criteria andExpireLessThanOrEqualTo(Integer value) {
            addCriterion("EXPIRE <=", value, "expire");
            return this;
        }

        public Criteria andExpireIn(List values) {
            addCriterion("EXPIRE in", values, "expire");
            return this;
        }

        public Criteria andExpireNotIn(List values) {
            addCriterion("EXPIRE not in", values, "expire");
            return this;
        }

        public Criteria andExpireBetween(Integer value1, Integer value2) {
            addCriterion("EXPIRE between", value1, value2, "expire");
            return this;
        }

        public Criteria andExpireNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPIRE not between", value1, value2, "expire");
            return this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return this;
        }

        public Criteria andStatusIn(List values) {
            addCriterion("STATUS in", values, "status");
            return this;
        }

        public Criteria andStatusNotIn(List values) {
            addCriterion("STATUS not in", values, "status");
            return this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return this;
        }

        public Criteria andIpAddrIsNull() {
            addCriterion("IP_ADDR is null");
            return this;
        }

        public Criteria andIpAddrIsNotNull() {
            addCriterion("IP_ADDR is not null");
            return this;
        }

        public Criteria andIpAddrEqualTo(String value) {
            addCriterion("IP_ADDR =", value, "ipAddr");
            return this;
        }

        public Criteria andIpAddrNotEqualTo(String value) {
            addCriterion("IP_ADDR <>", value, "ipAddr");
            return this;
        }

        public Criteria andIpAddrGreaterThan(String value) {
            addCriterion("IP_ADDR >", value, "ipAddr");
            return this;
        }

        public Criteria andIpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("IP_ADDR >=", value, "ipAddr");
            return this;
        }

        public Criteria andIpAddrLessThan(String value) {
            addCriterion("IP_ADDR <", value, "ipAddr");
            return this;
        }

        public Criteria andIpAddrLessThanOrEqualTo(String value) {
            addCriterion("IP_ADDR <=", value, "ipAddr");
            return this;
        }

        public Criteria andIpAddrLike(String value) {
            addCriterion("IP_ADDR like", value, "ipAddr");
            return this;
        }

        public Criteria andIpAddrNotLike(String value) {
            addCriterion("IP_ADDR not like", value, "ipAddr");
            return this;
        }

        public Criteria andIpAddrIn(List values) {
            addCriterion("IP_ADDR in", values, "ipAddr");
            return this;
        }

        public Criteria andIpAddrNotIn(List values) {
            addCriterion("IP_ADDR not in", values, "ipAddr");
            return this;
        }

        public Criteria andIpAddrBetween(String value1, String value2) {
            addCriterion("IP_ADDR between", value1, value2, "ipAddr");
            return this;
        }

        public Criteria andIpAddrNotBetween(String value1, String value2) {
            addCriterion("IP_ADDR not between", value1, value2, "ipAddr");
            return this;
        }

        public Criteria andIpPositionIsNull() {
            addCriterion("IP_POSITION is null");
            return this;
        }

        public Criteria andIpPositionIsNotNull() {
            addCriterion("IP_POSITION is not null");
            return this;
        }

        public Criteria andIpPositionEqualTo(String value) {
            addCriterion("IP_POSITION =", value, "ipPosition");
            return this;
        }

        public Criteria andIpPositionNotEqualTo(String value) {
            addCriterion("IP_POSITION <>", value, "ipPosition");
            return this;
        }

        public Criteria andIpPositionGreaterThan(String value) {
            addCriterion("IP_POSITION >", value, "ipPosition");
            return this;
        }

        public Criteria andIpPositionGreaterThanOrEqualTo(String value) {
            addCriterion("IP_POSITION >=", value, "ipPosition");
            return this;
        }

        public Criteria andIpPositionLessThan(String value) {
            addCriterion("IP_POSITION <", value, "ipPosition");
            return this;
        }

        public Criteria andIpPositionLessThanOrEqualTo(String value) {
            addCriterion("IP_POSITION <=", value, "ipPosition");
            return this;
        }

        public Criteria andIpPositionLike(String value) {
            addCriterion("IP_POSITION like", value, "ipPosition");
            return this;
        }

        public Criteria andIpPositionNotLike(String value) {
            addCriterion("IP_POSITION not like", value, "ipPosition");
            return this;
        }

        public Criteria andIpPositionIn(List values) {
            addCriterion("IP_POSITION in", values, "ipPosition");
            return this;
        }

        public Criteria andIpPositionNotIn(List values) {
            addCriterion("IP_POSITION not in", values, "ipPosition");
            return this;
        }

        public Criteria andIpPositionBetween(String value1, String value2) {
            addCriterion("IP_POSITION between", value1, value2, "ipPosition");
            return this;
        }

        public Criteria andIpPositionNotBetween(String value1, String value2) {
            addCriterion("IP_POSITION not between", value1, value2, "ipPosition");
            return this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateIn(List values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateNotIn(List values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
            return this;
        }

        public Criteria andAdderSnIsNull() {
            addCriterion("ADDER_SN is null");
            return this;
        }

        public Criteria andAdderSnIsNotNull() {
            addCriterion("ADDER_SN is not null");
            return this;
        }

        public Criteria andAdderSnEqualTo(Long value) {
            addCriterion("ADDER_SN =", value, "adderSn");
            return this;
        }

        public Criteria andAdderSnNotEqualTo(Long value) {
            addCriterion("ADDER_SN <>", value, "adderSn");
            return this;
        }

        public Criteria andAdderSnGreaterThan(Long value) {
            addCriterion("ADDER_SN >", value, "adderSn");
            return this;
        }

        public Criteria andAdderSnGreaterThanOrEqualTo(Long value) {
            addCriterion("ADDER_SN >=", value, "adderSn");
            return this;
        }

        public Criteria andAdderSnLessThan(Long value) {
            addCriterion("ADDER_SN <", value, "adderSn");
            return this;
        }

        public Criteria andAdderSnLessThanOrEqualTo(Long value) {
            addCriterion("ADDER_SN <=", value, "adderSn");
            return this;
        }

        public Criteria andAdderSnIn(List values) {
            addCriterion("ADDER_SN in", values, "adderSn");
            return this;
        }

        public Criteria andAdderSnNotIn(List values) {
            addCriterion("ADDER_SN not in", values, "adderSn");
            return this;
        }

        public Criteria andAdderSnBetween(Long value1, Long value2) {
            addCriterion("ADDER_SN between", value1, value2, "adderSn");
            return this;
        }

        public Criteria andAdderSnNotBetween(Long value1, Long value2) {
            addCriterion("ADDER_SN not between", value1, value2, "adderSn");
            return this;
        }

        public Criteria andAdderNameIsNull() {
            addCriterion("ADDER_NAME is null");
            return this;
        }

        public Criteria andAdderNameIsNotNull() {
            addCriterion("ADDER_NAME is not null");
            return this;
        }

        public Criteria andAdderNameEqualTo(String value) {
            addCriterion("ADDER_NAME =", value, "adderName");
            return this;
        }

        public Criteria andAdderNameNotEqualTo(String value) {
            addCriterion("ADDER_NAME <>", value, "adderName");
            return this;
        }

        public Criteria andAdderNameGreaterThan(String value) {
            addCriterion("ADDER_NAME >", value, "adderName");
            return this;
        }

        public Criteria andAdderNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDER_NAME >=", value, "adderName");
            return this;
        }

        public Criteria andAdderNameLessThan(String value) {
            addCriterion("ADDER_NAME <", value, "adderName");
            return this;
        }

        public Criteria andAdderNameLessThanOrEqualTo(String value) {
            addCriterion("ADDER_NAME <=", value, "adderName");
            return this;
        }

        public Criteria andAdderNameLike(String value) {
            addCriterion("ADDER_NAME like", value, "adderName");
            return this;
        }

        public Criteria andAdderNameNotLike(String value) {
            addCriterion("ADDER_NAME not like", value, "adderName");
            return this;
        }

        public Criteria andAdderNameIn(List values) {
            addCriterion("ADDER_NAME in", values, "adderName");
            return this;
        }

        public Criteria andAdderNameNotIn(List values) {
            addCriterion("ADDER_NAME not in", values, "adderName");
            return this;
        }

        public Criteria andAdderNameBetween(String value1, String value2) {
            addCriterion("ADDER_NAME between", value1, value2, "adderName");
            return this;
        }

        public Criteria andAdderNameNotBetween(String value1, String value2) {
            addCriterion("ADDER_NAME not between", value1, value2, "adderName");
            return this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return this;
        }

        public Criteria andAddTimeIn(List values) {
            addCriterion("ADD_TIME in", values, "addTime");
            return this;
        }

        public Criteria andAddTimeNotIn(List values) {
            addCriterion("ADD_TIME not in", values, "addTime");
            return this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
            return this;
        }

        public Criteria andUpdaterSnIsNull() {
            addCriterion("UPDATER_SN is null");
            return this;
        }

        public Criteria andUpdaterSnIsNotNull() {
            addCriterion("UPDATER_SN is not null");
            return this;
        }

        public Criteria andUpdaterSnEqualTo(Long value) {
            addCriterion("UPDATER_SN =", value, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnNotEqualTo(Long value) {
            addCriterion("UPDATER_SN <>", value, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnGreaterThan(Long value) {
            addCriterion("UPDATER_SN >", value, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATER_SN >=", value, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnLessThan(Long value) {
            addCriterion("UPDATER_SN <", value, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnLessThanOrEqualTo(Long value) {
            addCriterion("UPDATER_SN <=", value, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnIn(List values) {
            addCriterion("UPDATER_SN in", values, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnNotIn(List values) {
            addCriterion("UPDATER_SN not in", values, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnBetween(Long value1, Long value2) {
            addCriterion("UPDATER_SN between", value1, value2, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnNotBetween(Long value1, Long value2) {
            addCriterion("UPDATER_SN not between", value1, value2, "updaterSn");
            return this;
        }

        public Criteria andUpdaterNameIsNull() {
            addCriterion("UPDATER_NAME is null");
            return this;
        }

        public Criteria andUpdaterNameIsNotNull() {
            addCriterion("UPDATER_NAME is not null");
            return this;
        }

        public Criteria andUpdaterNameEqualTo(String value) {
            addCriterion("UPDATER_NAME =", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameNotEqualTo(String value) {
            addCriterion("UPDATER_NAME <>", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameGreaterThan(String value) {
            addCriterion("UPDATER_NAME >", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATER_NAME >=", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameLessThan(String value) {
            addCriterion("UPDATER_NAME <", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameLessThanOrEqualTo(String value) {
            addCriterion("UPDATER_NAME <=", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameLike(String value) {
            addCriterion("UPDATER_NAME like", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameNotLike(String value) {
            addCriterion("UPDATER_NAME not like", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameIn(List values) {
            addCriterion("UPDATER_NAME in", values, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameNotIn(List values) {
            addCriterion("UPDATER_NAME not in", values, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameBetween(String value1, String value2) {
            addCriterion("UPDATER_NAME between", value1, value2, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameNotBetween(String value1, String value2) {
            addCriterion("UPDATER_NAME not between", value1, value2, "updaterName");
            return this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeIn(List values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotIn(List values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return this;
        }
    }
}