// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterMigrationResponseBody extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("DBClusterEndpointList")
    public java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointList> DBClusterEndpointList;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DBClusterReadWriteMode")
    public String DBClusterReadWriteMode;

    @NameInMap("DelayedSeconds")
    public Integer delayedSeconds;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("MigrationStatus")
    public String migrationStatus;

    @NameInMap("RdsEndpointList")
    public java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointList> rdsEndpointList;

    @NameInMap("RdsReadWriteMode")
    public String rdsReadWriteMode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceRDSDBInstanceId")
    public String sourceRDSDBInstanceId;

    @NameInMap("Topologies")
    public String topologies;

    public static DescribeDBClusterMigrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterMigrationResponseBody self = new DescribeDBClusterMigrationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterMigrationResponseBody setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DescribeDBClusterMigrationResponseBody setDBClusterEndpointList(java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointList> DBClusterEndpointList) {
        this.DBClusterEndpointList = DBClusterEndpointList;
        return this;
    }
    public java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointList> getDBClusterEndpointList() {
        return this.DBClusterEndpointList;
    }

    public DescribeDBClusterMigrationResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterMigrationResponseBody setDBClusterReadWriteMode(String DBClusterReadWriteMode) {
        this.DBClusterReadWriteMode = DBClusterReadWriteMode;
        return this;
    }
    public String getDBClusterReadWriteMode() {
        return this.DBClusterReadWriteMode;
    }

    public DescribeDBClusterMigrationResponseBody setDelayedSeconds(Integer delayedSeconds) {
        this.delayedSeconds = delayedSeconds;
        return this;
    }
    public Integer getDelayedSeconds() {
        return this.delayedSeconds;
    }

    public DescribeDBClusterMigrationResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeDBClusterMigrationResponseBody setMigrationStatus(String migrationStatus) {
        this.migrationStatus = migrationStatus;
        return this;
    }
    public String getMigrationStatus() {
        return this.migrationStatus;
    }

    public DescribeDBClusterMigrationResponseBody setRdsEndpointList(java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointList> rdsEndpointList) {
        this.rdsEndpointList = rdsEndpointList;
        return this;
    }
    public java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointList> getRdsEndpointList() {
        return this.rdsEndpointList;
    }

    public DescribeDBClusterMigrationResponseBody setRdsReadWriteMode(String rdsReadWriteMode) {
        this.rdsReadWriteMode = rdsReadWriteMode;
        return this;
    }
    public String getRdsReadWriteMode() {
        return this.rdsReadWriteMode;
    }

    public DescribeDBClusterMigrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterMigrationResponseBody setSourceRDSDBInstanceId(String sourceRDSDBInstanceId) {
        this.sourceRDSDBInstanceId = sourceRDSDBInstanceId;
        return this;
    }
    public String getSourceRDSDBInstanceId() {
        return this.sourceRDSDBInstanceId;
    }

    public DescribeDBClusterMigrationResponseBody setTopologies(String topologies) {
        this.topologies = topologies;
        return this;
    }
    public String getTopologies() {
        return this.topologies;
    }

    public static class DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("Port")
        public String port;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems self = new DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeDBClusterMigrationResponseBodyDBClusterEndpointList extends TeaModel {
        @NameInMap("AddressItems")
        public java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems> addressItems;

        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        @NameInMap("EndpointType")
        public String endpointType;

        public static DescribeDBClusterMigrationResponseBodyDBClusterEndpointList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterMigrationResponseBodyDBClusterEndpointList self = new DescribeDBClusterMigrationResponseBodyDBClusterEndpointList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointList setAddressItems(java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems> addressItems) {
            this.addressItems = addressItems;
            return this;
        }
        public java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems> getAddressItems() {
            return this.addressItems;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointList setDBEndpointId(String DBEndpointId) {
            this.DBEndpointId = DBEndpointId;
            return this;
        }
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointList setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

    }

    public static class DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("Port")
        public String port;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems self = new DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeDBClusterMigrationResponseBodyRdsEndpointList extends TeaModel {
        @NameInMap("AddressItems")
        public java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems> addressItems;

        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        @NameInMap("EndpointType")
        public String endpointType;

        public static DescribeDBClusterMigrationResponseBodyRdsEndpointList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterMigrationResponseBodyRdsEndpointList self = new DescribeDBClusterMigrationResponseBodyRdsEndpointList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointList setAddressItems(java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems> addressItems) {
            this.addressItems = addressItems;
            return this;
        }
        public java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems> getAddressItems() {
            return this.addressItems;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointList setDBEndpointId(String DBEndpointId) {
            this.DBEndpointId = DBEndpointId;
            return this;
        }
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointList setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

    }

}
