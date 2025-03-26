// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCSecurityGroupListResponseBody extends TeaModel {
    @NameInMap("RCSecurityGroups")
    public java.util.List<DescribeRCSecurityGroupListResponseBodyRCSecurityGroups> RCSecurityGroups;

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
        @NameInMap("AvailableInstanceAmount")
        public Integer availableInstanceAmount;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SecurityGroupType")
        public String securityGroupType;

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
