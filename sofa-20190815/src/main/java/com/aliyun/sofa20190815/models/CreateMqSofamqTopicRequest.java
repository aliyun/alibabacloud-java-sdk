// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateMqSofamqTopicRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MessageType")
    public Long messageType;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Topic")
    public String topic;

    public static CreateMqSofamqTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMqSofamqTopicRequest self = new CreateMqSofamqTopicRequest();
        return TeaModel.build(map, self);
    }

    public CreateMqSofamqTopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMqSofamqTopicRequest setMessageType(Long messageType) {
        this.messageType = messageType;
        return this;
    }
    public Long getMessageType() {
        return this.messageType;
    }

    public CreateMqSofamqTopicRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateMqSofamqTopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
