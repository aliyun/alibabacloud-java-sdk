// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ModifyTemplateQuotaItemRequest extends TeaModel {
    /**
     * <p>The value of the quota that you want to apply for.</p>
     * <blockquote>
     * <ul>
     * <li><p>You can set this parameter based on the <code>TotalUsage</code> (quota usage) and <code>ApplicableRange</code> (the range of values for the quota) parameters of the target quota in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
     * </li>
     * <li><p>The quota application is reviewed by the technical support of each Alibaba Cloud service. To increase the success rate of your application, you must specify a reasonable quota value and a detailed reason when you submit the application.</p>
     * </li>
     * </ul>
     * </blockquote>
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
    public java.util.List<ModifyTemplateQuotaItemRequestDimensions> dimensions;

    /**
     * <p>The UTC time when the quota takes effect.
     * This parameter is applicable only to privileges (WhiteListLabel).</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the quota takes effect immediately.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-19T09:25:56Z</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The language of the notification for a quota alert. Valid values:</p>
     * <ul>
     * <li><p>zh (default): Chinese.</p>
     * </li>
     * <li><p>en: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("EnvLanguage")
    public String envLanguage;

    /**
     * <p>The UTC time when the quota expires.
     * This parameter is applicable only to privileges (WhiteListLabel).</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the quota does not expire.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-20T09:25:56Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The ID of the quota template.
     * For more information about how to obtain the ID of a quota template, see <a href="https://help.aliyun.com/document_detail/450403.html">ListQuotaApplicationTemplates</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Specifies whether to send a notification about the application result. Valid values:</p>
     * <ul>
     * <li><p>0 (default): no.</p>
     * </li>
     * <li><p>3: yes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NoticeType")
    public Long noticeType;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <blockquote>
     * <p>For more information about how to obtain the abbreviation of an Alibaba Cloud service name, see the <code>ProductCode</code> parameter in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * <blockquote>
     * <p>For more information about how to obtain the quota ID of an Alibaba Cloud service, see the <code>QuotaActionCode</code> parameter in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>q_security-groups</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota type. Valid values:</p>
     * <ul>
     * <li><p>CommonQuota (default): general quota.</p>
     * </li>
     * <li><p>WhiteListLabel: privilege.</p>
     * </li>
     * <li><p>FlowControl: API rate limit.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CommonQuota</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    public static ModifyTemplateQuotaItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateQuotaItemRequest self = new ModifyTemplateQuotaItemRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateQuotaItemRequest setDesireValue(Float desireValue) {
        this.desireValue = desireValue;
        return this;
    }
    public Float getDesireValue() {
        return this.desireValue;
    }

    public ModifyTemplateQuotaItemRequest setDimensions(java.util.List<ModifyTemplateQuotaItemRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<ModifyTemplateQuotaItemRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public ModifyTemplateQuotaItemRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyTemplateQuotaItemRequest setEnvLanguage(String envLanguage) {
        this.envLanguage = envLanguage;
        return this;
    }
    public String getEnvLanguage() {
        return this.envLanguage;
    }

    public ModifyTemplateQuotaItemRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ModifyTemplateQuotaItemRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyTemplateQuotaItemRequest setNoticeType(Long noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public Long getNoticeType() {
        return this.noticeType;
    }

    public ModifyTemplateQuotaItemRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ModifyTemplateQuotaItemRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public ModifyTemplateQuotaItemRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public static class ModifyTemplateQuotaItemRequestDimensions extends TeaModel {
        /**
         * <p>The key of the quota dimension.</p>
         * <blockquote>
         * <ul>
         * <li><p>The value of N depends on the number of dimensions that are supported by the Alibaba Cloud service.</p>
         * </li>
         * <li><p>If you set <code>ProductCode</code> to a value such as <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and value of the quota dimension.</p>
         * </li>
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
         * <li><p>The value of N depends on the number of dimensions that are supported by the Alibaba Cloud service.</p>
         * </li>
         * <li><p>If you set <code>ProductCode</code> to a value such as <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and value of the quota dimension.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyTemplateQuotaItemRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            ModifyTemplateQuotaItemRequestDimensions self = new ModifyTemplateQuotaItemRequestDimensions();
            return TeaModel.build(map, self);
        }

        public ModifyTemplateQuotaItemRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyTemplateQuotaItemRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
