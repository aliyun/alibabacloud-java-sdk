// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushMqSofamqMessageRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MsgId")
    public String msgId;

    @NameInMap("Topic")
    public String topic;

    public static PushMqSofamqMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMqSofamqMessageRequest self = new PushMqSofamqMessageRequest();
        return TeaModel.build(map, self);
    }

    public PushMqSofamqMessageRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public PushMqSofamqMessageRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public PushMqSofamqMessageRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PushMqSofamqMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PushMqSofamqMessageRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public PushMqSofamqMessageRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
