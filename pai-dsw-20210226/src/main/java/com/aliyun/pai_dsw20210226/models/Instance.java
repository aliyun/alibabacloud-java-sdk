// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class Instance extends TeaModel {
    // 运行时间，毫秒数
    @NameInMap("AccumulativeRunningTimeInMillis")
    public Long accumulativeRunningTimeInMillis;

    // 累计运行时间(分钟)
    @NameInMap("AccumulativeRunningTimeInMinutes")
    public Long accumulativeRunningTimeInMinutes;

    // 创建者
    @NameInMap("CreateUser")
    public String createUser;

    // 数据集列表
    @NameInMap("DatasetList")
    public java.util.List<Dataset> datasetList;

    // ecs规格
    @NameInMap("EcsSpec")
    public String ecsSpec;

    // 创建时间(GMT)
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改时间(GMT)
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 镜像ID
    @NameInMap("ImageId")
    public String imageId;

    // 镜像名称
    @NameInMap("ImageName")
    public String imageName;

    // 镜像类型
    @NameInMap("ImageType")
    public String imageType;

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

    // dsw实例链接
    @NameInMap("InstanceUrl")
    public String instanceUrl;

    // 实例版本
    @NameInMap("InstanceVersion")
    public String instanceVersion;

    // 是否他人可见
    @NameInMap("IsPublic")
    public Long isPublic;

    // jupyter链接
    @NameInMap("JupyterlabUrl")
    public String jupyterlabUrl;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // nas文件系统ID
    @NameInMap("NasFileSystemId")
    public String nasFileSystemId;

    // 付费类型代码
    @NameInMap("PayType")
    public Long payType;

    // 付费类型名称
    @NameInMap("PayTypeName")
    public String payTypeName;

    // 资源类型名称
    @NameInMap("Resource")
    public String resource;

    // 资源类型代码
    @NameInMap("ResourceType")
    public Long resourceType;

    // 是否支持定时关机
    @NameInMap("ShutdownEnabled")
    public Boolean shutdownEnabled;

    // 命令行终端链接
    @NameInMap("TerminalUrl")
    public String terminalUrl;

    // 用户ID
    @NameInMap("UserId")
    public String userId;

    // 保存用户镜像列表
    @NameInMap("UserImageList")
    public java.util.List<Image> userImageList;

    // 被打通VPC配置
    @NameInMap("UserVpc")
    public UserVpc userVpc;

    // webIde链接
    @NameInMap("WebIdeUrl")
    public String webIdeUrl;

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

    public Instance setAccumulativeRunningTimeInMillis(Long accumulativeRunningTimeInMillis) {
        this.accumulativeRunningTimeInMillis = accumulativeRunningTimeInMillis;
        return this;
    }
    public Long getAccumulativeRunningTimeInMillis() {
        return this.accumulativeRunningTimeInMillis;
    }

    public Instance setAccumulativeRunningTimeInMinutes(Long accumulativeRunningTimeInMinutes) {
        this.accumulativeRunningTimeInMinutes = accumulativeRunningTimeInMinutes;
        return this;
    }
    public Long getAccumulativeRunningTimeInMinutes() {
        return this.accumulativeRunningTimeInMinutes;
    }

    public Instance setCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }
    public String getCreateUser() {
        return this.createUser;
    }

    public Instance setDatasetList(java.util.List<Dataset> datasetList) {
        this.datasetList = datasetList;
        return this;
    }
    public java.util.List<Dataset> getDatasetList() {
        return this.datasetList;
    }

    public Instance setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
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

    public Instance setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public Instance setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public Instance setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public Instance setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
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

    public Instance setInstanceShutdownTimer(InstanceShutdownTimer instanceShutdownTimer) {
        this.instanceShutdownTimer = instanceShutdownTimer;
        return this;
    }
    public InstanceShutdownTimer getInstanceShutdownTimer() {
        return this.instanceShutdownTimer;
    }

    public Instance setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public Instance setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
        return this;
    }
    public String getInstanceUrl() {
        return this.instanceUrl;
    }

    public Instance setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }
    public String getInstanceVersion() {
        return this.instanceVersion;
    }

    public Instance setIsPublic(Long isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Long getIsPublic() {
        return this.isPublic;
    }

    public Instance setJupyterlabUrl(String jupyterlabUrl) {
        this.jupyterlabUrl = jupyterlabUrl;
        return this;
    }
    public String getJupyterlabUrl() {
        return this.jupyterlabUrl;
    }

    public Instance setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Instance setNasFileSystemId(String nasFileSystemId) {
        this.nasFileSystemId = nasFileSystemId;
        return this;
    }
    public String getNasFileSystemId() {
        return this.nasFileSystemId;
    }

    public Instance setPayType(Long payType) {
        this.payType = payType;
        return this;
    }
    public Long getPayType() {
        return this.payType;
    }

    public Instance setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
        return this;
    }
    public String getPayTypeName() {
        return this.payTypeName;
    }

    public Instance setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public Instance setResourceType(Long resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Long getResourceType() {
        return this.resourceType;
    }

    public Instance setShutdownEnabled(Boolean shutdownEnabled) {
        this.shutdownEnabled = shutdownEnabled;
        return this;
    }
    public Boolean getShutdownEnabled() {
        return this.shutdownEnabled;
    }

    public Instance setTerminalUrl(String terminalUrl) {
        this.terminalUrl = terminalUrl;
        return this;
    }
    public String getTerminalUrl() {
        return this.terminalUrl;
    }

    public Instance setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Instance setUserImageList(java.util.List<Image> userImageList) {
        this.userImageList = userImageList;
        return this;
    }
    public java.util.List<Image> getUserImageList() {
        return this.userImageList;
    }

    public Instance setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public Instance setWebIdeUrl(String webIdeUrl) {
        this.webIdeUrl = webIdeUrl;
        return this;
    }
    public String getWebIdeUrl() {
        return this.webIdeUrl;
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
