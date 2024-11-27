// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupConsumerUpdateRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group for which you want to configure read permissions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test_groupId</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance to which the consumer group you want to configure belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_111111111111_DOxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to authorize the consumer group to read messages. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The consumer group can read messages.</li>
     * <li><strong>false</strong>: The consumer group cannot read messages.</li>
     * </ul>
     * <p>Default value: <strong>true</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReadEnable")
    public Boolean readEnable;

    public static OnsGroupConsumerUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupConsumerUpdateRequest self = new OnsGroupConsumerUpdateRequest();
        return TeaModel.build(map, self);
    }

    public OnsGroupConsumerUpdateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsGroupConsumerUpdateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsGroupConsumerUpdateRequest setReadEnable(Boolean readEnable) {
        this.readEnable = readEnable;
        return this;
    }
    public Boolean getReadEnable() {
        return this.readEnable;
    }

}
