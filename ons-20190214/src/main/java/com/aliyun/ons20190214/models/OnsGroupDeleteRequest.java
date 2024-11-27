// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupDeleteRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test_groupId</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the ApsaraMQ for RocketMQ instance to which the specified consumer group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_111111111111_DOxxxxxx</p>
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
