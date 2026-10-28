// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>Notice: This parameter is deprecated and is not recommended.</p>
     * </blockquote>
     * <p>The quota review mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Sync</p>
     */
    @NameInMap("AuditMode")
    public String auditMode;

    /**
     * <p>The requested quota value.</p>
     * <blockquote>
     * <ul>
     * <li>Set the requested quota value based on the <code>TotalUsage</code> (quota usage) and <code>ApplicableRange</code> (applicable range of the quota) of the target quota in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</li>
     * <li>Quota increase requests are reviewed by the technical support of each cloud service. To increase the chances of approval, provide a reasonable requested value and a detailed reason when you submit the request.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>804</p>
     */
    @NameInMap("DesireValue")
    public Float desireValue;

    /**
     * <p>The quota dimensions.
     * The dimensions are attributes of the quota. The combination of dimensions (Dimensions) and quota ID (QuotaActionCode) uniquely identifies a quota.</p>
     * <blockquote>
     * <p>Some cloud services require dimensions. You can call <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> to query the quota dimensions supported by a cloud service. The <code>Requisite</code> response parameter indicates whether a dimension is required.</p>
     * </blockquote>
     */
    @NameInMap("Dimensions")
    public java.util.List<CreateQuotaApplicationRequestDimensions> dimensions;

    /**
     * <p>The UTC time when the quota takes effect.
     * This parameter is applicable only to privileges (WhiteListLabel). </p>
     * <blockquote>
     * <p>If you do not specify an effective period, the default value is 99 years from the start time of the current quota.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-19T09:25:56Z</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The language of the quota alert notification.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("EnvLanguage")
    public String envLanguage;

    /**
     * <p>The UTC time when the quota expires.
     * This parameter is applicable only to privileges (WhiteListLabel). </p>
     * <blockquote>
     * <p>If you do not specify an expiration time, the default value is the submission time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-20T09:25:56Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Specifies whether to send a notification about the request result. Valid values:</p>
     * <ul>
     * <li>0 (default): does not send a notification.</li>
     * <li>3: sends a notification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NoticeType")
    public Integer noticeType;

    /**
     * <p>The abbreviation of the cloud service name.</p>
     * <blockquote>
     * <p>For information about how to obtain the abbreviation of a cloud service name, see <code>ProductCode</code> in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * <blockquote>
     * <p>For information about how to obtain the quota ID of a cloud service, see <code>QuotaActionCode</code> in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>q_security-groups</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota type.</p>
     * <p>Default value: CommonQuota.</p>
     * 
     * <strong>example:</strong>
     * <p>CommonQuota</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    /**
     * <p>The reason for the quota increase request.</p>
     * <blockquote>
     * <p>Quota increase requests are reviewed by the technical support of each cloud service. To increase the chances of approval, provide a reasonable requested value and a detailed reason when you submit the request.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Scale Out</p>
     */
    @NameInMap("Reason")
    public String reason;

    public static CreateQuotaApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaApplicationRequest self = new CreateQuotaApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateQuotaApplicationRequest setAuditMode(String auditMode) {
        this.auditMode = auditMode;
        return this;
    }
    public String getAuditMode() {
        return this.auditMode;
    }

    public CreateQuotaApplicationRequest setDesireValue(Float desireValue) {
        this.desireValue = desireValue;
        return this;
    }
    public Float getDesireValue() {
        return this.desireValue;
    }

    public CreateQuotaApplicationRequest setDimensions(java.util.List<CreateQuotaApplicationRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<CreateQuotaApplicationRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public CreateQuotaApplicationRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public CreateQuotaApplicationRequest setEnvLanguage(String envLanguage) {
        this.envLanguage = envLanguage;
        return this;
    }
    public String getEnvLanguage() {
        return this.envLanguage;
    }

    public CreateQuotaApplicationRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateQuotaApplicationRequest setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public Integer getNoticeType() {
        return this.noticeType;
    }

    public CreateQuotaApplicationRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateQuotaApplicationRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public CreateQuotaApplicationRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public CreateQuotaApplicationRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public static class CreateQuotaApplicationRequestDimensions extends TeaModel {
        /**
         * <p>The key of the quota dimension.</p>
         * <blockquote>
         * <p><code>Dimensions.N.Key</code> and <code>Dimensions.N.Value</code> must be specified together. The valid values of N depend on the number of dimensions supported by the cloud service. You can call <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> to query the quota dimensions supported by a cloud service. The length of the returned array is the value of N.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the quota dimension.</p>
         * <blockquote>
         * <p><code>Dimensions.N.Key</code> and <code>Dimensions.N.Value</code> must be specified together. The valid values of N depend on the number of dimensions supported by the cloud service. You can call <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> to query the quota dimensions supported by a cloud service. The length of the returned array is the value of N.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateQuotaApplicationRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            CreateQuotaApplicationRequestDimensions self = new CreateQuotaApplicationRequestDimensions();
            return TeaModel.build(map, self);
        }

        public CreateQuotaApplicationRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateQuotaApplicationRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
