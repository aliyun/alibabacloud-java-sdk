// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    // 本分页中请求的实例列表
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 实例总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstancesDatasets extends TeaModel {
        // 数据集Id
        @NameInMap("DatasetId")
        public String datasetId;

        // 容器内挂载路径
        @NameInMap("MountPath")
        public String mountPath;

        public static ListInstancesResponseBodyInstancesDatasets build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesDatasets self = new ListInstancesResponseBodyInstancesDatasets();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesDatasets setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public ListInstancesResponseBodyInstancesDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class ListInstancesResponseBodyInstancesInstanceShutdownTimer extends TeaModel {
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

        public static ListInstancesResponseBodyInstancesInstanceShutdownTimer build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesInstanceShutdownTimer self = new ListInstancesResponseBodyInstancesInstanceShutdownTimer();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesInstanceShutdownTimer setDueTime(String dueTime) {
            this.dueTime = dueTime;
            return this;
        }
        public String getDueTime() {
            return this.dueTime;
        }

        public ListInstancesResponseBodyInstancesInstanceShutdownTimer setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstancesResponseBodyInstancesInstanceShutdownTimer setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstancesResponseBodyInstancesInstanceShutdownTimer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstancesInstanceShutdownTimer setRemainingTimeInMs(Long remainingTimeInMs) {
            this.remainingTimeInMs = remainingTimeInMs;
            return this;
        }
        public Long getRemainingTimeInMs() {
            return this.remainingTimeInMs;
        }

    }

    public static class ListInstancesResponseBodyInstancesLatestSnapshot extends TeaModel {
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

        public static ListInstancesResponseBodyInstancesLatestSnapshot build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesLatestSnapshot self = new ListInstancesResponseBodyInstancesLatestSnapshot();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesLatestSnapshot setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstancesResponseBodyInstancesLatestSnapshot setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstancesResponseBodyInstancesLatestSnapshot setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListInstancesResponseBodyInstancesLatestSnapshot setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListInstancesResponseBodyInstancesLatestSnapshot setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListInstancesResponseBodyInstancesLatestSnapshot setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

    }

    public static class ListInstancesResponseBodyInstancesUserVpc extends TeaModel {
        // Security Group Id
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // VSwitch Id
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // Vpc Id
        @NameInMap("VpcId")
        public String vpcId;

        public static ListInstancesResponseBodyInstancesUserVpc build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesUserVpc self = new ListInstancesResponseBodyInstancesUserVpc();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListInstancesResponseBodyInstancesUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListInstancesResponseBodyInstancesUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
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
        public java.util.List<ListInstancesResponseBodyInstancesDatasets> datasets;

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
        public ListInstancesResponseBodyInstancesInstanceShutdownTimer instanceShutdownTimer;

        // 实例Url
        @NameInMap("InstanceUrl")
        public String instanceUrl;

        // Jupyterlab Url
        @NameInMap("JupyterlabUrl")
        public String jupyterlabUrl;

        // 最新保存的用户镜像
        @NameInMap("LatestSnapshot")
        public ListInstancesResponseBodyInstancesLatestSnapshot latestSnapshot;

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

        // 终端url
        @NameInMap("TerminalUrl")
        public String terminalUrl;

        // 用户Id
        @NameInMap("UserId")
        public String userId;

        // user vpc配置
        @NameInMap("UserVpc")
        public ListInstancesResponseBodyInstancesUserVpc userVpc;

        // Web IDE url
        @NameInMap("WebIDEUrl")
        public String webIDEUrl;

        // 工作空间Id
        @NameInMap("WorkspaceId")
        public String workspaceId;

        // 工作空间名称
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setAcceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }
        public String getAcceleratorType() {
            return this.acceleratorType;
        }

        public ListInstancesResponseBodyInstances setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public ListInstancesResponseBodyInstances setAccumulatedRunningTimeInMs(Long accumulatedRunningTimeInMs) {
            this.accumulatedRunningTimeInMs = accumulatedRunningTimeInMs;
            return this;
        }
        public Long getAccumulatedRunningTimeInMs() {
            return this.accumulatedRunningTimeInMs;
        }

        public ListInstancesResponseBodyInstances setDatasets(java.util.List<ListInstancesResponseBodyInstancesDatasets> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesDatasets> getDatasets() {
            return this.datasets;
        }

        public ListInstancesResponseBodyInstances setEcsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }
        public String getEcsSpec() {
            return this.ecsSpec;
        }

        public ListInstancesResponseBodyInstances setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        public ListInstancesResponseBodyInstances setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstancesResponseBodyInstances setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstancesResponseBodyInstances setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListInstancesResponseBodyInstances setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListInstancesResponseBodyInstances setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyInstances setInstanceShutdownTimer(ListInstancesResponseBodyInstancesInstanceShutdownTimer instanceShutdownTimer) {
            this.instanceShutdownTimer = instanceShutdownTimer;
            return this;
        }
        public ListInstancesResponseBodyInstancesInstanceShutdownTimer getInstanceShutdownTimer() {
            return this.instanceShutdownTimer;
        }

        public ListInstancesResponseBodyInstances setInstanceUrl(String instanceUrl) {
            this.instanceUrl = instanceUrl;
            return this;
        }
        public String getInstanceUrl() {
            return this.instanceUrl;
        }

        public ListInstancesResponseBodyInstances setJupyterlabUrl(String jupyterlabUrl) {
            this.jupyterlabUrl = jupyterlabUrl;
            return this;
        }
        public String getJupyterlabUrl() {
            return this.jupyterlabUrl;
        }

        public ListInstancesResponseBodyInstances setLatestSnapshot(ListInstancesResponseBodyInstancesLatestSnapshot latestSnapshot) {
            this.latestSnapshot = latestSnapshot;
            return this;
        }
        public ListInstancesResponseBodyInstancesLatestSnapshot getLatestSnapshot() {
            return this.latestSnapshot;
        }

        public ListInstancesResponseBodyInstances setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListInstancesResponseBodyInstances setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public ListInstancesResponseBodyInstances setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public ListInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyInstances setTerminalUrl(String terminalUrl) {
            this.terminalUrl = terminalUrl;
            return this;
        }
        public String getTerminalUrl() {
            return this.terminalUrl;
        }

        public ListInstancesResponseBodyInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListInstancesResponseBodyInstances setUserVpc(ListInstancesResponseBodyInstancesUserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }
        public ListInstancesResponseBodyInstancesUserVpc getUserVpc() {
            return this.userVpc;
        }

        public ListInstancesResponseBodyInstances setWebIDEUrl(String webIDEUrl) {
            this.webIDEUrl = webIDEUrl;
            return this;
        }
        public String getWebIDEUrl() {
            return this.webIDEUrl;
        }

        public ListInstancesResponseBodyInstances setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListInstancesResponseBodyInstances setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
