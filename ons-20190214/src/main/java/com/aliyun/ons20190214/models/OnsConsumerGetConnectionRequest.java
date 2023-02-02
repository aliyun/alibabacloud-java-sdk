// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerGetConnectionRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group whose client connection status you want to query.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance to which the consumer group belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsConsumerGetConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerGetConnectionRequest self = new OnsConsumerGetConnectionRequest();
        return TeaModel.build(map, self);
    }

    public OnsConsumerGetConnectionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsConsumerGetConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
