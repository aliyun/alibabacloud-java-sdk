// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCSecurityGroupPermissionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Accept</p>
     */
    @NameInMap("InnerAccessPolicy")
    public String innerAccessPolicy;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>847BA085-B377-4BFA-8267-F82345ECE1D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>sg-2ze27hs990o2hn94****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupPermissions")
    public java.util.List<DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions> securityGroupPermissions;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp1opxu1zkhn****</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2025-05-31T03:12:29Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.0/0</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <strong>example:</strong>
         * <p>ingress</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <strong>example:</strong>
         * <p>Accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <strong>example:</strong>
         * <p>sgr-uf6ffg4du0e9jis2****</p>
         */
        @NameInMap("SecurityGroupRuleId")
        public String securityGroupRuleId;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.0/0</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions self = new DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions();
            return TeaModel.build(map, self);
        }

        public DescribeRCSecurityGroupPermissionResponseBodySecurityGroupPermissions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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
