// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupConfigurationResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The information about the ECS security group.</p>
     */
    @NameInMap("Items")
    public DescribeSecurityGroupConfigurationResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSecurityGroupConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupConfigurationResponseBody self = new DescribeSecurityGroupConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupConfigurationResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeSecurityGroupConfigurationResponseBody setItems(DescribeSecurityGroupConfigurationResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSecurityGroupConfigurationResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSecurityGroupConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation extends TeaModel {
        /**
         * <p>The network type of the ECS security group. Valid values:</p>
         * <br>
         * <p>*   **Classic**</p>
         * <p>*   **VPC**</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the ECS security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The security group name.</p>
         */
        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        public static DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation self = new DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

    }

    public static class DescribeSecurityGroupConfigurationResponseBodyItems extends TeaModel {
        @NameInMap("EcsSecurityGroupRelation")
        public java.util.List<DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation> ecsSecurityGroupRelation;

        public static DescribeSecurityGroupConfigurationResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupConfigurationResponseBodyItems self = new DescribeSecurityGroupConfigurationResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupConfigurationResponseBodyItems setEcsSecurityGroupRelation(java.util.List<DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation> ecsSecurityGroupRelation) {
            this.ecsSecurityGroupRelation = ecsSecurityGroupRelation;
            return this;
        }
        public java.util.List<DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation> getEcsSecurityGroupRelation() {
            return this.ecsSecurityGroupRelation;
        }

    }

}
