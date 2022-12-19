// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallCloudMonitorRequest extends TeaModel {
    // The AccessKey ID that is required to install the CloudMonitor agent. You can call the [DescribeMonitoringAgentAccessKey](~~114948~~) operation to query the AccessKey ID.
    // 
    // >  This parameter is required only when you install the CloudMonitor agent on servers that are not deployed on Alibaba Cloud.
    @NameInMap("AgentAccessKey")
    public String agentAccessKey;

    // The AccessKey secret that is required to install the CloudMonitor agent. You can call the [DescribeMonitoringAgentAccessKey](~~114948~~) operation to query the AccessKey secret.
    // 
    // >  This parameter is required only when you install the CloudMonitor agent on servers that are not deployed on Alibaba Cloud.
    @NameInMap("AgentSecretKey")
    public String agentSecretKey;

    // The version of the CloudMonitor agent that you want to install on the servers. For more information about the latest version of the CloudMonitor agent, see [Overview](~~183431~~).
    @NameInMap("ArgusVersion")
    public String argusVersion;

    // The IDs of the servers on which you want to install the CloudMonitor agent. Separate multiple IDs with commas (,).
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    // The UUIDs of the servers on which you want to install the CloudMonitor agent. Separate multiple UUIDs with commas (,).
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
