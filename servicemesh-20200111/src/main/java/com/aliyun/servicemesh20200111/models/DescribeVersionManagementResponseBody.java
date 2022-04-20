// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeVersionManagementResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VersionDetails")
    public java.util.List<DescribeVersionManagementResponseBodyVersionDetails> versionDetails;

    public static DescribeVersionManagementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionManagementResponseBody self = new DescribeVersionManagementResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVersionManagementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVersionManagementResponseBody setVersionDetails(java.util.List<DescribeVersionManagementResponseBodyVersionDetails> versionDetails) {
        this.versionDetails = versionDetails;
        return this;
    }
    public java.util.List<DescribeVersionManagementResponseBodyVersionDetails> getVersionDetails() {
        return this.versionDetails;
    }

    public static class DescribeVersionManagementResponseBodyVersionDetailsPodInstances extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NodeIp")
        public String nodeIp;

        @NameInMap("PodIP")
        public String podIP;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("RestartTime")
        public Integer restartTime;

        @NameInMap("Status")
        public String status;

        public static DescribeVersionManagementResponseBodyVersionDetailsPodInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeVersionManagementResponseBodyVersionDetailsPodInstances self = new DescribeVersionManagementResponseBodyVersionDetailsPodInstances();
            return TeaModel.build(map, self);
        }

        public DescribeVersionManagementResponseBodyVersionDetailsPodInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeVersionManagementResponseBodyVersionDetailsPodInstances setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeVersionManagementResponseBodyVersionDetailsPodInstances setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public DescribeVersionManagementResponseBodyVersionDetailsPodInstances setPodIP(String podIP) {
            this.podIP = podIP;
            return this;
        }
        public String getPodIP() {
            return this.podIP;
        }

        public DescribeVersionManagementResponseBodyVersionDetailsPodInstances setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public DescribeVersionManagementResponseBodyVersionDetailsPodInstances setRestartTime(Integer restartTime) {
            this.restartTime = restartTime;
            return this;
        }
        public Integer getRestartTime() {
            return this.restartTime;
        }

        public DescribeVersionManagementResponseBodyVersionDetailsPodInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeVersionManagementResponseBodyVersionDetailsResource extends TeaModel {
        @NameInMap("CPULimit")
        public String CPULimit;

        @NameInMap("CPURequest")
        public String CPURequest;

        @NameInMap("MemoryLimit")
        public String memoryLimit;

        @NameInMap("MemoryRequest")
        public String memoryRequest;

        public static DescribeVersionManagementResponseBodyVersionDetailsResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeVersionManagementResponseBodyVersionDetailsResource self = new DescribeVersionManagementResponseBodyVersionDetailsResource();
            return TeaModel.build(map, self);
        }

        public DescribeVersionManagementResponseBodyVersionDetailsResource setCPULimit(String CPULimit) {
            this.CPULimit = CPULimit;
            return this;
        }
        public String getCPULimit() {
            return this.CPULimit;
        }

        public DescribeVersionManagementResponseBodyVersionDetailsResource setCPURequest(String CPURequest) {
            this.CPURequest = CPURequest;
            return this;
        }
        public String getCPURequest() {
            return this.CPURequest;
        }

        public DescribeVersionManagementResponseBodyVersionDetailsResource setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public DescribeVersionManagementResponseBodyVersionDetailsResource setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

    }

    public static class DescribeVersionManagementResponseBodyVersionDetails extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeploymentName")
        public String deploymentName;

        @NameInMap("Images")
        public java.util.List<String> images;

        @NameInMap("Inject")
        public Boolean inject;

        @NameInMap("PodInstances")
        public java.util.List<DescribeVersionManagementResponseBodyVersionDetailsPodInstances> podInstances;

        @NameInMap("ReadyReplicas")
        public Integer readyReplicas;

        @NameInMap("Replicas")
        public Integer replicas;

        @NameInMap("Resource")
        public DescribeVersionManagementResponseBodyVersionDetailsResource resource;

        @NameInMap("Version")
        public String version;

        public static DescribeVersionManagementResponseBodyVersionDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeVersionManagementResponseBodyVersionDetails self = new DescribeVersionManagementResponseBodyVersionDetails();
            return TeaModel.build(map, self);
        }

        public DescribeVersionManagementResponseBodyVersionDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeVersionManagementResponseBodyVersionDetails setDeploymentName(String deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }
        public String getDeploymentName() {
            return this.deploymentName;
        }

        public DescribeVersionManagementResponseBodyVersionDetails setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public DescribeVersionManagementResponseBodyVersionDetails setInject(Boolean inject) {
            this.inject = inject;
            return this;
        }
        public Boolean getInject() {
            return this.inject;
        }

        public DescribeVersionManagementResponseBodyVersionDetails setPodInstances(java.util.List<DescribeVersionManagementResponseBodyVersionDetailsPodInstances> podInstances) {
            this.podInstances = podInstances;
            return this;
        }
        public java.util.List<DescribeVersionManagementResponseBodyVersionDetailsPodInstances> getPodInstances() {
            return this.podInstances;
        }

        public DescribeVersionManagementResponseBodyVersionDetails setReadyReplicas(Integer readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }
        public Integer getReadyReplicas() {
            return this.readyReplicas;
        }

        public DescribeVersionManagementResponseBodyVersionDetails setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

        public DescribeVersionManagementResponseBodyVersionDetails setResource(DescribeVersionManagementResponseBodyVersionDetailsResource resource) {
            this.resource = resource;
            return this;
        }
        public DescribeVersionManagementResponseBodyVersionDetailsResource getResource() {
            return this.resource;
        }

        public DescribeVersionManagementResponseBodyVersionDetails setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
