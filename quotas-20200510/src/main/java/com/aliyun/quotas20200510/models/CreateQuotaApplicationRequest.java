// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationRequest extends TeaModel {
    @NameInMap("AuditMode")
    public String auditMode;

    @NameInMap("DesireValue")
    public Float desireValue;

    @NameInMap("Dimensions")
    public java.util.List<CreateQuotaApplicationRequestDimensions> dimensions;

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
        @NameInMap("Key")
        public String key;

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
