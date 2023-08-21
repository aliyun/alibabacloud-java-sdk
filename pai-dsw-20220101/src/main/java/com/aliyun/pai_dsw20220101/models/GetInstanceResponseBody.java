// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("AccumulatedRunningTimeInMs")
    public Long accumulatedRunningTimeInMs;

    @NameInMap("CloudDisks")
    public java.util.List<GetInstanceResponseBodyCloudDisks> cloudDisks;

    @NameInMap("Code")
    public String code;

    @NameInMap("Datasets")
    public java.util.List<GetInstanceResponseBodyDatasets> datasets;

    @NameInMap("EcsSpec")
    public String ecsSpec;

    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, String> environmentVariables;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("IdleInstanceCuller")
    public GetInstanceResponseBodyIdleInstanceCuller idleInstanceCuller;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceShutdownTimer")
    public GetInstanceResponseBodyInstanceShutdownTimer instanceShutdownTimer;

    @NameInMap("InstanceSnapshotList")
    public java.util.List<GetInstanceResponseBodyInstanceSnapshotList> instanceSnapshotList;

    @NameInMap("InstanceUrl")
    public String instanceUrl;

    /**
     * <p>Jupyterlab Url。</p>
     */
    @NameInMap("JupyterlabUrl")
    public String jupyterlabUrl;

    @NameInMap("Labels")
    public java.util.List<GetInstanceResponseBodyLabels> labels;

    @NameInMap("LatestSnapshot")
    public GetInstanceResponseBodyLatestSnapshot latestSnapshot;

    @NameInMap("Message")
    public String message;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("ReasonCode")
    public String reasonCode;

    @NameInMap("ReasonMessage")
    public String reasonMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequestedResource")
    public GetInstanceResponseBodyRequestedResource requestedResource;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TerminalUrl")
    public String terminalUrl;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserVpc")
    public GetInstanceResponseBodyUserVpc userVpc;

    /**
     * <p>Web IDE url。</p>
     */
    @NameInMap("WebIDEUrl")
    public String webIDEUrl;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    @NameInMap("WorkspaceSource")
    public String workspaceSource;

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

    public GetInstanceResponseBody setCloudDisks(java.util.List<GetInstanceResponseBodyCloudDisks> cloudDisks) {
        this.cloudDisks = cloudDisks;
        return this;
    }
    public java.util.List<GetInstanceResponseBodyCloudDisks> getCloudDisks() {
        return this.cloudDisks;
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

    public GetInstanceResponseBody setIdleInstanceCuller(GetInstanceResponseBodyIdleInstanceCuller idleInstanceCuller) {
        this.idleInstanceCuller = idleInstanceCuller;
        return this;
    }
    public GetInstanceResponseBodyIdleInstanceCuller getIdleInstanceCuller() {
        return this.idleInstanceCuller;
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

    public GetInstanceResponseBody setInstanceSnapshotList(java.util.List<GetInstanceResponseBodyInstanceSnapshotList> instanceSnapshotList) {
        this.instanceSnapshotList = instanceSnapshotList;
        return this;
    }
    public java.util.List<GetInstanceResponseBodyInstanceSnapshotList> getInstanceSnapshotList() {
        return this.instanceSnapshotList;
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

    public GetInstanceResponseBody setLabels(java.util.List<GetInstanceResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<GetInstanceResponseBodyLabels> getLabels() {
        return this.labels;
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

    public GetInstanceResponseBody setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
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

    public GetInstanceResponseBody setRequestedResource(GetInstanceResponseBodyRequestedResource requestedResource) {
        this.requestedResource = requestedResource;
        return this;
    }
    public GetInstanceResponseBodyRequestedResource getRequestedResource() {
        return this.requestedResource;
    }

    public GetInstanceResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetInstanceResponseBody setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
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

    public GetInstanceResponseBody setWorkspaceSource(String workspaceSource) {
        this.workspaceSource = workspaceSource;
        return this;
    }
    public String getWorkspaceSource() {
        return this.workspaceSource;
    }

    public static class GetInstanceResponseBodyCloudDisks extends TeaModel {
        @NameInMap("Capacity")
        public String capacity;

        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("Path")
        public String path;

        @NameInMap("SubType")
        public String subType;

        public static GetInstanceResponseBodyCloudDisks build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyCloudDisks self = new GetInstanceResponseBodyCloudDisks();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyCloudDisks setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public GetInstanceResponseBodyCloudDisks setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetInstanceResponseBodyCloudDisks setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetInstanceResponseBodyCloudDisks setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

    }

    public static class GetInstanceResponseBodyDatasets extends TeaModel {
        @NameInMap("DatasetId")
        public String datasetId;

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

    public static class GetInstanceResponseBodyIdleInstanceCuller extends TeaModel {
        @NameInMap("CpuPercentThreshold")
        public Integer cpuPercentThreshold;

        @NameInMap("GpuPercentThreshold")
        public Integer gpuPercentThreshold;

        @NameInMap("IdleTimeInMinutes")
        public Integer idleTimeInMinutes;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MaxIdleTimeInMinutes")
        public Integer maxIdleTimeInMinutes;

        public static GetInstanceResponseBodyIdleInstanceCuller build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyIdleInstanceCuller self = new GetInstanceResponseBodyIdleInstanceCuller();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyIdleInstanceCuller setCpuPercentThreshold(Integer cpuPercentThreshold) {
            this.cpuPercentThreshold = cpuPercentThreshold;
            return this;
        }
        public Integer getCpuPercentThreshold() {
            return this.cpuPercentThreshold;
        }

        public GetInstanceResponseBodyIdleInstanceCuller setGpuPercentThreshold(Integer gpuPercentThreshold) {
            this.gpuPercentThreshold = gpuPercentThreshold;
            return this;
        }
        public Integer getGpuPercentThreshold() {
            return this.gpuPercentThreshold;
        }

        public GetInstanceResponseBodyIdleInstanceCuller setIdleTimeInMinutes(Integer idleTimeInMinutes) {
            this.idleTimeInMinutes = idleTimeInMinutes;
            return this;
        }
        public Integer getIdleTimeInMinutes() {
            return this.idleTimeInMinutes;
        }

        public GetInstanceResponseBodyIdleInstanceCuller setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyIdleInstanceCuller setMaxIdleTimeInMinutes(Integer maxIdleTimeInMinutes) {
            this.maxIdleTimeInMinutes = maxIdleTimeInMinutes;
            return this;
        }
        public Integer getMaxIdleTimeInMinutes() {
            return this.maxIdleTimeInMinutes;
        }

    }

    public static class GetInstanceResponseBodyInstanceShutdownTimer extends TeaModel {
        @NameInMap("DueTime")
        public String dueTime;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("InstanceId")
        public String instanceId;

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

    public static class GetInstanceResponseBodyInstanceSnapshotList extends TeaModel {
        /**
         * <p>快照创建时间</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>快照修改时间</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>镜像Id</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>镜像名称</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>镜像Url</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>实例快照错误代码</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>实例快照错误消息</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <p>镜像仓库Url</p>
         */
        @NameInMap("RepositoryUrl")
        public String repositoryUrl;

        /**
         * <p>实例快照状态</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetInstanceResponseBodyInstanceSnapshotList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceSnapshotList self = new GetInstanceResponseBodyInstanceSnapshotList();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceSnapshotList setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetInstanceResponseBodyLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetInstanceResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyLabels self = new GetInstanceResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceResponseBodyLatestSnapshot extends TeaModel {
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>实例快照错误代码</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>实例快照错误消息</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        @NameInMap("RepositoryUrl")
        public String repositoryUrl;

        /**
         * <p>实例快照状态</p>
         */
        @NameInMap("Status")
        public String status;

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

        public GetInstanceResponseBodyLatestSnapshot setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public GetInstanceResponseBodyLatestSnapshot setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public GetInstanceResponseBodyLatestSnapshot setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        public GetInstanceResponseBodyLatestSnapshot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetInstanceResponseBodyRequestedResource extends TeaModel {
        @NameInMap("CPU")
        public String CPU;

        @NameInMap("GPU")
        public String GPU;

        @NameInMap("GPUType")
        public String GPUType;

        @NameInMap("Memory")
        public String memory;

        @NameInMap("SharedMemory")
        public String sharedMemory;

        public static GetInstanceResponseBodyRequestedResource build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyRequestedResource self = new GetInstanceResponseBodyRequestedResource();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyRequestedResource setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public GetInstanceResponseBodyRequestedResource setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public String getGPU() {
            return this.GPU;
        }

        public GetInstanceResponseBodyRequestedResource setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public GetInstanceResponseBodyRequestedResource setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetInstanceResponseBodyRequestedResource setSharedMemory(String sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public String getSharedMemory() {
            return this.sharedMemory;
        }

    }

    public static class GetInstanceResponseBodyUserVpc extends TeaModel {
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>Vpc Id。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetInstanceResponseBodyUserVpc build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyUserVpc self = new GetInstanceResponseBodyUserVpc();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyUserVpc setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        public GetInstanceResponseBodyUserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
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
