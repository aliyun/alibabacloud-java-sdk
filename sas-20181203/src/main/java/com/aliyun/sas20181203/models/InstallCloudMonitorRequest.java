// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallCloudMonitorRequest extends TeaModel {
    /**
     * <p>The AccessKey ID that is required to install the CloudMonitor agent. You can call the [DescribeMonitoringAgentAccessKey](https://help.aliyun.com/document_detail/114948.html) operation to query the AccessKey ID.</p>
     * <br>
     * <p>> This parameter is required only when you install the CloudMonitor agent on servers that are not deployed on Alibaba Cloud.</p>
     */
    @NameInMap("AgentAccessKey")
    public String agentAccessKey;

    /**
     * <p>The AccessKey secret that is required to install the CloudMonitor agent. You can call the [DescribeMonitoringAgentAccessKey](https://help.aliyun.com/document_detail/114948.html) operation to query the AccessKey secret.</p>
     * <br>
     * <p>> This parameter is required only when you install the CloudMonitor agent on servers that are not deployed on Alibaba Cloud.</p>
     */
    @NameInMap("AgentSecretKey")
    public String agentSecretKey;

    /**
     * <p>The version of the CloudMonitor agent that you want to install on the servers. For more information about the latest version of the CloudMonitor agent, see [Overview](https://help.aliyun.com/document_detail/183431.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ArgusVersion")
    public String argusVersion;

    /**
     * <p>The IDs of the servers on which you want to install the CloudMonitor agent. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <p>The UUIDs of the servers on which you want to install the CloudMonitor agent. Separate multiple UUIDs with commas (,).</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static InstallCloudMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudMonitorRequest self = new InstallCloudMonitorRequest();
        return TeaModel.build(map, self);
    }

    public InstallCloudMonitorRequest setAgentAccessKey(String agentAccessKey) {
        this.agentAccessKey = agentAccessKey;
        return this;
    }
    public String getAgentAccessKey() {
        return this.agentAccessKey;
    }

    public InstallCloudMonitorRequest setAgentSecretKey(String agentSecretKey) {
        this.agentSecretKey = agentSecretKey;
        return this;
    }
    public String getAgentSecretKey() {
        return this.agentSecretKey;
    }

    public InstallCloudMonitorRequest setArgusVersion(String argusVersion) {
        this.argusVersion = argusVersion;
        return this;
    }
    public String getArgusVersion() {
        return this.argusVersion;
    }

    public InstallCloudMonitorRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public InstallCloudMonitorRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
