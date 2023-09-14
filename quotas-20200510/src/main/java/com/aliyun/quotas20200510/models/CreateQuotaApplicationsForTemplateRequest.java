// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationsForTemplateRequest extends TeaModel {
    @NameInMap("AliyunUids")
    public java.util.List<String> aliyunUids;

    @NameInMap("DesireValue")
    public Double desireValue;

    @NameInMap("Dimensions")
    public java.util.List<CreateQuotaApplicationsForTemplateRequestDimensions> dimensions;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("EnvLanguage")
    public String envLanguage;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("NoticeType")
    public Integer noticeType;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    @NameInMap("QuotaCategory")
    public String quotaCategory;

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
        @NameInMap("Key")
        public String key;

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
