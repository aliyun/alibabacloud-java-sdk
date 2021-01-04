// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class UpdateQuotaAlarmRequest extends TeaModel {
    @NameInMap("AlarmId")
    public String alarmId;

    @NameInMap("AlarmName")
    public String alarmName;

    @NameInMap("Threshold")
    public Float threshold;

    @NameInMap("ThresholdPercent")
    public Float thresholdPercent;

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

    public UpdateQuotaAlarmRequest setWebHook(String webHook) {
        this.webHook = webHook;
        return this;
    }
    public String getWebHook() {
        return this.webHook;
    }

}
