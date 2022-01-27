// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaAlarmRequest extends TeaModel {
    @NameInMap("AlarmName")
    public String alarmName;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    @NameInMap("QuotaDimensions")
    public java.util.List<CreateQuotaAlarmRequestQuotaDimensions> quotaDimensions;

    @NameInMap("Threshold")
    public Float threshold;

    @NameInMap("ThresholdPercent")
    public Float thresholdPercent;

    @NameInMap("ThresholdType")
    public String thresholdType;

    @NameInMap("WebHook")
    public String webHook;

    public static CreateQuotaAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaAlarmRequest self = new CreateQuotaAlarmRequest();
        return TeaModel.build(map, self);
    }

    public CreateQuotaAlarmRequest setAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }
    public String getAlarmName() {
        return this.alarmName;
    }

    public CreateQuotaAlarmRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateQuotaAlarmRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public CreateQuotaAlarmRequest setQuotaDimensions(java.util.List<CreateQuotaAlarmRequestQuotaDimensions> quotaDimensions) {
        this.quotaDimensions = quotaDimensions;
        return this;
    }
    public java.util.List<CreateQuotaAlarmRequestQuotaDimensions> getQuotaDimensions() {
        return this.quotaDimensions;
    }

    public CreateQuotaAlarmRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public CreateQuotaAlarmRequest setThresholdPercent(Float thresholdPercent) {
        this.thresholdPercent = thresholdPercent;
        return this;
    }
    public Float getThresholdPercent() {
        return this.thresholdPercent;
    }

    public CreateQuotaAlarmRequest setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }
    public String getThresholdType() {
        return this.thresholdType;
    }

    public CreateQuotaAlarmRequest setWebHook(String webHook) {
        this.webHook = webHook;
        return this;
    }
    public String getWebHook() {
        return this.webHook;
    }

    public static class CreateQuotaAlarmRequestQuotaDimensions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateQuotaAlarmRequestQuotaDimensions build(java.util.Map<String, ?> map) throws Exception {
            CreateQuotaAlarmRequestQuotaDimensions self = new CreateQuotaAlarmRequestQuotaDimensions();
            return TeaModel.build(map, self);
        }

        public CreateQuotaAlarmRequestQuotaDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateQuotaAlarmRequestQuotaDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
