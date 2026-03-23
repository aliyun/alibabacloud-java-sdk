// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDBInstanceTopologyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDBInstanceTopologyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDBInstanceTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDBInstanceTopologyResponseBody self = new GetDBInstanceTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDBInstanceTopologyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDBInstanceTopologyResponseBody setData(GetDBInstanceTopologyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDBInstanceTopologyResponseBodyData getData() {
        return this.data;
    }

    public GetDBInstanceTopologyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDBInstanceTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDBInstanceTopologyResponseBodyDataConnections extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetDBInstanceTopologyResponseBodyDataConnections build(java.util.Map<String, ?> map) throws Exception {
            GetDBInstanceTopologyResponseBodyDataConnections self = new GetDBInstanceTopologyResponseBodyDataConnections();
            return TeaModel.build(map, self);
        }

        public GetDBInstanceTopologyResponseBodyDataConnections setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public GetDBInstanceTopologyResponseBodyDataConnections setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public GetDBInstanceTopologyResponseBodyDataConnections setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public GetDBInstanceTopologyResponseBodyDataConnections setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetDBInstanceTopologyResponseBodyDataNodes extends TeaModel {
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Role")
        public String role;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetDBInstanceTopologyResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetDBInstanceTopologyResponseBodyDataNodes self = new GetDBInstanceTopologyResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetDBInstanceTopologyResponseBodyDataNodes setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public GetDBInstanceTopologyResponseBodyDataNodes setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public GetDBInstanceTopologyResponseBodyDataNodes setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public GetDBInstanceTopologyResponseBodyDataNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetDBInstanceTopologyResponseBodyDataNodes setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetDBInstanceTopologyResponseBodyDataNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetDBInstanceTopologyResponseBodyData extends TeaModel {
        @NameInMap("Connections")
        public java.util.List<GetDBInstanceTopologyResponseBodyDataConnections> connections;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("Nodes")
        public java.util.List<GetDBInstanceTopologyResponseBodyDataNodes> nodes;

        public static GetDBInstanceTopologyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDBInstanceTopologyResponseBodyData self = new GetDBInstanceTopologyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDBInstanceTopologyResponseBodyData setConnections(java.util.List<GetDBInstanceTopologyResponseBodyDataConnections> connections) {
            this.connections = connections;
            return this;
        }
        public java.util.List<GetDBInstanceTopologyResponseBodyDataConnections> getConnections() {
            return this.connections;
        }

        public GetDBInstanceTopologyResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public GetDBInstanceTopologyResponseBodyData setNodes(java.util.List<GetDBInstanceTopologyResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetDBInstanceTopologyResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
