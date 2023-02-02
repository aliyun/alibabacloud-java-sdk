// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupSubDetailRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group that you want to query.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance to which the consumer group you want to query belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsGroupSubDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupSubDetailRequest self = new OnsGroupSubDetailRequest();
        return TeaModel.build(map, self);
    }

    public OnsGroupSubDetailRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsGroupSubDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
