// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDWSVpcServerRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServerId")
    public String serverId;

    public static DeleteDWSVpcServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDWSVpcServerRequest self = new DeleteDWSVpcServerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDWSVpcServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDWSVpcServerRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
