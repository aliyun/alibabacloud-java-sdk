// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsForTemplateResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("QuotaBatchApplications")
    public java.util.List<ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications> quotaBatchApplications;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListQuotaApplicationsForTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationsForTemplateResponseBody self = new ListQuotaApplicationsForTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationsForTemplateResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaApplicationsForTemplateResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaApplicationsForTemplateResponseBody setQuotaBatchApplications(java.util.List<ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications> quotaBatchApplications) {
        this.quotaBatchApplications = quotaBatchApplications;
        return this;
    }
    public java.util.List<ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications> getQuotaBatchApplications() {
        return this.quotaBatchApplications;
    }

    public ListQuotaApplicationsForTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuotaApplicationsForTemplateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplicationsAuditStatusVos extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Status")
        public String status;

        public static ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplicationsAuditStatusVos build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplicationsAuditStatusVos self = new ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplicationsAuditStatusVos();
            return TeaModel.build(map, self);
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplicationsAuditStatusVos setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplicationsAuditStatusVos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications extends TeaModel {
        @NameInMap("ApplyTime")
        public String applyTime;

        @NameInMap("AuditStatusVos")
        public java.util.List<ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplicationsAuditStatusVos> auditStatusVos;

        @NameInMap("BatchQuotaApplicationId")
        public String batchQuotaApplicationId;

        @NameInMap("DesireValue")
        public Double desireValue;

        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        @NameInMap("QuotaCategory")
        public String quotaCategory;

        public static ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications self = new ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications();
            return TeaModel.build(map, self);
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications setAuditStatusVos(java.util.List<ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplicationsAuditStatusVos> auditStatusVos) {
            this.auditStatusVos = auditStatusVos;
            return this;
        }
        public java.util.List<ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplicationsAuditStatusVos> getAuditStatusVos() {
            return this.auditStatusVos;
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications setBatchQuotaApplicationId(String batchQuotaApplicationId) {
            this.batchQuotaApplicationId = batchQuotaApplicationId;
            return this;
        }
        public String getBatchQuotaApplicationId() {
            return this.batchQuotaApplicationId;
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications setDesireValue(Double desireValue) {
            this.desireValue = desireValue;
            return this;
        }
        public Double getDesireValue() {
            return this.desireValue;
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications setDimensions(java.util.Map<String, ?> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.Map<String, ?> getDimensions() {
            return this.dimensions;
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications setQuotaCategory(String quotaCategory) {
            this.quotaCategory = quotaCategory;
            return this;
        }
        public String getQuotaCategory() {
            return this.quotaCategory;
        }

    }

}
