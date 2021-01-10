// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMqSofamqWarnRequest extends TeaModel {
    @NameInMap("AlertTime")
    public String alertTime;

    @NameInMap("Contacts")
    public String contacts;

    @NameInMap("DelayTime")
    public Long delayTime;

    @NameInMap("Frequency")
    public Long frequency;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Threshold")
    public Long threshold;

    @NameInMap("WarnId")
    public Long warnId;

    public static UpdateMqSofamqWarnRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMqSofamqWarnRequest self = new UpdateMqSofamqWarnRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMqSofamqWarnRequest setAlertTime(String alertTime) {
        this.alertTime = alertTime;
        return this;
    }
    public String getAlertTime() {
        return this.alertTime;
    }

    public UpdateMqSofamqWarnRequest setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }
    public String getContacts() {
        return this.contacts;
    }

    public UpdateMqSofamqWarnRequest setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Long getDelayTime() {
        return this.delayTime;
    }

    public UpdateMqSofamqWarnRequest setFrequency(Long frequency) {
        this.frequency = frequency;
        return this;
    }
    public Long getFrequency() {
        return this.frequency;
    }

    public UpdateMqSofamqWarnRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMqSofamqWarnRequest setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

    public UpdateMqSofamqWarnRequest setWarnId(Long warnId) {
        this.warnId = warnId;
        return this;
    }
    public Long getWarnId() {
        return this.warnId;
    }

}
