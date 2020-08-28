// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DBClusterNetworkType")
    @Validation(required = true)
    public String DBClusterNetworkType;

    @NameInMap("VPCId")
    @Validation(required = true)
    public String VPCId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("PayType")
    @Validation(required = true)
    public String payType;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("DBClusterStatus")
    @Validation(required = true)
    public String DBClusterStatus;

    @NameInMap("DBClusterDescription")
    @Validation(required = true)
    public String DBClusterDescription;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("DBType")
    @Validation(required = true)
    public String DBType;

    @NameInMap("DBVersion")
    @Validation(required = true)
    public String DBVersion;

    @NameInMap("LockMode")
    @Validation(required = true)
    public String lockMode;

    @NameInMap("DeletionLock")
    @Validation(required = true)
    public Integer deletionLock;

    @NameInMap("CreationTime")
    @Validation(required = true)
    public String creationTime;

    @NameInMap("ExpireTime")
    @Validation(required = true)
    public String expireTime;

    @NameInMap("Expired")
    @Validation(required = true)
    public String expired;

    @NameInMap("MaintainTime")
    @Validation(required = true)
    public String maintainTime;

    @NameInMap("StorageUsed")
    @Validation(required = true)
    public Long storageUsed;

    @NameInMap("StorageMax")
    @Validation(required = true)
    public Long storageMax;

    @NameInMap("ZoneIds")
    @Validation(required = true)
    public String zoneIds;

    @NameInMap("SQLSize")
    @Validation(required = true)
    public Long SQLSize;

    @NameInMap("IsLatestVersion")
    @Validation(required = true)
    public Boolean isLatestVersion;

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    @NameInMap("DataLevel1BackupChainSize")
    @Validation(required = true)
    public Long dataLevel1BackupChainSize;

    @NameInMap("Tags")
    @Validation(required = true)
    public java.util.List<DescribeDBClusterAttributeResponseTags> tags;

    @NameInMap("DBNodes")
    @Validation(required = true)
    public java.util.List<DescribeDBClusterAttributeResponseDBNodes> DBNodes;

    public static DescribeDBClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeResponse self = new DescribeDBClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBClusterAttributeResponseTags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDBClusterAttributeResponseTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseTags self = new DescribeDBClusterAttributeResponseTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterAttributeResponseDBNodes extends TeaModel {
        @NameInMap("DBNodeId")
        @Validation(required = true)
        public String DBNodeId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("DBNodeStatus")
        @Validation(required = true)
        public String DBNodeStatus;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("DBNodeClass")
        @Validation(required = true)
        public String DBNodeClass;

        @NameInMap("DBNodeRole")
        @Validation(required = true)
        public String DBNodeRole;

        @NameInMap("MaxIOPS")
        @Validation(required = true)
        public Integer maxIOPS;

        @NameInMap("MaxConnections")
        @Validation(required = true)
        public Integer maxConnections;

        @NameInMap("FailoverPriority")
        @Validation(required = true)
        public Integer failoverPriority;

        public static DescribeDBClusterAttributeResponseDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseDBNodes self = new DescribeDBClusterAttributeResponseDBNodes();
            return TeaModel.build(map, self);
        }

    }

}
