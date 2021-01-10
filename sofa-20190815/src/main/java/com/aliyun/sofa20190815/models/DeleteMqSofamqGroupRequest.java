// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMqSofamqGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteMqSofamqGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqSofamqGroupRequest self = new DeleteMqSofamqGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMqSofamqGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteMqSofamqGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
