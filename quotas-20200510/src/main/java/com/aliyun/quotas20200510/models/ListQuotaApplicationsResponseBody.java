// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("QuotaApplications")
    public java.util.List<ListQuotaApplicationsResponseBodyQuotaApplications> quotaApplications;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("PeriodUnit")
        public String periodUnit;

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
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("ApplyTime")
        public String applyTime;

        @NameInMap("ApproveValue")
        public Float approveValue;

        @NameInMap("AuditReason")
        public String auditReason;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("DesireValue")
        public Float desireValue;

        @NameInMap("Dimension")
        public java.util.Map<String, ?> dimension;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("NoticeType")
        public Integer noticeType;

        @NameInMap("Period")
        public ListQuotaApplicationsResponseBodyQuotaApplicationsPeriod period;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        @NameInMap("QuotaArn")
        public String quotaArn;

        @NameInMap("QuotaDescription")
        public String quotaDescription;

        @NameInMap("QuotaName")
        public String quotaName;

        @NameInMap("QuotaUnit")
        public String quotaUnit;

        @NameInMap("Reason")
        public String reason;

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
