// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UninstallAgentForClusterRequest extends TeaModel {
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
     * <p>c822f83bb45994ddbac9326b4c2f04f35</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    public static UninstallAgentForClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallAgentForClusterRequest self = new UninstallAgentForClusterRequest();
        return TeaModel.build(map, self);
    }

    public UninstallAgentForClusterRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UninstallAgentForClusterRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public UninstallAgentForClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
