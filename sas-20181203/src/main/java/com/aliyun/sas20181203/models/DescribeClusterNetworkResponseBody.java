// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterNetworkResponseBody extends TeaModel {
    /**
     * <p>Information about the network topology edge in the cluster.</p>
     */
    @NameInMap("ClusterNetwork")
    public DescribeClusterNetworkResponseBodyClusterNetwork clusterNetwork;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C286491D-4A2F-589A-B63B-D2AD3DA9BD71</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNetworkResponseBody self = new DescribeClusterNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNetworkResponseBody setClusterNetwork(DescribeClusterNetworkResponseBodyClusterNetwork clusterNetwork) {
        this.clusterNetwork = clusterNetwork;
        return this;
    }
    public DescribeClusterNetworkResponseBodyClusterNetwork getClusterNetwork() {
        return this.clusterNetwork;
    }

    public DescribeClusterNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterNetworkResponseBodyClusterNetworkEdge extends TeaModel {
        /**
         * <p>The ID of the destination node.</p>
         * 
         * <strong>example:</strong>
         * <p>cfb41a869c71e4678a97021582dd8****</p>
         */
        @NameInMap("DstNodeId")
        public String dstNodeId;

        /**
         * <p>The type of the destination node. Valid values:</p>
         * <ul>
         * <li>Set the value to <strong>cluster</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("DstNodeType")
        public String dstNodeType;

        /**
         * <p>The ID of the topology edge.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The port number of the topology edge.</p>
         * 
         * <strong>example:</strong>
         * <p>6164</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the source node.</p>
         * 
         * <strong>example:</strong>
         * <p>cfb41a869c71e4678a97021582dd8****</p>
         */
        @NameInMap("SrcNodeId")
        public String srcNodeId;

        /**
         * <p>The type of the source node. Valid values:</p>
         * <ul>
         * <li><strong>cluster</strong>: a cluster.</li>
         * <li><strong>internet</strong>: a network node outside the cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("SrcNodeType")
        public String srcNodeType;

        public static DescribeClusterNetworkResponseBodyClusterNetworkEdge build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNetworkResponseBodyClusterNetworkEdge self = new DescribeClusterNetworkResponseBodyClusterNetworkEdge();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkEdge setDstNodeId(String dstNodeId) {
            this.dstNodeId = dstNodeId;
            return this;
        }
        public String getDstNodeId() {
            return this.dstNodeId;
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkEdge setDstNodeType(String dstNodeType) {
            this.dstNodeType = dstNodeType;
            return this;
        }
        public String getDstNodeType() {
            return this.dstNodeType;
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkEdge setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkEdge setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkEdge setSrcNodeId(String srcNodeId) {
            this.srcNodeId = srcNodeId;
            return this;
        }
        public String getSrcNodeId() {
            return this.srcNodeId;
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkEdge setSrcNodeType(String srcNodeType) {
            this.srcNodeType = srcNodeType;
            return this;
        }
        public String getSrcNodeType() {
            return this.srcNodeType;
        }

    }

    public static class DescribeClusterNetworkResponseBodyClusterNetworkNode extends TeaModel {
        /**
         * <p>The status of the microsegmentation switch. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: off.</li>
         * <li><strong>1</strong>: on.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CnnfSwitch")
        public Integer cnnfSwitch;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cfeb7a9f99ce740e98c5595d0fe37****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: classic network.</li>
         * <li><strong>1</strong>: virtual private cloud (VPC).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InterceptionType")
        public Integer interceptionType;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>testwww</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the network topology switch. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong></li>
         * <li><strong>OFF</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("NetTopoSwitch")
        public String netTopoSwitch;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: high.</li>
         * <li><strong>2</strong>: medium.</li>
         * <li><strong>1</strong>: low.</li>
         * <li><strong>0</strong>: secure.</li>
         * <li><strong>-1</strong>: unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The type of the node. Valid values:</p>
         * <ul>
         * <li><strong>cluster</strong>: a cluster.</li>
         * <li><strong>internet</strong>: a network node outside the cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeClusterNetworkResponseBodyClusterNetworkNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNetworkResponseBodyClusterNetworkNode self = new DescribeClusterNetworkResponseBodyClusterNetworkNode();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkNode setCnnfSwitch(Integer cnnfSwitch) {
            this.cnnfSwitch = cnnfSwitch;
            return this;
        }
        public Integer getCnnfSwitch() {
            return this.cnnfSwitch;
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkNode setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkNode setInterceptionType(Integer interceptionType) {
            this.interceptionType = interceptionType;
            return this;
        }
        public Integer getInterceptionType() {
            return this.interceptionType;
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkNode setNetTopoSwitch(String netTopoSwitch) {
            this.netTopoSwitch = netTopoSwitch;
            return this;
        }
        public String getNetTopoSwitch() {
            return this.netTopoSwitch;
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkNode setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeClusterNetworkResponseBodyClusterNetworkNode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeClusterNetworkResponseBodyClusterNetwork extends TeaModel {
        /**
         * <p>An array that consists of information about the topology edge.</p>
         */
        @NameInMap("Edge")
        public java.util.List<DescribeClusterNetworkResponseBodyClusterNetworkEdge> edge;

        /**
         * <p>An array that consists of information about the node.</p>
         */
        @NameInMap("Node")
        public java.util.List<DescribeClusterNetworkResponseBodyClusterNetworkNode> node;

        public static DescribeClusterNetworkResponseBodyClusterNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNetworkResponseBodyClusterNetwork self = new DescribeClusterNetworkResponseBodyClusterNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNetworkResponseBodyClusterNetwork setEdge(java.util.List<DescribeClusterNetworkResponseBodyClusterNetworkEdge> edge) {
            this.edge = edge;
            return this;
        }
        public java.util.List<DescribeClusterNetworkResponseBodyClusterNetworkEdge> getEdge() {
            return this.edge;
        }

        public DescribeClusterNetworkResponseBodyClusterNetwork setNode(java.util.List<DescribeClusterNetworkResponseBodyClusterNetworkNode> node) {
            this.node = node;
            return this;
        }
        public java.util.List<DescribeClusterNetworkResponseBodyClusterNetworkNode> getNode() {
            return this.node;
        }

    }

}
