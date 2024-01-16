// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsForTemplateResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records that can be returned for the query.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position from which you want to start the query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The queried quota application records.</p>
     */
    @NameInMap("QuotaBatchApplications")
    public java.util.List<ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications> quotaBatchApplications;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that are returned for the query.</p>
     */
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
        /**
         * <p>The number of approval documents.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The approval status of the quota increase application. Valid values:</p>
         * <br>
         * <p>*   Disagree: The application is rejected.</p>
         * <p>*   Agree: The application is approved.</p>
         * <p>*   Process: The application is pending approval.</p>
         * <p>*   Cancel: The application is canceled.</p>
         */
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
        /**
         * <p>The Alibaba Cloud accounts for which the quotas are applied.</p>
         */
        @NameInMap("AliyunUids")
        public java.util.List<String> aliyunUids;

        /**
         * <p>The time when the quota increase application was submitted. The value is displayed in UTC.</p>
         */
        @NameInMap("ApplyTime")
        public String applyTime;

        /**
         * <p>The number of applications in different approval states.</p>
         */
        @NameInMap("AuditStatusVos")
        public java.util.List<ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplicationsAuditStatusVos> auditStatusVos;

        /**
         * <p>The ID of the quota application batch.</p>
         */
        @NameInMap("BatchQuotaApplicationId")
        public String batchQuotaApplicationId;

        /**
         * <p>The requested value of the quota.</p>
         */
        @NameInMap("DesireValue")
        public Double desireValue;

        /**
         * <p>The quota dimensions.</p>
         * <br>
         * <p>Format: {"regionId":"cn-hangzhou"}.</p>
         */
        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        /**
         * <p>The start time of the validity period of the quota. The value is displayed in UTC.</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The end time of the validity period of the quota. The value is displayed in UTC.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The quota ID.</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The quota type. Valid values:</p>
         * <br>
         * <p>*   CommonQuota: general quota</p>
         * <p>*   FlowControl: API rate limit</p>
         * <p>*   WhiteListLabel: privilege</p>
         */
        @NameInMap("QuotaCategory")
        public String quotaCategory;

        /**
         * <p>The reason for the quota increase application.</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications self = new ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications();
            return TeaModel.build(map, self);
        }

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications setAliyunUids(java.util.List<String> aliyunUids) {
            this.aliyunUids = aliyunUids;
            return this;
        }
        public java.util.List<String> getAliyunUids() {
            return this.aliyunUids;
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

        public ListQuotaApplicationsForTemplateResponseBodyQuotaBatchApplications setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
