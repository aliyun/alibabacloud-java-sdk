// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateTemplateQuotaItemRequest extends TeaModel {
    // The requested value of the quota.
    @NameInMap("DesireValue")
    public Float desireValue;

    // The quota dimensions.
    @NameInMap("Dimensions")
    public java.util.List<CreateTemplateQuotaItemRequestDimensions> dimensions;

    // The start time of the validity period of the quota. Specify the value in UTC. This parameter is valid only if you set the QuotaCategory parameter to WhiteListLabel.
    // 
    // > If you do not specify this parameter, the quota takes effect immediately.
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    // The language of the quota alert notification. Valid values:
    // 
    // *   zh (default value): Chinese
    // *   en: English
    @NameInMap("EnvLanguage")
    public String envLanguage;

    // The end time of the validity period of the quota. Specify the value in UTC. This parameter is valid only if you set the QuotaCategory parameter to WhiteListLabel.
    // 
    // > If the value of this parameter is empty, no end time is specified.
    @NameInMap("ExpireTime")
    public String expireTime;

    // Specifies whether to send a notification about the application result. Valid values:
    // 
    // *   0 (default value): no
    // *   3: yes
    @NameInMap("NoticeType")
    public Long noticeType;

    // The abbreviation of the Alibaba Cloud service name.
    // 
    // > For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
    @NameInMap("ProductCode")
    public String productCode;

    // The ID of the quota.
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    // The type of the quota. Valid values:
    // 
    // *   CommonQuota: general quota
    // *   WhiteListLabel: whitelist quota
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
        // The dimension keys.
        // 
        // The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
        // 
        // > This parameter is required if you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess.
        @NameInMap("Key")
        public String key;

        // The dimension values.
        // 
        // The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
        // 
        // > This parameter is required if you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess.
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
