// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupConfigurationResponseBody extends TeaModel {
    /**
     * <p>The network type of the security group. Valid values:</p>
     * <br>
     * <p>*   **classic**: the classic network.</p>
     * <p>*   **vpc**: the virtual private cloud (VPC).</p>
     */
    @NameInMap("Items")
    public DescribeSecurityGroupConfigurationResponseBodyItems items;

    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSecurityGroupConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupConfigurationResponseBody self = new DescribeSecurityGroupConfigurationResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>Queries the security groups that are included in the whitelist of an ApsaraDB for Redis instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The operation that you want to perform. Set the value to **DescribeSecurityGroupConfiguration**.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation self = new DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
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
