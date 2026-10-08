// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCClusterNodesResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<DescribeRCClusterNodesResponseBodyNodes> nodes;

    @NameInMap("Page")
    public DescribeRCClusterNodesResponseBodyPage page;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCClusterNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCClusterNodesResponseBody self = new DescribeRCClusterNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCClusterNodesResponseBody setNodes(java.util.List<DescribeRCClusterNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeRCClusterNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeRCClusterNodesResponseBody setPage(DescribeRCClusterNodesResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribeRCClusterNodesResponseBodyPage getPage() {
        return this.page;
    }

    public DescribeRCClusterNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRCClusterNodesResponseBodyNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-01-06T22:22:16.00+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DockerVersion")
        public String dockerVersion;

        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>vn-uoeaq5a51g0vk473****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceRole")
        public String instanceRole;

        @NameInMap("IpAddresses")
        public java.util.List<String> ipAddresses;

        @NameInMap("IsAliyunNode")
        public Boolean isAliyunNode;

        /**
         * <strong>example:</strong>
         * <p>vn-uoeaq5a51g0vk473****</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>rcnpf5e3ee4a65104cf0801f94850d37****</p>
         */
        @NameInMap("NodePoolId")
        public String nodePoolId;

        @NameInMap("NodeStatus")
        public String nodeStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PodCount")
        public Long podCount;

        @NameInMap("RuntimeVersion")
        public String runtimeVersion;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeRCClusterNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCClusterNodesResponseBodyNodes self = new DescribeRCClusterNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeRCClusterNodesResponseBodyNodes setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRCClusterNodesResponseBodyNodes setDockerVersion(String dockerVersion) {
            this.dockerVersion = dockerVersion;
            return this;
        }
        public String getDockerVersion() {
            return this.dockerVersion;
        }

        public DescribeRCClusterNodesResponseBodyNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeRCClusterNodesResponseBodyNodes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRCClusterNodesResponseBodyNodes setInstanceRole(String instanceRole) {
            this.instanceRole = instanceRole;
            return this;
        }
        public String getInstanceRole() {
            return this.instanceRole;
        }

        public DescribeRCClusterNodesResponseBodyNodes setIpAddresses(java.util.List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public java.util.List<String> getIpAddresses() {
            return this.ipAddresses;
        }

        public DescribeRCClusterNodesResponseBodyNodes setIsAliyunNode(Boolean isAliyunNode) {
            this.isAliyunNode = isAliyunNode;
            return this;
        }
        public Boolean getIsAliyunNode() {
            return this.isAliyunNode;
        }

        public DescribeRCClusterNodesResponseBodyNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeRCClusterNodesResponseBodyNodes setNodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        public DescribeRCClusterNodesResponseBodyNodes setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public DescribeRCClusterNodesResponseBodyNodes setPodCount(Long podCount) {
            this.podCount = podCount;
            return this;
        }
        public Long getPodCount() {
            return this.podCount;
        }

        public DescribeRCClusterNodesResponseBodyNodes setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public DescribeRCClusterNodesResponseBodyNodes setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeRCClusterNodesResponseBodyPage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeRCClusterNodesResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCClusterNodesResponseBodyPage self = new DescribeRCClusterNodesResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribeRCClusterNodesResponseBodyPage setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeRCClusterNodesResponseBodyPage setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeRCClusterNodesResponseBodyPage setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
