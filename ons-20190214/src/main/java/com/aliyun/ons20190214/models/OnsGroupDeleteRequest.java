// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupDeleteRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group that you want to delete.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the Message Queue for Apache RocketMQ instance that contains the specified group.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsGroupDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupDeleteRequest self = new OnsGroupDeleteRequest();
        return TeaModel.build(map, self);
    }

    public OnsGroupDeleteRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsGroupDeleteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
