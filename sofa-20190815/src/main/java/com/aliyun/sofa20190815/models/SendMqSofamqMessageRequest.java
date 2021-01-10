// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SendMqSofamqMessageRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Key")
    public String key;

    @NameInMap("Message")
    public String message;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Topic")
    public String topic;

    public static SendMqSofamqMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMqSofamqMessageRequest self = new SendMqSofamqMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMqSofamqMessageRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public SendMqSofamqMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendMqSofamqMessageRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SendMqSofamqMessageRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendMqSofamqMessageRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SendMqSofamqMessageRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
