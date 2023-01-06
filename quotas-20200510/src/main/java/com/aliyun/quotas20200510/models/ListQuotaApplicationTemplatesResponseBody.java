// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationTemplatesResponseBody extends TeaModel {
    // The maximum number of records that are returned for the query.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that marks the position at which the query ends.
    // 
    // > An empty value indicates that all data is returned.
    @NameInMap("NextToken")
    public String nextToken;

    // The quota templates that are returned.
    @NameInMap("QuotaApplicationTemplates")
    public java.util.List<ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates> quotaApplicationTemplates;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of records that are returned for the query.
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

    public static class ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates extends TeaModel {
        // None
        @NameInMap("ApplicableRange")
        public java.util.List<Float> applicableRange;

        // The type of the adjustable value. Valid values:
        // 
        // *   continuous
        // *   discontinuous
        @NameInMap("ApplicableType")
        public String applicableType;

        // The requested value of the quota.
        @NameInMap("DesireValue")
        public Float desireValue;

        // The quota dimensions.
        // 
        // Format: {"regionId":"Region"}.
        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        // 配额生效的UTC时间。
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        // The language of the quota alert notification. Valid values:
        // 
        // *   zh: Chinese
        // *   en: English
        @NameInMap("EnvLanguage")
        public String envLanguage;

        // 配额失效的UTC时间。
        @NameInMap("ExpireTime")
        public String expireTime;

        // The ID of the quota template.
        @NameInMap("Id")
        public String id;

        // Indicates whether Quota Center sends a notification about the application result. Valid values:
        // 
        // *   0: no
        // *   3: yes
        @NameInMap("NoticeType")
        public Integer noticeType;

        // The abbreviation of the Alibaba Cloud service name.
        @NameInMap("ProductCode")
        public String productCode;

        // The ID of the quota.
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        // 配额类型。
        // - CommonQuota：通用配额。
        // - WhiteListLabel：权益配额。
        @NameInMap("QuotaCategory")
        public String quotaCategory;

        // The description of the quota.
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        // The name of the quota.
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
