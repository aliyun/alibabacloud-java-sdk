// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateMqSofamqWarnRequest extends TeaModel {
    @NameInMap("AlertTime")
    public String alertTime;

    @NameInMap("Contacts")
    public String contacts;

    @NameInMap("DelayTime")
    public Long delayTime;

    @NameInMap("Frequency")
    public Long frequency;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Threshold")
    public Long threshold;

    @NameInMap("Topic")
    public String topic;

    public static CreateMqSofamqWarnRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMqSofamqWarnRequest self = new CreateMqSofamqWarnRequest();
        return TeaModel.build(map, self);
    }

    public CreateMqSofamqWarnRequest setAlertTime(String alertTime) {
        this.alertTime = alertTime;
        return this;
    }
    public String getAlertTime() {
        return this.alertTime;
    }

    public CreateMqSofamqWarnRequest setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }
    public String getContacts() {
        return this.contacts;
    }

    public CreateMqSofamqWarnRequest setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Long getDelayTime() {
        return this.delayTime;
    }

    public CreateMqSofamqWarnRequest setFrequency(Long frequency) {
        this.frequency = frequency;
        return this;
    }
    public Long getFrequency() {
        return this.frequency;
    }

    public CreateMqSofamqWarnRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateMqSofamqWarnRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMqSofamqWarnRequest setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

    public CreateMqSofamqWarnRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
