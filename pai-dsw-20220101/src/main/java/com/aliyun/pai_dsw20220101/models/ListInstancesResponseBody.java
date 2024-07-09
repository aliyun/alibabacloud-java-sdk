// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    /**
     * <strong>example:</strong>
     * <p>&quot;XXX&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>35</p>
     */
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

    public static class ListInstancesResponseBodyInstancesAffinityCPU extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        public static ListInstancesResponseBodyInstancesAffinityCPU build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesAffinityCPU self = new ListInstancesResponseBodyInstancesAffinityCPU();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesAffinityCPU setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class ListInstancesResponseBodyInstancesAffinity extends TeaModel {
        @NameInMap("CPU")
        public ListInstancesResponseBodyInstancesAffinityCPU CPU;

        public static ListInstancesResponseBodyInstancesAffinity build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesAffinity self = new ListInstancesResponseBodyInstancesAffinity();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesAffinity setCPU(ListInstancesResponseBodyInstancesAffinityCPU CPU) {
            this.CPU = CPU;
            return this;
        }
        public ListInstancesResponseBodyInstancesAffinityCPU getCPU() {
            return this.CPU;
        }

    }

    public static class ListInstancesResponseBodyInstancesCloudDisks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30Gi</p>
         */
        @NameInMap("Capacity")
        public String capacity;

        /**
         * <strong>example:</strong>
         * <p>/mmt/workspace</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <strong>example:</strong>
         * <p>/workspace</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>rootfs</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>d-vsqjvsjp4orp5l206u</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CpuPercentThreshold")
        public Integer cpuPercentThreshold;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("GpuPercentThreshold")
        public Integer gpuPercentThreshold;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("IdleTimeInMinutes")
        public Integer idleTimeInMinutes;

        /**
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("DueTime")
        public String dueTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>3600000</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>image-05cefd0be2exxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>py36_cpu_tf1.12_ubuntu</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <strong>example:</strong>
         * <p>Internal Error</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <strong>example:</strong>
         * <p>ImagePullBackOff</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <strong>example:</strong>
         * <p><a href="https://cr.console.aliyun.com/repository/cn-hangzhou/zouxu/kf/images">https://cr.console.aliyun.com/repository/cn-hangzhou/zouxu/kf/images</a></p>
         */
        @NameInMap("RepositoryUrl")
        public String repositoryUrl;

        /**
         * <strong>example:</strong>
         * <p>Pushing</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>stsTokenOwner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>123xxxxxxxx</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>image-05cefd0be2exxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>py36_cpu_tf1.12_ubuntu</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <strong>example:</strong>
         * <p>Internal Error</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <strong>example:</strong>
         * <p>ImagePullBackOff</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <strong>example:</strong>
         * <p><a href="https://cr.console.aliyun.com/repository/cn-hangzhou/zouxu/kf/images">https://cr.console.aliyun.com/repository/cn-hangzhou/zouxu/kf/images</a></p>
         */
        @NameInMap("RepositoryUrl")
        public String repositoryUrl;

        /**
         * <strong>example:</strong>
         * <p>Pushing</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("GPU")
        public String GPU;

        /**
         * <strong>example:</strong>
         * <p>v100</p>
         */
        @NameInMap("GPUType")
        public String GPUType;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>eth0 | eth1</p>
         */
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        /**
         * <strong>example:</strong>
         * <p>[&quot;192.168.0.1/24&quot;, &quot;192.168.1.1/24&quot;]</p>
         */
        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        @NameInMap("ForwardInfos")
        public java.util.List<ForwardInfoResponse> forwardInfos;

        /**
         * <strong>example:</strong>
         * <p>sg-xxxxxx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>vsw-xxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-xxxxx</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("AcceleratorType")
        public String acceleratorType;

        /**
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Accessibility")
        public String accessibility;

        /**
         * <strong>example:</strong>
         * <p>3600000</p>
         */
        @NameInMap("AccumulatedRunningTimeInMs")
        public Long accumulatedRunningTimeInMs;

        @NameInMap("Affinity")
        public ListInstancesResponseBodyInstancesAffinity affinity;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("CloudDisks")
        public java.util.List<ListInstancesResponseBodyInstancesCloudDisks> cloudDisks;

        @NameInMap("Datasets")
        public java.util.List<ListInstancesResponseBodyInstancesDatasets> datasets;

        /**
         * <strong>example:</strong>
         * <p>535.54.03</p>
         */
        @NameInMap("Driver")
        public String driver;

        /**
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("EcsSpec")
        public String ecsSpec;

        /**
         * <strong>example:</strong>
         * <p>{userName: &quot;Chris&quot;}</p>
         */
        @NameInMap("EnvironmentVariables")
        public java.util.Map<String, String> environmentVariables;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>{&quot;InstanceId&quot;:&quot;dsw-05cefd0be2e5a278&quot;,&quot;CpuPercentThreshold&quot;:20,&quot;GpuPercentThreshold&quot;:10,&quot;MaxIdleTimeInMinutes&quot;:120,&quot;IdleTimeInMinutes&quot;:30}</p>
         */
        @NameInMap("IdleInstanceCuller")
        public ListInstancesResponseBodyInstancesIdleInstanceCuller idleInstanceCuller;

        @NameInMap("ImageAuth")
        public String imageAuth;

        /**
         * <strong>example:</strong>
         * <p>image-05cefd0be2exxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>py36_cpu_tf1.12_ubuntu</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>training_data</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceShutdownTimer")
        public ListInstancesResponseBodyInstancesInstanceShutdownTimer instanceShutdownTimer;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("InstanceSnapshotList")
        public java.util.List<ListInstancesResponseBodyInstancesInstanceSnapshotList> instanceSnapshotList;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dsw-cn-shanghai.data.aliyun.com/notebook.htm?instance=39772#/">https://dsw-cn-shanghai.data.aliyun.com/notebook.htm?instance=39772#/</a></p>
         */
        @NameInMap("InstanceUrl")
        public String instanceUrl;

        /**
         * <p>Jupyterlab Url。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/lab/">https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/lab/</a></p>
         */
        @NameInMap("JupyterlabUrl")
        public String jupyterlabUrl;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;foo\&quot;: \&quot;bar\&quot;}</p>
         */
        @NameInMap("Labels")
        public java.util.List<ListInstancesResponseBodyInstancesLabels> labels;

        @NameInMap("LatestSnapshot")
        public ListInstancesResponseBodyInstancesLatestSnapshot latestSnapshot;

        /**
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <strong>example:</strong>
         * <p>Internal Error</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <strong>example:</strong>
         * <p>ImagePullBackOff</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <strong>example:</strong>
         * <p>{&quot;CPU&quot;:&quot;4&quot;,&quot;Memory&quot;:&quot;8Gi&quot;,&quot;SharedMemory&quot;:&quot;4Gi&quot;,&quot;GPU&quot;:&quot;1&quot;,&quot;GPUType&quot;:&quot;Tesla-V100-16G&quot;}</p>
         */
        @NameInMap("RequestedResource")
        public ListInstancesResponseBodyInstancesRequestedResource requestedResource;

        /**
         * <strong>example:</strong>
         * <p>dsw-123456789</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>resource_group</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/tty/">https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/tty/</a></p>
         */
        @NameInMap("TerminalUrl")
        public String terminalUrl;

        /**
         * <strong>example:</strong>
         * <p>1612285282502324</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>测试用户</p>
         */
        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserVpc")
        public ListInstancesResponseBodyInstancesUserVpc userVpc;

        /**
         * <p>Web IDE url。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/ide/">https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/ide/</a></p>
         */
        @NameInMap("WebIDEUrl")
        public String webIDEUrl;

        /**
         * <strong>example:</strong>
         * <p>40823</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <strong>example:</strong>
         * <p>training_data</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        /**
         * <strong>example:</strong>
         * <p>d-123456789</p>
         */
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

        public ListInstancesResponseBodyInstances setAffinity(ListInstancesResponseBodyInstancesAffinity affinity) {
            this.affinity = affinity;
            return this;
        }
        public ListInstancesResponseBodyInstancesAffinity getAffinity() {
            return this.affinity;
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

        public ListInstancesResponseBodyInstances setImageAuth(String imageAuth) {
            this.imageAuth = imageAuth;
            return this;
        }
        public String getImageAuth() {
            return this.imageAuth;
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
