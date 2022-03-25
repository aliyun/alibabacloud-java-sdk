// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstancesV2ResponseBody extends TeaModel {
    // 本分页中请求的实例列表
    @NameInMap("Instances")
    public java.util.List<ListInstancesV2ResponseBodyInstances> instances;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 实例总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstancesV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesV2ResponseBody self = new ListInstancesV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesV2ResponseBody setInstances(java.util.List<ListInstancesV2ResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesV2ResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesV2ResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesV2ResponseBodyInstancesDatasets extends TeaModel {
        // 数据集Id
        @NameInMap("DatasetId")
        public String datasetId;

        // 容器内挂载路径
        @NameInMap("MountPath")
        public String mountPath;

        public static ListInstancesV2ResponseBodyInstancesDatasets build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesV2ResponseBodyInstancesDatasets self = new ListInstancesV2ResponseBodyInstancesDatasets();
            return TeaModel.build(map, self);
        }

        public ListInstancesV2ResponseBodyInstancesDatasets setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public ListInstancesV2ResponseBodyInstancesDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class ListInstancesV2ResponseBodyInstancesInstanceShutdownTimer extends TeaModel {
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

        public static ListInstancesV2ResponseBodyInstancesInstanceShutdownTimer build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesV2ResponseBodyInstancesInstanceShutdownTimer self = new ListInstancesV2ResponseBodyInstancesInstanceShutdownTimer();
            return TeaModel.build(map, self);
        }

        public ListInstancesV2ResponseBodyInstancesInstanceShutdownTimer setDueTime(String dueTime) {
            this.dueTime = dueTime;
            return this;
        }
        public String getDueTime() {
            return this.dueTime;
        }

        public ListInstancesV2ResponseBodyInstancesInstanceShutdownTimer setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstancesV2ResponseBodyInstancesInstanceShutdownTimer setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstancesV2ResponseBodyInstancesInstanceShutdownTimer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesV2ResponseBodyInstancesInstanceShutdownTimer setRemainingTimeInMs(Long remainingTimeInMs) {
            this.remainingTimeInMs = remainingTimeInMs;
            return this;
        }
        public Long getRemainingTimeInMs() {
            return this.remainingTimeInMs;
        }

    }

    public static class ListInstancesV2ResponseBodyInstancesLatestSnapshot extends TeaModel {
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

        public static ListInstancesV2ResponseBodyInstancesLatestSnapshot build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesV2ResponseBodyInstancesLatestSnapshot self = new ListInstancesV2ResponseBodyInstancesLatestSnapshot();
            return TeaModel.build(map, self);
        }

        public ListInstancesV2ResponseBodyInstancesLatestSnapshot setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstancesV2ResponseBodyInstancesLatestSnapshot setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstancesV2ResponseBodyInstancesLatestSnapshot setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListInstancesV2ResponseBodyInstancesLatestSnapshot setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListInstancesV2ResponseBodyInstancesLatestSnapshot setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListInstancesV2ResponseBodyInstancesLatestSnapshot setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

    }

    public static class ListInstancesV2ResponseBodyInstancesUserVpc extends TeaModel {
        // Security Group Id
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // VSwitch Id
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // Vpc Id
        @NameInMap("VpcId")
        public String vpcId;

        public static ListInstancesV2ResponseBodyInstancesUserVpc build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesV2ResponseBodyInstancesUserVpc self = new ListInstancesV2ResponseBodyInstancesUserVpc();
            return TeaModel.build(map, self);
        }

        public ListInstancesV2ResponseBodyInstancesUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListInstancesV2ResponseBodyInstancesUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListInstancesV2ResponseBodyInstancesUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListInstancesV2ResponseBodyInstances extends TeaModel {
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
        public java.util.List<ListInstancesV2ResponseBodyInstancesDatasets> datasets;

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
        public ListInstancesV2ResponseBodyInstancesInstanceShutdownTimer instanceShutdownTimer;

        // 实例Url
        @NameInMap("InstanceUrl")
        public String instanceUrl;

        // Jupyterlab Url
        @NameInMap("JupyterlabUrl")
        public String jupyterlabUrl;

        // 最新保存的用户镜像
        @NameInMap("LatestSnapshot")
        public ListInstancesV2ResponseBodyInstancesLatestSnapshot latestSnapshot;

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
        public ListInstancesV2ResponseBodyInstancesUserVpc userVpc;

        // web ide url
        @NameInMap("WebIDEUrl")
        public String webIDEUrl;

        // 工作空间Id
        @NameInMap("WorkspaceId")
        public String workspaceId;

        // 工作空间名称
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListInstancesV2ResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesV2ResponseBodyInstances self = new ListInstancesV2ResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesV2ResponseBodyInstances setAcceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }
        public String getAcceleratorType() {
            return this.acceleratorType;
        }

        public ListInstancesV2ResponseBodyInstances setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public ListInstancesV2ResponseBodyInstances setAccumulatedRunningTimeInMs(Long accumulatedRunningTimeInMs) {
            this.accumulatedRunningTimeInMs = accumulatedRunningTimeInMs;
            return this;
        }
        public Long getAccumulatedRunningTimeInMs() {
            return this.accumulatedRunningTimeInMs;
        }

        public ListInstancesV2ResponseBodyInstances setDatasets(java.util.List<ListInstancesV2ResponseBodyInstancesDatasets> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<ListInstancesV2ResponseBodyInstancesDatasets> getDatasets() {
            return this.datasets;
        }

        public ListInstancesV2ResponseBodyInstances setEcsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }
        public String getEcsSpec() {
            return this.ecsSpec;
        }

        public ListInstancesV2ResponseBodyInstances setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        public ListInstancesV2ResponseBodyInstances setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstancesV2ResponseBodyInstances setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstancesV2ResponseBodyInstances setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListInstancesV2ResponseBodyInstances setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListInstancesV2ResponseBodyInstances setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListInstancesV2ResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesV2ResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesV2ResponseBodyInstances setInstanceShutdownTimer(ListInstancesV2ResponseBodyInstancesInstanceShutdownTimer instanceShutdownTimer) {
            this.instanceShutdownTimer = instanceShutdownTimer;
            return this;
        }
        public ListInstancesV2ResponseBodyInstancesInstanceShutdownTimer getInstanceShutdownTimer() {
            return this.instanceShutdownTimer;
        }

        public ListInstancesV2ResponseBodyInstances setInstanceUrl(String instanceUrl) {
            this.instanceUrl = instanceUrl;
            return this;
        }
        public String getInstanceUrl() {
            return this.instanceUrl;
        }

        public ListInstancesV2ResponseBodyInstances setJupyterlabUrl(String jupyterlabUrl) {
            this.jupyterlabUrl = jupyterlabUrl;
            return this;
        }
        public String getJupyterlabUrl() {
            return this.jupyterlabUrl;
        }

        public ListInstancesV2ResponseBodyInstances setLatestSnapshot(ListInstancesV2ResponseBodyInstancesLatestSnapshot latestSnapshot) {
            this.latestSnapshot = latestSnapshot;
            return this;
        }
        public ListInstancesV2ResponseBodyInstancesLatestSnapshot getLatestSnapshot() {
            return this.latestSnapshot;
        }

        public ListInstancesV2ResponseBodyInstances setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListInstancesV2ResponseBodyInstances setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public ListInstancesV2ResponseBodyInstances setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public ListInstancesV2ResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesV2ResponseBodyInstances setTerminalUrl(String terminalUrl) {
            this.terminalUrl = terminalUrl;
            return this;
        }
        public String getTerminalUrl() {
            return this.terminalUrl;
        }

        public ListInstancesV2ResponseBodyInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListInstancesV2ResponseBodyInstances setUserVpc(ListInstancesV2ResponseBodyInstancesUserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }
        public ListInstancesV2ResponseBodyInstancesUserVpc getUserVpc() {
            return this.userVpc;
        }

        public ListInstancesV2ResponseBodyInstances setWebIDEUrl(String webIDEUrl) {
            this.webIDEUrl = webIDEUrl;
            return this;
        }
        public String getWebIDEUrl() {
            return this.webIDEUrl;
        }

        public ListInstancesV2ResponseBodyInstances setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListInstancesV2ResponseBodyInstances setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
