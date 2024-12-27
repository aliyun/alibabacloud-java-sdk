// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpgradeAgentForClusterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("agent_id")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>3.4.0-1</p>
     */
    @NameInMap("agent_version")
    public String agentVersion;

    /**
     * <strong>example:</strong>
     * <p>c1c187fd513cb41a19876bac0e6b05212</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    public static UpgradeAgentForClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAgentForClusterRequest self = new UpgradeAgentForClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeAgentForClusterRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpgradeAgentForClusterRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public UpgradeAgentForClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
