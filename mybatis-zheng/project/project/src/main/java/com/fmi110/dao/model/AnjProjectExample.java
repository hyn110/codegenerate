package com.fmi110..dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnjProjectExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public AnjProjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInitiatorIsNull() {
            addCriterion("initiator is null");
            return (Criteria) this;
        }

        public Criteria andInitiatorIsNotNull() {
            addCriterion("initiator is not null");
            return (Criteria) this;
        }

        public Criteria andInitiatorEqualTo(String value) {
            addCriterion("initiator =", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorNotEqualTo(String value) {
            addCriterion("initiator <>", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorGreaterThan(String value) {
            addCriterion("initiator >", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorGreaterThanOrEqualTo(String value) {
            addCriterion("initiator >=", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorLessThan(String value) {
            addCriterion("initiator <", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorLessThanOrEqualTo(String value) {
            addCriterion("initiator <=", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorLike(String value) {
            addCriterion("initiator like", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorNotLike(String value) {
            addCriterion("initiator not like", value, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorIn(List<String> values) {
            addCriterion("initiator in", values, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorNotIn(List<String> values) {
            addCriterion("initiator not in", values, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorBetween(String value1, String value2) {
            addCriterion("initiator between", value1, value2, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorNotBetween(String value1, String value2) {
            addCriterion("initiator not between", value1, value2, "initiator");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoIsNull() {
            addCriterion("initiator_logo is null");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoIsNotNull() {
            addCriterion("initiator_logo is not null");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoEqualTo(String value) {
            addCriterion("initiator_logo =", value, "initiatorLogo");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoNotEqualTo(String value) {
            addCriterion("initiator_logo <>", value, "initiatorLogo");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoGreaterThan(String value) {
            addCriterion("initiator_logo >", value, "initiatorLogo");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoGreaterThanOrEqualTo(String value) {
            addCriterion("initiator_logo >=", value, "initiatorLogo");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoLessThan(String value) {
            addCriterion("initiator_logo <", value, "initiatorLogo");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoLessThanOrEqualTo(String value) {
            addCriterion("initiator_logo <=", value, "initiatorLogo");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoLike(String value) {
            addCriterion("initiator_logo like", value, "initiatorLogo");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoNotLike(String value) {
            addCriterion("initiator_logo not like", value, "initiatorLogo");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoIn(List<String> values) {
            addCriterion("initiator_logo in", values, "initiatorLogo");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoNotIn(List<String> values) {
            addCriterion("initiator_logo not in", values, "initiatorLogo");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoBetween(String value1, String value2) {
            addCriterion("initiator_logo between", value1, value2, "initiatorLogo");
            return (Criteria) this;
        }

        public Criteria andInitiatorLogoNotBetween(String value1, String value2) {
            addCriterion("initiator_logo not between", value1, value2, "initiatorLogo");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPjtBreifIsNull() {
            addCriterion("pjt_breif is null");
            return (Criteria) this;
        }

        public Criteria andPjtBreifIsNotNull() {
            addCriterion("pjt_breif is not null");
            return (Criteria) this;
        }

        public Criteria andPjtBreifEqualTo(String value) {
            addCriterion("pjt_breif =", value, "pjtBreif");
            return (Criteria) this;
        }

        public Criteria andPjtBreifNotEqualTo(String value) {
            addCriterion("pjt_breif <>", value, "pjtBreif");
            return (Criteria) this;
        }

        public Criteria andPjtBreifGreaterThan(String value) {
            addCriterion("pjt_breif >", value, "pjtBreif");
            return (Criteria) this;
        }

        public Criteria andPjtBreifGreaterThanOrEqualTo(String value) {
            addCriterion("pjt_breif >=", value, "pjtBreif");
            return (Criteria) this;
        }

        public Criteria andPjtBreifLessThan(String value) {
            addCriterion("pjt_breif <", value, "pjtBreif");
            return (Criteria) this;
        }

        public Criteria andPjtBreifLessThanOrEqualTo(String value) {
            addCriterion("pjt_breif <=", value, "pjtBreif");
            return (Criteria) this;
        }

        public Criteria andPjtBreifLike(String value) {
            addCriterion("pjt_breif like", value, "pjtBreif");
            return (Criteria) this;
        }

        public Criteria andPjtBreifNotLike(String value) {
            addCriterion("pjt_breif not like", value, "pjtBreif");
            return (Criteria) this;
        }

        public Criteria andPjtBreifIn(List<String> values) {
            addCriterion("pjt_breif in", values, "pjtBreif");
            return (Criteria) this;
        }

        public Criteria andPjtBreifNotIn(List<String> values) {
            addCriterion("pjt_breif not in", values, "pjtBreif");
            return (Criteria) this;
        }

        public Criteria andPjtBreifBetween(String value1, String value2) {
            addCriterion("pjt_breif between", value1, value2, "pjtBreif");
            return (Criteria) this;
        }

        public Criteria andPjtBreifNotBetween(String value1, String value2) {
            addCriterion("pjt_breif not between", value1, value2, "pjtBreif");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNull() {
            addCriterion("p_type is null");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNotNull() {
            addCriterion("p_type is not null");
            return (Criteria) this;
        }

        public Criteria andPTypeEqualTo(String value) {
            addCriterion("p_type =", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotEqualTo(String value) {
            addCriterion("p_type <>", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThan(String value) {
            addCriterion("p_type >", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThanOrEqualTo(String value) {
            addCriterion("p_type >=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThan(String value) {
            addCriterion("p_type <", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThanOrEqualTo(String value) {
            addCriterion("p_type <=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLike(String value) {
            addCriterion("p_type like", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotLike(String value) {
            addCriterion("p_type not like", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeIn(List<String> values) {
            addCriterion("p_type in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotIn(List<String> values) {
            addCriterion("p_type not in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeBetween(String value1, String value2) {
            addCriterion("p_type between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotBetween(String value1, String value2) {
            addCriterion("p_type not between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeIsNull() {
            addCriterion("investment_type is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeIsNotNull() {
            addCriterion("investment_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeEqualTo(String value) {
            addCriterion("investment_type =", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeNotEqualTo(String value) {
            addCriterion("investment_type <>", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeGreaterThan(String value) {
            addCriterion("investment_type >", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("investment_type >=", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeLessThan(String value) {
            addCriterion("investment_type <", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeLessThanOrEqualTo(String value) {
            addCriterion("investment_type <=", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeLike(String value) {
            addCriterion("investment_type like", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeNotLike(String value) {
            addCriterion("investment_type not like", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeIn(List<String> values) {
            addCriterion("investment_type in", values, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeNotIn(List<String> values) {
            addCriterion("investment_type not in", values, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeBetween(String value1, String value2) {
            addCriterion("investment_type between", value1, value2, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeNotBetween(String value1, String value2) {
            addCriterion("investment_type not between", value1, value2, "investmentType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNameIsNull() {
            addCriterion("status_name is null");
            return (Criteria) this;
        }

        public Criteria andStatusNameIsNotNull() {
            addCriterion("status_name is not null");
            return (Criteria) this;
        }

        public Criteria andStatusNameEqualTo(String value) {
            addCriterion("status_name =", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotEqualTo(String value) {
            addCriterion("status_name <>", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameGreaterThan(String value) {
            addCriterion("status_name >", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("status_name >=", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameLessThan(String value) {
            addCriterion("status_name <", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameLessThanOrEqualTo(String value) {
            addCriterion("status_name <=", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameLike(String value) {
            addCriterion("status_name like", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotLike(String value) {
            addCriterion("status_name not like", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameIn(List<String> values) {
            addCriterion("status_name in", values, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotIn(List<String> values) {
            addCriterion("status_name not in", values, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameBetween(String value1, String value2) {
            addCriterion("status_name between", value1, value2, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotBetween(String value1, String value2) {
            addCriterion("status_name not between", value1, value2, "statusName");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andImageMIsNull() {
            addCriterion("image_m is null");
            return (Criteria) this;
        }

        public Criteria andImageMIsNotNull() {
            addCriterion("image_m is not null");
            return (Criteria) this;
        }

        public Criteria andImageMEqualTo(String value) {
            addCriterion("image_m =", value, "imageM");
            return (Criteria) this;
        }

        public Criteria andImageMNotEqualTo(String value) {
            addCriterion("image_m <>", value, "imageM");
            return (Criteria) this;
        }

        public Criteria andImageMGreaterThan(String value) {
            addCriterion("image_m >", value, "imageM");
            return (Criteria) this;
        }

        public Criteria andImageMGreaterThanOrEqualTo(String value) {
            addCriterion("image_m >=", value, "imageM");
            return (Criteria) this;
        }

        public Criteria andImageMLessThan(String value) {
            addCriterion("image_m <", value, "imageM");
            return (Criteria) this;
        }

        public Criteria andImageMLessThanOrEqualTo(String value) {
            addCriterion("image_m <=", value, "imageM");
            return (Criteria) this;
        }

        public Criteria andImageMLike(String value) {
            addCriterion("image_m like", value, "imageM");
            return (Criteria) this;
        }

        public Criteria andImageMNotLike(String value) {
            addCriterion("image_m not like", value, "imageM");
            return (Criteria) this;
        }

        public Criteria andImageMIn(List<String> values) {
            addCriterion("image_m in", values, "imageM");
            return (Criteria) this;
        }

        public Criteria andImageMNotIn(List<String> values) {
            addCriterion("image_m not in", values, "imageM");
            return (Criteria) this;
        }

        public Criteria andImageMBetween(String value1, String value2) {
            addCriterion("image_m between", value1, value2, "imageM");
            return (Criteria) this;
        }

        public Criteria andImageMNotBetween(String value1, String value2) {
            addCriterion("image_m not between", value1, value2, "imageM");
            return (Criteria) this;
        }

        public Criteria andImageSIsNull() {
            addCriterion("image_s is null");
            return (Criteria) this;
        }

        public Criteria andImageSIsNotNull() {
            addCriterion("image_s is not null");
            return (Criteria) this;
        }

        public Criteria andImageSEqualTo(String value) {
            addCriterion("image_s =", value, "imageS");
            return (Criteria) this;
        }

        public Criteria andImageSNotEqualTo(String value) {
            addCriterion("image_s <>", value, "imageS");
            return (Criteria) this;
        }

        public Criteria andImageSGreaterThan(String value) {
            addCriterion("image_s >", value, "imageS");
            return (Criteria) this;
        }

        public Criteria andImageSGreaterThanOrEqualTo(String value) {
            addCriterion("image_s >=", value, "imageS");
            return (Criteria) this;
        }

        public Criteria andImageSLessThan(String value) {
            addCriterion("image_s <", value, "imageS");
            return (Criteria) this;
        }

        public Criteria andImageSLessThanOrEqualTo(String value) {
            addCriterion("image_s <=", value, "imageS");
            return (Criteria) this;
        }

        public Criteria andImageSLike(String value) {
            addCriterion("image_s like", value, "imageS");
            return (Criteria) this;
        }

        public Criteria andImageSNotLike(String value) {
            addCriterion("image_s not like", value, "imageS");
            return (Criteria) this;
        }

        public Criteria andImageSIn(List<String> values) {
            addCriterion("image_s in", values, "imageS");
            return (Criteria) this;
        }

        public Criteria andImageSNotIn(List<String> values) {
            addCriterion("image_s not in", values, "imageS");
            return (Criteria) this;
        }

        public Criteria andImageSBetween(String value1, String value2) {
            addCriterion("image_s between", value1, value2, "imageS");
            return (Criteria) this;
        }

        public Criteria andImageSNotBetween(String value1, String value2) {
            addCriterion("image_s not between", value1, value2, "imageS");
            return (Criteria) this;
        }

        public Criteria andFinancingMoneyIsNull() {
            addCriterion("financing_money is null");
            return (Criteria) this;
        }

        public Criteria andFinancingMoneyIsNotNull() {
            addCriterion("financing_money is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingMoneyEqualTo(Long value) {
            addCriterion("financing_money =", value, "financingMoney");
            return (Criteria) this;
        }

        public Criteria andFinancingMoneyNotEqualTo(Long value) {
            addCriterion("financing_money <>", value, "financingMoney");
            return (Criteria) this;
        }

        public Criteria andFinancingMoneyGreaterThan(Long value) {
            addCriterion("financing_money >", value, "financingMoney");
            return (Criteria) this;
        }

        public Criteria andFinancingMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("financing_money >=", value, "financingMoney");
            return (Criteria) this;
        }

        public Criteria andFinancingMoneyLessThan(Long value) {
            addCriterion("financing_money <", value, "financingMoney");
            return (Criteria) this;
        }

        public Criteria andFinancingMoneyLessThanOrEqualTo(Long value) {
            addCriterion("financing_money <=", value, "financingMoney");
            return (Criteria) this;
        }

        public Criteria andFinancingMoneyIn(List<Long> values) {
            addCriterion("financing_money in", values, "financingMoney");
            return (Criteria) this;
        }

        public Criteria andFinancingMoneyNotIn(List<Long> values) {
            addCriterion("financing_money not in", values, "financingMoney");
            return (Criteria) this;
        }

        public Criteria andFinancingMoneyBetween(Long value1, Long value2) {
            addCriterion("financing_money between", value1, value2, "financingMoney");
            return (Criteria) this;
        }

        public Criteria andFinancingMoneyNotBetween(Long value1, Long value2) {
            addCriterion("financing_money not between", value1, value2, "financingMoney");
            return (Criteria) this;
        }

        public Criteria andUpMoneyIsNull() {
            addCriterion("up_money is null");
            return (Criteria) this;
        }

        public Criteria andUpMoneyIsNotNull() {
            addCriterion("up_money is not null");
            return (Criteria) this;
        }

        public Criteria andUpMoneyEqualTo(Long value) {
            addCriterion("up_money =", value, "upMoney");
            return (Criteria) this;
        }

        public Criteria andUpMoneyNotEqualTo(Long value) {
            addCriterion("up_money <>", value, "upMoney");
            return (Criteria) this;
        }

        public Criteria andUpMoneyGreaterThan(Long value) {
            addCriterion("up_money >", value, "upMoney");
            return (Criteria) this;
        }

        public Criteria andUpMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("up_money >=", value, "upMoney");
            return (Criteria) this;
        }

        public Criteria andUpMoneyLessThan(Long value) {
            addCriterion("up_money <", value, "upMoney");
            return (Criteria) this;
        }

        public Criteria andUpMoneyLessThanOrEqualTo(Long value) {
            addCriterion("up_money <=", value, "upMoney");
            return (Criteria) this;
        }

        public Criteria andUpMoneyIn(List<Long> values) {
            addCriterion("up_money in", values, "upMoney");
            return (Criteria) this;
        }

        public Criteria andUpMoneyNotIn(List<Long> values) {
            addCriterion("up_money not in", values, "upMoney");
            return (Criteria) this;
        }

        public Criteria andUpMoneyBetween(Long value1, Long value2) {
            addCriterion("up_money between", value1, value2, "upMoney");
            return (Criteria) this;
        }

        public Criteria andUpMoneyNotBetween(Long value1, Long value2) {
            addCriterion("up_money not between", value1, value2, "upMoney");
            return (Criteria) this;
        }

        public Criteria andFinancingRateIsNull() {
            addCriterion("financing_rate is null");
            return (Criteria) this;
        }

        public Criteria andFinancingRateIsNotNull() {
            addCriterion("financing_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingRateEqualTo(Integer value) {
            addCriterion("financing_rate =", value, "financingRate");
            return (Criteria) this;
        }

        public Criteria andFinancingRateNotEqualTo(Integer value) {
            addCriterion("financing_rate <>", value, "financingRate");
            return (Criteria) this;
        }

        public Criteria andFinancingRateGreaterThan(Integer value) {
            addCriterion("financing_rate >", value, "financingRate");
            return (Criteria) this;
        }

        public Criteria andFinancingRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("financing_rate >=", value, "financingRate");
            return (Criteria) this;
        }

        public Criteria andFinancingRateLessThan(Integer value) {
            addCriterion("financing_rate <", value, "financingRate");
            return (Criteria) this;
        }

        public Criteria andFinancingRateLessThanOrEqualTo(Integer value) {
            addCriterion("financing_rate <=", value, "financingRate");
            return (Criteria) this;
        }

        public Criteria andFinancingRateIn(List<Integer> values) {
            addCriterion("financing_rate in", values, "financingRate");
            return (Criteria) this;
        }

        public Criteria andFinancingRateNotIn(List<Integer> values) {
            addCriterion("financing_rate not in", values, "financingRate");
            return (Criteria) this;
        }

        public Criteria andFinancingRateBetween(Integer value1, Integer value2) {
            addCriterion("financing_rate between", value1, value2, "financingRate");
            return (Criteria) this;
        }

        public Criteria andFinancingRateNotBetween(Integer value1, Integer value2) {
            addCriterion("financing_rate not between", value1, value2, "financingRate");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeIsNull() {
            addCriterion("financing_type is null");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeIsNotNull() {
            addCriterion("financing_type is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeEqualTo(String value) {
            addCriterion("financing_type =", value, "financingType");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeNotEqualTo(String value) {
            addCriterion("financing_type <>", value, "financingType");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeGreaterThan(String value) {
            addCriterion("financing_type >", value, "financingType");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("financing_type >=", value, "financingType");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeLessThan(String value) {
            addCriterion("financing_type <", value, "financingType");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeLessThanOrEqualTo(String value) {
            addCriterion("financing_type <=", value, "financingType");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeLike(String value) {
            addCriterion("financing_type like", value, "financingType");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeNotLike(String value) {
            addCriterion("financing_type not like", value, "financingType");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeIn(List<String> values) {
            addCriterion("financing_type in", values, "financingType");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeNotIn(List<String> values) {
            addCriterion("financing_type not in", values, "financingType");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeBetween(String value1, String value2) {
            addCriterion("financing_type between", value1, value2, "financingType");
            return (Criteria) this;
        }

        public Criteria andFinancingTypeNotBetween(String value1, String value2) {
            addCriterion("financing_type not between", value1, value2, "financingType");
            return (Criteria) this;
        }

        public Criteria andInvestFinancingRateIsNull() {
            addCriterion("invest_financing_rate is null");
            return (Criteria) this;
        }

        public Criteria andInvestFinancingRateIsNotNull() {
            addCriterion("invest_financing_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInvestFinancingRateEqualTo(Integer value) {
            addCriterion("invest_financing_rate =", value, "investFinancingRate");
            return (Criteria) this;
        }

        public Criteria andInvestFinancingRateNotEqualTo(Integer value) {
            addCriterion("invest_financing_rate <>", value, "investFinancingRate");
            return (Criteria) this;
        }

        public Criteria andInvestFinancingRateGreaterThan(Integer value) {
            addCriterion("invest_financing_rate >", value, "investFinancingRate");
            return (Criteria) this;
        }

        public Criteria andInvestFinancingRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("invest_financing_rate >=", value, "investFinancingRate");
            return (Criteria) this;
        }

        public Criteria andInvestFinancingRateLessThan(Integer value) {
            addCriterion("invest_financing_rate <", value, "investFinancingRate");
            return (Criteria) this;
        }

        public Criteria andInvestFinancingRateLessThanOrEqualTo(Integer value) {
            addCriterion("invest_financing_rate <=", value, "investFinancingRate");
            return (Criteria) this;
        }

        public Criteria andInvestFinancingRateIn(List<Integer> values) {
            addCriterion("invest_financing_rate in", values, "investFinancingRate");
            return (Criteria) this;
        }

        public Criteria andInvestFinancingRateNotIn(List<Integer> values) {
            addCriterion("invest_financing_rate not in", values, "investFinancingRate");
            return (Criteria) this;
        }

        public Criteria andInvestFinancingRateBetween(Integer value1, Integer value2) {
            addCriterion("invest_financing_rate between", value1, value2, "investFinancingRate");
            return (Criteria) this;
        }

        public Criteria andInvestFinancingRateNotBetween(Integer value1, Integer value2) {
            addCriterion("invest_financing_rate not between", value1, value2, "investFinancingRate");
            return (Criteria) this;
        }

        public Criteria andInvestUpMoneyIsNull() {
            addCriterion("invest_up_money is null");
            return (Criteria) this;
        }

        public Criteria andInvestUpMoneyIsNotNull() {
            addCriterion("invest_up_money is not null");
            return (Criteria) this;
        }

        public Criteria andInvestUpMoneyEqualTo(Long value) {
            addCriterion("invest_up_money =", value, "investUpMoney");
            return (Criteria) this;
        }

        public Criteria andInvestUpMoneyNotEqualTo(Long value) {
            addCriterion("invest_up_money <>", value, "investUpMoney");
            return (Criteria) this;
        }

        public Criteria andInvestUpMoneyGreaterThan(Long value) {
            addCriterion("invest_up_money >", value, "investUpMoney");
            return (Criteria) this;
        }

        public Criteria andInvestUpMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("invest_up_money >=", value, "investUpMoney");
            return (Criteria) this;
        }

        public Criteria andInvestUpMoneyLessThan(Long value) {
            addCriterion("invest_up_money <", value, "investUpMoney");
            return (Criteria) this;
        }

        public Criteria andInvestUpMoneyLessThanOrEqualTo(Long value) {
            addCriterion("invest_up_money <=", value, "investUpMoney");
            return (Criteria) this;
        }

        public Criteria andInvestUpMoneyIn(List<Long> values) {
            addCriterion("invest_up_money in", values, "investUpMoney");
            return (Criteria) this;
        }

        public Criteria andInvestUpMoneyNotIn(List<Long> values) {
            addCriterion("invest_up_money not in", values, "investUpMoney");
            return (Criteria) this;
        }

        public Criteria andInvestUpMoneyBetween(Long value1, Long value2) {
            addCriterion("invest_up_money between", value1, value2, "investUpMoney");
            return (Criteria) this;
        }

        public Criteria andInvestUpMoneyNotBetween(Long value1, Long value2) {
            addCriterion("invest_up_money not between", value1, value2, "investUpMoney");
            return (Criteria) this;
        }

        public Criteria andRemainDaysIsNull() {
            addCriterion("remain_days is null");
            return (Criteria) this;
        }

        public Criteria andRemainDaysIsNotNull() {
            addCriterion("remain_days is not null");
            return (Criteria) this;
        }

        public Criteria andRemainDaysEqualTo(Integer value) {
            addCriterion("remain_days =", value, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysNotEqualTo(Integer value) {
            addCriterion("remain_days <>", value, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysGreaterThan(Integer value) {
            addCriterion("remain_days >", value, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("remain_days >=", value, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysLessThan(Integer value) {
            addCriterion("remain_days <", value, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysLessThanOrEqualTo(Integer value) {
            addCriterion("remain_days <=", value, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysIn(List<Integer> values) {
            addCriterion("remain_days in", values, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysNotIn(List<Integer> values) {
            addCriterion("remain_days not in", values, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysBetween(Integer value1, Integer value2) {
            addCriterion("remain_days between", value1, value2, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("remain_days not between", value1, value2, "remainDays");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIsNull() {
            addCriterion("project_progress is null");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIsNotNull() {
            addCriterion("project_progress is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProgressEqualTo(Integer value) {
            addCriterion("project_progress =", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressNotEqualTo(Integer value) {
            addCriterion("project_progress <>", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGreaterThan(Integer value) {
            addCriterion("project_progress >", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_progress >=", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressLessThan(Integer value) {
            addCriterion("project_progress <", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressLessThanOrEqualTo(Integer value) {
            addCriterion("project_progress <=", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIn(List<Integer> values) {
            addCriterion("project_progress in", values, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressNotIn(List<Integer> values) {
            addCriterion("project_progress not in", values, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressBetween(Integer value1, Integer value2) {
            addCriterion("project_progress between", value1, value2, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressNotBetween(Integer value1, Integer value2) {
            addCriterion("project_progress not between", value1, value2, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andPreheatdateStartIsNull() {
            addCriterion("preheatdate_start is null");
            return (Criteria) this;
        }

        public Criteria andPreheatdateStartIsNotNull() {
            addCriterion("preheatdate_start is not null");
            return (Criteria) this;
        }

        public Criteria andPreheatdateStartEqualTo(Date value) {
            addCriterion("preheatdate_start =", value, "preheatdateStart");
            return (Criteria) this;
        }

        public Criteria andPreheatdateStartNotEqualTo(Date value) {
            addCriterion("preheatdate_start <>", value, "preheatdateStart");
            return (Criteria) this;
        }

        public Criteria andPreheatdateStartGreaterThan(Date value) {
            addCriterion("preheatdate_start >", value, "preheatdateStart");
            return (Criteria) this;
        }

        public Criteria andPreheatdateStartGreaterThanOrEqualTo(Date value) {
            addCriterion("preheatdate_start >=", value, "preheatdateStart");
            return (Criteria) this;
        }

        public Criteria andPreheatdateStartLessThan(Date value) {
            addCriterion("preheatdate_start <", value, "preheatdateStart");
            return (Criteria) this;
        }

        public Criteria andPreheatdateStartLessThanOrEqualTo(Date value) {
            addCriterion("preheatdate_start <=", value, "preheatdateStart");
            return (Criteria) this;
        }

        public Criteria andPreheatdateStartIn(List<Date> values) {
            addCriterion("preheatdate_start in", values, "preheatdateStart");
            return (Criteria) this;
        }

        public Criteria andPreheatdateStartNotIn(List<Date> values) {
            addCriterion("preheatdate_start not in", values, "preheatdateStart");
            return (Criteria) this;
        }

        public Criteria andPreheatdateStartBetween(Date value1, Date value2) {
            addCriterion("preheatdate_start between", value1, value2, "preheatdateStart");
            return (Criteria) this;
        }

        public Criteria andPreheatdateStartNotBetween(Date value1, Date value2) {
            addCriterion("preheatdate_start not between", value1, value2, "preheatdateStart");
            return (Criteria) this;
        }

        public Criteria andPreheatdateEndIsNull() {
            addCriterion("preheatdate_end is null");
            return (Criteria) this;
        }

        public Criteria andPreheatdateEndIsNotNull() {
            addCriterion("preheatdate_end is not null");
            return (Criteria) this;
        }

        public Criteria andPreheatdateEndEqualTo(Date value) {
            addCriterion("preheatdate_end =", value, "preheatdateEnd");
            return (Criteria) this;
        }

        public Criteria andPreheatdateEndNotEqualTo(Date value) {
            addCriterion("preheatdate_end <>", value, "preheatdateEnd");
            return (Criteria) this;
        }

        public Criteria andPreheatdateEndGreaterThan(Date value) {
            addCriterion("preheatdate_end >", value, "preheatdateEnd");
            return (Criteria) this;
        }

        public Criteria andPreheatdateEndGreaterThanOrEqualTo(Date value) {
            addCriterion("preheatdate_end >=", value, "preheatdateEnd");
            return (Criteria) this;
        }

        public Criteria andPreheatdateEndLessThan(Date value) {
            addCriterion("preheatdate_end <", value, "preheatdateEnd");
            return (Criteria) this;
        }

        public Criteria andPreheatdateEndLessThanOrEqualTo(Date value) {
            addCriterion("preheatdate_end <=", value, "preheatdateEnd");
            return (Criteria) this;
        }

        public Criteria andPreheatdateEndIn(List<Date> values) {
            addCriterion("preheatdate_end in", values, "preheatdateEnd");
            return (Criteria) this;
        }

        public Criteria andPreheatdateEndNotIn(List<Date> values) {
            addCriterion("preheatdate_end not in", values, "preheatdateEnd");
            return (Criteria) this;
        }

        public Criteria andPreheatdateEndBetween(Date value1, Date value2) {
            addCriterion("preheatdate_end between", value1, value2, "preheatdateEnd");
            return (Criteria) this;
        }

        public Criteria andPreheatdateEndNotBetween(Date value1, Date value2) {
            addCriterion("preheatdate_end not between", value1, value2, "preheatdateEnd");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateIsNull() {
            addCriterion("invest_start_date is null");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateIsNotNull() {
            addCriterion("invest_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateEqualTo(Date value) {
            addCriterion("invest_start_date =", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateNotEqualTo(Date value) {
            addCriterion("invest_start_date <>", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateGreaterThan(Date value) {
            addCriterion("invest_start_date >", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("invest_start_date >=", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateLessThan(Date value) {
            addCriterion("invest_start_date <", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateLessThanOrEqualTo(Date value) {
            addCriterion("invest_start_date <=", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateIn(List<Date> values) {
            addCriterion("invest_start_date in", values, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateNotIn(List<Date> values) {
            addCriterion("invest_start_date not in", values, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateBetween(Date value1, Date value2) {
            addCriterion("invest_start_date between", value1, value2, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateNotBetween(Date value1, Date value2) {
            addCriterion("invest_start_date not between", value1, value2, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInverstEndDateIsNull() {
            addCriterion("inverst_end_date is null");
            return (Criteria) this;
        }

        public Criteria andInverstEndDateIsNotNull() {
            addCriterion("inverst_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andInverstEndDateEqualTo(Date value) {
            addCriterion("inverst_end_date =", value, "inverstEndDate");
            return (Criteria) this;
        }

        public Criteria andInverstEndDateNotEqualTo(Date value) {
            addCriterion("inverst_end_date <>", value, "inverstEndDate");
            return (Criteria) this;
        }

        public Criteria andInverstEndDateGreaterThan(Date value) {
            addCriterion("inverst_end_date >", value, "inverstEndDate");
            return (Criteria) this;
        }

        public Criteria andInverstEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("inverst_end_date >=", value, "inverstEndDate");
            return (Criteria) this;
        }

        public Criteria andInverstEndDateLessThan(Date value) {
            addCriterion("inverst_end_date <", value, "inverstEndDate");
            return (Criteria) this;
        }

        public Criteria andInverstEndDateLessThanOrEqualTo(Date value) {
            addCriterion("inverst_end_date <=", value, "inverstEndDate");
            return (Criteria) this;
        }

        public Criteria andInverstEndDateIn(List<Date> values) {
            addCriterion("inverst_end_date in", values, "inverstEndDate");
            return (Criteria) this;
        }

        public Criteria andInverstEndDateNotIn(List<Date> values) {
            addCriterion("inverst_end_date not in", values, "inverstEndDate");
            return (Criteria) this;
        }

        public Criteria andInverstEndDateBetween(Date value1, Date value2) {
            addCriterion("inverst_end_date between", value1, value2, "inverstEndDate");
            return (Criteria) this;
        }

        public Criteria andInverstEndDateNotBetween(Date value1, Date value2) {
            addCriterion("inverst_end_date not between", value1, value2, "inverstEndDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateIsNull() {
            addCriterion("finish_date is null");
            return (Criteria) this;
        }

        public Criteria andFinishDateIsNotNull() {
            addCriterion("finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinishDateEqualTo(Date value) {
            addCriterion("finish_date =", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotEqualTo(Date value) {
            addCriterion("finish_date <>", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateGreaterThan(Date value) {
            addCriterion("finish_date >", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_date >=", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateLessThan(Date value) {
            addCriterion("finish_date <", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateLessThanOrEqualTo(Date value) {
            addCriterion("finish_date <=", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateIn(List<Date> values) {
            addCriterion("finish_date in", values, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotIn(List<Date> values) {
            addCriterion("finish_date not in", values, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateBetween(Date value1, Date value2) {
            addCriterion("finish_date between", value1, value2, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotBetween(Date value1, Date value2) {
            addCriterion("finish_date not between", value1, value2, "finishDate");
            return (Criteria) this;
        }

        public Criteria andRaiseIsNull() {
            addCriterion("raise is null");
            return (Criteria) this;
        }

        public Criteria andRaiseIsNotNull() {
            addCriterion("raise is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseEqualTo(String value) {
            addCriterion("raise =", value, "raise");
            return (Criteria) this;
        }

        public Criteria andRaiseNotEqualTo(String value) {
            addCriterion("raise <>", value, "raise");
            return (Criteria) this;
        }

        public Criteria andRaiseGreaterThan(String value) {
            addCriterion("raise >", value, "raise");
            return (Criteria) this;
        }

        public Criteria andRaiseGreaterThanOrEqualTo(String value) {
            addCriterion("raise >=", value, "raise");
            return (Criteria) this;
        }

        public Criteria andRaiseLessThan(String value) {
            addCriterion("raise <", value, "raise");
            return (Criteria) this;
        }

        public Criteria andRaiseLessThanOrEqualTo(String value) {
            addCriterion("raise <=", value, "raise");
            return (Criteria) this;
        }

        public Criteria andRaiseLike(String value) {
            addCriterion("raise like", value, "raise");
            return (Criteria) this;
        }

        public Criteria andRaiseNotLike(String value) {
            addCriterion("raise not like", value, "raise");
            return (Criteria) this;
        }

        public Criteria andRaiseIn(List<String> values) {
            addCriterion("raise in", values, "raise");
            return (Criteria) this;
        }

        public Criteria andRaiseNotIn(List<String> values) {
            addCriterion("raise not in", values, "raise");
            return (Criteria) this;
        }

        public Criteria andRaiseBetween(String value1, String value2) {
            addCriterion("raise between", value1, value2, "raise");
            return (Criteria) this;
        }

        public Criteria andRaiseNotBetween(String value1, String value2) {
            addCriterion("raise not between", value1, value2, "raise");
            return (Criteria) this;
        }

        public Criteria andLaunchIsNull() {
            addCriterion("launch is null");
            return (Criteria) this;
        }

        public Criteria andLaunchIsNotNull() {
            addCriterion("launch is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchEqualTo(String value) {
            addCriterion("launch =", value, "launch");
            return (Criteria) this;
        }

        public Criteria andLaunchNotEqualTo(String value) {
            addCriterion("launch <>", value, "launch");
            return (Criteria) this;
        }

        public Criteria andLaunchGreaterThan(String value) {
            addCriterion("launch >", value, "launch");
            return (Criteria) this;
        }

        public Criteria andLaunchGreaterThanOrEqualTo(String value) {
            addCriterion("launch >=", value, "launch");
            return (Criteria) this;
        }

        public Criteria andLaunchLessThan(String value) {
            addCriterion("launch <", value, "launch");
            return (Criteria) this;
        }

        public Criteria andLaunchLessThanOrEqualTo(String value) {
            addCriterion("launch <=", value, "launch");
            return (Criteria) this;
        }

        public Criteria andLaunchLike(String value) {
            addCriterion("launch like", value, "launch");
            return (Criteria) this;
        }

        public Criteria andLaunchNotLike(String value) {
            addCriterion("launch not like", value, "launch");
            return (Criteria) this;
        }

        public Criteria andLaunchIn(List<String> values) {
            addCriterion("launch in", values, "launch");
            return (Criteria) this;
        }

        public Criteria andLaunchNotIn(List<String> values) {
            addCriterion("launch not in", values, "launch");
            return (Criteria) this;
        }

        public Criteria andLaunchBetween(String value1, String value2) {
            addCriterion("launch between", value1, value2, "launch");
            return (Criteria) this;
        }

        public Criteria andLaunchNotBetween(String value1, String value2) {
            addCriterion("launch not between", value1, value2, "launch");
            return (Criteria) this;
        }

        public Criteria andSortAIsNull() {
            addCriterion("sort_a is null");
            return (Criteria) this;
        }

        public Criteria andSortAIsNotNull() {
            addCriterion("sort_a is not null");
            return (Criteria) this;
        }

        public Criteria andSortAEqualTo(Integer value) {
            addCriterion("sort_a =", value, "sortA");
            return (Criteria) this;
        }

        public Criteria andSortANotEqualTo(Integer value) {
            addCriterion("sort_a <>", value, "sortA");
            return (Criteria) this;
        }

        public Criteria andSortAGreaterThan(Integer value) {
            addCriterion("sort_a >", value, "sortA");
            return (Criteria) this;
        }

        public Criteria andSortAGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_a >=", value, "sortA");
            return (Criteria) this;
        }

        public Criteria andSortALessThan(Integer value) {
            addCriterion("sort_a <", value, "sortA");
            return (Criteria) this;
        }

        public Criteria andSortALessThanOrEqualTo(Integer value) {
            addCriterion("sort_a <=", value, "sortA");
            return (Criteria) this;
        }

        public Criteria andSortAIn(List<Integer> values) {
            addCriterion("sort_a in", values, "sortA");
            return (Criteria) this;
        }

        public Criteria andSortANotIn(List<Integer> values) {
            addCriterion("sort_a not in", values, "sortA");
            return (Criteria) this;
        }

        public Criteria andSortABetween(Integer value1, Integer value2) {
            addCriterion("sort_a between", value1, value2, "sortA");
            return (Criteria) this;
        }

        public Criteria andSortANotBetween(Integer value1, Integer value2) {
            addCriterion("sort_a not between", value1, value2, "sortA");
            return (Criteria) this;
        }

        public Criteria andSortBIsNull() {
            addCriterion("sort_b is null");
            return (Criteria) this;
        }

        public Criteria andSortBIsNotNull() {
            addCriterion("sort_b is not null");
            return (Criteria) this;
        }

        public Criteria andSortBEqualTo(Integer value) {
            addCriterion("sort_b =", value, "sortB");
            return (Criteria) this;
        }

        public Criteria andSortBNotEqualTo(Integer value) {
            addCriterion("sort_b <>", value, "sortB");
            return (Criteria) this;
        }

        public Criteria andSortBGreaterThan(Integer value) {
            addCriterion("sort_b >", value, "sortB");
            return (Criteria) this;
        }

        public Criteria andSortBGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_b >=", value, "sortB");
            return (Criteria) this;
        }

        public Criteria andSortBLessThan(Integer value) {
            addCriterion("sort_b <", value, "sortB");
            return (Criteria) this;
        }

        public Criteria andSortBLessThanOrEqualTo(Integer value) {
            addCriterion("sort_b <=", value, "sortB");
            return (Criteria) this;
        }

        public Criteria andSortBIn(List<Integer> values) {
            addCriterion("sort_b in", values, "sortB");
            return (Criteria) this;
        }

        public Criteria andSortBNotIn(List<Integer> values) {
            addCriterion("sort_b not in", values, "sortB");
            return (Criteria) this;
        }

        public Criteria andSortBBetween(Integer value1, Integer value2) {
            addCriterion("sort_b between", value1, value2, "sortB");
            return (Criteria) this;
        }

        public Criteria andSortBNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_b not between", value1, value2, "sortB");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(String value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(String value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(String value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(String value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(String value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLike(String value) {
            addCriterion("deleted like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotLike(String value) {
            addCriterion("deleted not like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<String> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<String> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(String value1, String value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(String value1, String value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIsNull() {
            addCriterion("is_on_sale is null");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIsNotNull() {
            addCriterion("is_on_sale is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleEqualTo(String value) {
            addCriterion("is_on_sale =", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotEqualTo(String value) {
            addCriterion("is_on_sale <>", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleGreaterThan(String value) {
            addCriterion("is_on_sale >", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleGreaterThanOrEqualTo(String value) {
            addCriterion("is_on_sale >=", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLessThan(String value) {
            addCriterion("is_on_sale <", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLessThanOrEqualTo(String value) {
            addCriterion("is_on_sale <=", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLike(String value) {
            addCriterion("is_on_sale like", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotLike(String value) {
            addCriterion("is_on_sale not like", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIn(List<String> values) {
            addCriterion("is_on_sale in", values, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotIn(List<String> values) {
            addCriterion("is_on_sale not in", values, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleBetween(String value1, String value2) {
            addCriterion("is_on_sale between", value1, value2, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotBetween(String value1, String value2) {
            addCriterion("is_on_sale not between", value1, value2, "isOnSale");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}