// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupSubDetailRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("GroupId")
    public String groupId;

    public static OnsGroupSubDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupSubDetailRequest self = new OnsGroupSubDetailRequest();
        return TeaModel.build(map, self);
    }

    public OnsGroupSubDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsGroupSubDetailRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
