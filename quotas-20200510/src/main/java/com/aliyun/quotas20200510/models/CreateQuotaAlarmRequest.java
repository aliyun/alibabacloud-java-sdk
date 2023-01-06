// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaAlarmRequest extends TeaModel {
    // The name of the quota alert.
    @NameInMap("AlarmName")
    public String alarmName;

    // The abbreviation of the cloud service name.
    // 
    // >  For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
    @NameInMap("ProductCode")
    public String productCode;

    // The ID of the quota.
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    @NameInMap("QuotaDimensions")
    public java.util.List<CreateQuotaAlarmRequestQuotaDimensions> quotaDimensions;

    // The numeric value of the alert threshold. The value must meet the following requirements:
    // 
    // *   If the `ThresholdType` parameter is set to `used` and the used quota is greater than or equal to a specified value, you receive an alert. The alert threshold must be greater than the current used quota.
    // *   If the `ThresholdType` parameter is set to `usable` and the available quota is less than or equal to a specified value, you received an alert. The alert threshold must be less than the current available quota.
    // 
    // >  You must set one of the Threshold and ThresholdPercent parameters.
    @NameInMap("Threshold")
    public Float threshold;

    // The percentage of the alert threshold. Valid values:
    // 
    // *   If the `ThresholdType` parameter is set to `used` and the percentage of the used quota in the total quota is greater than or equal to a specified value, you receive an alert. Value range: (50%, 100%].
    // *   If the `ThresholdType` parameter is set to `usable` and the percentage of the available quota in the total quota is less than or equal to a specified value, you receive an alert. Value range: (0%, 50%].
    // 
    // >  You must set one of the Threshold and ThresholdPercent parameters.
    @NameInMap("ThresholdPercent")
    public Float thresholdPercent;

    // The type of the quota alert. Valid values:
    // 
    // *   used: The alert is created for the used quota.
    // *   usable: The alert is created for the available quota.
    @NameInMap("ThresholdType")
    public String thresholdType;

    // The webhook URL. Quota Center sends the alert notification to a specified URL by using an HTTP POST request.
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
        // The dimension keys.
        // 
        // The value range of N changes based on the number of dimensions that are supported by the related cloud service.
        // 
        // >  If you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess, this parameter is required.
        @NameInMap("Key")
        public String key;

        // The dimension values.
        // 
        // The value range of N changes based on the number of dimensions that are supported by the related cloud service.
        // 
        // >  If you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess, this parameter is required.
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
