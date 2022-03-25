// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class UpdateInstanceV2Request extends TeaModel {
    // 实例计算类型
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    // 工作空间内是否他人可见
    @NameInMap("Accessibility")
    public String accessibility;

    // 累计运行时间（ms）
    @NameInMap("AccumulatedRunningTimeInMs")
    public Long accumulatedRunningTimeInMs;

    // 数据集集合
    @NameInMap("Datasets")
    public java.util.List<UpdateInstanceV2RequestDatasets> datasets;

    // 实例对应的Ecs规格
    @NameInMap("EcsSpec")
    public String ecsSpec;

    // 环境变量
    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, String> environmentVariables;

    // 实例创建时间
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 实例修改时间
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 镜像Id
    @NameInMap("ImageId")
    public String imageId;

    // 镜像名称
    @NameInMap("ImageName")
    public String imageName;

    // 镜像地址
    @NameInMap("ImageUrl")
    public String imageUrl;

    // 实例Id
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例名称
    @NameInMap("InstanceName")
    public String instanceName;

    // 定时关机任务
    @NameInMap("InstanceShutdownTimer")
    public UpdateInstanceV2RequestInstanceShutdownTimer instanceShutdownTimer;

    // 实例Url
    @NameInMap("InstanceUrl")
    public String instanceUrl;

    // Jupyterlab Url
    @NameInMap("JupyterlabUrl")
    public String jupyterlabUrl;

    // 最新保存的用户镜像
    @NameInMap("LatestSnapshot")
    public UpdateInstanceV2RequestLatestSnapshot latestSnapshot;

    // 支付类型
    @NameInMap("PaymentType")
    public String paymentType;

    // 实例错误代码
    @NameInMap("ReasonCode")
    public String reasonCode;

    // 实例错误原因
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    // 实例状态
    @NameInMap("Status")
    public String status;

    // terminal url
    @NameInMap("TerminalUrl")
    public String terminalUrl;

    // 用户Id
    @NameInMap("UserId")
    public String userId;

    // user vpc配置
    @NameInMap("UserVpc")
    public UpdateInstanceV2RequestUserVpc userVpc;

    // web ide url
    @NameInMap("WebIDEUrl")
    public String webIDEUrl;

    // 工作空间Id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 工作空间名称
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static UpdateInstanceV2Request build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceV2Request self = new UpdateInstanceV2Request();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceV2Request setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public UpdateInstanceV2Request setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public UpdateInstanceV2Request setAccumulatedRunningTimeInMs(Long accumulatedRunningTimeInMs) {
        this.accumulatedRunningTimeInMs = accumulatedRunningTimeInMs;
        return this;
    }
    public Long getAccumulatedRunningTimeInMs() {
        return this.accumulatedRunningTimeInMs;
    }

    public UpdateInstanceV2Request setDatasets(java.util.List<UpdateInstanceV2RequestDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<UpdateInstanceV2RequestDatasets> getDatasets() {
        return this.datasets;
    }

    public UpdateInstanceV2Request setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public UpdateInstanceV2Request setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public UpdateInstanceV2Request setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public UpdateInstanceV2Request setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public UpdateInstanceV2Request setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateInstanceV2Request setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public UpdateInstanceV2Request setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public UpdateInstanceV2Request setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceV2Request setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateInstanceV2Request setInstanceShutdownTimer(UpdateInstanceV2RequestInstanceShutdownTimer instanceShutdownTimer) {
        this.instanceShutdownTimer = instanceShutdownTimer;
        return this;
    }
    public UpdateInstanceV2RequestInstanceShutdownTimer getInstanceShutdownTimer() {
        return this.instanceShutdownTimer;
    }

    public UpdateInstanceV2Request setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
        return this;
    }
    public String getInstanceUrl() {
        return this.instanceUrl;
    }

    public UpdateInstanceV2Request setJupyterlabUrl(String jupyterlabUrl) {
        this.jupyterlabUrl = jupyterlabUrl;
        return this;
    }
    public String getJupyterlabUrl() {
        return this.jupyterlabUrl;
    }

    public UpdateInstanceV2Request setLatestSnapshot(UpdateInstanceV2RequestLatestSnapshot latestSnapshot) {
        this.latestSnapshot = latestSnapshot;
        return this;
    }
    public UpdateInstanceV2RequestLatestSnapshot getLatestSnapshot() {
        return this.latestSnapshot;
    }

    public UpdateInstanceV2Request setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public UpdateInstanceV2Request setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public UpdateInstanceV2Request setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public UpdateInstanceV2Request setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateInstanceV2Request setTerminalUrl(String terminalUrl) {
        this.terminalUrl = terminalUrl;
        return this;
    }
    public String getTerminalUrl() {
        return this.terminalUrl;
    }

    public UpdateInstanceV2Request setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateInstanceV2Request setUserVpc(UpdateInstanceV2RequestUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UpdateInstanceV2RequestUserVpc getUserVpc() {
        return this.userVpc;
    }

    public UpdateInstanceV2Request setWebIDEUrl(String webIDEUrl) {
        this.webIDEUrl = webIDEUrl;
        return this;
    }
    public String getWebIDEUrl() {
        return this.webIDEUrl;
    }

    public UpdateInstanceV2Request setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UpdateInstanceV2Request setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class UpdateInstanceV2RequestDatasets extends TeaModel {
        // 数据集Id
        @NameInMap("DatasetId")
        public String datasetId;

        // 容器内挂载路径
        @NameInMap("MountPath")
        public String mountPath;

        public static UpdateInstanceV2RequestDatasets build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceV2RequestDatasets self = new UpdateInstanceV2RequestDatasets();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceV2RequestDatasets setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public UpdateInstanceV2RequestDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class UpdateInstanceV2RequestInstanceShutdownTimer extends TeaModel {
        // 设定关机时间
        @NameInMap("DueTime")
        public String dueTime;

        // 创建时间
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        // 修改时间
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        // 实例Id
        @NameInMap("InstanceId")
        public String instanceId;

        // 剩余关机时间（ms）
        @NameInMap("RemainingTimeInMs")
        public Long remainingTimeInMs;

        public static UpdateInstanceV2RequestInstanceShutdownTimer build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceV2RequestInstanceShutdownTimer self = new UpdateInstanceV2RequestInstanceShutdownTimer();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceV2RequestInstanceShutdownTimer setDueTime(String dueTime) {
            this.dueTime = dueTime;
            return this;
        }
        public String getDueTime() {
            return this.dueTime;
        }

        public UpdateInstanceV2RequestInstanceShutdownTimer setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public UpdateInstanceV2RequestInstanceShutdownTimer setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public UpdateInstanceV2RequestInstanceShutdownTimer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateInstanceV2RequestInstanceShutdownTimer setRemainingTimeInMs(Long remainingTimeInMs) {
            this.remainingTimeInMs = remainingTimeInMs;
            return this;
        }
        public Long getRemainingTimeInMs() {
            return this.remainingTimeInMs;
        }

    }

    public static class UpdateInstanceV2RequestLatestSnapshot extends TeaModel {
        // 快照创建时间
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        // 快照修改时间
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        // 镜像Id
        @NameInMap("ImageId")
        public String imageId;

        // 镜像名称
        @NameInMap("ImageName")
        public String imageName;

        // 镜像Url
        @NameInMap("ImageUrl")
        public String imageUrl;

        // 镜像仓库Url
        @NameInMap("RepositoryUrl")
        public String repositoryUrl;

        public static UpdateInstanceV2RequestLatestSnapshot build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceV2RequestLatestSnapshot self = new UpdateInstanceV2RequestLatestSnapshot();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceV2RequestLatestSnapshot setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public UpdateInstanceV2RequestLatestSnapshot setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public UpdateInstanceV2RequestLatestSnapshot setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public UpdateInstanceV2RequestLatestSnapshot setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public UpdateInstanceV2RequestLatestSnapshot setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public UpdateInstanceV2RequestLatestSnapshot setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

    }

    public static class UpdateInstanceV2RequestUserVpc extends TeaModel {
        // Security Group Id
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // VSwitch Id
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // Vpc Id
        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateInstanceV2RequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceV2RequestUserVpc self = new UpdateInstanceV2RequestUserVpc();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceV2RequestUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateInstanceV2RequestUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateInstanceV2RequestUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
