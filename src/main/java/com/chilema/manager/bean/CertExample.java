package com.chilema.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class CertExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andIdImgIsNull() {
            addCriterion("id_img is null");
            return (Criteria) this;
        }

        public Criteria andIdImgIsNotNull() {
            addCriterion("id_img is not null");
            return (Criteria) this;
        }

        public Criteria andIdImgEqualTo(String value) {
            addCriterion("id_img =", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgNotEqualTo(String value) {
            addCriterion("id_img <>", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgGreaterThan(String value) {
            addCriterion("id_img >", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgGreaterThanOrEqualTo(String value) {
            addCriterion("id_img >=", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgLessThan(String value) {
            addCriterion("id_img <", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgLessThanOrEqualTo(String value) {
            addCriterion("id_img <=", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgLike(String value) {
            addCriterion("id_img like", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgNotLike(String value) {
            addCriterion("id_img not like", value, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgIn(List<String> values) {
            addCriterion("id_img in", values, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgNotIn(List<String> values) {
            addCriterion("id_img not in", values, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgBetween(String value1, String value2) {
            addCriterion("id_img between", value1, value2, "idImg");
            return (Criteria) this;
        }

        public Criteria andIdImgNotBetween(String value1, String value2) {
            addCriterion("id_img not between", value1, value2, "idImg");
            return (Criteria) this;
        }

        public Criteria andTradImgIsNull() {
            addCriterion("trad_img is null");
            return (Criteria) this;
        }

        public Criteria andTradImgIsNotNull() {
            addCriterion("trad_img is not null");
            return (Criteria) this;
        }

        public Criteria andTradImgEqualTo(String value) {
            addCriterion("trad_img =", value, "tradImg");
            return (Criteria) this;
        }

        public Criteria andTradImgNotEqualTo(String value) {
            addCriterion("trad_img <>", value, "tradImg");
            return (Criteria) this;
        }

        public Criteria andTradImgGreaterThan(String value) {
            addCriterion("trad_img >", value, "tradImg");
            return (Criteria) this;
        }

        public Criteria andTradImgGreaterThanOrEqualTo(String value) {
            addCriterion("trad_img >=", value, "tradImg");
            return (Criteria) this;
        }

        public Criteria andTradImgLessThan(String value) {
            addCriterion("trad_img <", value, "tradImg");
            return (Criteria) this;
        }

        public Criteria andTradImgLessThanOrEqualTo(String value) {
            addCriterion("trad_img <=", value, "tradImg");
            return (Criteria) this;
        }

        public Criteria andTradImgLike(String value) {
            addCriterion("trad_img like", value, "tradImg");
            return (Criteria) this;
        }

        public Criteria andTradImgNotLike(String value) {
            addCriterion("trad_img not like", value, "tradImg");
            return (Criteria) this;
        }

        public Criteria andTradImgIn(List<String> values) {
            addCriterion("trad_img in", values, "tradImg");
            return (Criteria) this;
        }

        public Criteria andTradImgNotIn(List<String> values) {
            addCriterion("trad_img not in", values, "tradImg");
            return (Criteria) this;
        }

        public Criteria andTradImgBetween(String value1, String value2) {
            addCriterion("trad_img between", value1, value2, "tradImg");
            return (Criteria) this;
        }

        public Criteria andTradImgNotBetween(String value1, String value2) {
            addCriterion("trad_img not between", value1, value2, "tradImg");
            return (Criteria) this;
        }

        public Criteria andHygImgIsNull() {
            addCriterion("hyg_img is null");
            return (Criteria) this;
        }

        public Criteria andHygImgIsNotNull() {
            addCriterion("hyg_img is not null");
            return (Criteria) this;
        }

        public Criteria andHygImgEqualTo(String value) {
            addCriterion("hyg_img =", value, "hygImg");
            return (Criteria) this;
        }

        public Criteria andHygImgNotEqualTo(String value) {
            addCriterion("hyg_img <>", value, "hygImg");
            return (Criteria) this;
        }

        public Criteria andHygImgGreaterThan(String value) {
            addCriterion("hyg_img >", value, "hygImg");
            return (Criteria) this;
        }

        public Criteria andHygImgGreaterThanOrEqualTo(String value) {
            addCriterion("hyg_img >=", value, "hygImg");
            return (Criteria) this;
        }

        public Criteria andHygImgLessThan(String value) {
            addCriterion("hyg_img <", value, "hygImg");
            return (Criteria) this;
        }

        public Criteria andHygImgLessThanOrEqualTo(String value) {
            addCriterion("hyg_img <=", value, "hygImg");
            return (Criteria) this;
        }

        public Criteria andHygImgLike(String value) {
            addCriterion("hyg_img like", value, "hygImg");
            return (Criteria) this;
        }

        public Criteria andHygImgNotLike(String value) {
            addCriterion("hyg_img not like", value, "hygImg");
            return (Criteria) this;
        }

        public Criteria andHygImgIn(List<String> values) {
            addCriterion("hyg_img in", values, "hygImg");
            return (Criteria) this;
        }

        public Criteria andHygImgNotIn(List<String> values) {
            addCriterion("hyg_img not in", values, "hygImg");
            return (Criteria) this;
        }

        public Criteria andHygImgBetween(String value1, String value2) {
            addCriterion("hyg_img between", value1, value2, "hygImg");
            return (Criteria) this;
        }

        public Criteria andHygImgNotBetween(String value1, String value2) {
            addCriterion("hyg_img not between", value1, value2, "hygImg");
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