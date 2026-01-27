// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCClusterNodesResponseBody extends TeaModel {
    /**
     * <p>The details of the nodes.</p>
     */
    @NameInMap("Nodes")
    public java.util.List<DescribeRCClusterNodesResponseBodyNodes> nodes;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("Page")
    public DescribeRCClusterNodesResponseBodyPage page;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16C62438-491B-5C02-9B49-BA924A1372A2</p>
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
         * <p>The time when the node was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-21T07:20:09Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The container version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("DockerVersion")
        public String dockerVersion;

        /**
         * <p>The image ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>m-2oqiu973jwcxe****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-u79597n5f54s5bnz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The node role. Valid values:</p>
         * <ul>
         * <li><strong>Master</strong>: master node</li>
         * <li><strong>Worker</strong>: worker node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Master</p>
         */
        @NameInMap("InstanceRole")
        public String instanceRole;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("IpAddresses")
        public java.util.List<String> ipAddresses;

        /**
         * <p>Indicates whether the node is provided by Alibaba Cloud. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAliyunNode")
        public Boolean isAliyunNode;

        /**
         * <p>The node name, which is the identifier of the RDS Custom node in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou.192.168.XXX.XXX</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("NodePoolId")
        public String nodePoolId;

        /**
         * <p>Indicates whether the node is ready. Valid values:</p>
         * <ul>
         * <li><strong>Ready</strong>: The node is ready.</li>
         * <li><strong>NotReady</strong>: The node is not ready.</li>
         * <li><strong>Unknown</strong>: The status of the node is unknown.</li>
         * <li><strong>Offline</strong>: The node is offline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("NodeStatus")
        public String nodeStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PodCount")
        public Long podCount;

        /**
         * <p>The runtime of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-21T07:20:09Z</p>
         */
        @NameInMap("RuntimeVersion")
        public String runtimeVersion;

        /**
         * <p>The node status. Valid values:</p>
         * <ul>
         * <li><strong>pending</strong></li>
         * <li><strong>running</strong></li>
         * <li><strong>starting</strong></li>
         * <li><strong>stopping</strong></li>
         * <li><strong>stopped</strong></li>
         * </ul>
         * 
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
