// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class Instance extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例名称
    @NameInMap("InstanceName")
    public String instanceName;

    // ecs规格
    @NameInMap("EcsSpec")
    public String ecsSpec;

    // 实例状态
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    // jupyter链接
    @NameInMap("JupyterlabUrl")
    public String jupyterlabUrl;

    // webIde链接
    @NameInMap("WebIdeUrl")
    public String webIdeUrl;

    // 命令行终端链接
    @NameInMap("TerminalUrl")
    public String terminalUrl;

    // 累计运行时间(分钟)
    @NameInMap("AccumulativeRunningTimeInMinutes")
    public Long accumulativeRunningTimeInMinutes;

    // 镜像ID
    @NameInMap("ImageId")
    public String imageId;

    // 镜像链接
    @NameInMap("ImageUrl")
    public String imageUrl;

    // 创建时间(GMT)
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改时间(GMT)
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 用户ID
    @NameInMap("UserId")
    public String userId;

    // nas文件系统ID
    @NameInMap("NasFileSystemId")
    public String nasFileSystemId;

    // 被打通VPC配置
    @NameInMap("UserVpc")
    public UserVpc userVpc;

    // 定时关机任务
    @NameInMap("InstanceShutdownTimer")
    public InstanceShutdownTimer instanceShutdownTimer;

    // 工作空间id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 工作空间名称
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static Instance build(java.util.Map<String, ?> map) throws Exception {
        Instance self = new Instance();
        return TeaModel.build(map, self);
    }

    public Instance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Instance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public Instance setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public Instance setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public Instance setJupyterlabUrl(String jupyterlabUrl) {
        this.jupyterlabUrl = jupyterlabUrl;
        return this;
    }
    public String getJupyterlabUrl() {
        return this.jupyterlabUrl;
    }

    public Instance setWebIdeUrl(String webIdeUrl) {
        this.webIdeUrl = webIdeUrl;
        return this;
    }
    public String getWebIdeUrl() {
        return this.webIdeUrl;
    }

    public Instance setTerminalUrl(String terminalUrl) {
        this.terminalUrl = terminalUrl;
        return this;
    }
    public String getTerminalUrl() {
        return this.terminalUrl;
    }

    public Instance setAccumulativeRunningTimeInMinutes(Long accumulativeRunningTimeInMinutes) {
        this.accumulativeRunningTimeInMinutes = accumulativeRunningTimeInMinutes;
        return this;
    }
    public Long getAccumulativeRunningTimeInMinutes() {
        return this.accumulativeRunningTimeInMinutes;
    }

    public Instance setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public Instance setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public Instance setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Instance setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Instance setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Instance setNasFileSystemId(String nasFileSystemId) {
        this.nasFileSystemId = nasFileSystemId;
        return this;
    }
    public String getNasFileSystemId() {
        return this.nasFileSystemId;
    }

    public Instance setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public Instance setInstanceShutdownTimer(InstanceShutdownTimer instanceShutdownTimer) {
        this.instanceShutdownTimer = instanceShutdownTimer;
        return this;
    }
    public InstanceShutdownTimer getInstanceShutdownTimer() {
        return this.instanceShutdownTimer;
    }

    public Instance setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public Instance setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
