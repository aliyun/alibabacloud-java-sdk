// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationTemplatesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records returned for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position at which the query ends.</p>
     * <blockquote>
     * <p>An empty value indicates that all data is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The queried quota templates.</p>
     */
    @NameInMap("QuotaApplicationTemplates")
    public java.util.List<ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates> quotaApplicationTemplates;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D47B3A10-CDAC-5412-B2EE-EC9A3DBE9053</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records returned for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListQuotaApplicationTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationTemplatesResponseBody self = new ListQuotaApplicationTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaApplicationTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaApplicationTemplatesResponseBody setQuotaApplicationTemplates(java.util.List<ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates> quotaApplicationTemplates) {
        this.quotaApplicationTemplates = quotaApplicationTemplates;
        return this;
    }
    public java.util.List<ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates> getQuotaApplicationTemplates() {
        return this.quotaApplicationTemplates;
    }

    public ListQuotaApplicationTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuotaApplicationTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplatesPeriod extends TeaModel {
        /**
         * <p>The unit of the calculation cycle. Valid values:</p>
         * <ul>
         * <li>second</li>
         * <li>minute</li>
         * <li>hour</li>
         * <li>day</li>
         * <li>week</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The value of the calculation cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodValue")
        public Integer periodValue;

        public static ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplatesPeriod build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplatesPeriod self = new ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplatesPeriod();
            return TeaModel.build(map, self);
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplatesPeriod setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplatesPeriod setPeriodValue(Integer periodValue) {
            this.periodValue = periodValue;
            return this;
        }
        public Integer getPeriodValue() {
            return this.periodValue;
        }

    }

    public static class ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates extends TeaModel {
        /**
         * <p>None</p>
         */
        @NameInMap("ApplicableRange")
        public java.util.List<Float> applicableRange;

        /**
         * <p>The type of the adjustable value. Valid values:</p>
         * <ul>
         * <li>continuous</li>
         * <li>discontinuous</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>continuous</p>
         */
        @NameInMap("ApplicableType")
        public String applicableType;

        /**
         * <p>The requested value of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>802</p>
         */
        @NameInMap("DesireValue")
        public Float desireValue;

        /**
         * <p>The quota dimensions.</p>
         * <p>Format: {&quot;regionId&quot;:&quot;Region&quot;}.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        /**
         * <p>The start time of the validity period of the quota. The value is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-28T06:07:00Z</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The language of the quota alert notification. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("EnvLanguage")
        public String envLanguage;

        /**
         * <p>The end time of the validity period of the quota. The value is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-29T06:07:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the quota template.</p>
         * 
         * <strong>example:</strong>
         * <p>1****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether Quota Center sends a notification about the application result. Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>3: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NoticeType")
        public Integer noticeType;

        /**
         * <p>The calculation cycle of the quota.</p>
         */
        @NameInMap("Period")
        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplatesPeriod period;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>q_security-groups</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The type of the quota. Valid values:</p>
         * <ul>
         * <li>CommonQuota: general quota</li>
         * <li>FlowControl: API rate limit</li>
         * <li>WhiteListLabel: privilege</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CommonQuota</p>
         */
        @NameInMap("QuotaCategory")
        public String quotaCategory;

        /**
         * <p>The description of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>The maximum number of security groups that can be created by the current account.</p>
         */
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        /**
         * <p>The name of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>Maximum Number of Security Groups</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        public static ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates self = new ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates();
            return TeaModel.build(map, self);
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setApplicableRange(java.util.List<Float> applicableRange) {
            this.applicableRange = applicableRange;
            return this;
        }
        public java.util.List<Float> getApplicableRange() {
            return this.applicableRange;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setApplicableType(String applicableType) {
            this.applicableType = applicableType;
            return this;
        }
        public String getApplicableType() {
            return this.applicableType;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setDesireValue(Float desireValue) {
            this.desireValue = desireValue;
            return this;
        }
        public Float getDesireValue() {
            return this.desireValue;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setDimensions(java.util.Map<String, ?> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.Map<String, ?> getDimensions() {
            return this.dimensions;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setEnvLanguage(String envLanguage) {
            this.envLanguage = envLanguage;
            return this;
        }
        public String getEnvLanguage() {
            return this.envLanguage;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setNoticeType(Integer noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public Integer getNoticeType() {
            return this.noticeType;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setPeriod(ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplatesPeriod period) {
            this.period = period;
            return this;
        }
        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplatesPeriod getPeriod() {
            return this.period;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setQuotaCategory(String quotaCategory) {
            this.quotaCategory = quotaCategory;
            return this;
        }
        public String getQuotaCategory() {
            return this.quotaCategory;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setQuotaDescription(String quotaDescription) {
            this.quotaDescription = quotaDescription;
            return this;
        }
        public String getQuotaDescription() {
            return this.quotaDescription;
        }

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

    }

}
