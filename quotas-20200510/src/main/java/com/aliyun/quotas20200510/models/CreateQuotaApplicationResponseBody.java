// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationResponseBody extends TeaModel {
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

    @NameInMap("RequestId")
    public String requestId;

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
