// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationInstancesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: indicates that the request was successful.</li>
     * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
     * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
     * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the application instances.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationInstancesResponseBodyData data;

    /**
     * <p>The error code. </p>
     * <ul>
     * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
     * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the list of application instances was obtained. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: indicates that the list was obtained.</li>
     * <li><strong>false</strong>: indicates that the list could not be obtained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
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

    public static class DescribeApplicationInstancesResponseBodyDataInstances extends TeaModel {
        /**
         * <p>The start time of the instance creation process. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1558442609000</p>
         */
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

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
         * <p>The end time of the instance creation process. Unit: milliseconds.</p>
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
         * <p>The address of the repository.</p>
         * <blockquote>
         * <p> If you deploy the application by using a JAR or WAR package, the image generated by SAE is not available for download.</p>
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
         * <p>The number of times that the instance restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InstanceContainerRestarts")
        public Long instanceContainerRestarts;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Error</strong>: An error occurred during the instance startup.</li>
         * <li><strong>CrashLoopBackOff</strong>: The container failed to start. An error occurred during the startup process and persisted after the restart.</li>
         * <li><strong>ErrImagePull</strong>: An error occurred while the container image was being pulled from the instance.</li>
         * <li><strong>ImagePullBackOff</strong>: The container image could not be obtained.</li>
         * <li><strong>Pending</strong>: The instance is waiting to be scheduled.</li>
         * <li><strong>Unknown</strong>: An unknown exception occurred.</li>
         * <li><strong>Terminating</strong>: The instance creation process is being terminated.</li>
         * <li><strong>NotFound</strong>: The instance cannot be found.</li>
         * <li><strong>PodInitializing</strong>: The instance is being initialized.</li>
         * <li><strong>Init:0/1</strong>: The instance is initialized.</li>
         * <li><strong>Running</strong>: The instance is running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("InstanceContainerStatus")
        public String instanceContainerStatus;

        /**
         * <p>The configurations of health checks. Valid values:</p>
         * <ul>
         * <li><strong>WithoutHealthCheckConfig</strong>: Liveness and readiness checks are not configured.</li>
         * <li><strong>WithoutLivenessConfig</strong>: The liveness check is not configured.</li>
         * <li><strong>WithoutReadinessConfig</strong>: The readiness check is not configured.</li>
         * <li><strong>NotCheckedYet</strong>: The health checks are not performed or are in progress.</li>
         * <li><strong>LivenessUnhealthy</strong>: The instance failed the liveness check.</li>
         * <li><strong>ReadinessUnhealthy</strong>: The instance failed the readiness check.</li>
         * <li><strong>Unhealthy</strong>: The instance failed both liveness and readiness checks.</li>
         * <li><strong>Healthy</strong>: The instance passed both liveness and readiness checks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WithoutHealthCheckConfig</p>
         */
        @NameInMap("InstanceHealthStatus")
        public String instanceHealthStatus;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>b2a8a925-477a-4ed7-b825-d5e22500****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The version of the package.</p>
         * 
         * <strong>example:</strong>
         * <p>1609939496200</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        /**
         * <p>The ID of the zone where the instance is deployed.</p>
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

        public DescribeApplicationInstancesResponseBodyDataInstances setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
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
         * <p>The number of the returned page.</p>
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
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned instances.</p>
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
