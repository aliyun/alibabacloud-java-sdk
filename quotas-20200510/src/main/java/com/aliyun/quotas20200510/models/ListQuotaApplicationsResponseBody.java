// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("QuotaApplications")
    public java.util.List<ListQuotaApplicationsResponseBodyQuotaApplications> quotaApplications;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListQuotaApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaApplicationsResponseBody self = new ListQuotaApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotaApplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListQuotaApplicationsResponseBody setQuotaApplications(java.util.List<ListQuotaApplicationsResponseBodyQuotaApplications> quotaApplications) {
        this.quotaApplications = quotaApplications;
        return this;
    }
    public java.util.List<ListQuotaApplicationsResponseBodyQuotaApplications> getQuotaApplications() {
        return this.quotaApplications;
    }

    public ListQuotaApplicationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuotaApplicationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListQuotaApplicationsResponseBodyQuotaApplications extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("QuotaUnit")
        public String quotaUnit;

        @NameInMap("DesireValue")
        public Float desireValue;

        @NameInMap("NoticeType")
        public Integer noticeType;

        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        @NameInMap("Dimension")
        public java.util.Map<String, ?> dimension;

        @NameInMap("QuotaDescription")
        public String quotaDescription;

        @NameInMap("QuotaArn")
        public String quotaArn;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("ApproveValue")
        public Float approveValue;

        @NameInMap("QuotaName")
        public String quotaName;

        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("AuditReason")
        public String auditReason;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ApplyTime")
        public String applyTime;

        @NameInMap("ProductCode")
        public String productCode;

        public static ListQuotaApplicationsResponseBodyQuotaApplications build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaApplicationsResponseBodyQuotaApplications self = new ListQuotaApplicationsResponseBodyQuotaApplications();
            return TeaModel.build(map, self);
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setQuotaUnit(String quotaUnit) {
            this.quotaUnit = quotaUnit;
            return this;
        }
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setDesireValue(Float desireValue) {
            this.desireValue = desireValue;
            return this;
        }
        public Float getDesireValue() {
            return this.desireValue;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setNoticeType(Integer noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public Integer getNoticeType() {
            return this.noticeType;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setDimension(java.util.Map<String, ?> dimension) {
            this.dimension = dimension;
            return this;
        }
        public java.util.Map<String, ?> getDimension() {
            return this.dimension;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setQuotaDescription(String quotaDescription) {
            this.quotaDescription = quotaDescription;
            return this;
        }
        public String getQuotaDescription() {
            return this.quotaDescription;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setQuotaArn(String quotaArn) {
            this.quotaArn = quotaArn;
            return this;
        }
        public String getQuotaArn() {
            return this.quotaArn;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setApproveValue(Float approveValue) {
            this.approveValue = approveValue;
            return this;
        }
        public Float getApproveValue() {
            return this.approveValue;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setAuditReason(String auditReason) {
            this.auditReason = auditReason;
            return this;
        }
        public String getAuditReason() {
            return this.auditReason;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public ListQuotaApplicationsResponseBodyQuotaApplications setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
