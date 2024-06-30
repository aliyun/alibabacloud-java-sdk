// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaApplicationsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records that are returned for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position at which the query ends. An empty value indicates that all data is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The details of the applications.</p>
     */
    @NameInMap("QuotaApplications")
    public java.util.List<ListQuotaApplicationsResponseBodyQuotaApplications> quotaApplications;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>730925FB-0BD0-40AC-AF3A-A6C6E9716879</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of applications.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The unit of the calculation cycle. Valid values:</p>
         * <ul>
         * <li>second</li>
         * <li>minute</li>
         * <li>hour</li>
         * <li>day</li>
         * <li>week</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>second</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The value of the calculation cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>b926571d-cc09-4711-b547-58a615f0****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The time when the application was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-15T09:13:53Z</p>
         */
        @NameInMap("ApplyTime")
        public String applyTime;

        /**
         * <p>The quota value that is approved.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("ApproveValue")
        public Float approveValue;

        /**
         * <p>The result of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Agree</p>
         */
        @NameInMap("AuditReason")
        public String auditReason;

        /**
         * <p>The remarks of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The quota value that is approved.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("DesireValue")
        public Float desireValue;

        /**
         * <p>The dimension of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("Dimension")
        public java.util.Map<String, ?> dimension;

        /**
         * <p>The time when the application took effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-15T11:46:25Z</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The time when the application expired.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-17T11:46:25Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether Quota Center sends a notification about the application result. Valid values:</p>
         * <ul>
         * <li>0: A notification about the application result is not sent.</li>
         * <li>3: A notification about the application result is sent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NoticeType")
        public Integer noticeType;

        /**
         * <p>The calculation cycle of the quota.</p>
         */
        @NameInMap("Period")
        public ListQuotaApplicationsResponseBodyQuotaApplicationsPeriod period;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>csk</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>q_i5uzm3</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:quotas:<em>:120886317861</em>***:quota/csk/q_i5uzm3</p>
         */
        @NameInMap("QuotaArn")
        public String quotaArn;

        /**
         * <p>The description of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>The maximum number of nodes in a cluster</p>
         */
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        /**
         * <p>The name of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>Maximum Number of Nodes</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        /**
         * <p>The unit of the new quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>Node</p>
         */
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        /**
         * <p>The reason for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Business expansion</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The status of the application. Valid values:</p>
         * <ul>
         * <li>Disagree: The application is rejected.</li>
         * <li>Agree: The application is approved.</li>
         * <li>Process: The application is being reviewed.</li>
         * <li>Cancel: The application is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Agree</p>
         */
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
