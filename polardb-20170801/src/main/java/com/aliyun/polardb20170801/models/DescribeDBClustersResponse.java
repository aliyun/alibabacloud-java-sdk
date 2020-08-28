// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersResponse extends TeaModel {
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
    public DescribeDBClustersResponseItems items;

    public static DescribeDBClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersResponse self = new DescribeDBClustersResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBClustersResponseItemsDBClusterDBNodesDBNode extends TeaModel {
        @NameInMap("DBNodeId")
        @Validation(required = true)
        public String DBNodeId;

        @NameInMap("DBNodeClass")
        @Validation(required = true)
        public String DBNodeClass;

        @NameInMap("DBNodeRole")
        @Validation(required = true)
        public String DBNodeRole;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static DescribeDBClustersResponseItemsDBClusterDBNodesDBNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseItemsDBClusterDBNodesDBNode self = new DescribeDBClustersResponseItemsDBClusterDBNodesDBNode();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClustersResponseItemsDBClusterDBNodes extends TeaModel {
        @NameInMap("DBNode")
        @Validation(required = true)
        public java.util.List<DescribeDBClustersResponseItemsDBClusterDBNodesDBNode> DBNode;

        public static DescribeDBClustersResponseItemsDBClusterDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseItemsDBClusterDBNodes self = new DescribeDBClustersResponseItemsDBClusterDBNodes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClustersResponseItemsDBClusterTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDBClustersResponseItemsDBClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseItemsDBClusterTagsTag self = new DescribeDBClustersResponseItemsDBClusterTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClustersResponseItemsDBClusterTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeDBClustersResponseItemsDBClusterTagsTag> tag;

        public static DescribeDBClustersResponseItemsDBClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseItemsDBClusterTags self = new DescribeDBClustersResponseItemsDBClusterTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClustersResponseItemsDBCluster extends TeaModel {
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

        @NameInMap("DBNodeNumber")
        @Validation(required = true)
        public Integer DBNodeNumber;

        @NameInMap("DBNodeClass")
        @Validation(required = true)
        public String DBNodeClass;

        @NameInMap("StorageUsed")
        @Validation(required = true)
        public Long storageUsed;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("DBNodes")
        @Validation(required = true)
        public DescribeDBClustersResponseItemsDBClusterDBNodes DBNodes;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeDBClustersResponseItemsDBClusterTags tags;

        public static DescribeDBClustersResponseItemsDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseItemsDBCluster self = new DescribeDBClustersResponseItemsDBCluster();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClustersResponseItems extends TeaModel {
        @NameInMap("DBCluster")
        @Validation(required = true)
        public java.util.List<DescribeDBClustersResponseItemsDBCluster> DBCluster;

        public static DescribeDBClustersResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseItems self = new DescribeDBClustersResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
