// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationInstancesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A client error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the application instances.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationInstancesResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li><p>This parameter is not returned for successful requests.</p>
     * </li>
     * <li><p>This parameter is returned for failed requests. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query request details.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeApplicationInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationInstancesResponseBody self = new DescribeApplicationInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationInstancesResponseBody setData(DescribeApplicationInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationInstancesResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApplicationInstancesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationInstancesResponseBodyDataInstancesSidecarContainersStatus extends TeaModel {
        /**
         * <p>The ID of the sidecar container.</p>
         * 
         * <strong>example:</strong>
         * <p>sidecar-test-01</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The status of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("ContainerStatus")
        public String containerStatus;

        /**
         * <p>The URL of the container image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-beijing.aliyuncs.com/sae-dev-test/******</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        public static DescribeApplicationInstancesResponseBodyDataInstancesSidecarContainersStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationInstancesResponseBodyDataInstancesSidecarContainersStatus self = new DescribeApplicationInstancesResponseBodyDataInstancesSidecarContainersStatus();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationInstancesResponseBodyDataInstancesSidecarContainersStatus setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeApplicationInstancesResponseBodyDataInstancesSidecarContainersStatus setContainerStatus(String containerStatus) {
            this.containerStatus = containerStatus;
            return this;
        }
        public String getContainerStatus() {
            return this.containerStatus;
        }

        public DescribeApplicationInstancesResponseBodyDataInstancesSidecarContainersStatus setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

    public static class DescribeApplicationInstancesResponseBodyDataInstancesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeApplicationInstancesResponseBodyDataInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationInstancesResponseBodyDataInstancesTags self = new DescribeApplicationInstancesResponseBodyDataInstancesTags();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationInstancesResponseBodyDataInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApplicationInstancesResponseBodyDataInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApplicationInstancesResponseBodyDataInstances extends TeaModel {
        /**
         * <p>The time when instance creation began. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1558442609000</p>
         */
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        /**
         * <p>Whether the instance is being debugged. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The instance is being debugged.</p>
         * </li>
         * <li><p><strong>false</strong>: The instance is not being debugged.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("DebugStatus")
        public Boolean debugStatus;

        /**
         * <p>The elastic IP address (EIP).</p>
         * 
         * <strong>example:</strong>
         * <p>8.129.XX.XXX</p>
         */
        @NameInMap("Eip")
        public String eip;

        /**
         * <p>The time when instance creation was completed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642757283000</p>
         */
        @NameInMap("FinishTimeStamp")
        public Long finishTimeStamp;

        /**
         * <p>The ID of the group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>b2a8a925-477a-4ed7-b825-d5e22500****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The URL of the container image.</p>
         * <blockquote>
         * <p>If you deploy an application using a JAR or WAR package, the container image generated by SAE is not available for download.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-beijing.aliyuncs.com/sae-demo-image/cartservice:1.0</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The internal IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.X.X</p>
         */
        @NameInMap("InstanceContainerIp")
        public String instanceContainerIp;

        /**
         * <p>The number of times the instance\&quot;s container has restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InstanceContainerRestarts")
        public Long instanceContainerRestarts;

        /**
         * <p>The status of the instance container. Valid values:</p>
         * <ul>
         * <li><p><strong>Error</strong>: An error occurred during instance startup.</p>
         * </li>
         * <li><p><strong>CrashLoopBackOff</strong>: The container failed to start, encountered an error during startup, and then failed again after a restart.</p>
         * </li>
         * <li><p><strong>ErrImagePull</strong>: Failed to pull the instance\&quot;s container image.</p>
         * </li>
         * <li><p><strong>ImagePullBackOff</strong>: The container image could not be pulled.</p>
         * </li>
         * <li><p><strong>Pending</strong>: The instance is waiting to be scheduled.</p>
         * </li>
         * <li><p><strong>Unknown</strong>: An unknown exception occurred.</p>
         * </li>
         * <li><p><strong>Terminating</strong>: The instance is being stopped.</p>
         * </li>
         * <li><p><strong>NotFound</strong>: The instance cannot be found.</p>
         * </li>
         * <li><p><strong>PodInitializing</strong>: The instance is being initialized.</p>
         * </li>
         * <li><p><strong>Init:0/1</strong>: The instance is being initialized.</p>
         * </li>
         * <li><p><strong>Running</strong>: The instance is running.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("InstanceContainerStatus")
        public String instanceContainerStatus;

        /**
         * <p>The health check status of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>WithoutHealthCheckConfig</strong>: liveness and readiness health checks are not configured.</p>
         * </li>
         * <li><p><strong>WithoutLivenessConfig</strong>: The liveness health check is not configured.</p>
         * </li>
         * <li><p><strong>WithoutReadinessConfig</strong>: The readiness health check is not configured.</p>
         * </li>
         * <li><p><strong>NotCheckedYet</strong>: The instance is undergoing or waiting for a health check.</p>
         * </li>
         * <li><p><strong>LivenessUnhealthy</strong>: The liveness health check failed. The instance is unhealthy.</p>
         * </li>
         * <li><p><strong>ReadinessUnhealthy</strong>: The readiness health check failed. The instance is unhealthy.</p>
         * </li>
         * <li><p><strong>Unhealthy</strong>: Both the liveness and readiness health checks failed. The instance is unhealthy.</p>
         * </li>
         * <li><p><strong>Healthy</strong>: The health check passed. The instance is healthy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WithoutHealthCheckConfig</p>
         */
        @NameInMap("InstanceHealthStatus")
        public String instanceHealthStatus;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b2a8a925-477a-4ed7-b825-d5e22500****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the main container.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("MainContainerStatus")
        public String mainContainerStatus;

        /**
         * <p>The version of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>1609939496200</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        /**
         * <p>The status of the sidecar containers.</p>
         */
        @NameInMap("SidecarContainersStatus")
        public java.util.List<DescribeApplicationInstancesResponseBodyDataInstancesSidecarContainersStatus> sidecarContainersStatus;

        /**
         * <p>The tags attached to the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeApplicationInstancesResponseBodyDataInstancesTags> tags;

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1750061980000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The traffic status of the instance.</p>
         */
        @NameInMap("TrafficStatus")
        public String trafficStatus;

        /**
         * <p>The error message for a failed health check on the application instance. This field is empty if the check is successful.</p>
         */
        @NameInMap("UnhealthyMessage")
        public String unhealthyMessage;

        /**
         * <p>The ID of the vSwitch where the instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-***</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeApplicationInstancesResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationInstancesResponseBodyDataInstances self = new DescribeApplicationInstancesResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setDebugStatus(Boolean debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public Boolean getDebugStatus() {
            return this.debugStatus;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setFinishTimeStamp(Long finishTimeStamp) {
            this.finishTimeStamp = finishTimeStamp;
            return this;
        }
        public Long getFinishTimeStamp() {
            return this.finishTimeStamp;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceContainerIp(String instanceContainerIp) {
            this.instanceContainerIp = instanceContainerIp;
            return this;
        }
        public String getInstanceContainerIp() {
            return this.instanceContainerIp;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceContainerRestarts(Long instanceContainerRestarts) {
            this.instanceContainerRestarts = instanceContainerRestarts;
            return this;
        }
        public Long getInstanceContainerRestarts() {
            return this.instanceContainerRestarts;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceContainerStatus(String instanceContainerStatus) {
            this.instanceContainerStatus = instanceContainerStatus;
            return this;
        }
        public String getInstanceContainerStatus() {
            return this.instanceContainerStatus;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceHealthStatus(String instanceHealthStatus) {
            this.instanceHealthStatus = instanceHealthStatus;
            return this;
        }
        public String getInstanceHealthStatus() {
            return this.instanceHealthStatus;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setMainContainerStatus(String mainContainerStatus) {
            this.mainContainerStatus = mainContainerStatus;
            return this;
        }
        public String getMainContainerStatus() {
            return this.mainContainerStatus;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setSidecarContainersStatus(java.util.List<DescribeApplicationInstancesResponseBodyDataInstancesSidecarContainersStatus> sidecarContainersStatus) {
            this.sidecarContainersStatus = sidecarContainersStatus;
            return this;
        }
        public java.util.List<DescribeApplicationInstancesResponseBodyDataInstancesSidecarContainersStatus> getSidecarContainersStatus() {
            return this.sidecarContainersStatus;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setTags(java.util.List<DescribeApplicationInstancesResponseBodyDataInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeApplicationInstancesResponseBodyDataInstancesTags> getTags() {
            return this.tags;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setTrafficStatus(String trafficStatus) {
            this.trafficStatus = trafficStatus;
            return this;
        }
        public String getTrafficStatus() {
            return this.trafficStatus;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setUnhealthyMessage(String unhealthyMessage) {
            this.unhealthyMessage = unhealthyMessage;
            return this;
        }
        public String getUnhealthyMessage() {
            return this.unhealthyMessage;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeApplicationInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The list of application instances.</p>
         */
        @NameInMap("Instances")
        public java.util.List<DescribeApplicationInstancesResponseBodyDataInstances> instances;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static DescribeApplicationInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationInstancesResponseBodyData self = new DescribeApplicationInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationInstancesResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeApplicationInstancesResponseBodyData setInstances(java.util.List<DescribeApplicationInstancesResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<DescribeApplicationInstancesResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

        public DescribeApplicationInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeApplicationInstancesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
