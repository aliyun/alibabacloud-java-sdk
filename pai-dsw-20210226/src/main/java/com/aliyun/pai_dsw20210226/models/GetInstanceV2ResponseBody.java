// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceV2ResponseBody extends TeaModel {
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
    public java.util.List<GetInstanceV2ResponseBodyDatasets> datasets;

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
    public GetInstanceV2ResponseBodyInstanceShutdownTimer instanceShutdownTimer;

    // 实例Url
    @NameInMap("InstanceUrl")
    public String instanceUrl;

    // Jupyterlab Url
    @NameInMap("JupyterlabUrl")
    public String jupyterlabUrl;

    // 最新保存的用户镜像
    @NameInMap("LatestSnapshot")
    public GetInstanceV2ResponseBodyLatestSnapshot latestSnapshot;

    // 支付类型
    @NameInMap("PaymentType")
    public String paymentType;

    // 实例错误代码
    @NameInMap("ReasonCode")
    public String reasonCode;

    // 实例错误原因
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

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
    public GetInstanceV2ResponseBodyUserVpc userVpc;

    // web ide url
    @NameInMap("WebIDEUrl")
    public String webIDEUrl;

    // 工作空间Id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 工作空间名称
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static GetInstanceV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceV2ResponseBody self = new GetInstanceV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceV2ResponseBody setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public GetInstanceV2ResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetInstanceV2ResponseBody setAccumulatedRunningTimeInMs(Long accumulatedRunningTimeInMs) {
        this.accumulatedRunningTimeInMs = accumulatedRunningTimeInMs;
        return this;
    }
    public Long getAccumulatedRunningTimeInMs() {
        return this.accumulatedRunningTimeInMs;
    }

    public GetInstanceV2ResponseBody setDatasets(java.util.List<GetInstanceV2ResponseBodyDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<GetInstanceV2ResponseBodyDatasets> getDatasets() {
        return this.datasets;
    }

    public GetInstanceV2ResponseBody setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public GetInstanceV2ResponseBody setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public GetInstanceV2ResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetInstanceV2ResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetInstanceV2ResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetInstanceV2ResponseBody setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public GetInstanceV2ResponseBody setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GetInstanceV2ResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceV2ResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public GetInstanceV2ResponseBody setInstanceShutdownTimer(GetInstanceV2ResponseBodyInstanceShutdownTimer instanceShutdownTimer) {
        this.instanceShutdownTimer = instanceShutdownTimer;
        return this;
    }
    public GetInstanceV2ResponseBodyInstanceShutdownTimer getInstanceShutdownTimer() {
        return this.instanceShutdownTimer;
    }

    public GetInstanceV2ResponseBody setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
        return this;
    }
    public String getInstanceUrl() {
        return this.instanceUrl;
    }

    public GetInstanceV2ResponseBody setJupyterlabUrl(String jupyterlabUrl) {
        this.jupyterlabUrl = jupyterlabUrl;
        return this;
    }
    public String getJupyterlabUrl() {
        return this.jupyterlabUrl;
    }

    public GetInstanceV2ResponseBody setLatestSnapshot(GetInstanceV2ResponseBodyLatestSnapshot latestSnapshot) {
        this.latestSnapshot = latestSnapshot;
        return this;
    }
    public GetInstanceV2ResponseBodyLatestSnapshot getLatestSnapshot() {
        return this.latestSnapshot;
    }

    public GetInstanceV2ResponseBody setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public GetInstanceV2ResponseBody setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public GetInstanceV2ResponseBody setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public GetInstanceV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceV2ResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetInstanceV2ResponseBody setTerminalUrl(String terminalUrl) {
        this.terminalUrl = terminalUrl;
        return this;
    }
    public String getTerminalUrl() {
        return this.terminalUrl;
    }

    public GetInstanceV2ResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetInstanceV2ResponseBody setUserVpc(GetInstanceV2ResponseBodyUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public GetInstanceV2ResponseBodyUserVpc getUserVpc() {
        return this.userVpc;
    }

    public GetInstanceV2ResponseBody setWebIDEUrl(String webIDEUrl) {
        this.webIDEUrl = webIDEUrl;
        return this;
    }
    public String getWebIDEUrl() {
        return this.webIDEUrl;
    }

    public GetInstanceV2ResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetInstanceV2ResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class GetInstanceV2ResponseBodyDatasets extends TeaModel {
        // 数据集Id
        @NameInMap("DatasetId")
        public String datasetId;

        // 容器内挂载路径
        @NameInMap("MountPath")
        public String mountPath;

        public static GetInstanceV2ResponseBodyDatasets build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceV2ResponseBodyDatasets self = new GetInstanceV2ResponseBodyDatasets();
            return TeaModel.build(map, self);
        }

        public GetInstanceV2ResponseBodyDatasets setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public GetInstanceV2ResponseBodyDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class GetInstanceV2ResponseBodyInstanceShutdownTimer extends TeaModel {
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

        public static GetInstanceV2ResponseBodyInstanceShutdownTimer build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceV2ResponseBodyInstanceShutdownTimer self = new GetInstanceV2ResponseBodyInstanceShutdownTimer();
            return TeaModel.build(map, self);
        }

        public GetInstanceV2ResponseBodyInstanceShutdownTimer setDueTime(String dueTime) {
            this.dueTime = dueTime;
            return this;
        }
        public String getDueTime() {
            return this.dueTime;
        }

        public GetInstanceV2ResponseBodyInstanceShutdownTimer setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetInstanceV2ResponseBodyInstanceShutdownTimer setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetInstanceV2ResponseBodyInstanceShutdownTimer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceV2ResponseBodyInstanceShutdownTimer setRemainingTimeInMs(Long remainingTimeInMs) {
            this.remainingTimeInMs = remainingTimeInMs;
            return this;
        }
        public Long getRemainingTimeInMs() {
            return this.remainingTimeInMs;
        }

    }

    public static class GetInstanceV2ResponseBodyLatestSnapshot extends TeaModel {
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

        public static GetInstanceV2ResponseBodyLatestSnapshot build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceV2ResponseBodyLatestSnapshot self = new GetInstanceV2ResponseBodyLatestSnapshot();
            return TeaModel.build(map, self);
        }

        public GetInstanceV2ResponseBodyLatestSnapshot setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetInstanceV2ResponseBodyLatestSnapshot setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetInstanceV2ResponseBodyLatestSnapshot setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetInstanceV2ResponseBodyLatestSnapshot setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public GetInstanceV2ResponseBodyLatestSnapshot setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetInstanceV2ResponseBodyLatestSnapshot setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

    }

    public static class GetInstanceV2ResponseBodyUserVpc extends TeaModel {
        // Security Group Id
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // VSwitch Id
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // Vpc Id
        @NameInMap("VpcId")
        public String vpcId;

        public static GetInstanceV2ResponseBodyUserVpc build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceV2ResponseBodyUserVpc self = new GetInstanceV2ResponseBodyUserVpc();
            return TeaModel.build(map, self);
        }

        public GetInstanceV2ResponseBodyUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetInstanceV2ResponseBodyUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetInstanceV2ResponseBodyUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
