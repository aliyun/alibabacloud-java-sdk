// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesForCloneResponse extends TeaModel {
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
    public DescribeDBInstancesForCloneResponseItems items;

    public static DescribeDBInstancesForCloneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesForCloneResponse self = new DescribeDBInstancesForCloneResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBInstancesForCloneResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        public static DescribeDBInstancesForCloneResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesForCloneResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId self = new DescribeDBInstancesForCloneResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesForCloneResponseItemsDBInstanceReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesForCloneResponseItemsDBInstanceReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId;

        public static DescribeDBInstancesForCloneResponseItemsDBInstanceReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesForCloneResponseItemsDBInstanceReadOnlyDBInstanceIds self = new DescribeDBInstancesForCloneResponseItemsDBInstanceReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesForCloneResponseItemsDBInstance extends TeaModel {
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

        @NameInMap("ReadOnlyDBInstanceIds")
        @Validation(required = true)
        public DescribeDBInstancesForCloneResponseItemsDBInstanceReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        public static DescribeDBInstancesForCloneResponseItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesForCloneResponseItemsDBInstance self = new DescribeDBInstancesForCloneResponseItemsDBInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesForCloneResponseItems extends TeaModel {
        @NameInMap("DBInstance")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesForCloneResponseItemsDBInstance> DBInstance;

        public static DescribeDBInstancesForCloneResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesForCloneResponseItems self = new DescribeDBInstancesForCloneResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
