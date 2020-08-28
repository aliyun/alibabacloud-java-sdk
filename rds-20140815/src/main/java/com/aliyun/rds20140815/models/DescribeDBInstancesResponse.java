// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDBInstancesResponseItems items;

    public static DescribeDBInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponse self = new DescribeDBInstancesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        public static DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId self = new DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId;

        public static DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds self = new DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesResponseItemsDBInstance extends TeaModel {
        @NameInMap("InsId")
        @Validation(required = true)
        public Integer insId;

        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("DBInstanceDescription")
        @Validation(required = true)
        public String DBInstanceDescription;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        @NameInMap("DBInstanceType")
        @Validation(required = true)
        public String DBInstanceType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("DestroyTime")
        @Validation(required = true)
        public String destroyTime;

        @NameInMap("DBInstanceStatus")
        @Validation(required = true)
        public String DBInstanceStatus;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("DBInstanceNetType")
        @Validation(required = true)
        public String DBInstanceNetType;

        @NameInMap("ConnectionMode")
        @Validation(required = true)
        public String connectionMode;

        @NameInMap("LockMode")
        @Validation(required = true)
        public String lockMode;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("DBInstanceStorageType")
        @Validation(required = true)
        public String DBInstanceStorageType;

        @NameInMap("DBInstanceClass")
        @Validation(required = true)
        public String DBInstanceClass;

        @NameInMap("InstanceNetworkType")
        @Validation(required = true)
        public String instanceNetworkType;

        @NameInMap("VpcCloudInstanceId")
        @Validation(required = true)
        public String vpcCloudInstanceId;

        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("MutriORsignle")
        @Validation(required = true)
        public Boolean mutriORsignle;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        @NameInMap("GuardDBInstanceId")
        @Validation(required = true)
        public String guardDBInstanceId;

        @NameInMap("TempDBInstanceId")
        @Validation(required = true)
        public String tempDBInstanceId;

        @NameInMap("MasterInstanceId")
        @Validation(required = true)
        public String masterInstanceId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String VSwitchId;

        @NameInMap("ReplicateId")
        @Validation(required = true)
        public String replicateId;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("AutoUpgradeMinorVersion")
        @Validation(required = true)
        public String autoUpgradeMinorVersion;

        @NameInMap("DedicatedHostGroupId")
        @Validation(required = true)
        public String dedicatedHostGroupId;

        @NameInMap("DedicatedHostIdForMaster")
        @Validation(required = true)
        public String dedicatedHostIdForMaster;

        @NameInMap("DedicatedHostIdForSlave")
        @Validation(required = true)
        public String dedicatedHostIdForSlave;

        @NameInMap("DedicatedHostIdForLog")
        @Validation(required = true)
        public String dedicatedHostIdForLog;

        @NameInMap("DedicatedHostNameForMaster")
        @Validation(required = true)
        public String dedicatedHostNameForMaster;

        @NameInMap("DedicatedHostNameForSlave")
        @Validation(required = true)
        public String dedicatedHostNameForSlave;

        @NameInMap("DedicatedHostNameForLog")
        @Validation(required = true)
        public String dedicatedHostNameForLog;

        @NameInMap("DedicatedHostZoneIdForMaster")
        @Validation(required = true)
        public String dedicatedHostZoneIdForMaster;

        @NameInMap("DedicatedHostZoneIdForSlave")
        @Validation(required = true)
        public String dedicatedHostZoneIdForSlave;

        @NameInMap("DedicatedHostZoneIdForLog")
        @Validation(required = true)
        public String dedicatedHostZoneIdForLog;

        @NameInMap("ReadOnlyDBInstanceIds")
        @Validation(required = true)
        public DescribeDBInstancesResponseItemsDBInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        public static DescribeDBInstancesResponseItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseItemsDBInstance self = new DescribeDBInstancesResponseItemsDBInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesResponseItems extends TeaModel {
        @NameInMap("DBInstance")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesResponseItemsDBInstance> DBInstance;

        public static DescribeDBInstancesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseItems self = new DescribeDBInstancesResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
