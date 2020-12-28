// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryClientByTopicRequest extends TeaModel {
    @NameInMap("ParentTopic")
    public String parentTopic;

    @NameInMap("SubTopic")
    public String subTopic;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsMqttQueryClientByTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryClientByTopicRequest self = new OnsMqttQueryClientByTopicRequest();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryClientByTopicRequest setParentTopic(String parentTopic) {
        this.parentTopic = parentTopic;
        return this;
    }
    public String getParentTopic() {
        return this.parentTopic;
    }

    public OnsMqttQueryClientByTopicRequest setSubTopic(String subTopic) {
        this.subTopic = subTopic;
        return this;
    }
    public String getSubTopic() {
        return this.subTopic;
    }

    public OnsMqttQueryClientByTopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
