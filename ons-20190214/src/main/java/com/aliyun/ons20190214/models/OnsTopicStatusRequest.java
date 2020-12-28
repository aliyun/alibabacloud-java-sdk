// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicStatusRequest extends TeaModel {
    @NameInMap("Topic")
    public String topic;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsTopicStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicStatusRequest self = new OnsTopicStatusRequest();
        return TeaModel.build(map, self);
    }

    public OnsTopicStatusRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsTopicStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
