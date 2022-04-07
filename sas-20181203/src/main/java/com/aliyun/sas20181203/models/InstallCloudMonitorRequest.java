// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallCloudMonitorRequest extends TeaModel {
    // 非阿里云主机安装云监控插件时所需要的AccessKey
    @NameInMap("AgentAccessKey")
    public String agentAccessKey;

    // 非阿里云主机安装云监控插件时所需要的AccessSecret
    @NameInMap("AgentSecretKey")
    public String agentSecretKey;

    // 云监控版本
    @NameInMap("ArgusVersion")
    public String argusVersion;

    // 实例 instanceId
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    // uuid 列表
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
