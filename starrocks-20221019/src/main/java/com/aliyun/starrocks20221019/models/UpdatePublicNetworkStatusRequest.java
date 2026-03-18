// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class UpdatePublicNetworkStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BE</p>
     */
    @NameInMap("ComponentType")
    public String componentType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublicNetworkEnabled")
    public Boolean publicNetworkEnabled;

    public static UpdatePublicNetworkStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicNetworkStatusRequest self = new UpdatePublicNetworkStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublicNetworkStatusRequest setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public UpdatePublicNetworkStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdatePublicNetworkStatusRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public UpdatePublicNetworkStatusRequest setPublicNetworkEnabled(Boolean publicNetworkEnabled) {
        this.publicNetworkEnabled = publicNetworkEnabled;
        return this;
    }
    public Boolean getPublicNetworkEnabled() {
        return this.publicNetworkEnabled;
    }

}
