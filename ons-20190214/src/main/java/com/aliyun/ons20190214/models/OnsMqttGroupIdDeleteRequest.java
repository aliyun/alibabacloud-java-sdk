// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttGroupIdDeleteRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsMqttGroupIdDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttGroupIdDeleteRequest self = new OnsMqttGroupIdDeleteRequest();
        return TeaModel.build(map, self);
    }

    public OnsMqttGroupIdDeleteRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsMqttGroupIdDeleteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
