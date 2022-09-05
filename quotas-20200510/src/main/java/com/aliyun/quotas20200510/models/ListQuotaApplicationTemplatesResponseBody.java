// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationTemplatesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("QuotaApplicationTemplates")
    public java.util.List<ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates> quotaApplicationTemplates;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ApplicableRange")
        public java.util.List<Float> applicableRange;

        @NameInMap("ApplicableType")
        public String applicableType;

        @NameInMap("DesireValue")
        public Float desireValue;

        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        @NameInMap("EnvLanguage")
        public String envLanguage;

        @NameInMap("Id")
        public String id;

        @NameInMap("NoticeType")
        public Integer noticeType;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        @NameInMap("QuotaDescription")
        public String quotaDescription;

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

        public ListQuotaApplicationTemplatesResponseBodyQuotaApplicationTemplates setEnvLanguage(String envLanguage) {
            this.envLanguage = envLanguage;
            return this;
        }
        public String getEnvLanguage() {
            return this.envLanguage;
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
