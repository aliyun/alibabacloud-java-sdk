// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsResponseBody extends TeaModel {
    // The number of records that are returned for the query.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that marks the position at which the query ends. An empty value indicates that all data is returned.
    @NameInMap("NextToken")
    public String nextToken;

    // The details about the applications.
    @NameInMap("QuotaApplications")
    public java.util.List<ListQuotaApplicationsResponseBodyQuotaApplications> quotaApplications;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of applications.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListQuotaApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationsResponseBody self = new ListQuotaApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaApplicationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaApplicationsResponseBody setQuotaApplications(java.util.List<ListQuotaApplicationsResponseBodyQuotaApplications> quotaApplications) {
        this.quotaApplications = quotaApplications;
        return this;
    }
    public java.util.List<ListQuotaApplicationsResponseBodyQuotaApplications> getQuotaApplications() {
        return this.quotaApplications;
    }

    public ListQuotaApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuotaApplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListQuotaApplicationsResponseBodyQuotaApplicationsPeriod extends TeaModel {
        // The unit of the calculation cycle of the quota. Valid values:
        // 
        // *   second
        // *   minute
        // *   hour
        // *   day
        // *   week
        @NameInMap("PeriodUnit")
        public String periodUnit;

        // The value of the calculation cycle of the quota.
        @NameInMap("PeriodValue")
        public Long periodValue;

        public static ListQuotaApplicationsResponseBodyQuotaApplicationsPeriod build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaApplicationsResponseBodyQuotaApplicationsPeriod self = new ListQuotaApplicationsResponseBodyQuotaApplicationsPeriod();
            return TeaModel.build(map, self);
        }

        public ListQuotaApplicationsResponseBodyQuotaApplicationsPeriod setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplicationsPeriod setPeriodValue(Long periodValue) {
            this.periodValue = periodValue;
            return this;
        }
        public Long getPeriodValue() {
            return this.periodValue;
        }

    }

    public static class ListQuotaApplicationsResponseBodyQuotaApplications extends TeaModel {
        // The ID of the application.
        @NameInMap("ApplicationId")
        public String applicationId;

        // The time when the application was submitted.
        @NameInMap("ApplyTime")
        public String applyTime;

        // The quota value that is approved.
        @NameInMap("ApproveValue")
        public Float approveValue;

        // The result of the application.
        @NameInMap("AuditReason")
        public String auditReason;

        // The remarks of the application.
        @NameInMap("Comment")
        public String comment;

        // The quota value that is approved.
        @NameInMap("DesireValue")
        public Float desireValue;

        // The quota dimension of the application.
        @NameInMap("Dimension")
        public java.util.Map<String, ?> dimension;

        // The time when the application took effect.
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        // The time when the application expired.
        @NameInMap("ExpireTime")
        public String expireTime;

        // Indicates whether Quota Center sends a notification about the application result. Valid values:
        // 
        // *   0: Quota Center sends a notification.
        // *   3: Quota Center does not send a notification.
        @NameInMap("NoticeType")
        public Integer noticeType;

        // The calculation cycle of the quota.
        @NameInMap("Period")
        public ListQuotaApplicationsResponseBodyQuotaApplicationsPeriod period;

        // The abbreviation of the cloud service name.
        @NameInMap("ProductCode")
        public String productCode;

        // The ID of the quota.
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        // The Alibaba Cloud Resource Name (ARN) of the quota.
        @NameInMap("QuotaArn")
        public String quotaArn;

        // The description of the quota.
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        // The name of the quota.
        @NameInMap("QuotaName")
        public String quotaName;

        // The unit of the quota.
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        // The reason for the application.
        @NameInMap("Reason")
        public String reason;

        // The status of the application. Valid values:
        // 
        // *   Disagree: The application is rejected.
        // *   Agree: The application is approved.
        // *   Process: The application is pending approval.
        // *   Cancel: The application is closed.
        @NameInMap("Status")
        public String status;

        public static ListQuotaApplicationsResponseBodyQuotaApplications build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaApplicationsResponseBodyQuotaApplications self = new ListQuotaApplicationsResponseBodyQuotaApplications();
            return TeaModel.build(map, self);
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setApproveValue(Float approveValue) {
            this.approveValue = approveValue;
            return this;
        }
        public Float getApproveValue() {
            return this.approveValue;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setAuditReason(String auditReason) {
            this.auditReason = auditReason;
            return this;
        }
        public String getAuditReason() {
            return this.auditReason;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setDesireValue(Float desireValue) {
            this.desireValue = desireValue;
            return this;
        }
        public Float getDesireValue() {
            return this.desireValue;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setDimension(java.util.Map<String, ?> dimension) {
            this.dimension = dimension;
            return this;
        }
        public java.util.Map<String, ?> getDimension() {
            return this.dimension;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setNoticeType(Integer noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public Integer getNoticeType() {
            return this.noticeType;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setPeriod(ListQuotaApplicationsResponseBodyQuotaApplicationsPeriod period) {
            this.period = period;
            return this;
        }
        public ListQuotaApplicationsResponseBodyQuotaApplicationsPeriod getPeriod() {
            return this.period;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setQuotaArn(String quotaArn) {
            this.quotaArn = quotaArn;
            return this;
        }
        public String getQuotaArn() {
            return this.quotaArn;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setQuotaDescription(String quotaDescription) {
            this.quotaDescription = quotaDescription;
            return this;
        }
        public String getQuotaDescription() {
            return this.quotaDescription;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setQuotaUnit(String quotaUnit) {
            this.quotaUnit = quotaUnit;
            return this;
        }
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
