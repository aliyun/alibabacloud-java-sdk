// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAppNetworkResponseBody extends TeaModel {
    /**
     * <p>The information about the application network topology.</p>
     */
    @NameInMap("AppNetwork")
    public GetAppNetworkResponseBodyAppNetwork appNetwork;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The ID of the destination node.</p>
         */
        @NameInMap("DstNodeId")
        public String dstNodeId;

        /**
         * <p>The type of the destination node. Valid values:</p>
         * <br>
         * <p>*   **app**: an application</p>
         * <p>*   **internet**: a network node in another cluster</p>
         */
        @NameInMap("DstNodeType")
        public String dstNodeType;

        /**
         * <p>The ID of the edge.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The number of the destination port.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the source node.</p>
         */
        @NameInMap("SrcNodeId")
        public String srcNodeId;

        /**
         * <p>The type of the source node. Valid values:</p>
         * <br>
         * <p>*   **app**: an application</p>
         * <p>*   **internet**: a network node in another cluster</p>
         */
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
        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the custom namespace.</p>
         */
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
        /**
         * <p>The list of the container IDs.</p>
         */
        @NameInMap("ContainerIds")
        public java.util.List<String> containerIds;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The risk level. Valid values:</p>
         * <br>
         * <p>*   **3**: high</p>
         * <p>*   **2**: medium</p>
         * <p>*   **1**: low</p>
         * <p>*   **0**: warning</p>
         * <p>*   **-1**: unknown</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The type of the node. Valid values:</p>
         * <br>
         * <p>*   **app**: an application</p>
         * <p>*   **internet**: a network node in another cluster</p>
         */
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
        /**
         * <p>The information about the topology edge.</p>
         */
        @NameInMap("Edge")
        public java.util.List<GetAppNetworkResponseBodyAppNetworkEdge> edge;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public java.util.List<GetAppNetworkResponseBodyAppNetworkNamespace> namespace;

        /**
         * <p>The information about the application node.</p>
         */
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
