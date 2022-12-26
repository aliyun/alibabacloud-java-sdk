// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FindContainerNetworkConnectRequest extends TeaModel {
    @NameInMap("CriteriaType")
    public String criteriaType;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DstNode")
    public FindContainerNetworkConnectRequestDstNode dstNode;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SrcNode")
    public FindContainerNetworkConnectRequestSrcNode srcNode;

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
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NodeIds")
        public java.util.List<String> nodeIds;

        @NameInMap("NodeType")
        public String nodeType;

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
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NodeIds")
        public java.util.List<String> nodeIds;

        @NameInMap("NodeType")
        public String nodeType;

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
