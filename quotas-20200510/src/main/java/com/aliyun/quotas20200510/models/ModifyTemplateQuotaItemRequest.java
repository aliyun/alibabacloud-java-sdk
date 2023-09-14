// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ModifyTemplateQuotaItemRequest extends TeaModel {
    @NameInMap("DesireValue")
    public Float desireValue;

    @NameInMap("Dimensions")
    public java.util.List<ModifyTemplateQuotaItemRequestDimensions> dimensions;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("EnvLanguage")
    public String envLanguage;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("NoticeType")
    public Long noticeType;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

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
        @NameInMap("Key")
        public String key;

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
