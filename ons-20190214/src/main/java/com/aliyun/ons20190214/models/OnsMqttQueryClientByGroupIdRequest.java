// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryClientByGroupIdRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsMqttQueryClientByGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryClientByGroupIdRequest self = new OnsMqttQueryClientByGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryClientByGroupIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsMqttQueryClientByGroupIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
