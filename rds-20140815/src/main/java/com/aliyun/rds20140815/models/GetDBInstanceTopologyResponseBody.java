// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDBInstanceTopologyResponseBody extends TeaModel {
    /**
     * <p>An internal parameter. You can ignore this parameter.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details about the topology.</p>
     */
    @NameInMap("Data")
    public GetDBInstanceTopologyResponseBodyData data;

    /**
     * <p>An internal parameter. You can ignore this parameter.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The endpoint that is used to connect to the database instance.</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **vpc**</p>
         * <p>*   **public**</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The zone ID of the instance.</p>
         */
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
        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The ID of the dedicated cluster.</p>
         * <br>
         * <p>> : If the instance does not reside in the specified dedicated cluster, no value is returned.</p>
         */
        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        /**
         * <p>The host ID of the instance in the dedicated cluster.</p>
         * <br>
         * <p>> : If the instance does not reside in the specified dedicated cluster, no value is returned.</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The ID of the instance.</p>
         * <br>
         * <p>> : The value \*\*-1\*\* is returned for an instance that does not reside in a dedicated cluster.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The type of the node. The following result is returned:</p>
         * <br>
         * <p>*   **Master**: a primary node</p>
         * <p>*   **Slave**: a secondary node</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The zone ID of the instance.</p>
         */
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
        /**
         * <p>The network connection information of the instance.</p>
         */
        @NameInMap("Connections")
        public java.util.List<GetDBInstanceTopologyResponseBodyDataConnections> connections;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The queried nodes.</p>
         */
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
