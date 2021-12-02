// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateAppMonitorsRequest extends TeaModel {
    @NameInMap("AlarmTemplateId")
    public Long alarmTemplateId;

    @NameInMap("AppIds")
    public java.util.List<Long> appIds;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("MainUserId")
    public Long mainUserId;

    @NameInMap("SilenceTime")
    public String silenceTime;

    public static CreateAppMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppMonitorsRequest self = new CreateAppMonitorsRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppMonitorsRequest setAlarmTemplateId(Long alarmTemplateId) {
        this.alarmTemplateId = alarmTemplateId;
        return this;
    }
    public Long getAlarmTemplateId() {
        return this.alarmTemplateId;
    }

    public CreateAppMonitorsRequest setAppIds(java.util.List<Long> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<Long> getAppIds() {
        return this.appIds;
    }

    public CreateAppMonitorsRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public CreateAppMonitorsRequest setMainUserId(Long mainUserId) {
        this.mainUserId = mainUserId;
        return this;
    }
    public Long getMainUserId() {
        return this.mainUserId;
    }

    public CreateAppMonitorsRequest setSilenceTime(String silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public String getSilenceTime() {
        return this.silenceTime;
    }

}
