// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAgentInstallRecordsRequest extends TeaModel {
    @NameInMap("current")
    public Long current;

    @NameInMap("instance_id")
    public String instanceId;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("plugin_id")
    public String pluginId;

    @NameInMap("plugin_version")
    public String pluginVersion;

    @NameInMap("status")
    public String status;

    public static ListAgentInstallRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstallRecordsRequest self = new ListAgentInstallRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentInstallRecordsRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListAgentInstallRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAgentInstallRecordsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAgentInstallRecordsRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ListAgentInstallRecordsRequest setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }
    public String getPluginVersion() {
        return this.pluginVersion;
    }

    public ListAgentInstallRecordsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
