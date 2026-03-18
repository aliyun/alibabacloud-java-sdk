// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class GetNodeGroupFeatureGateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-d332aa8bca48****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    public static GetNodeGroupFeatureGateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeGroupFeatureGateRequest self = new GetNodeGroupFeatureGateRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeGroupFeatureGateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetNodeGroupFeatureGateRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

}
