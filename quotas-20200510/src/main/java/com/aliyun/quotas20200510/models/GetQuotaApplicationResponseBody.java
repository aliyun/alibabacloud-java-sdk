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
     * 
     * <strong>example:</strong>
     * <p>7BBD1D37-094C-4485-8B7D-64682F82BC18</p>
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
         * 
         * <strong>example:</strong>
         * <p>d314d6ae-867d-484c-9009-3d421a80****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The time when the application was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-19T09:25:56Z</p>
         */
        @NameInMap("ApplyTime")
        public String applyTime;

        /**
         * <p>The approved quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The expected value of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>804</p>
         */
        @NameInMap("DesireValue")
        public Integer desireValue;

        /**
         * <p>The dimension.</p>
         * <p>Format: <code>{&quot;regionId&quot;:&quot;Region&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cn-shanghai&quot;,&quot;cn-hangzhou&quot;]</p>
         */
        @NameInMap("Dimension")
        public java.util.Map<String, ?> dimension;

        /**
         * <p>The time when the new quota value takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-19 15:30:00</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The time when the new quota expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-29 15:30:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The method of that is used to send alert notifications. Valid values:</p>
         * <ul>
         * <li>0: Quota Center does not send a notification.</li>
         * <li>1: Quota Center sends an email notification.</li>
         * <li>2: Quota Center sends an SMS notification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NoticeType")
        public Long noticeType;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>q_security-groups</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:quotas:cn-hangzhou:120886317861****:quota/ecs/q_security-groups/</p>
         */
        @NameInMap("QuotaArn")
        public String quotaArn;

        /**
         * <p>The description of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>The maximum number of security groups that can be owned by the current account</p>
         */
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        /**
         * <p>The name of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>Maximum Number of Security Groups</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        /**
         * <p>The unit of the new quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        /**
         * <p>The reason for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Scale Out</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The status of the application. Valid values:</p>
         * <ul>
         * <li>Disagree: The application is rejected.</li>
         * <li>Agree: The application is approved.</li>
         * <li>Process: The application is being reviewed.</li>
         * <li>Cancel: The application is closed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Agree</p>
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
