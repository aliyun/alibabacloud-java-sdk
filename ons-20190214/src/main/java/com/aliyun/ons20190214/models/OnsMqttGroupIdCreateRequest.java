// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttGroupIdCreateRequest extends TeaModel {
    @NameInMap("Topic")
    public String topic;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsMqttGroupIdCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttGroupIdCreateRequest self = new OnsMqttGroupIdCreateRequest();
        return TeaModel.build(map, self);
    }

    public OnsMqttGroupIdCreateRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsMqttGroupIdCreateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsMqttGroupIdCreateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
