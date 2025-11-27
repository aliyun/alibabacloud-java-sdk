// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCSecurityGroupListResponseBody extends TeaModel {
    /**
     * <p>The basic information about the security groups.</p>
     */
    @NameInMap("RCSecurityGroups")
    public java.util.List<DescribeRCSecurityGroupListResponseBodyRCSecurityGroups> RCSecurityGroups;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7A41C147-C8D0-4DAE-A1A2-17EBCD60DFA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCSecurityGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCSecurityGroupListResponseBody self = new DescribeRCSecurityGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCSecurityGroupListResponseBody setRCSecurityGroups(java.util.List<DescribeRCSecurityGroupListResponseBodyRCSecurityGroups> RCSecurityGroups) {
        this.RCSecurityGroups = RCSecurityGroups;
        return this;
    }
    public java.util.List<DescribeRCSecurityGroupListResponseBodyRCSecurityGroups> getRCSecurityGroups() {
        return this.RCSecurityGroups;
    }

    public DescribeRCSecurityGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRCSecurityGroupListResponseBodyRCSecurityGroups extends TeaModel {
        /**
         * <p>The number of instances that can be added to the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("AvailableInstanceAmount")
        public Integer availableInstanceAmount;

        /**
         * <p>The time when the security group was created. The time follows the ISO 8601 standard and is in the <code>yyyy-MM-ddThh:mmZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-31T03:12:29Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of instances that are added to the security group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze27hs990o2hn9****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The type of the security group. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: a normal security group.</li>
         * <li><strong>enterprise</strong>: an advanced security group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("SecurityGroupType")
        public String securityGroupType;

        /**
         * <p>The ID of the VPC to which the security group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1opxu1zkhn****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeRCSecurityGroupListResponseBodyRCSecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCSecurityGroupListResponseBodyRCSecurityGroups self = new DescribeRCSecurityGroupListResponseBodyRCSecurityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeRCSecurityGroupListResponseBodyRCSecurityGroups setAvailableInstanceAmount(Integer availableInstanceAmount) {
            this.availableInstanceAmount = availableInstanceAmount;
            return this;
        }
        public Integer getAvailableInstanceAmount() {
            return this.availableInstanceAmount;
        }

        public DescribeRCSecurityGroupListResponseBodyRCSecurityGroups setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRCSecurityGroupListResponseBodyRCSecurityGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRCSecurityGroupListResponseBodyRCSecurityGroups setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeRCSecurityGroupListResponseBodyRCSecurityGroups setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeRCSecurityGroupListResponseBodyRCSecurityGroups setSecurityGroupType(String securityGroupType) {
            this.securityGroupType = securityGroupType;
            return this;
        }
        public String getSecurityGroupType() {
            return this.securityGroupType;
        }

        public DescribeRCSecurityGroupListResponseBodyRCSecurityGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
