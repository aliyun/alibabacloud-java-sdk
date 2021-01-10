// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableMsSgDowngradeGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableMsSgDowngradeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableMsSgDowngradeGroupRequest self = new DisableMsSgDowngradeGroupRequest();
        return TeaModel.build(map, self);
    }

    public DisableMsSgDowngradeGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DisableMsSgDowngradeGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
