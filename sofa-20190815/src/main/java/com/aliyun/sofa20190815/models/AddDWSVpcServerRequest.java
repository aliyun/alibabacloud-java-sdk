// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddDWSVpcServerRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServerId")
    public String serverId;

    public static AddDWSVpcServerRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDWSVpcServerRequest self = new AddDWSVpcServerRequest();
        return TeaModel.build(map, self);
    }

    public AddDWSVpcServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDWSVpcServerRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
