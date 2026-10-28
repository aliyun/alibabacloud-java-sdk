// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationsForTemplateRequest extends TeaModel {
    /**
     * <p>The list of Alibaba Cloud accounts that belong to the resource directory members for which you want to apply for quotas.</p>
     * <blockquote>
     * <p>You can apply for quota increases for a maximum of 50 members at a time. For more information about the members of a resource directory, see <a href="https://help.aliyun.com/document_detail/604207.html">ListAccounts</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliyunUids")
    public java.util.List<String> aliyunUids;

    /**
     * <p>The requested quota value.</p>
     * <blockquote>
     * <ul>
     * <li>Set the requested quota value based on the <code>TotalUsage</code> (quota usage) and <code>ApplicableRange</code> (applicable range for quota application) of the target quota in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</li>
     * <li>Quota applications are reviewed and approved by the technical support team of each cloud service. To increase the approval rate, specify a reasonable requested value and provide a detailed reason when you submit a quota application.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("DesireValue")
    public Double desireValue;

    /**
     * <p>The quota dimensions.</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<CreateQuotaApplicationsForTemplateRequestDimensions> dimensions;

    /**
     * <p>The UTC time when the quota takes effect. This parameter applies only to privileges (WhiteListLabel).</p>
     * <blockquote>
     * <p>If you do not specify an effective period for the current account, the commit time is used by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-19T09:25:56Z</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The language of the notification for the quota application result. Valid values:</p>
     * <ul>
     * <li>zh (default): Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("EnvLanguage")
    public String envLanguage;

    /**
     * <p>The UTC time when the quota expires. This parameter applies only to privileges (WhiteListLabel). </p>
     * <blockquote>
     * <p>If you do not specify an expiration time for the current account, the expiration time is set to 99 years after the effective period of the current quota.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-20T09:25:56Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Specifies whether to send notifications for quota application results. Valid values:</p>
     * <ul>
     * <li>0 (default): no.</li>
     * <li>3: yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NoticeType")
    public Integer noticeType;

    /**
     * <p>The abbreviated name of the cloud service.</p>
     * <blockquote>
     * <p>For more information about how to obtain the abbreviated name of a cloud service, see <code>ProductCode</code> in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-spec</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * <blockquote>
     * <p>For more information about how to obtain the quota ID of a cloud service, see <code>QuotaActionCode</code> in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.2xlarge</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota type. Valid values:</p>
     * <ul>
     * <li>CommonQuota: general quota.</li>
     * <li>FlowControl: API rate limit.</li>
     * <li>WhiteListLabel: privilege.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CommonQuota</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    /**
     * <p>The reason for the quota application.</p>
     * <blockquote>
     * <p>Quota applications are reviewed and approved by the technical support team of each cloud service. To increase the approval rate, specify a reasonable requested value and provide a detailed reason when you submit a quota application.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Scale Out</p>
     */
    @NameInMap("Reason")
    public String reason;

    public static CreateQuotaApplicationsForTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaApplicationsForTemplateRequest self = new CreateQuotaApplicationsForTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateQuotaApplicationsForTemplateRequest setAliyunUids(java.util.List<String> aliyunUids) {
        this.aliyunUids = aliyunUids;
        return this;
    }
    public java.util.List<String> getAliyunUids() {
        return this.aliyunUids;
    }

    public CreateQuotaApplicationsForTemplateRequest setDesireValue(Double desireValue) {
        this.desireValue = desireValue;
        return this;
    }
    public Double getDesireValue() {
        return this.desireValue;
    }

    public CreateQuotaApplicationsForTemplateRequest setDimensions(java.util.List<CreateQuotaApplicationsForTemplateRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<CreateQuotaApplicationsForTemplateRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public CreateQuotaApplicationsForTemplateRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public CreateQuotaApplicationsForTemplateRequest setEnvLanguage(String envLanguage) {
        this.envLanguage = envLanguage;
        return this;
    }
    public String getEnvLanguage() {
        return this.envLanguage;
    }

    public CreateQuotaApplicationsForTemplateRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateQuotaApplicationsForTemplateRequest setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public Integer getNoticeType() {
        return this.noticeType;
    }

    public CreateQuotaApplicationsForTemplateRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateQuotaApplicationsForTemplateRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public CreateQuotaApplicationsForTemplateRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public CreateQuotaApplicationsForTemplateRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public static class CreateQuotaApplicationsForTemplateRequestDimensions extends TeaModel {
        /**
         * <p>The key of the quota dimension.</p>
         * <blockquote>
         * <ul>
         * <li>The value range of N depends on the number of dimensions supported by the cloud service.</li>
         * <li>When <code>ProductCode</code> is set to <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and the value of the quota dimension.</li>
         * </ul>
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
         * <ul>
         * <li>The value range of N depends on the number of dimensions supported by the cloud service.</li>
         * <li>When <code>ProductCode</code> is set to <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and the value of the quota dimension.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateQuotaApplicationsForTemplateRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            CreateQuotaApplicationsForTemplateRequestDimensions self = new CreateQuotaApplicationsForTemplateRequestDimensions();
            return TeaModel.build(map, self);
        }

        public CreateQuotaApplicationsForTemplateRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateQuotaApplicationsForTemplateRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
