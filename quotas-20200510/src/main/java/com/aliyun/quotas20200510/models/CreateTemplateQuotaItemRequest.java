// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateTemplateQuotaItemRequest extends TeaModel {
    @NameInMap("DesireValue")
    public Float desireValue;

    @NameInMap("Dimensions")
    public java.util.List<CreateTemplateQuotaItemRequestDimensions> dimensions;

    @NameInMap("EnvLanguage")
    public String envLanguage;

    @NameInMap("NoticeType")
    public Long noticeType;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

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

    public CreateTemplateQuotaItemRequest setEnvLanguage(String envLanguage) {
        this.envLanguage = envLanguage;
        return this;
    }
    public String getEnvLanguage() {
        return this.envLanguage;
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

    public static class CreateTemplateQuotaItemRequestDimensions extends TeaModel {
        @NameInMap("Key")
        public String key;

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
