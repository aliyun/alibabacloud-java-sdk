// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDmsTopicsRequest extends TeaModel {
    @NameInMap("Group")
    public String group;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDmsTopicsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDmsTopicsRequest self = new GetDmsTopicsRequest();
        return TeaModel.build(map, self);
    }

    public GetDmsTopicsRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetDmsTopicsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
