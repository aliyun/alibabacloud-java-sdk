// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationResponseBody extends TeaModel {
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
     * <p>The quota value that is approved.</p>
     * 
     * <strong>example:</strong>
     * <p>804</p>
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
     * <p>The requested value of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("DesireValue")
    public Integer desireValue;

    /**
     * <p>The quota dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
     */
    @NameInMap("Dimension")
    public java.util.Map<String, ?> dimension;

    /**
     * <p>The time when the new quota value takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-19T09:25:56Z</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The time when the new quota expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-20T09:25:56Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Indicates whether Quota Center sends a notification about the application result. Valid values:</p>
     * <ul>
     * <li>0: Quota Center does not send a notification.</li>
     * <li>3: Quota Center sends a notification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("NoticeType")
    public Long noticeType;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-spec</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c5.large</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:quotas:cn-hangzhou:*:quota/ecs/ecs.m2.medium/prepaid/classic/instancetype/cn-hangzhou-b</p>
     */
    @NameInMap("QuotaArn")
    public String quotaArn;

    /**
     * <p>The description of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c5.large</p>
     */
    @NameInMap("QuotaDescription")
    public String quotaDescription;

    /**
     * <p>The name of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c5.large</p>
     */
    @NameInMap("QuotaName")
    public String quotaName;

    /**
     * <p>The unit of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>AMOUNT</p>
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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D47B3A10-CDAC-5412-B2EE-EC9A3DBE9053</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
     * <p>Process</p>
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
