// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDBInstanceTopologyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDBInstanceTopologyResponseData data;

    public static GetDBInstanceTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDBInstanceTopologyResponse self = new GetDBInstanceTopologyResponse();
        return TeaModel.build(map, self);
    }

    public GetDBInstanceTopologyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDBInstanceTopologyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDBInstanceTopologyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDBInstanceTopologyResponse setData(GetDBInstanceTopologyResponseData data) {
        this.data = data;
        return this;
    }
    public GetDBInstanceTopologyResponseData getData() {
        return this.data;
    }

    public static class GetDBInstanceTopologyResponseDataConnections extends TeaModel {
        @NameInMap("NetType")
        @Validation(required = true)
        public String netType;

        @NameInMap("ConnectionString")
        @Validation(required = true)
        public String connectionString;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static GetDBInstanceTopologyResponseDataConnections build(java.util.Map<String, ?> map) throws Exception {
            GetDBInstanceTopologyResponseDataConnections self = new GetDBInstanceTopologyResponseDataConnections();
            return TeaModel.build(map, self);
        }

        public GetDBInstanceTopologyResponseDataConnections setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public GetDBInstanceTopologyResponseDataConnections setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public GetDBInstanceTopologyResponseDataConnections setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetDBInstanceTopologyResponseDataNodes extends TeaModel {
        @NameInMap("Role")
        @Validation(required = true)
        public String role;

        @NameInMap("DedicatedHostId")
        @Validation(required = true)
        public String dedicatedHostId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("DedicatedHostGroupId")
        @Validation(required = true)
        public String dedicatedHostGroupId;

        public static GetDBInstanceTopologyResponseDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetDBInstanceTopologyResponseDataNodes self = new GetDBInstanceTopologyResponseDataNodes();
            return TeaModel.build(map, self);
        }

        public GetDBInstanceTopologyResponseDataNodes setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetDBInstanceTopologyResponseDataNodes setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public GetDBInstanceTopologyResponseDataNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public GetDBInstanceTopologyResponseDataNodes setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

    }

    public static class GetDBInstanceTopologyResponseData extends TeaModel {
        @NameInMap("DBInstanceName")
        @Validation(required = true)
        public String DBInstanceName;

        @NameInMap("Connections")
        @Validation(required = true)
        public java.util.List<GetDBInstanceTopologyResponseDataConnections> connections;

        @NameInMap("Nodes")
        @Validation(required = true)
        public java.util.List<GetDBInstanceTopologyResponseDataNodes> nodes;

        public static GetDBInstanceTopologyResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDBInstanceTopologyResponseData self = new GetDBInstanceTopologyResponseData();
            return TeaModel.build(map, self);
        }

        public GetDBInstanceTopologyResponseData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public GetDBInstanceTopologyResponseData setConnections(java.util.List<GetDBInstanceTopologyResponseDataConnections> connections) {
            this.connections = connections;
            return this;
        }
        public java.util.List<GetDBInstanceTopologyResponseDataConnections> getConnections() {
            return this.connections;
        }

        public GetDBInstanceTopologyResponseData setNodes(java.util.List<GetDBInstanceTopologyResponseDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetDBInstanceTopologyResponseDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
