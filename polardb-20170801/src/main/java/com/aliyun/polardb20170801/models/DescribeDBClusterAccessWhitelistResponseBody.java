// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhitelistResponseBody extends TeaModel {
    /**
     * <p>The Elastic Compute Service (ECS) security groups that are associated with the cluster.</p>
     */
    @NameInMap("DBClusterSecurityGroups")
    public DescribeDBClusterAccessWhitelistResponseBodyDBClusterSecurityGroups DBClusterSecurityGroups;

    /**
     * <p>The details about the cluster.</p>
     */
    @NameInMap("Items")
    public DescribeDBClusterAccessWhitelistResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>559E91A2-CDA3-4E9F-808B-29D738******</p>
     */
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
        /**
         * <p>The ID of the ECS security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp**************</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the ECS security group.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-********************</p>
         */
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
        /**
         * <p>The attributes of the IP whitelist group. Set this parameter to <strong>hidden</strong> to hide the IP whitelist group in the console.</p>
         * <blockquote>
         * <ul>
         * <li>The IP whitelist group that has appeared in the console cannot be hidden.</li>
         * <li>This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hidden</p>
         */
        @NameInMap("DBClusterIPArrayAttribute")
        public String DBClusterIPArrayAttribute;

        /**
         * <p>The name of the IP whitelist group. The group name must be 2 to 120 characters in length and consists of lowercase letters and digits. It must start with a letter, and end with a letter or a digit.</p>
         * <ul>
         * <li>If the specified whitelist group name does not exist, the whitelist group is created.</li>
         * <li>If the specified whitelist group name exists, the whitelist group is modified.</li>
         * <li>If you do not specify this parameter, the default group is modified.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can create a maximum of 50 IP whitelist groups for a cluster.</li>
         * <li>This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("DBClusterIPArrayName")
        public String DBClusterIPArrayName;

        /**
         * <p>The IP addresses or Classless Inter-Domain Routing (CIDR) blocks in the IP whitelist group. You can add 1,000 IP addresses or CIDR blocks to all the IP whitelist groups. Separate multiple IP addresses with commas (,). The following two formats are supported:</p>
         * <ul>
         * <li>IP addresses. Example: 10.23.12.24.</li>
         * <li>CIDR blocks. Example: 10.23.12.24/24. 24 indicates the length of the prefix of the CIDR block. The length is the range of 1 to 32.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>11.<em><strong>.</strong></em>.<em><strong>,11.</strong></em>.<em><strong>.</strong></em></p>
         */
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
