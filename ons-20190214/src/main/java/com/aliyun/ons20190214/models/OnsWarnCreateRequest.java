// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsWarnCreateRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("Threshold")
    public String threshold;

    @NameInMap("Contacts")
    public String contacts;

    @NameInMap("DelayTime")
    public String delayTime;

    @NameInMap("BlockTime")
    public String blockTime;

    @NameInMap("AlertTime")
    public String alertTime;

    @NameInMap("Level")
    public String level;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsWarnCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsWarnCreateRequest self = new OnsWarnCreateRequest();
        return TeaModel.build(map, self);
    }

    public OnsWarnCreateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsWarnCreateRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsWarnCreateRequest setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

    public OnsWarnCreateRequest setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }
    public String getContacts() {
        return this.contacts;
    }

    public OnsWarnCreateRequest setDelayTime(String delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public String getDelayTime() {
        return this.delayTime;
    }

    public OnsWarnCreateRequest setBlockTime(String blockTime) {
        this.blockTime = blockTime;
        return this;
    }
    public String getBlockTime() {
        return this.blockTime;
    }

    public OnsWarnCreateRequest setAlertTime(String alertTime) {
        this.alertTime = alertTime;
        return this;
    }
    public String getAlertTime() {
        return this.alertTime;
    }

    public OnsWarnCreateRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public OnsWarnCreateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
