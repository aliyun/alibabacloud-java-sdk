// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListClusterAgentInstallRecordsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cbd80af02b9d6454ebdc579c5e022d0c8</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("plugin_id")
    public String pluginId;

    /**
     * <strong>example:</strong>
     * <p>3.4.0-1</p>
     */
    @NameInMap("plugin_version")
    public String pluginVersion;

    public static ListClusterAgentInstallRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAgentInstallRecordsRequest self = new ListClusterAgentInstallRecordsRequest();
        return TeaModel.build(map, self);
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
