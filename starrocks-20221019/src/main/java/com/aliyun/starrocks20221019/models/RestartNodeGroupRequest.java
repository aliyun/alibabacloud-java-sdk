// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class RestartNodeGroupRequest extends TeaModel {
    /**
     * <p>Whether to restart in fast mode. Default value: false.</p>
     * <ul>
     * <li><p>true: Restart compute nodes in fast mode. Nodes restart in batches. Within each batch, nodes restart in parallel. Between batches, restarts run sequentially.</p>
     * </li>
     * <li><p>false: Restart compute nodes using rolling restart.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FastMode")
    public Boolean fastMode;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the compute group.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    public static RestartNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartNodeGroupRequest self = new RestartNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public RestartNodeGroupRequest setFastMode(Boolean fastMode) {
        this.fastMode = fastMode;
        return this;
    }
    public Boolean getFastMode() {
        return this.fastMode;
    }

    public RestartNodeGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RestartNodeGroupRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

}
