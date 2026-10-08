// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AuthorizeRCSecurityGroupPermissionRequest extends TeaModel {
    /**
     * <p>The direction of the rule. Valid values:</p>
     * <ul>
     * <li><strong>ingress</strong>: inbound.</li>
     * <li><strong>egress</strong>: outbound.</li>
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
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-2ze27hs990o2hn9****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The security group information.</p>
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
         * <p>The destination IP address range for outbound authorization. CIDR format and IPv4 IP address ranges are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1/12</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The protocol type. This parameter is case-insensitive. Valid values: </p>
         * <ul>
         * <li><strong>ICMP</strong></li>
         * <li><strong>GRE</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>ALL</strong>: all protocols.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The range of destination ports for the transport layer protocol. Valid values:</p>
         * <ul>
         * <li>TCP/UDP: valid values are <strong>1</strong> to <strong>65535</strong>. Separate the start port and the end port with a forward slash (/). Example of a valid value: <strong>1/200</strong>. Example of an invalid value: <strong>200/1</strong>.</li>
         * <li>ICMP: <strong>-1/-1</strong>.</li>
         * <li>GRE: <strong>-1/-1</strong>.</li>
         * <li>If IpProtocol is set to all: <strong>-1/-1</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the rule. Valid values: 1 to 100. A smaller value indicates a higher priority. If two security group rules have the same priority, the deny rule takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The source IP address range for inbound authorization. CIDR format and IPv4 IP address ranges are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1/12</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The range of source ports for the transport layer protocol. Valid values:</p>
         * <ul>
         * <li>TCP/UDP: valid values are <strong>1</strong> to <strong>65535</strong>. Separate the start port and the end port with a forward slash (/). Example of a valid value: <strong>1/200</strong>. Example of an invalid value: <strong>200/1</strong>.</li>
         * <li>ICMP: <strong>-1/-1</strong>.</li>
         * <li>GRE: <strong>-1/-1</strong>.</li>
         * <li>If IpProtocol is set to all: <strong>-1/-1</strong>.</li>
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
