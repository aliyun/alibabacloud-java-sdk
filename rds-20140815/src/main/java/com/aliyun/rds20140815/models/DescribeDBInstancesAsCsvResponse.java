// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesAsCsvResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDBInstancesAsCsvResponseItems items;

    public static DescribeDBInstancesAsCsvResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesAsCsvResponse self = new DescribeDBInstancesAsCsvResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBInstancesAsCsvResponseItemsDBInstanceAttribute extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        @NameInMap("DBInstanceClassType")
        @Validation(required = true)
        public String DBInstanceClassType;

        @NameInMap("DBInstanceType")
        @Validation(required = true)
        public String DBInstanceType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ConnectionString")
        @Validation(required = true)
        public String connectionString;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        @NameInMap("DBInstanceClass")
        @Validation(required = true)
        public String DBInstanceClass;

        @NameInMap("DBInstanceMemory")
        @Validation(required = true)
        public Long DBInstanceMemory;

        @NameInMap("DBInstanceStorage")
        @Validation(required = true)
        public Integer DBInstanceStorage;

        @NameInMap("DBInstanceNetType")
        @Validation(required = true)
        public String DBInstanceNetType;

        @NameInMap("DBInstanceStatus")
        @Validation(required = true)
        public String DBInstanceStatus;

        @NameInMap("DBInstanceDescription")
        @Validation(required = true)
        public String DBInstanceDescription;

        @NameInMap("LockMode")
        @Validation(required = true)
        public String lockMode;

        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        @NameInMap("ReadDelayTime")
        @Validation(required = true)
        public String readDelayTime;

        @NameInMap("DBMaxQuantity")
        @Validation(required = true)
        public Integer DBMaxQuantity;

        @NameInMap("AccountMaxQuantity")
        @Validation(required = true)
        public Integer accountMaxQuantity;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("MaintainTime")
        @Validation(required = true)
        public String maintainTime;

        @NameInMap("AvailabilityValue")
        @Validation(required = true)
        public String availabilityValue;

        @NameInMap("MaxIOPS")
        @Validation(required = true)
        public Integer maxIOPS;

        @NameInMap("MaxConnections")
        @Validation(required = true)
        public Integer maxConnections;

        @NameInMap("MasterInstanceId")
        @Validation(required = true)
        public String masterInstanceId;

        @NameInMap("DBInstanceCPU")
        @Validation(required = true)
        public String DBInstanceCPU;

        @NameInMap("IncrementSourceDBInstanceId")
        @Validation(required = true)
        public String incrementSourceDBInstanceId;

        @NameInMap("GuardDBInstanceId")
        @Validation(required = true)
        public String guardDBInstanceId;

        @NameInMap("TempDBInstanceId")
        @Validation(required = true)
        public String tempDBInstanceId;

        @NameInMap("SecurityIPList")
        @Validation(required = true)
        public String securityIPList;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("InstanceNetworkType")
        @Validation(required = true)
        public String instanceNetworkType;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("AccountType")
        @Validation(required = true)
        public String accountType;

        @NameInMap("SupportUpgradeAccountType")
        @Validation(required = true)
        public String supportUpgradeAccountType;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String VSwitchId;

        @NameInMap("ConnectionMode")
        @Validation(required = true)
        public String connectionMode;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        public static DescribeDBInstancesAsCsvResponseItemsDBInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesAsCsvResponseItemsDBInstanceAttribute self = new DescribeDBInstancesAsCsvResponseItemsDBInstanceAttribute();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesAsCsvResponseItems extends TeaModel {
        @NameInMap("DBInstanceAttribute")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesAsCsvResponseItemsDBInstanceAttribute> DBInstanceAttribute;

        public static DescribeDBInstancesAsCsvResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesAsCsvResponseItems self = new DescribeDBInstancesAsCsvResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
