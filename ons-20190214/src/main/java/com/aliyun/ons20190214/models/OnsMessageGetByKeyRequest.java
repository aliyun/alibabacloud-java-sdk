// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByKeyRequest extends TeaModel {
    @NameInMap("Topic")
    public String topic;

    @NameInMap("Key")
    public String key;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsMessageGetByKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageGetByKeyRequest self = new OnsMessageGetByKeyRequest();
        return TeaModel.build(map, self);
    }

    public OnsMessageGetByKeyRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsMessageGetByKeyRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public OnsMessageGetByKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
