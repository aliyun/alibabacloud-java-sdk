// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupConfigurationResponseBody extends TeaModel {
    /**
     * <p>The list of security groups.</p>
     */
    @NameInMap("Items")
    public DescribeSecurityGroupConfigurationResponseBodyItems items;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>981C0D6A-D9DD-466C-92DA-F29DF755****</p>
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
        /**
         * <p>The network type of the security group. Valid values:</p>
         * <ul>
         * <li><strong>classic</strong>: the classic network.</li>
         * <li><strong>vpc</strong>: the virtual private cloud (VPC).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The ID of the region where the instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp14p9y07ns3gwq****</p>
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
