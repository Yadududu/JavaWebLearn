package com.lmj.bean;

import java.util.ArrayList;
import java.util.List;

public class CountryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CountryExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCCountrynameIsNull() {
            addCriterion("c_countryname is null");
            return (Criteria) this;
        }

        public Criteria andCCountrynameIsNotNull() {
            addCriterion("c_countryname is not null");
            return (Criteria) this;
        }

        public Criteria andCCountrynameEqualTo(String value) {
            addCriterion("c_countryname =", value, "cCountryname");
            return (Criteria) this;
        }

        public Criteria andCCountrynameNotEqualTo(String value) {
            addCriterion("c_countryname <>", value, "cCountryname");
            return (Criteria) this;
        }

        public Criteria andCCountrynameGreaterThan(String value) {
            addCriterion("c_countryname >", value, "cCountryname");
            return (Criteria) this;
        }

        public Criteria andCCountrynameGreaterThanOrEqualTo(String value) {
            addCriterion("c_countryname >=", value, "cCountryname");
            return (Criteria) this;
        }

        public Criteria andCCountrynameLessThan(String value) {
            addCriterion("c_countryname <", value, "cCountryname");
            return (Criteria) this;
        }

        public Criteria andCCountrynameLessThanOrEqualTo(String value) {
            addCriterion("c_countryname <=", value, "cCountryname");
            return (Criteria) this;
        }

        public Criteria andCCountrynameLike(String value) {
            addCriterion("c_countryname like", value, "cCountryname");
            return (Criteria) this;
        }

        public Criteria andCCountrynameNotLike(String value) {
            addCriterion("c_countryname not like", value, "cCountryname");
            return (Criteria) this;
        }

        public Criteria andCCountrynameIn(List<String> values) {
            addCriterion("c_countryname in", values, "cCountryname");
            return (Criteria) this;
        }

        public Criteria andCCountrynameNotIn(List<String> values) {
            addCriterion("c_countryname not in", values, "cCountryname");
            return (Criteria) this;
        }

        public Criteria andCCountrynameBetween(String value1, String value2) {
            addCriterion("c_countryname between", value1, value2, "cCountryname");
            return (Criteria) this;
        }

        public Criteria andCCountrynameNotBetween(String value1, String value2) {
            addCriterion("c_countryname not between", value1, value2, "cCountryname");
            return (Criteria) this;
        }

        public Criteria andCCapitalIsNull() {
            addCriterion("c_capital is null");
            return (Criteria) this;
        }

        public Criteria andCCapitalIsNotNull() {
            addCriterion("c_capital is not null");
            return (Criteria) this;
        }

        public Criteria andCCapitalEqualTo(String value) {
            addCriterion("c_capital =", value, "cCapital");
            return (Criteria) this;
        }

        public Criteria andCCapitalNotEqualTo(String value) {
            addCriterion("c_capital <>", value, "cCapital");
            return (Criteria) this;
        }

        public Criteria andCCapitalGreaterThan(String value) {
            addCriterion("c_capital >", value, "cCapital");
            return (Criteria) this;
        }

        public Criteria andCCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("c_capital >=", value, "cCapital");
            return (Criteria) this;
        }

        public Criteria andCCapitalLessThan(String value) {
            addCriterion("c_capital <", value, "cCapital");
            return (Criteria) this;
        }

        public Criteria andCCapitalLessThanOrEqualTo(String value) {
            addCriterion("c_capital <=", value, "cCapital");
            return (Criteria) this;
        }

        public Criteria andCCapitalLike(String value) {
            addCriterion("c_capital like", value, "cCapital");
            return (Criteria) this;
        }

        public Criteria andCCapitalNotLike(String value) {
            addCriterion("c_capital not like", value, "cCapital");
            return (Criteria) this;
        }

        public Criteria andCCapitalIn(List<String> values) {
            addCriterion("c_capital in", values, "cCapital");
            return (Criteria) this;
        }

        public Criteria andCCapitalNotIn(List<String> values) {
            addCriterion("c_capital not in", values, "cCapital");
            return (Criteria) this;
        }

        public Criteria andCCapitalBetween(String value1, String value2) {
            addCriterion("c_capital between", value1, value2, "cCapital");
            return (Criteria) this;
        }

        public Criteria andCCapitalNotBetween(String value1, String value2) {
            addCriterion("c_capital not between", value1, value2, "cCapital");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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