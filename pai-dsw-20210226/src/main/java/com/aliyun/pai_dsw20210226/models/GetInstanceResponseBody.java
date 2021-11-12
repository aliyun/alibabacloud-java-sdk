// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    // 累计运行时间(分钟)
    @NameInMap("AccumulativeRunningTimeInMinutes")
    public Long accumulativeRunningTimeInMinutes;

    // ecs规格
    @NameInMap("EcsSpec")
    public String ecsSpec;

    // 实例创建时间(GMT)
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 实例修改时间(GMT)
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 镜像ID
    @NameInMap("ImageId")
    public String imageId;

    // 镜像链接
    @NameInMap("ImageUrl")
    public String imageUrl;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例名称
    @NameInMap("InstanceName")
    public String instanceName;

    // 定时关机任务
    @NameInMap("InstanceShutdownTimer")
    public InstanceShutdownTimer instanceShutdownTimer;

    // 实例状态
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    // jupyter链接
    @NameInMap("JupyterlabUrl")
    public String jupyterlabUrl;

    // nas文件系统ID
    @NameInMap("NasFileSystemId")
    public String nasFileSystemId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 命令行终端链接
    @NameInMap("TerminalUrl")
    public String terminalUrl;

    // 用户ID
    @NameInMap("UserId")
    public String userId;

    // 被打通VPC配置
    @NameInMap("UserVpc")
    public UserVpc userVpc;

    // web ide链接
    @NameInMap("WebIdeUrl")
    public String webIdeUrl;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setAccumulativeRunningTimeInMinutes(Long accumulativeRunningTimeInMinutes) {
        this.accumulativeRunningTimeInMinutes = accumulativeRunningTimeInMinutes;
        return this;
    }
    public Long getAccumulativeRunningTimeInMinutes() {
        return this.accumulativeRunningTimeInMinutes;
    }

    public GetInstanceResponseBody setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public GetInstanceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetInstanceResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetInstanceResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetInstanceResponseBody setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GetInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public GetInstanceResponseBody setInstanceShutdownTimer(InstanceShutdownTimer instanceShutdownTimer) {
        this.instanceShutdownTimer = instanceShutdownTimer;
        return this;
    }
    public InstanceShutdownTimer getInstanceShutdownTimer() {
        return this.instanceShutdownTimer;
    }

    public GetInstanceResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public GetInstanceResponseBody setJupyterlabUrl(String jupyterlabUrl) {
        this.jupyterlabUrl = jupyterlabUrl;
        return this;
    }
    public String getJupyterlabUrl() {
        return this.jupyterlabUrl;
    }

    public GetInstanceResponseBody setNasFileSystemId(String nasFileSystemId) {
        this.nasFileSystemId = nasFileSystemId;
        return this;
    }
    public String getNasFileSystemId() {
        return this.nasFileSystemId;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setTerminalUrl(String terminalUrl) {
        this.terminalUrl = terminalUrl;
        return this;
    }
    public String getTerminalUrl() {
        return this.terminalUrl;
    }

    public GetInstanceResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetInstanceResponseBody setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public GetInstanceResponseBody setWebIdeUrl(String webIdeUrl) {
        this.webIdeUrl = webIdeUrl;
        return this;
    }
    public String getWebIdeUrl() {
        return this.webIdeUrl;
    }

}
