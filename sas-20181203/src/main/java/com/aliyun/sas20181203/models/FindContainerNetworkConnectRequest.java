// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FindContainerNetworkConnectRequest extends TeaModel {
    /**
     * <p>The type of the information that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>EDGE</strong>: connection information</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EDGE</p>
     */
    @NameInMap("CriteriaType")
    public String criteriaType;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The information about the destination node.</p>
     */
    @NameInMap("DstNode")
    public FindContainerNetworkConnectRequestDstNode dstNode;

    /**
     * <p>The end time of the network connection.</p>
     * 
     * <strong>example:</strong>
     * <p>1649260799999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p>We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The information about the source node.</p>
     */
    @NameInMap("SrcNode")
    public FindContainerNetworkConnectRequestSrcNode srcNode;

    /**
     * <p>The start time of the network connection.</p>
     * 
     * <strong>example:</strong>
     * <p>1666886400000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static FindContainerNetworkConnectRequest build(java.util.Map<String, ?> map) throws Exception {
        FindContainerNetworkConnectRequest self = new FindContainerNetworkConnectRequest();
        return TeaModel.build(map, self);
    }

    public FindContainerNetworkConnectRequest setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
        return this;
    }
    public String getCriteriaType() {
        return this.criteriaType;
    }

    public FindContainerNetworkConnectRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public FindContainerNetworkConnectRequest setDstNode(FindContainerNetworkConnectRequestDstNode dstNode) {
        this.dstNode = dstNode;
        return this;
    }
    public FindContainerNetworkConnectRequestDstNode getDstNode() {
        return this.dstNode;
    }

    public FindContainerNetworkConnectRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public FindContainerNetworkConnectRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public FindContainerNetworkConnectRequest setSrcNode(FindContainerNetworkConnectRequestSrcNode srcNode) {
        this.srcNode = srcNode;
        return this;
    }
    public FindContainerNetworkConnectRequestSrcNode getSrcNode() {
        return this.srcNode;
    }

    public FindContainerNetworkConnectRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class FindContainerNetworkConnectRequestDstNode extends TeaModel {
        /**
         * <p>The name of the container application.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx-ingress-controller</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the container cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>f5x833820xx</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The namespace of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The node IDs.</p>
         */
        @NameInMap("NodeIds")
        public java.util.List<String> nodeIds;

        /**
         * <p>The type of the node. Valid values:</p>
         * <ul>
         * <li><strong>app</strong>: application, which indicates that the node type is application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The name of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-deployment-yacs-31144-39265-1384966-7f8c8cd578-h6mhb</p>
         */
        @NameInMap("PodName")
        public String podName;

        public static FindContainerNetworkConnectRequestDstNode build(java.util.Map<String, ?> map) throws Exception {
            FindContainerNetworkConnectRequestDstNode self = new FindContainerNetworkConnectRequestDstNode();
            return TeaModel.build(map, self);
        }

        public FindContainerNetworkConnectRequestDstNode setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public FindContainerNetworkConnectRequestDstNode setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public FindContainerNetworkConnectRequestDstNode setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public FindContainerNetworkConnectRequestDstNode setNodeIds(java.util.List<String> nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }
        public java.util.List<String> getNodeIds() {
            return this.nodeIds;
        }

        public FindContainerNetworkConnectRequestDstNode setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public FindContainerNetworkConnectRequestDstNode setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

    }

    public static class FindContainerNetworkConnectRequestSrcNode extends TeaModel {
        /**
         * <p>The name of the container application.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prometheus-ack-arms-prometheus</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the container cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c56xxx1775dea0</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The namespace of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The node IDs.</p>
         */
        @NameInMap("NodeIds")
        public java.util.List<String> nodeIds;

        /**
         * <p>The type of the node. Valid values:</p>
         * <ul>
         * <li><strong>app</strong>: application, which indicates that the node type is application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The name of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-deployment-yacs-31144-39265-1384966-7f8c8cd578-h6mhb</p>
         */
        @NameInMap("PodName")
        public String podName;

        public static FindContainerNetworkConnectRequestSrcNode build(java.util.Map<String, ?> map) throws Exception {
            FindContainerNetworkConnectRequestSrcNode self = new FindContainerNetworkConnectRequestSrcNode();
            return TeaModel.build(map, self);
        }

        public FindContainerNetworkConnectRequestSrcNode setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public FindContainerNetworkConnectRequestSrcNode setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public FindContainerNetworkConnectRequestSrcNode setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public FindContainerNetworkConnectRequestSrcNode setNodeIds(java.util.List<String> nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }
        public java.util.List<String> getNodeIds() {
            return this.nodeIds;
        }

        public FindContainerNetworkConnectRequestSrcNode setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public FindContainerNetworkConnectRequestSrcNode setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

    }

}
