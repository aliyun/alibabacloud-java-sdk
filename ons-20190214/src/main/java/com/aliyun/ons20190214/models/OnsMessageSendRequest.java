// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageSendRequest extends TeaModel {
    @NameInMap("Topic")
    public String topic;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Key")
    public String key;

    @NameInMap("Message")
    public String message;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsMessageSendRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageSendRequest self = new OnsMessageSendRequest();
        return TeaModel.build(map, self);
    }

    public OnsMessageSendRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsMessageSendRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public OnsMessageSendRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public OnsMessageSendRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OnsMessageSendRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
