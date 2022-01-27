// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationResponseBody extends TeaModel {
    @NameInMap("QuotaApplication")
    public GetQuotaApplicationResponseBodyQuotaApplication quotaApplication;

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
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("ApplyTime")
        public String applyTime;

        @NameInMap("ApproveValue")
        public Float approveValue;

        @NameInMap("AuditReason")
        public String auditReason;

        @NameInMap("DesireValue")
        public Integer desireValue;

        @NameInMap("Dimension")
        public java.util.Map<String, ?> dimension;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("NoticeType")
        public Long noticeType;

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
