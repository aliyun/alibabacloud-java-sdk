// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAppNetworkResponseBody extends TeaModel {
    @NameInMap("AppNetwork")
    public GetAppNetworkResponseBodyAppNetwork appNetwork;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppNetworkResponseBody self = new GetAppNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppNetworkResponseBody setAppNetwork(GetAppNetworkResponseBodyAppNetwork appNetwork) {
        this.appNetwork = appNetwork;
        return this;
    }
    public GetAppNetworkResponseBodyAppNetwork getAppNetwork() {
        return this.appNetwork;
    }

    public GetAppNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppNetworkResponseBodyAppNetworkEdge extends TeaModel {
        @NameInMap("DstNodeId")
        public String dstNodeId;

        @NameInMap("DstNodeType")
        public String dstNodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("Port")
        public String port;

        @NameInMap("SrcNodeId")
        public String srcNodeId;

        @NameInMap("SrcNodeType")
        public String srcNodeType;

        public static GetAppNetworkResponseBodyAppNetworkEdge build(java.util.Map<String, ?> map) throws Exception {
            GetAppNetworkResponseBodyAppNetworkEdge self = new GetAppNetworkResponseBodyAppNetworkEdge();
            return TeaModel.build(map, self);
        }

        public GetAppNetworkResponseBodyAppNetworkEdge setDstNodeId(String dstNodeId) {
            this.dstNodeId = dstNodeId;
            return this;
        }
        public String getDstNodeId() {
            return this.dstNodeId;
        }

        public GetAppNetworkResponseBodyAppNetworkEdge setDstNodeType(String dstNodeType) {
            this.dstNodeType = dstNodeType;
            return this;
        }
        public String getDstNodeType() {
            return this.dstNodeType;
        }

        public GetAppNetworkResponseBodyAppNetworkEdge setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAppNetworkResponseBodyAppNetworkEdge setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetAppNetworkResponseBodyAppNetworkEdge setSrcNodeId(String srcNodeId) {
            this.srcNodeId = srcNodeId;
            return this;
        }
        public String getSrcNodeId() {
            return this.srcNodeId;
        }

        public GetAppNetworkResponseBodyAppNetworkEdge setSrcNodeType(String srcNodeType) {
            this.srcNodeType = srcNodeType;
            return this;
        }
        public String getSrcNodeType() {
            return this.srcNodeType;
        }

    }

    public static class GetAppNetworkResponseBodyAppNetworkNamespace extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetAppNetworkResponseBodyAppNetworkNamespace build(java.util.Map<String, ?> map) throws Exception {
            GetAppNetworkResponseBodyAppNetworkNamespace self = new GetAppNetworkResponseBodyAppNetworkNamespace();
            return TeaModel.build(map, self);
        }

        public GetAppNetworkResponseBodyAppNetworkNamespace setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAppNetworkResponseBodyAppNetworkNamespace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAppNetworkResponseBodyAppNetworkNode extends TeaModel {
        @NameInMap("ContainerIds")
        public java.util.List<String> containerIds;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("Type")
        public String type;

        public static GetAppNetworkResponseBodyAppNetworkNode build(java.util.Map<String, ?> map) throws Exception {
            GetAppNetworkResponseBodyAppNetworkNode self = new GetAppNetworkResponseBodyAppNetworkNode();
            return TeaModel.build(map, self);
        }

        public GetAppNetworkResponseBodyAppNetworkNode setContainerIds(java.util.List<String> containerIds) {
            this.containerIds = containerIds;
            return this;
        }
        public java.util.List<String> getContainerIds() {
            return this.containerIds;
        }

        public GetAppNetworkResponseBodyAppNetworkNode setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAppNetworkResponseBodyAppNetworkNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAppNetworkResponseBodyAppNetworkNode setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetAppNetworkResponseBodyAppNetworkNode setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetAppNetworkResponseBodyAppNetworkNode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAppNetworkResponseBodyAppNetwork extends TeaModel {
        @NameInMap("Edge")
        public java.util.List<GetAppNetworkResponseBodyAppNetworkEdge> edge;

        @NameInMap("Namespace")
        public java.util.List<GetAppNetworkResponseBodyAppNetworkNamespace> namespace;

        @NameInMap("Node")
        public java.util.List<GetAppNetworkResponseBodyAppNetworkNode> node;

        public static GetAppNetworkResponseBodyAppNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetAppNetworkResponseBodyAppNetwork self = new GetAppNetworkResponseBodyAppNetwork();
            return TeaModel.build(map, self);
        }

        public GetAppNetworkResponseBodyAppNetwork setEdge(java.util.List<GetAppNetworkResponseBodyAppNetworkEdge> edge) {
            this.edge = edge;
            return this;
        }
        public java.util.List<GetAppNetworkResponseBodyAppNetworkEdge> getEdge() {
            return this.edge;
        }

        public GetAppNetworkResponseBodyAppNetwork setNamespace(java.util.List<GetAppNetworkResponseBodyAppNetworkNamespace> namespace) {
            this.namespace = namespace;
            return this;
        }
        public java.util.List<GetAppNetworkResponseBodyAppNetworkNamespace> getNamespace() {
            return this.namespace;
        }

        public GetAppNetworkResponseBodyAppNetwork setNode(java.util.List<GetAppNetworkResponseBodyAppNetworkNode> node) {
            this.node = node;
            return this;
        }
        public java.util.List<GetAppNetworkResponseBodyAppNetworkNode> getNode() {
            return this.node;
        }

    }

}
