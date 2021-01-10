// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMqSofamqGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ReadEnable")
    public Boolean readEnable;

    public static UpdateMqSofamqGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMqSofamqGroupRequest self = new UpdateMqSofamqGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMqSofamqGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateMqSofamqGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMqSofamqGroupRequest setReadEnable(Boolean readEnable) {
        this.readEnable = readEnable;
        return this;
    }
    public Boolean getReadEnable() {
        return this.readEnable;
    }

}
