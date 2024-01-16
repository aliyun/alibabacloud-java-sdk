// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsDetailForTemplateResponseBody extends TeaModel {
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
     * <p>The details of the quota increase application.</p>
     */
    @NameInMap("QuotaApplications")
    public java.util.List<ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications> quotaApplications;

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

    public static ListQuotaApplicationsDetailForTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationsDetailForTemplateResponseBody self = new ListQuotaApplicationsDetailForTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationsDetailForTemplateResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaApplicationsDetailForTemplateResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaApplicationsDetailForTemplateResponseBody setQuotaApplications(java.util.List<ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications> quotaApplications) {
        this.quotaApplications = quotaApplications;
        return this;
    }
    public java.util.List<ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications> getQuotaApplications() {
        return this.quotaApplications;
    }

    public ListQuotaApplicationsDetailForTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuotaApplicationsDetailForTemplateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplicationsPeriod extends TeaModel {
        /**
         * <p>The unit of the calculation cycle of the quota.</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The value of the calculation cycle of the quota.</p>
         */
        @NameInMap("PeriodValue")
        public Integer periodValue;

        public static ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplicationsPeriod build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplicationsPeriod self = new ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplicationsPeriod();
            return TeaModel.build(map, self);
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplicationsPeriod setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplicationsPeriod setPeriodValue(Integer periodValue) {
            this.periodValue = periodValue;
            return this;
        }
        public Integer getPeriodValue() {
            return this.periodValue;
        }

    }

    public static class ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <p>The ID of the quota increase application.</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The time when the quota increase application was submitted. The value is displayed in UTC.</p>
         */
        @NameInMap("ApplyTime")
        public String applyTime;

        /**
         * <p>The quota value that is approved.</p>
         */
        @NameInMap("ApproveValue")
        public Double approveValue;

        /**
         * <p>The approval result of the quota increase application.</p>
         */
        @NameInMap("AuditReason")
        public String auditReason;

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
        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplicationsPeriod period;

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
         * <p>The Alibaba Cloud Resource Name (ARN) of the quota.</p>
         */
        @NameInMap("QuotaArn")
        public String quotaArn;

        /**
         * <p>The quota type. Valid values:</p>
         * <br>
         * <p>*   CommonQuota (default): general quota</p>
         * <p>*   WhiteListLabel: privilege</p>
         * <p>*   FlowControl: API rate limit</p>
         */
        @NameInMap("QuotaCategory")
        public String quotaCategory;

        /**
         * <p>The description of the quota.</p>
         */
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        /**
         * <p>The quota dimensions.</p>
         */
        @NameInMap("QuotaDimension")
        public java.util.Map<String, String> quotaDimension;

        /**
         * <p>The quota name.</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        /**
         * <p>The unit of the quota.</p>
         */
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        /**
         * <p>The reason for the quota increase application.</p>
         */
        @NameInMap("Reason")
        public String reason;

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

        public static ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications self = new ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications();
            return TeaModel.build(map, self);
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setApproveValue(Double approveValue) {
            this.approveValue = approveValue;
            return this;
        }
        public Double getApproveValue() {
            return this.approveValue;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setAuditReason(String auditReason) {
            this.auditReason = auditReason;
            return this;
        }
        public String getAuditReason() {
            return this.auditReason;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setBatchQuotaApplicationId(String batchQuotaApplicationId) {
            this.batchQuotaApplicationId = batchQuotaApplicationId;
            return this;
        }
        public String getBatchQuotaApplicationId() {
            return this.batchQuotaApplicationId;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setDesireValue(Double desireValue) {
            this.desireValue = desireValue;
            return this;
        }
        public Double getDesireValue() {
            return this.desireValue;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setEnvLanguage(String envLanguage) {
            this.envLanguage = envLanguage;
            return this;
        }
        public String getEnvLanguage() {
            return this.envLanguage;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setNoticeType(Integer noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public Integer getNoticeType() {
            return this.noticeType;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setPeriod(ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplicationsPeriod period) {
            this.period = period;
            return this;
        }
        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplicationsPeriod getPeriod() {
            return this.period;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setQuotaArn(String quotaArn) {
            this.quotaArn = quotaArn;
            return this;
        }
        public String getQuotaArn() {
            return this.quotaArn;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setQuotaCategory(String quotaCategory) {
            this.quotaCategory = quotaCategory;
            return this;
        }
        public String getQuotaCategory() {
            return this.quotaCategory;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setQuotaDescription(String quotaDescription) {
            this.quotaDescription = quotaDescription;
            return this;
        }
        public String getQuotaDescription() {
            return this.quotaDescription;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setQuotaDimension(java.util.Map<String, String> quotaDimension) {
            this.quotaDimension = quotaDimension;
            return this;
        }
        public java.util.Map<String, String> getQuotaDimension() {
            return this.quotaDimension;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setQuotaUnit(String quotaUnit) {
            this.quotaUnit = quotaUnit;
            return this;
        }
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
