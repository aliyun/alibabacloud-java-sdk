// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateTemplateQuotaItemRequest extends TeaModel {
    /**
     * <p>The requested quota value.</p>
     * <blockquote>
     * <ul>
     * <li>Set the requested quota value based on the <code>TotalUsage</code> (quota usage) and <code>ApplicableRange</code> (applicable range for the quota item) of the target quota in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</li>
     * <li>Quota applications are reviewed by the technical support team of each cloud service. To increase the approval rate, specify a reasonable requested value and provide a detailed reason when you apply for a quota increase.</li>
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
     * <p>The quota dimensions.</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<CreateTemplateQuotaItemRequestDimensions> dimensions;

    /**
     * <p>The UTC time when the quota takes effect.
     * This parameter applies only to privileges (WhiteListLabel). </p>
     * <blockquote>
     * <p>An empty value indicates that the quota takes effect immediately.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-19T09:25:56Z</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The language of the quota alert notification. Valid values:</p>
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
     * <p>The UTC time when the quota expires.
     * This parameter applies only to privileges (WhiteListLabel). </p>
     * <blockquote>
     * <p>An empty value indicates that no UTC expiration time is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-20T09:25:56Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Specifies whether to send a notification for the quota application result. Valid values:</p>
     * <ul>
     * <li>0 (default): No.</li>
     * <li>3: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NoticeType")
    public Long noticeType;

    /**
     * <p>The abbreviation of the cloud service.</p>
     * <blockquote>
     * <p>For information about how to obtain the abbreviation of a cloud service, see <code>ProductCode</code> in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
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
     * <p>The quota category. Valid values:</p>
     * <ul>
     * <li>CommonQuota: general quota.</li>
     * <li>WhiteListLabel: privilege.</li>
     * <li>FlowControl: API rate limit.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CommonQuota</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    public static CreateTemplateQuotaItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateQuotaItemRequest self = new CreateTemplateQuotaItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateQuotaItemRequest setDesireValue(Float desireValue) {
        this.desireValue = desireValue;
        return this;
    }
    public Float getDesireValue() {
        return this.desireValue;
    }

    public CreateTemplateQuotaItemRequest setDimensions(java.util.List<CreateTemplateQuotaItemRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<CreateTemplateQuotaItemRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public CreateTemplateQuotaItemRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public CreateTemplateQuotaItemRequest setEnvLanguage(String envLanguage) {
        this.envLanguage = envLanguage;
        return this;
    }
    public String getEnvLanguage() {
        return this.envLanguage;
    }

    public CreateTemplateQuotaItemRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateTemplateQuotaItemRequest setNoticeType(Long noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public Long getNoticeType() {
        return this.noticeType;
    }

    public CreateTemplateQuotaItemRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateTemplateQuotaItemRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public CreateTemplateQuotaItemRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public static class CreateTemplateQuotaItemRequestDimensions extends TeaModel {
        /**
         * <p>The key of the quota dimension.</p>
         * <blockquote>
         * <ul>
         * <li>The value range of N depends on the number of dimensions supported by the cloud service.</li>
         * <li>If <code>ProductCode</code> is <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and the value of the quota dimension.</li>
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
         * <li>If <code>ProductCode</code> is <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and the value of the quota dimension.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTemplateQuotaItemRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateQuotaItemRequestDimensions self = new CreateTemplateQuotaItemRequestDimensions();
            return TeaModel.build(map, self);
        }

        public CreateTemplateQuotaItemRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTemplateQuotaItemRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
