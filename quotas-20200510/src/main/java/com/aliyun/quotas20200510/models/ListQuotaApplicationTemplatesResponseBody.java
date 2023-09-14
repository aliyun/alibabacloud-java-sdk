// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationTemplatesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records returned for the query.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position at which the query ends.</p>
     * <br>
     * <p>> An empty value indicates that all data is returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The returned quota templates.</p>
     */
    @NameInMap("QuotaApplicationTemplates")
    public java.util.List<ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates> quotaApplicationTemplates;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records returned for the query.</p>
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
         * <br>
         * <p>*   second</p>
         * <p>*   minute</p>
         * <p>*   hour</p>
         * <p>*   day</p>
         * <p>*   week</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The value of the calculation cycle.</p>
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
         * <p>N/A</p>
         */
        @NameInMap("ApplicableRange")
        public java.util.List<Float> applicableRange;

        /**
         * <p>The type of the adjustable value. Valid values:</p>
         * <br>
         * <p>*   continuous</p>
         * <p>*   discontinuous</p>
         */
        @NameInMap("ApplicableType")
        public String applicableType;

        /**
         * <p>The requested value of the quota.</p>
         */
        @NameInMap("DesireValue")
        public Float desireValue;

        /**
         * <p>The quota dimensions.</p>
         * <br>
         * <p>Format: {"regionId":"Region"}.</p>
         */
        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        /**
         * <p>The start time of the validity period of the quota. The value is displayed in UTC.</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The language of the quota alert notification. Valid values:</p>
         * <br>
         * <p>*   zh: Chinese</p>
         * <p>*   en: English</p>
         */
        @NameInMap("EnvLanguage")
        public String envLanguage;

        /**
         * <p>The end time of the validity period of the quota. The value is displayed in UTC.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the quota template.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether Quota Center sends a notification about the application result. Valid values:</p>
         * <br>
         * <p>*   0: no</p>
         * <p>*   3: yes</p>
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
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the quota.</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The type of the quota.</p>
         * <br>
         * <p>*   CommonQuota: general quota</p>
         * <p>*   WhiteListLabel: privilege</p>
         */
        @NameInMap("QuotaCategory")
        public String quotaCategory;

        /**
         * <p>The description of the quota.</p>
         */
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        /**
         * <p>The name of the quota.</p>
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
