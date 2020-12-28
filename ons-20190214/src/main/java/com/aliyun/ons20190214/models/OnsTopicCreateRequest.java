// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicCreateRequest extends TeaModel {
    @NameInMap("Topic")
    public String topic;

    @NameInMap("MessageType")
    public Integer messageType;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsTopicCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicCreateRequest self = new OnsTopicCreateRequest();
        return TeaModel.build(map, self);
    }

    public OnsTopicCreateRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsTopicCreateRequest setMessageType(Integer messageType) {
        this.messageType = messageType;
        return this;
    }
    public Integer getMessageType() {
        return this.messageType;
    }

    public OnsTopicCreateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public OnsTopicCreateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
