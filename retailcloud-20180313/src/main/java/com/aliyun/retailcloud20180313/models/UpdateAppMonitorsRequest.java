// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateAppMonitorsRequest extends TeaModel {
    @NameInMap("MainUserId")
    public Long mainUserId;

    @NameInMap("MonitorIds")
    public java.util.List<Long> monitorIds;

    @NameInMap("SilenceTime")
    public String silenceTime;

    @NameInMap("TemplateId")
    public Long templateId;

    public static UpdateAppMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppMonitorsRequest self = new UpdateAppMonitorsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppMonitorsRequest setMainUserId(Long mainUserId) {
        this.mainUserId = mainUserId;
        return this;
    }
    public Long getMainUserId() {
        return this.mainUserId;
    }

    public UpdateAppMonitorsRequest setMonitorIds(java.util.List<Long> monitorIds) {
        this.monitorIds = monitorIds;
        return this;
    }
    public java.util.List<Long> getMonitorIds() {
        return this.monitorIds;
    }

    public UpdateAppMonitorsRequest setSilenceTime(String silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public String getSilenceTime() {
        return this.silenceTime;
    }

    public UpdateAppMonitorsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
