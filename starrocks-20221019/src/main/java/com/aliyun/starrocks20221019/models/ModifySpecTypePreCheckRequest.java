// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifySpecTypePreCheckRequest extends TeaModel {
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
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("TargetSpecType")
    public String targetSpecType;

    public static ModifySpecTypePreCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySpecTypePreCheckRequest self = new ModifySpecTypePreCheckRequest();
        return TeaModel.build(map, self);
    }

    public ModifySpecTypePreCheckRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySpecTypePreCheckRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ModifySpecTypePreCheckRequest setTargetSpecType(String targetSpecType) {
        this.targetSpecType = targetSpecType;
        return this;
    }
    public String getTargetSpecType() {
        return this.targetSpecType;
    }

}
