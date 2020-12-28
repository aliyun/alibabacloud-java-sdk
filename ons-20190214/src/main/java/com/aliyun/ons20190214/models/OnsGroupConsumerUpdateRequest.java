// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupConsumerUpdateRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ReadEnable")
    public Boolean readEnable;

    @NameInMap("InstanceId")
    public String instanceId;

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

    public OnsGroupConsumerUpdateRequest setReadEnable(Boolean readEnable) {
        this.readEnable = readEnable;
        return this;
    }
    public Boolean getReadEnable() {
        return this.readEnable;
    }

    public OnsGroupConsumerUpdateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
