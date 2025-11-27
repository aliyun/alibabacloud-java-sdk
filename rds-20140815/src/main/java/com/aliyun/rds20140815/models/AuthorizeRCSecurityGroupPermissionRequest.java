// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AuthorizeRCSecurityGroupPermissionRequest extends TeaModel {
    /**
     * <p>The direction of the rule. Valid values:</p>
     * <ul>
     * <li><strong>ingress</strong>: the inbound security group rule.</li>
     * <li><strong>egress</strong>: the outbound security group rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ingress</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The region ID.</p>
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
     * <p>sg-2ze27hs990o2hn9****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The information about the security group.</p>
     */
    @NameInMap("SecurityGroupPermissions")
    public java.util.List<AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions> securityGroupPermissions;

    public static AuthorizeRCSecurityGroupPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeRCSecurityGroupPermissionRequest self = new AuthorizeRCSecurityGroupPermissionRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeRCSecurityGroupPermissionRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public AuthorizeRCSecurityGroupPermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AuthorizeRCSecurityGroupPermissionRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public AuthorizeRCSecurityGroupPermissionRequest setSecurityGroupPermissions(java.util.List<AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions> securityGroupPermissions) {
        this.securityGroupPermissions = securityGroupPermissions;
        return this;
    }
    public java.util.List<AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions> getSecurityGroupPermissions() {
        return this.securityGroupPermissions;
    }

    public static class AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions extends TeaModel {
        /**
         * <p>The destination CIDR block for outbound access control. CIDR blocks and IPv4 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1/12</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The protocol type supported by the rule. The value is not case-sensitive. Valid values:</p>
         * <ul>
         * <li><strong>ICMP</strong></li>
         * <li><strong>GRE</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>ALL</strong>: All protocols are supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The action that you want to specify in the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The range of destination ports that correspond to the transport layer protocol of the destination security group. Valid values:</p>
         * <ul>
         * <li>The value is in the X/Y format when IpProtocol is set to TCP or UDP. X specifies the start port number and Y specifies the end port number. X and Y range from <strong>1</strong> to <strong>65535</strong>. The start port number and the end port number are separated by a forward slash (/). Correct example: <strong>1/200</strong>. Incorrect example: <strong>200/1</strong>.</li>
         * <li>Valid value when IpProtocol is set to ICMP: <strong>-1/-1</strong>.</li>
         * <li>Valid value when IpProtocol is set to GRE: <strong>-1/-1</strong>.</li>
         * <li>Valid value when IpProtocol is set to ALL: <strong>-1/-1</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the rule. Valid values: 1 to 100. A smaller value indicates a higher priority. When multiple security group rules have the same priority, drop rules take precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The source CIDR block for inbound access control. CIDR blocks and IPv4 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1/12</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The range of port numbers that correspond to the transport layer protocol for the source security group. Valid values:</p>
         * <ul>
         * <li>The value is in the X/Y format when IpProtocol is set to TCP or UDP. X specifies the start port number and Y specifies the end port number. X and Y range from <strong>1</strong> to <strong>65535</strong>. The start port number and the end port number are separated by a forward slash (/). Correct example: <strong>1/200</strong>. Incorrect example: <strong>200/1</strong>.</li>
         * <li>Valid value when IpProtocol is set to ICMP: <strong>-1/-1</strong>.</li>
         * <li>Valid value when IpProtocol is set to GRE: <strong>-1/-1</strong>.</li>
         * <li>Valid value when IpProtocol is set to ALL: <strong>-1/-1</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions build(java.util.Map<String, ?> map) throws Exception {
            AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions self = new AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions();
            return TeaModel.build(map, self);
        }

        public AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public AuthorizeRCSecurityGroupPermissionRequestSecurityGroupPermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
