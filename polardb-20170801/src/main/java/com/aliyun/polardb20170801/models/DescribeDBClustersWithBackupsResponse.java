// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersWithBackupsResponse extends TeaModel {
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
    public DescribeDBClustersWithBackupsResponseItems items;

    public static DescribeDBClustersWithBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersWithBackupsResponse self = new DescribeDBClustersWithBackupsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBClustersWithBackupsResponseItemsDBCluster extends TeaModel {
        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("DBClusterDescription")
        @Validation(required = true)
        public String DBClusterDescription;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        @NameInMap("DBClusterNetworkType")
        @Validation(required = true)
        public String DBClusterNetworkType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("Expired")
        @Validation(required = true)
        public String expired;

        @NameInMap("DBClusterStatus")
        @Validation(required = true)
        public String DBClusterStatus;

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

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("IsDeleted")
        @Validation(required = true)
        public Integer isDeleted;

        @NameInMap("DeletedTime")
        @Validation(required = true)
        public String deletedTime;

        @NameInMap("DBNodeClass")
        @Validation(required = true)
        public String DBNodeClass;

        public static DescribeDBClustersWithBackupsResponseItemsDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersWithBackupsResponseItemsDBCluster self = new DescribeDBClustersWithBackupsResponseItemsDBCluster();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClustersWithBackupsResponseItems extends TeaModel {
        @NameInMap("DBCluster")
        @Validation(required = true)
        public java.util.List<DescribeDBClustersWithBackupsResponseItemsDBCluster> DBCluster;

        public static DescribeDBClustersWithBackupsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersWithBackupsResponseItems self = new DescribeDBClustersWithBackupsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
