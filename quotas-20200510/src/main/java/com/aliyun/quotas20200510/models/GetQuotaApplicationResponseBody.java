// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationResponseBody extends TeaModel {
    // The details about the application.
    @NameInMap("QuotaApplication")
    public GetQuotaApplicationResponseBodyQuotaApplication quotaApplication;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static GetQuotaApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaApplicationResponseBody self = new GetQuotaApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaApplicationResponseBody setQuotaApplication(GetQuotaApplicationResponseBodyQuotaApplication quotaApplication) {
        this.quotaApplication = quotaApplication;
        return this;
    }
    public GetQuotaApplicationResponseBodyQuotaApplication getQuotaApplication() {
        return this.quotaApplication;
    }

    public GetQuotaApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetQuotaApplicationResponseBodyQuotaApplication extends TeaModel {
        // The ID of the application.
        @NameInMap("ApplicationId")
        public String applicationId;

        // The time when the application was submitted.
        @NameInMap("ApplyTime")
        public String applyTime;

        // The approved quota value.
        @NameInMap("ApproveValue")
        public Float approveValue;

        // The result of the application.
        @NameInMap("AuditReason")
        public String auditReason;

        // The quota for which you apply.
        @NameInMap("DesireValue")
        public Integer desireValue;

        // The quota dimensions.
        // 
        // Format: `{"regionId":"Region"}`.
        @NameInMap("Dimension")
        public java.util.Map<String, ?> dimension;

        // The time when the quota took effect.
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        // The time when the quota expired.
        @NameInMap("ExpireTime")
        public String expireTime;

        // The notification method. Valid values:
        // 
        // *   0: Quota Center does not send a notification.
        // *   1: Quota Center sends an email notification.
        // *   2: Quota Center sends an SMS notification.
        @NameInMap("NoticeType")
        public Long noticeType;

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

        public static GetQuotaApplicationResponseBodyQuotaApplication build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaApplicationResponseBodyQuotaApplication self = new GetQuotaApplicationResponseBodyQuotaApplication();
            return TeaModel.build(map, self);
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setApproveValue(Float approveValue) {
            this.approveValue = approveValue;
            return this;
        }
        public Float getApproveValue() {
            return this.approveValue;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setAuditReason(String auditReason) {
            this.auditReason = auditReason;
            return this;
        }
        public String getAuditReason() {
            return this.auditReason;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setDesireValue(Integer desireValue) {
            this.desireValue = desireValue;
            return this;
        }
        public Integer getDesireValue() {
            return this.desireValue;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setDimension(java.util.Map<String, ?> dimension) {
            this.dimension = dimension;
            return this;
        }
        public java.util.Map<String, ?> getDimension() {
            return this.dimension;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setNoticeType(Long noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public Long getNoticeType() {
            return this.noticeType;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setQuotaArn(String quotaArn) {
            this.quotaArn = quotaArn;
            return this;
        }
        public String getQuotaArn() {
            return this.quotaArn;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setQuotaDescription(String quotaDescription) {
            this.quotaDescription = quotaDescription;
            return this;
        }
        public String getQuotaDescription() {
            return this.quotaDescription;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setQuotaUnit(String quotaUnit) {
            this.quotaUnit = quotaUnit;
            return this;
        }
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetQuotaApplicationResponseBodyQuotaApplication setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
