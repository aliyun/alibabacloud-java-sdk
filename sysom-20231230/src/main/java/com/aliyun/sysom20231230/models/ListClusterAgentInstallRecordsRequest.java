// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListClusterAgentInstallRecordsRequest extends TeaModel {
    @NameInMap("agent_config_id")
    public String agentConfigId;

    /**
     * <p>Filter by cluster ID.</p>
     * <blockquote>
     * <p>This cluster ID is not the ACK cluster ID, but the <code>cluster_id</code> field in the data returned by this API, or the <code>id</code> field in the data returned by the ListCluster API.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cbd80af02b9d6454ebdc579c5e022d0c8</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>Current page number (starting from 1)</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Specify this parameter to filter the installation list for a specific agent. Can be used in combination with the plugin_version parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("plugin_id")
    public String pluginId;

    /**
     * <p>Cannot be used alone. Use in combination with plugin_id to filter the installation list for a specific agent version.</p>
     * 
     * <strong>example:</strong>
     * <p>3.4.0-1</p>
     */
    @NameInMap("plugin_version")
    public String pluginVersion;

    public static ListClusterAgentInstallRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAgentInstallRecordsRequest self = new ListClusterAgentInstallRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterAgentInstallRecordsRequest setAgentConfigId(String agentConfigId) {
        this.agentConfigId = agentConfigId;
        return this;
    }
    public String getAgentConfigId() {
        return this.agentConfigId;
    }

    public ListClusterAgentInstallRecordsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterAgentInstallRecordsRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListClusterAgentInstallRecordsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClusterAgentInstallRecordsRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ListClusterAgentInstallRecordsRequest setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }
    public String getPluginVersion() {
        return this.pluginVersion;
    }

}
