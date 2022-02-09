// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeMigrationEndpointsResponseBody extends TeaModel {
    @NameInMap("MigrationEndpoints")
    public java.util.List<DescribeMigrationEndpointsResponseBodyMigrationEndpoints> migrationEndpoints;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeMigrationEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationEndpointsResponseBody self = new DescribeMigrationEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationEndpointsResponseBody setMigrationEndpoints(java.util.List<DescribeMigrationEndpointsResponseBodyMigrationEndpoints> migrationEndpoints) {
        this.migrationEndpoints = migrationEndpoints;
        return this;
    }
    public java.util.List<DescribeMigrationEndpointsResponseBodyMigrationEndpoints> getMigrationEndpoints() {
        return this.migrationEndpoints;
    }

    public DescribeMigrationEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrationEndpointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMigrationEndpointsResponseBodyMigrationEndpoints extends TeaModel {
        @NameInMap("CloudInstanceId")
        public String cloudInstanceId;

        @NameInMap("CloudInstanceRegionId")
        public String cloudInstanceRegionId;

        @NameInMap("CloudInstanceTenantId")
        public String cloudInstanceTenantId;

        @NameInMap("ConnectionInfo")
        public String connectionInfo;

        @NameInMap("DbEngine")
        public String dbEngine;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DgInstanceId")
        public String dgInstanceId;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointName")
        public String endpointName;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("Host")
        public String host;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Port")
        public String port;

        @NameInMap("Sid")
        public String sid;

        @NameInMap("Username")
        public String username;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeMigrationEndpointsResponseBodyMigrationEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationEndpointsResponseBodyMigrationEndpoints self = new DescribeMigrationEndpointsResponseBodyMigrationEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setCloudInstanceRegionId(String cloudInstanceRegionId) {
            this.cloudInstanceRegionId = cloudInstanceRegionId;
            return this;
        }
        public String getCloudInstanceRegionId() {
            return this.cloudInstanceRegionId;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setCloudInstanceTenantId(String cloudInstanceTenantId) {
            this.cloudInstanceTenantId = cloudInstanceTenantId;
            return this;
        }
        public String getCloudInstanceTenantId() {
            return this.cloudInstanceTenantId;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setConnectionInfo(String connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setDbEngine(String dbEngine) {
            this.dbEngine = dbEngine;
            return this;
        }
        public String getDbEngine() {
            return this.dbEngine;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setDgInstanceId(String dgInstanceId) {
            this.dgInstanceId = dgInstanceId;
            return this;
        }
        public String getDgInstanceId() {
            return this.dgInstanceId;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeMigrationEndpointsResponseBodyMigrationEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
