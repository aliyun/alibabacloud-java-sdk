// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AuthorizeRCSecurityGroupPermissionRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

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
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

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
