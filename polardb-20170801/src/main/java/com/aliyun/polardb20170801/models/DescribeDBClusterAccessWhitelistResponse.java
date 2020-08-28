// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhitelistResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDBClusterAccessWhitelistResponseItems items;

    @NameInMap("DBClusterSecurityGroups")
    @Validation(required = true)
    public DescribeDBClusterAccessWhitelistResponseDBClusterSecurityGroups DBClusterSecurityGroups;

    public static DescribeDBClusterAccessWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAccessWhitelistResponse self = new DescribeDBClusterAccessWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBClusterAccessWhitelistResponseItemsDBClusterIPArray extends TeaModel {
        @NameInMap("DBClusterIPArrayName")
        @Validation(required = true)
        public String DBClusterIPArrayName;

        @NameInMap("DBClusterIPArrayAttribute")
        @Validation(required = true)
        public String DBClusterIPArrayAttribute;

        @NameInMap("SecurityIps")
        @Validation(required = true)
        public String securityIps;

        public static DescribeDBClusterAccessWhitelistResponseItemsDBClusterIPArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhitelistResponseItemsDBClusterIPArray self = new DescribeDBClusterAccessWhitelistResponseItemsDBClusterIPArray();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterAccessWhitelistResponseItems extends TeaModel {
        @NameInMap("DBClusterIPArray")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterAccessWhitelistResponseItemsDBClusterIPArray> DBClusterIPArray;

        public static DescribeDBClusterAccessWhitelistResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhitelistResponseItems self = new DescribeDBClusterAccessWhitelistResponseItems();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterAccessWhitelistResponseDBClusterSecurityGroupsDBClusterSecurityGroup extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("SecurityGroupName")
        @Validation(required = true)
        public String securityGroupName;

        public static DescribeDBClusterAccessWhitelistResponseDBClusterSecurityGroupsDBClusterSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhitelistResponseDBClusterSecurityGroupsDBClusterSecurityGroup self = new DescribeDBClusterAccessWhitelistResponseDBClusterSecurityGroupsDBClusterSecurityGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterAccessWhitelistResponseDBClusterSecurityGroups extends TeaModel {
        @NameInMap("DBClusterSecurityGroup")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterAccessWhitelistResponseDBClusterSecurityGroupsDBClusterSecurityGroup> DBClusterSecurityGroup;

        public static DescribeDBClusterAccessWhitelistResponseDBClusterSecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhitelistResponseDBClusterSecurityGroups self = new DescribeDBClusterAccessWhitelistResponseDBClusterSecurityGroups();
            return TeaModel.build(map, self);
        }

    }

}
