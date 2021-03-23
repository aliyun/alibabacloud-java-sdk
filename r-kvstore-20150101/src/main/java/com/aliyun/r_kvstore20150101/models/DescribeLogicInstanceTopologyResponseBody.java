// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeLogicInstanceTopologyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RedisProxyList")
    public DescribeLogicInstanceTopologyResponseBodyRedisProxyList redisProxyList;

    @NameInMap("RedisShardList")
    public DescribeLogicInstanceTopologyResponseBodyRedisShardList redisShardList;

    public static DescribeLogicInstanceTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogicInstanceTopologyResponseBody self = new DescribeLogicInstanceTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogicInstanceTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo extends TeaModel {
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Connection")
        public String connection;

        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("Capacity")
        public String capacity;

        @NameInMap("NodeType")
        public String nodeType;

        public static DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo self = new DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisProxyListNodeInfo setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
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
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Connection")
        public String connection;

        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("Capacity")
        public String capacity;

        @NameInMap("NodeType")
        public String nodeType;

        public static DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo self = new DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
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

        public DescribeLogicInstanceTopologyResponseBodyRedisShardListNodeInfo setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
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
