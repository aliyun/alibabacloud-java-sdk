// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCSecurityGroupPermissionRequest extends TeaModel {
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

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupRuleId")
    public String securityGroupRuleId;

    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    public static ModifyRCSecurityGroupPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCSecurityGroupPermissionRequest self = new ModifyRCSecurityGroupPermissionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCSecurityGroupPermissionRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public ModifyRCSecurityGroupPermissionRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModifyRCSecurityGroupPermissionRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifyRCSecurityGroupPermissionRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ModifyRCSecurityGroupPermissionRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public ModifyRCSecurityGroupPermissionRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ModifyRCSecurityGroupPermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRCSecurityGroupPermissionRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifyRCSecurityGroupPermissionRequest setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }
    public String getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    public ModifyRCSecurityGroupPermissionRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public ModifyRCSecurityGroupPermissionRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

}
