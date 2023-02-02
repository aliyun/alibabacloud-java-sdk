// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupConsumerUpdateRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group for which you want to configure the read permissions.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance to which the consumer group you want to configure belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to authorize the consumer group with the specified ID to read messages. Valid values:</p>
     * <br>
     * <p>*   **true**: Authorize the consumer group with the specified ID to read messages.</p>
     * <p>*   **false**: Do not authorize the consumer group with the specified group ID to read messages.</p>
     * <br>
     * <p>Default value: **true**.</p>
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
