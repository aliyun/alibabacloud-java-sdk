// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationResponseBody extends TeaModel {
    /**
     * <p>The details about the application.</p>
     */
    @NameInMap("QuotaApplication")
    public GetQuotaApplicationResponseBodyQuotaApplication quotaApplication;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The time when the application was submitted.</p>
         */
        @NameInMap("ApplyTime")
        public String applyTime;

        /**
         * <p>The approved quota value.</p>
         */
        @NameInMap("ApproveValue")
        public Float approveValue;

        /**
         * <p>The result of the application.</p>
         */
        @NameInMap("AuditReason")
        public String auditReason;

        /**
         * <p>The expected value of the quota.</p>
         */
        @NameInMap("DesireValue")
        public Integer desireValue;

        /**
         * <p>The dimension.</p>
         * <br>
         * <p>Format: `{"regionId":"Region"}`.</p>
         */
        @NameInMap("Dimension")
        public java.util.Map<String, ?> dimension;

        /**
         * <p>The time when the new quota value takes effect.</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The time when the new quota expires.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The method of that is used to send alert notifications. Valid values:</p>
         * <br>
         * <p>*   0: Quota Center does not send a notification.</p>
         * <p>*   1: Quota Center sends an email notification.</p>
         * <p>*   2: Quota Center sends an SMS notification.</p>
         */
        @NameInMap("NoticeType")
        public Long noticeType;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the quota.</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the quota.</p>
         */
        @NameInMap("QuotaArn")
        public String quotaArn;

        /**
         * <p>The description of the quota.</p>
         */
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        /**
         * <p>The name of the quota.</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        /**
         * <p>The unit of the new quota value.</p>
         */
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        /**
         * <p>The reason for the application.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The status of the application. Valid values:</p>
         * <br>
         * <p>*   Disagree: The application is rejected.</p>
         * <p>*   Agree: The application is approved.</p>
         * <p>*   Process: The application is being reviewed.</p>
         * <p>*   Cancel: The application is closed.</p>
         */
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
