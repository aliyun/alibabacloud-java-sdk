// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateClusterAgentConfigRequest extends TeaModel {
    /**
     * <p>The ID of the component whose configuration is to be updated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The ID of the cluster. You can call the ListClusters operation to obtain the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c8b90bc1b2ef0436f81213c032b75c5f3</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>The ID of the component configuration to install on the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f0078fbb-4213-11f0-a19b-00163e4ae208</p>
     */
    @NameInMap("configId")
    public String configId;

    public static UpdateClusterAgentConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAgentConfigRequest self = new UpdateClusterAgentConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAgentConfigRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdateClusterAgentConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterAgentConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

}
