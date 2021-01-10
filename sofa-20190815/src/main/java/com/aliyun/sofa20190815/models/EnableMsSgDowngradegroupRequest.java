// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMsSgDowngradegroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableMsSgDowngradegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMsSgDowngradegroupRequest self = new EnableMsSgDowngradegroupRequest();
        return TeaModel.build(map, self);
    }

    public EnableMsSgDowngradegroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public EnableMsSgDowngradegroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
