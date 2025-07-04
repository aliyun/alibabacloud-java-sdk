// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InstallAgentForClusterRequest extends TeaModel {
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
     * <p>c9d7f3fc3d42942afbcb65c1100ffb19d</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    @NameInMap("config_id")
    public String configId;

    @NameInMap("grayscale_config")
    public String grayscaleConfig;

    public static InstallAgentForClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallAgentForClusterRequest self = new InstallAgentForClusterRequest();
        return TeaModel.build(map, self);
    }

    public InstallAgentForClusterRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public InstallAgentForClusterRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public InstallAgentForClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InstallAgentForClusterRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public InstallAgentForClusterRequest setGrayscaleConfig(String grayscaleConfig) {
        this.grayscaleConfig = grayscaleConfig;
        return this;
    }
    public String getGrayscaleConfig() {
        return this.grayscaleConfig;
    }

}
