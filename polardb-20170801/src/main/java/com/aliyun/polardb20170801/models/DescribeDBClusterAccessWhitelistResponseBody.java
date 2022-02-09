// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhitelistResponseBody extends TeaModel {
    @NameInMap("DBClusterSecurityGroups")
    public DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroups DBClusterSecurityGroups;

    @NameInMap("Items")
    public DescribeDBClusterAccessWhitelistResponseBodyItems items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterAccessWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAccessWhitelistResponseBody self = new DescribeDBClusterAccessWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAccessWhitelistResponseBody setDBClusterSecurityGroups(DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroups DBClusterSecurityGroups) {
        this.DBClusterSecurityGroups = DBClusterSecurityGroups;
        return this;
    }
    public DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroups getDBClusterSecurityGroups() {
        return this.DBClusterSecurityGroups;
    }

    public DescribeDBClusterAccessWhitelistResponseBody setItems(DescribeDBClusterAccessWhitelistResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBClusterAccessWhitelistResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBClusterAccessWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroupsDBClusterSecurityGroup extends TeaModel {
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        public static DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroupsDBClusterSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroupsDBClusterSecurityGroup self = new DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroupsDBClusterSecurityGroup();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroupsDBClusterSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroupsDBClusterSecurityGroup setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

    }

    public static class DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroups extends TeaModel {
        @NameInMap("DBClusterSecurityGroup")
        public java.util.List<DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroupsDBClusterSecurityGroup> DBClusterSecurityGroup;

        public static DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroups self = new DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroups setDBClusterSecurityGroup(java.util.List<DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroupsDBClusterSecurityGroup> DBClusterSecurityGroup) {
            this.DBClusterSecurityGroup = DBClusterSecurityGroup;
            return this;
        }
        public java.util.List<DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroupsDBClusterSecurityGroup> getDBClusterSecurityGroup() {
            return this.DBClusterSecurityGroup;
        }

    }

    public static class DescribeDBClusterAccessWhitelistResponseBodyItemsDBClusterIPArray extends TeaModel {
        @NameInMap("DBClusterIPArrayAttribute")
        public String DBClusterIPArrayAttribute;

        @NameInMap("DBClusterIPArrayName")
        public String DBClusterIPArrayName;

        @NameInMap("SecurityIps")
        public String securityIps;

        public static DescribeDBClusterAccessWhitelistResponseBodyItemsDBClusterIPArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhitelistResponseBodyItemsDBClusterIPArray self = new DescribeDBClusterAccessWhitelistResponseBodyItemsDBClusterIPArray();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAccessWhitelistResponseBodyItemsDBClusterIPArray setDBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
            this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
            return this;
        }
        public String getDBClusterIPArrayAttribute() {
            return this.DBClusterIPArrayAttribute;
        }

        public DescribeDBClusterAccessWhitelistResponseBodyItemsDBClusterIPArray setDBClusterIPArrayName(String DBClusterIPArrayName) {
            this.DBClusterIPArrayName = DBClusterIPArrayName;
            return this;
        }
        public String getDBClusterIPArrayName() {
            return this.DBClusterIPArrayName;
        }

        public DescribeDBClusterAccessWhitelistResponseBodyItemsDBClusterIPArray setSecurityIps(String securityIps) {
            this.securityIps = securityIps;
            return this;
        }
        public String getSecurityIps() {
            return this.securityIps;
        }

    }

    public static class DescribeDBClusterAccessWhitelistResponseBodyItems extends TeaModel {
        @NameInMap("DBClusterIPArray")
        public java.util.List<DescribeDBClusterAccessWhitelistResponseBodyItemsDBClusterIPArray> DBClusterIPArray;

        public static DescribeDBClusterAccessWhitelistResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhitelistResponseBodyItems self = new DescribeDBClusterAccessWhitelistResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAccessWhitelistResponseBodyItems setDBClusterIPArray(java.util.List<DescribeDBClusterAccessWhitelistResponseBodyItemsDBClusterIPArray> DBClusterIPArray) {
            this.DBClusterIPArray = DBClusterIPArray;
            return this;
        }
        public java.util.List<DescribeDBClusterAccessWhitelistResponseBodyItemsDBClusterIPArray> getDBClusterIPArray() {
            return this.DBClusterIPArray;
        }

    }

}
