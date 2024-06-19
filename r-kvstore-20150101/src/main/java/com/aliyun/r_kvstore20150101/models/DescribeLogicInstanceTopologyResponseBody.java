// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeLogicInstanceTopologyResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The information about proxy nodes.</p>
     */
    @NameInMap("RedisProxyList")
    public DescribeLogicInstanceTopologyResponseBodyRedisProxyList redisProxyList;

    /**
     * <p>Details of data shards, including node information such as NodeInfo.</p>
     */
    @NameInMap("RedisShardList")
    public DescribeLogicInstanceTopologyResponseBodyRedisShardList redisShardList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>794120D1-E0CF-4713-BAE4-EBAEA04506AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLogicInstanceTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogicInstanceTopologyResponseBody self = new DescribeLogicInstanceTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogicInstanceTopologyResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeLogicInstanceTopologyResponseBody setRedisProxyList(DescribeLogicInstanceTopologyResponseBodyRedisProxyList redisProxyList) {
        this.redisProxyList = redisProxyList;
        return this;
    }
    public DescribeLogicInstanceTopologyResponseBodyRedisProxyList getRedisProxyList() {
        return this.redisProxyList;
    }

    public DescribeLogicInstanceTopologyResponseBody setRedisShardList(DescribeLogicInstanceTopologyResponseBodyRedisShardList redisShardList) {
        this.redisShardList = redisShardList;
        return this;
    }
    public DescribeLogicInstanceTopologyResponseBodyRedisShardList getRedisShardList() {
        return this.redisShardList;
    }

    public DescribeLogicInstanceTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo extends TeaModel {
        /**
         * <p>The maximum bandwidth of the node. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The storage capacity of the node. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>5120</p>
         */
        @NameInMap("Capacity")
        public String capacity;

        /**
         * <p>The maximum number of connections.</p>
         * 
         * <strong>example:</strong>
         * <p>320000</p>
         */
        @NameInMap("Connection")
        public String connection;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp10noxlhcoim2****-proxy-3#542****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>db</strong>: a data node.</li>
         * <li><strong>normal</strong>: a management node, which can be a proxy node or a Configserver node. For specific instances, the return value of this parameter is proxy or cs, instead of normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>proxy</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        public static DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo self = new DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

    public static class DescribeLogicInstanceTopologyResponseBodyRedisProxyList extends TeaModel {
        @NameInMap("NodeInfo")
        public java.util.List<DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo> nodeInfo;

        public static DescribeLogicInstanceTopologyResponseBodyRedisProxyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogicInstanceTopologyResponseBodyRedisProxyList self = new DescribeLogicInstanceTopologyResponseBodyRedisProxyList();
            return TeaModel.build(map, self);
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisProxyList setNodeInfo(java.util.List<DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo> nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public java.util.List<DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

    }

    public static class DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo extends TeaModel {
        /**
         * <p>The maximum bandwidth of the node. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The storage capacity of the node. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Capacity")
        public String capacity;

        /**
         * <p>The maximum number of connections.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Connection")
        public String connection;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp10noxlhcoim2****-db-0#688****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>proxy</strong>: proxy node</li>
         * <li><strong>db</strong>: data node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The type of the child instance. Valid values:</p>
         * <ul>
         * <li><strong>master</strong>: master node</li>
         * <li><strong>readonly</strong>: read-only instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("SubInstanceType")
        public String subInstanceType;

        public static DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo self = new DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo setSubInstanceType(String subInstanceType) {
            this.subInstanceType = subInstanceType;
            return this;
        }
        public String getSubInstanceType() {
            return this.subInstanceType;
        }

    }

    public static class DescribeLogicInstanceTopologyResponseBodyRedisShardList extends TeaModel {
        @NameInMap("NodeInfo")
        public java.util.List<DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo> nodeInfo;

        public static DescribeLogicInstanceTopologyResponseBodyRedisShardList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogicInstanceTopologyResponseBodyRedisShardList self = new DescribeLogicInstanceTopologyResponseBodyRedisShardList();
            return TeaModel.build(map, self);
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisShardList setNodeInfo(java.util.List<DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo> nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public java.util.List<DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

    }

}
