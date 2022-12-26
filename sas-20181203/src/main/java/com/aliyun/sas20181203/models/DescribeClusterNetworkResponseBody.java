// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterNetworkResponseBody extends TeaModel {
    @NameInMap("ClusterNetwork")
    public DescribeClusterNetworkResponseBodyClusterNetwork clusterNetwork;

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
        @NameInMap("CnnfSwitch")
        public Integer cnnfSwitch;

        @NameInMap("Id")
        public String id;

        @NameInMap("InterceptionType")
        public Integer interceptionType;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetTopoSwitch")
        public String netTopoSwitch;

        @NameInMap("RiskLevel")
        public String riskLevel;

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
        @NameInMap("Edge")
        public java.util.List<DescribeClusterNetworkResponseBodyClusterNetworkEdge> edge;

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
