// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstancesCloudDisks extends TeaModel {
        @NameInMap("Capacity")
        public String capacity;

        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("Path")
        public String path;

        @NameInMap("SubType")
        public String subType;

        public static ListInstancesResponseBodyInstancesCloudDisks build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesCloudDisks self = new ListInstancesResponseBodyInstancesCloudDisks();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesCloudDisks setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public ListInstancesResponseBodyInstancesCloudDisks setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public ListInstancesResponseBodyInstancesCloudDisks setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListInstancesResponseBodyInstancesCloudDisks setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

    }

    public static class ListInstancesResponseBodyInstancesDatasets extends TeaModel {
        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("OptionType")
        public String optionType;

        @NameInMap("Options")
        public String options;

        @NameInMap("Uri")
        public String uri;

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

        public ListInstancesResponseBodyInstancesDatasets setOptionType(String optionType) {
            this.optionType = optionType;
            return this;
        }
        public String getOptionType() {
            return this.optionType;
        }

        public ListInstancesResponseBodyInstancesDatasets setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public ListInstancesResponseBodyInstancesDatasets setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class ListInstancesResponseBodyInstancesIdleInstanceCuller extends TeaModel {
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

        public static ListInstancesResponseBodyInstancesIdleInstanceCuller build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesIdleInstanceCuller self = new ListInstancesResponseBodyInstancesIdleInstanceCuller();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesIdleInstanceCuller setCpuPercentThreshold(Integer cpuPercentThreshold) {
            this.cpuPercentThreshold = cpuPercentThreshold;
            return this;
        }
        public Integer getCpuPercentThreshold() {
            return this.cpuPercentThreshold;
        }

        public ListInstancesResponseBodyInstancesIdleInstanceCuller setGpuPercentThreshold(Integer gpuPercentThreshold) {
            this.gpuPercentThreshold = gpuPercentThreshold;
            return this;
        }
        public Integer getGpuPercentThreshold() {
            return this.gpuPercentThreshold;
        }

        public ListInstancesResponseBodyInstancesIdleInstanceCuller setIdleTimeInMinutes(Integer idleTimeInMinutes) {
            this.idleTimeInMinutes = idleTimeInMinutes;
            return this;
        }
        public Integer getIdleTimeInMinutes() {
            return this.idleTimeInMinutes;
        }

        public ListInstancesResponseBodyInstancesIdleInstanceCuller setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstancesIdleInstanceCuller setMaxIdleTimeInMinutes(Integer maxIdleTimeInMinutes) {
            this.maxIdleTimeInMinutes = maxIdleTimeInMinutes;
            return this;
        }
        public Integer getMaxIdleTimeInMinutes() {
            return this.maxIdleTimeInMinutes;
        }

    }

    public static class ListInstancesResponseBodyInstancesInstanceShutdownTimer extends TeaModel {
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

    public static class ListInstancesResponseBodyInstancesInstanceSnapshotList extends TeaModel {
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

        @NameInMap("ReasonCode")
        public String reasonCode;

        @NameInMap("ReasonMessage")
        public String reasonMessage;

        @NameInMap("RepositoryUrl")
        public String repositoryUrl;

        @NameInMap("Status")
        public String status;

        public static ListInstancesResponseBodyInstancesInstanceSnapshotList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesInstanceSnapshotList self = new ListInstancesResponseBodyInstancesInstanceSnapshotList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesInstanceSnapshotList setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstancesResponseBodyInstancesInstanceSnapshotList setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstancesResponseBodyInstancesInstanceSnapshotList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListInstancesResponseBodyInstancesInstanceSnapshotList setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListInstancesResponseBodyInstancesInstanceSnapshotList setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListInstancesResponseBodyInstancesInstanceSnapshotList setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public ListInstancesResponseBodyInstancesInstanceSnapshotList setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public ListInstancesResponseBodyInstancesInstanceSnapshotList setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        public ListInstancesResponseBodyInstancesInstanceSnapshotList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListInstancesResponseBodyInstancesLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListInstancesResponseBodyInstancesLabels build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesLabels self = new ListInstancesResponseBodyInstancesLabels();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseBodyInstancesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseBodyInstancesLatestSnapshot extends TeaModel {
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

        @NameInMap("ReasonCode")
        public String reasonCode;

        @NameInMap("ReasonMessage")
        public String reasonMessage;

        @NameInMap("RepositoryUrl")
        public String repositoryUrl;

        @NameInMap("Status")
        public String status;

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

        public ListInstancesResponseBodyInstancesLatestSnapshot setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public ListInstancesResponseBodyInstancesLatestSnapshot setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public ListInstancesResponseBodyInstancesLatestSnapshot setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        public ListInstancesResponseBodyInstancesLatestSnapshot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListInstancesResponseBodyInstancesRequestedResource extends TeaModel {
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

        public static ListInstancesResponseBodyInstancesRequestedResource build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesRequestedResource self = new ListInstancesResponseBodyInstancesRequestedResource();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesRequestedResource setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public ListInstancesResponseBodyInstancesRequestedResource setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public String getGPU() {
            return this.GPU;
        }

        public ListInstancesResponseBodyInstancesRequestedResource setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public ListInstancesResponseBodyInstancesRequestedResource setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public ListInstancesResponseBodyInstancesRequestedResource setSharedMemory(String sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public String getSharedMemory() {
            return this.sharedMemory;
        }

    }

    public static class ListInstancesResponseBodyInstancesUserVpc extends TeaModel {
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        @NameInMap("ForwardInfos")
        public java.util.List<ForwardInfoResponse> forwardInfos;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListInstancesResponseBodyInstancesUserVpc build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesUserVpc self = new ListInstancesResponseBodyInstancesUserVpc();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesUserVpc setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        public ListInstancesResponseBodyInstancesUserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
        }

        public ListInstancesResponseBodyInstancesUserVpc setForwardInfos(java.util.List<ForwardInfoResponse> forwardInfos) {
            this.forwardInfos = forwardInfos;
            return this;
        }
        public java.util.List<ForwardInfoResponse> getForwardInfos() {
            return this.forwardInfos;
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
        @NameInMap("AcceleratorType")
        public String acceleratorType;

        @NameInMap("Accessibility")
        public String accessibility;

        @NameInMap("AccumulatedRunningTimeInMs")
        public Long accumulatedRunningTimeInMs;

        @NameInMap("CloudDisks")
        public java.util.List<ListInstancesResponseBodyInstancesCloudDisks> cloudDisks;

        @NameInMap("Datasets")
        public java.util.List<ListInstancesResponseBodyInstancesDatasets> datasets;

        @NameInMap("Driver")
        public String driver;

        @NameInMap("EcsSpec")
        public String ecsSpec;

        @NameInMap("EnvironmentVariables")
        public java.util.Map<String, String> environmentVariables;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("IdleInstanceCuller")
        public ListInstancesResponseBodyInstancesIdleInstanceCuller idleInstanceCuller;

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
        public ListInstancesResponseBodyInstancesInstanceShutdownTimer instanceShutdownTimer;

        @NameInMap("InstanceSnapshotList")
        public java.util.List<ListInstancesResponseBodyInstancesInstanceSnapshotList> instanceSnapshotList;

        @NameInMap("InstanceUrl")
        public String instanceUrl;

        /**
         * <p>Jupyterlab Url。</p>
         */
        @NameInMap("JupyterlabUrl")
        public String jupyterlabUrl;

        @NameInMap("Labels")
        public java.util.List<ListInstancesResponseBodyInstancesLabels> labels;

        @NameInMap("LatestSnapshot")
        public ListInstancesResponseBodyInstancesLatestSnapshot latestSnapshot;

        @NameInMap("PaymentType")
        public String paymentType;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("ReasonCode")
        public String reasonCode;

        @NameInMap("ReasonMessage")
        public String reasonMessage;

        @NameInMap("RequestedResource")
        public ListInstancesResponseBodyInstancesRequestedResource requestedResource;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TerminalUrl")
        public String terminalUrl;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserVpc")
        public ListInstancesResponseBodyInstancesUserVpc userVpc;

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

        public ListInstancesResponseBodyInstances setCloudDisks(java.util.List<ListInstancesResponseBodyInstancesCloudDisks> cloudDisks) {
            this.cloudDisks = cloudDisks;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesCloudDisks> getCloudDisks() {
            return this.cloudDisks;
        }

        public ListInstancesResponseBodyInstances setDatasets(java.util.List<ListInstancesResponseBodyInstancesDatasets> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesDatasets> getDatasets() {
            return this.datasets;
        }

        public ListInstancesResponseBodyInstances setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
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

        public ListInstancesResponseBodyInstances setIdleInstanceCuller(ListInstancesResponseBodyInstancesIdleInstanceCuller idleInstanceCuller) {
            this.idleInstanceCuller = idleInstanceCuller;
            return this;
        }
        public ListInstancesResponseBodyInstancesIdleInstanceCuller getIdleInstanceCuller() {
            return this.idleInstanceCuller;
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

        public ListInstancesResponseBodyInstances setInstanceSnapshotList(java.util.List<ListInstancesResponseBodyInstancesInstanceSnapshotList> instanceSnapshotList) {
            this.instanceSnapshotList = instanceSnapshotList;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesInstanceSnapshotList> getInstanceSnapshotList() {
            return this.instanceSnapshotList;
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

        public ListInstancesResponseBodyInstances setLabels(java.util.List<ListInstancesResponseBodyInstancesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesLabels> getLabels() {
            return this.labels;
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

        public ListInstancesResponseBodyInstances setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
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

        public ListInstancesResponseBodyInstances setRequestedResource(ListInstancesResponseBodyInstancesRequestedResource requestedResource) {
            this.requestedResource = requestedResource;
            return this;
        }
        public ListInstancesResponseBodyInstancesRequestedResource getRequestedResource() {
            return this.requestedResource;
        }

        public ListInstancesResponseBodyInstances setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListInstancesResponseBodyInstances setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
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

        public ListInstancesResponseBodyInstances setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
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

        public ListInstancesResponseBodyInstances setWorkspaceSource(String workspaceSource) {
            this.workspaceSource = workspaceSource;
            return this;
        }
        public String getWorkspaceSource() {
            return this.workspaceSource;
        }

    }

}
