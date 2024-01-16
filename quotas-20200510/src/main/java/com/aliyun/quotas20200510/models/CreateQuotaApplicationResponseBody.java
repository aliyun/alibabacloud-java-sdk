// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationResponseBody extends TeaModel {
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
     * <p>The quota value that is approved.</p>
     */
    @NameInMap("ApproveValue")
    public Float approveValue;

    /**
     * <p>The result of the application.</p>
     */
    @NameInMap("AuditReason")
    public String auditReason;

    /**
     * <p>The requested value of the quota.</p>
     */
    @NameInMap("DesireValue")
    public Integer desireValue;

    /**
     * <p>The quota dimension.</p>
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
     * <p>Indicates whether Quota Center sends a notification about the application result. Valid values:</p>
     * <br>
     * <p>*   0: Quota Center does not send a notification.</p>
     * <p>*   3: Quota Center sends a notification.</p>
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
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the application. Valid values:</p>
     * <br>
     * <p>*   Disagree: The application is rejected.</p>
     * <p>*   Agree: The application is approved.</p>
     * <p>*   Process: The application is being reviewed.</p>
     * <p>*   Cancel: The application is canceled.</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateQuotaApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaApplicationResponseBody self = new CreateQuotaApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQuotaApplicationResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateQuotaApplicationResponseBody setApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }
    public String getApplyTime() {
        return this.applyTime;
    }

    public CreateQuotaApplicationResponseBody setApproveValue(Float approveValue) {
        this.approveValue = approveValue;
        return this;
    }
    public Float getApproveValue() {
        return this.approveValue;
    }

    public CreateQuotaApplicationResponseBody setAuditReason(String auditReason) {
        this.auditReason = auditReason;
        return this;
    }
    public String getAuditReason() {
        return this.auditReason;
    }

    public CreateQuotaApplicationResponseBody setDesireValue(Integer desireValue) {
        this.desireValue = desireValue;
        return this;
    }
    public Integer getDesireValue() {
        return this.desireValue;
    }

    public CreateQuotaApplicationResponseBody setDimension(java.util.Map<String, ?> dimension) {
        this.dimension = dimension;
        return this;
    }
    public java.util.Map<String, ?> getDimension() {
        return this.dimension;
    }

    public CreateQuotaApplicationResponseBody setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public CreateQuotaApplicationResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateQuotaApplicationResponseBody setNoticeType(Long noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public Long getNoticeType() {
        return this.noticeType;
    }

    public CreateQuotaApplicationResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateQuotaApplicationResponseBody setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public CreateQuotaApplicationResponseBody setQuotaArn(String quotaArn) {
        this.quotaArn = quotaArn;
        return this;
    }
    public String getQuotaArn() {
        return this.quotaArn;
    }

    public CreateQuotaApplicationResponseBody setQuotaDescription(String quotaDescription) {
        this.quotaDescription = quotaDescription;
        return this;
    }
    public String getQuotaDescription() {
        return this.quotaDescription;
    }

    public CreateQuotaApplicationResponseBody setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public CreateQuotaApplicationResponseBody setQuotaUnit(String quotaUnit) {
        this.quotaUnit = quotaUnit;
        return this;
    }
    public String getQuotaUnit() {
        return this.quotaUnit;
    }

    public CreateQuotaApplicationResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CreateQuotaApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQuotaApplicationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
