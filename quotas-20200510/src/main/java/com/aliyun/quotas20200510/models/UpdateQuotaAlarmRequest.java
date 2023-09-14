// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class UpdateQuotaAlarmRequest extends TeaModel {
    /**
     * <p>The ID of the quota alert.</p>
     */
    @NameInMap("AlarmId")
    public String alarmId;

    /**
     * <p>The name of the quota alert.</p>
     */
    @NameInMap("AlarmName")
    public String alarmName;

    /**
     * <p>The numeric value of the alert threshold. Valid values:</p>
     * <br>
     * <p>*   If you set the `ThresholdType` parameter to `used`, you will receive an alert notification when the used quota is greater than or equal to the preset alert threshold. The alert threshold must be greater than the current used quota.</p>
     * <p>*   If you set the `ThresholdType` parameter to `usable`, you will receive an alert notification when the available quota is less than or equal to the preset alert threshold. The alert threshold must be less than the current available quota.</p>
     * <br>
     * <p>> You must set one of the Threshold and ThresholdPercent parameters.</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    /**
     * <p>The percentage of the alert threshold. Valid values:</p>
     * <br>
     * <p>*   If you set the `ThresholdType` parameter to `used`, you will receive an alert notification when the used quota is greater than or equal to the preset percentage of the alert threshold. Value range: (50%, 100%].</p>
     * <p>*   If you set the `ThresholdType` parameter to `usable`, you will receive an alert notification when the available quota is less than or equal to the preset percentage of the alert threshold. Value range: (0%, 50%].</p>
     * <br>
     * <p>> You must set one of the Threshold and ThresholdPercent parameters.</p>
     */
    @NameInMap("ThresholdPercent")
    public Float thresholdPercent;

    /**
     * <p>The type of the quota alert. Valid values:</p>
     * <br>
     * <p>*   used: The alert is created for the used quota.</p>
     * <p>*   usable: The alert is created for the available quota.</p>
     */
    @NameInMap("ThresholdType")
    public String thresholdType;

    /**
     * <p>The webhook URL. Quota Center sends alert notifications to the specified URL by using HTTP POST requests.</p>
     */
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
