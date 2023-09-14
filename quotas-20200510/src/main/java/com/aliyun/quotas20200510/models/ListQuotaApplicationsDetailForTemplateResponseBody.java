// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsDetailForTemplateResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("QuotaApplications")
    public java.util.List<ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplications> quotaApplications;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("PeriodUnit")
        public String periodUnit;

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
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("ApplyTime")
        public String applyTime;

        @NameInMap("ApproveValue")
        public Double approveValue;

        @NameInMap("AuditReason")
        public String auditReason;

        @NameInMap("BatchQuotaApplicationId")
        public String batchQuotaApplicationId;

        @NameInMap("DesireValue")
        public Double desireValue;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("EnvLanguage")
        public String envLanguage;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("NoticeType")
        public Integer noticeType;

        @NameInMap("Period")
        public ListQuotaApplicationsDetailForTemplateResponseBodyQuotaApplicationsPeriod period;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        @NameInMap("QuotaArn")
        public String quotaArn;

        @NameInMap("QuotaCategory")
        public String quotaCategory;

        @NameInMap("QuotaDescription")
        public String quotaDescription;

        @NameInMap("QuotaDimension")
        public java.util.Map<String, String> quotaDimension;

        @NameInMap("QuotaName")
        public String quotaName;

        @NameInMap("QuotaUnit")
        public String quotaUnit;

        @NameInMap("Reason")
        public String reason;

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
