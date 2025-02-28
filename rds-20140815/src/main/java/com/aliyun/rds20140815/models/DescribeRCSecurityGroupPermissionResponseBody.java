// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCSecurityGroupPermissionResponseBody extends TeaModel {
    @NameInMap("InnerAccessPolicy")
    public String innerAccessPolicy;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupPermissions")
    public java.util.List<DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions> securityGroupPermissions;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeRCSecurityGroupPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCSecurityGroupPermissionResponseBody self = new DescribeRCSecurityGroupPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCSecurityGroupPermissionResponseBody setInnerAccessPolicy(String innerAccessPolicy) {
        this.innerAccessPolicy = innerAccessPolicy;
        return this;
    }
    public String getInnerAccessPolicy() {
        return this.innerAccessPolicy;
    }

    public DescribeRCSecurityGroupPermissionResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCSecurityGroupPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCSecurityGroupPermissionResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeRCSecurityGroupPermissionResponseBody setSecurityGroupPermissions(java.util.List<DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions> securityGroupPermissions) {
        this.securityGroupPermissions = securityGroupPermissions;
        return this;
    }
    public java.util.List<DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions> getSecurityGroupPermissions() {
        return this.securityGroupPermissions;
    }

    public DescribeRCSecurityGroupPermissionResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions extends TeaModel {
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("SecurityGroupRuleId")
        public String securityGroupRuleId;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions self = new DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions();
            return TeaModel.build(map, self);
        }

        public DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions setSecurityGroupRuleId(String securityGroupRuleId) {
            this.securityGroupRuleId = securityGroupRuleId;
            return this;
        }
        public String getSecurityGroupRuleId() {
            return this.securityGroupRuleId;
        }

        public DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
