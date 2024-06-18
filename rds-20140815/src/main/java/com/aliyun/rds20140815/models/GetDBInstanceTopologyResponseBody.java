// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDBInstanceTopologyResponseBody extends TeaModel {
    /**
     * <p>An internal parameter. You can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
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
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7430AB1A-6D49-5B6D-B9E5-920250076074</p>
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
         * 
         * <strong>example:</strong>
         * <p>rm-m5ezban**********.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-m5ezban**********</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>vpc</strong></li>
         * <li><strong>public</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The zone ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao-c</p>
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
         * 
         * <strong>example:</strong>
         * <p>rm-m5ezban**********</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The ID of the dedicated cluster.</p>
         * <blockquote>
         * <p>: If the instance does not reside in the specified dedicated cluster, no value is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dhg-4n*****</p>
         */
        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        /**
         * <p>The host ID of the instance in the dedicated cluster.</p>
         * <blockquote>
         * <p>: If the instance does not reside in the specified dedicated cluster, no value is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-bpxxxxxxx</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>: The value \<em>\</em>-1\<em>\</em> is returned for an instance that does not reside in a dedicated cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>349054</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The type of the node. The following result is returned:</p>
         * <ul>
         * <li><strong>Master</strong>: a primary node</li>
         * <li><strong>Slave</strong>: a secondary node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The zone ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao-c</p>
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
         * 
         * <strong>example:</strong>
         * <p>rm-m5ezban**********</p>
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
