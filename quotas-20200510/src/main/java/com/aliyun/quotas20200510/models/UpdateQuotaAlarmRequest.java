// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class UpdateQuotaAlarmRequest extends TeaModel {
    // The ID of the quota alert.
    @NameInMap("AlarmId")
    public String alarmId;

    // The name of the quota alert.
    @NameInMap("AlarmName")
    public String alarmName;

    // The numeric value of the alert threshold. Valid values:
    // 
    // *   If the `ThresholdType` parameter is set to `used` and the used quota is greater than or equal to a specified value, you receive alert notifications. The alert threshold must be greater than the current used quota.
    // *   If the `ThresholdType` parameter is set to `usable` and the available quota is less than or equal to a specified value, you receive alert notifications. The alert threshold must be less than the current available quota.
    // 
    // >  You must set one of the Threshold and ThresholdPercent parameters.
    @NameInMap("Threshold")
    public Float threshold;

    // The percentage of the alert threshold. Valid values:
    // 
    // *   If the `ThresholdType` parameter is set to `used` and the percentage of the used quota in the total quota is greater than or equal to a specified value, you receive alert notifications. Value range: (50%, 100%].
    // *   If the `ThresholdType` parameter is set to `usable` and the percentage of the available quota in the total quota is less than or equal to a specified value, you receive alert notifications. Value range: (0%, 50%].
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

    public static UpdateQuotaAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaAlarmRequest self = new UpdateQuotaAlarmRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaAlarmRequest setAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public String getAlarmId() {
        return this.alarmId;
    }

    public UpdateQuotaAlarmRequest setAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }
    public String getAlarmName() {
        return this.alarmName;
    }

    public UpdateQuotaAlarmRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public UpdateQuotaAlarmRequest setThresholdPercent(Float thresholdPercent) {
        this.thresholdPercent = thresholdPercent;
        return this;
    }
    public Float getThresholdPercent() {
        return this.thresholdPercent;
    }

    public UpdateQuotaAlarmRequest setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }
    public String getThresholdType() {
        return this.thresholdType;
    }

    public UpdateQuotaAlarmRequest setWebHook(String webHook) {
        this.webHook = webHook;
        return this;
    }
    public String getWebHook() {
        return this.webHook;
    }

}
