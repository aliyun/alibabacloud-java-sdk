// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterMigrationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("SourceRDSDBInstanceId")
    @Validation(required = true)
    public String sourceRDSDBInstanceId;

    @NameInMap("MigrationStatus")
    @Validation(required = true)
    public String migrationStatus;

    @NameInMap("Topologies")
    @Validation(required = true)
    public String topologies;

    @NameInMap("DelayedSeconds")
    @Validation(required = true)
    public Integer delayedSeconds;

    @NameInMap("ExpiredTime")
    @Validation(required = true)
    public String expiredTime;

    @NameInMap("RdsReadWriteMode")
    @Validation(required = true)
    public String rdsReadWriteMode;

    @NameInMap("DBClusterReadWriteMode")
    @Validation(required = true)
    public String DBClusterReadWriteMode;

    @NameInMap("Comment")
    @Validation(required = true)
    public String comment;

    @NameInMap("DBClusterEndpointList")
    @Validation(required = true)
    public java.util.List<DescribeDBClusterMigrationResponseDBClusterEndpointList> DBClusterEndpointList;

    @NameInMap("RdsEndpointList")
    @Validation(required = true)
    public java.util.List<DescribeDBClusterMigrationResponseRdsEndpointList> rdsEndpointList;

    public static DescribeDBClusterMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterMigrationResponse self = new DescribeDBClusterMigrationResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBClusterMigrationResponseDBClusterEndpointListAddressItems extends TeaModel {
        @NameInMap("ConnectionString")
        @Validation(required = true)
        public String connectionString;

        @NameInMap("IPAddress")
        @Validation(required = true)
        public String IPAddress;

        @NameInMap("NetType")
        @Validation(required = true)
        public String netType;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        @NameInMap("VPCId")
        @Validation(required = true)
        public String VPCId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        public static DescribeDBClusterMigrationResponseDBClusterEndpointListAddressItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterMigrationResponseDBClusterEndpointListAddressItems self = new DescribeDBClusterMigrationResponseDBClusterEndpointListAddressItems();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterMigrationResponseDBClusterEndpointList extends TeaModel {
        @NameInMap("DBEndpointId")
        @Validation(required = true)
        public String DBEndpointId;

        @NameInMap("EndpointType")
        @Validation(required = true)
        public String endpointType;

        @NameInMap("AddressItems")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterMigrationResponseDBClusterEndpointListAddressItems> addressItems;

        public static DescribeDBClusterMigrationResponseDBClusterEndpointList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterMigrationResponseDBClusterEndpointList self = new DescribeDBClusterMigrationResponseDBClusterEndpointList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterMigrationResponseRdsEndpointListAddressItems extends TeaModel {
        @NameInMap("ConnectionString")
        @Validation(required = true)
        public String connectionString;

        @NameInMap("IPAddress")
        @Validation(required = true)
        public String IPAddress;

        @NameInMap("NetType")
        @Validation(required = true)
        public String netType;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        @NameInMap("VPCId")
        @Validation(required = true)
        public String VPCId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        public static DescribeDBClusterMigrationResponseRdsEndpointListAddressItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterMigrationResponseRdsEndpointListAddressItems self = new DescribeDBClusterMigrationResponseRdsEndpointListAddressItems();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterMigrationResponseRdsEndpointList extends TeaModel {
        @NameInMap("DBEndpointId")
        @Validation(required = true)
        public String DBEndpointId;

        @NameInMap("EndpointType")
        @Validation(required = true)
        public String endpointType;

        @NameInMap("AddressItems")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterMigrationResponseRdsEndpointListAddressItems> addressItems;

        public static DescribeDBClusterMigrationResponseRdsEndpointList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterMigrationResponseRdsEndpointList self = new DescribeDBClusterMigrationResponseRdsEndpointList();
            return TeaModel.build(map, self);
        }

    }

}
