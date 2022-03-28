// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    // 实例计算类型
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    // 工作空间内是否他人可见
    @NameInMap("Accessibility")
    public String accessibility;

    // 累计运行时间（ms）
    @NameInMap("AccumulatedRunningTimeInMs")
    public Long accumulatedRunningTimeInMs;

    // 状态码
    @NameInMap("Code")
    public String code;

    // 数据集集合
    @NameInMap("Datasets")
    public java.util.List<GetInstanceResponseBodyDatasets> datasets;

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

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
    public GetInstanceResponseBodyInstanceShutdownTimer instanceShutdownTimer;

    // 实例Url
    @NameInMap("InstanceUrl")
    public String instanceUrl;

    // Jupyterlab Url
    @NameInMap("JupyterlabUrl")
    public String jupyterlabUrl;

    // 最新保存的用户镜像
    @NameInMap("LatestSnapshot")
    public GetInstanceResponseBodyLatestSnapshot latestSnapshot;

    // 说明
    @NameInMap("Message")
    public String message;

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

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    // 终端url
    @NameInMap("TerminalUrl")
    public String terminalUrl;

    // 用户Id
    @NameInMap("UserId")
    public String userId;

    // 用户名称
    @NameInMap("UserName")
    public String userName;

    // user vpc配置
    @NameInMap("UserVpc")
    public GetInstanceResponseBodyUserVpc userVpc;

    // Web IDE url
    @NameInMap("WebIDEUrl")
    public String webIDEUrl;

    // 工作空间Id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 工作空间名称
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public GetInstanceResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetInstanceResponseBody setAccumulatedRunningTimeInMs(Long accumulatedRunningTimeInMs) {
        this.accumulatedRunningTimeInMs = accumulatedRunningTimeInMs;
        return this;
    }
    public Long getAccumulatedRunningTimeInMs() {
        return this.accumulatedRunningTimeInMs;
    }

    public GetInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceResponseBody setDatasets(java.util.List<GetInstanceResponseBodyDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<GetInstanceResponseBodyDatasets> getDatasets() {
        return this.datasets;
    }

    public GetInstanceResponseBody setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public GetInstanceResponseBody setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
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

    public GetInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetInstanceResponseBody setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
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

    public GetInstanceResponseBody setInstanceShutdownTimer(GetInstanceResponseBodyInstanceShutdownTimer instanceShutdownTimer) {
        this.instanceShutdownTimer = instanceShutdownTimer;
        return this;
    }
    public GetInstanceResponseBodyInstanceShutdownTimer getInstanceShutdownTimer() {
        return this.instanceShutdownTimer;
    }

    public GetInstanceResponseBody setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
        return this;
    }
    public String getInstanceUrl() {
        return this.instanceUrl;
    }

    public GetInstanceResponseBody setJupyterlabUrl(String jupyterlabUrl) {
        this.jupyterlabUrl = jupyterlabUrl;
        return this;
    }
    public String getJupyterlabUrl() {
        return this.jupyterlabUrl;
    }

    public GetInstanceResponseBody setLatestSnapshot(GetInstanceResponseBodyLatestSnapshot latestSnapshot) {
        this.latestSnapshot = latestSnapshot;
        return this;
    }
    public GetInstanceResponseBodyLatestSnapshot getLatestSnapshot() {
        return this.latestSnapshot;
    }

    public GetInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceResponseBody setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public GetInstanceResponseBody setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public GetInstanceResponseBody setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

    public GetInstanceResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public GetInstanceResponseBody setUserVpc(GetInstanceResponseBodyUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public GetInstanceResponseBodyUserVpc getUserVpc() {
        return this.userVpc;
    }

    public GetInstanceResponseBody setWebIDEUrl(String webIDEUrl) {
        this.webIDEUrl = webIDEUrl;
        return this;
    }
    public String getWebIDEUrl() {
        return this.webIDEUrl;
    }

    public GetInstanceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetInstanceResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class GetInstanceResponseBodyDatasets extends TeaModel {
        // 数据集Id
        @NameInMap("DatasetId")
        public String datasetId;

        // 容器内挂载路径
        @NameInMap("MountPath")
        public String mountPath;

        public static GetInstanceResponseBodyDatasets build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDatasets self = new GetInstanceResponseBodyDatasets();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDatasets setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public GetInstanceResponseBodyDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class GetInstanceResponseBodyInstanceShutdownTimer extends TeaModel {
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

        public static GetInstanceResponseBodyInstanceShutdownTimer build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceShutdownTimer self = new GetInstanceResponseBodyInstanceShutdownTimer();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceShutdownTimer setDueTime(String dueTime) {
            this.dueTime = dueTime;
            return this;
        }
        public String getDueTime() {
            return this.dueTime;
        }

        public GetInstanceResponseBodyInstanceShutdownTimer setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetInstanceResponseBodyInstanceShutdownTimer setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetInstanceResponseBodyInstanceShutdownTimer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyInstanceShutdownTimer setRemainingTimeInMs(Long remainingTimeInMs) {
            this.remainingTimeInMs = remainingTimeInMs;
            return this;
        }
        public Long getRemainingTimeInMs() {
            return this.remainingTimeInMs;
        }

    }

    public static class GetInstanceResponseBodyLatestSnapshot extends TeaModel {
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

        public static GetInstanceResponseBodyLatestSnapshot build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyLatestSnapshot self = new GetInstanceResponseBodyLatestSnapshot();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyLatestSnapshot setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetInstanceResponseBodyLatestSnapshot setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetInstanceResponseBodyLatestSnapshot setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetInstanceResponseBodyLatestSnapshot setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public GetInstanceResponseBodyLatestSnapshot setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetInstanceResponseBodyLatestSnapshot setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

    }

    public static class GetInstanceResponseBodyUserVpc extends TeaModel {
        // Security Group Id
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // VSwitch Id
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // Vpc Id
        @NameInMap("VpcId")
        public String vpcId;

        public static GetInstanceResponseBodyUserVpc build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyUserVpc self = new GetInstanceResponseBodyUserVpc();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetInstanceResponseBodyUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetInstanceResponseBodyUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
