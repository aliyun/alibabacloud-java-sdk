// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerTimeSpanRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsConsumerTimeSpanRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerTimeSpanRequest self = new OnsConsumerTimeSpanRequest();
        return TeaModel.build(map, self);
    }

    public OnsConsumerTimeSpanRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsConsumerTimeSpanRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsConsumerTimeSpanRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
