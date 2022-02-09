// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class GetResourceGroupInstanceRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static GetResourceGroupInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupInstanceRequest self = new GetResourceGroupInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetResourceGroupInstanceRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
