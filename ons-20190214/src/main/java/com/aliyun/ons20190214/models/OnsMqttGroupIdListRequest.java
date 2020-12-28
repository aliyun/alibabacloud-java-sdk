// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttGroupIdListRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsMqttGroupIdListRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttGroupIdListRequest self = new OnsMqttGroupIdListRequest();
        return TeaModel.build(map, self);
    }

    public OnsMqttGroupIdListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
