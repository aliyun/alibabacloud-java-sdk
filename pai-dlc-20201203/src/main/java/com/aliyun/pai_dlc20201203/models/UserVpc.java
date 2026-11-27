// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UserVpc extends TeaModel {
    /**
     * <p>The default route configuration. Valid values: eth0 and eth1. Currently, this parameter is used only in general-purpose computing 1.0 scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>eth1</p>
     */
    @NameInMap("DefaultRoute")
    public String defaultRoute;

    /**
     * <p>The secondary CIDR block (route configuration).</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   &quot;192.168.0.0/24&quot;,
     *   &quot;192.168.1.0/24&quot;
     * ]</p>
     */
    @NameInMap("ExtendedCIDRs")
    public java.util.List<String> extendedCIDRs;

    /**
     * <p>The role chain configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;roleType&quot;:&quot;service&quot;,
     *     &quot;roleArn&quot;:&quot;acs:ram::service account UID:role/roletoassumecustomerrole&quot;,
     *     &quot;assumeRoleFor&quot;: &quot;service account UID&quot;
     *   },
     *   {
     *     &quot;roleType&quot;:&quot;service&quot;,
     *     &quot;roleArn&quot;:&quot;acs:ram::end user UID:role/user-role&quot;,
     *     &quot;assumeRoleFor&quot;:&quot;end user UID&quot;
     *   }
     * ]</p>
     */
    @NameInMap("RoleChain")
    public String roleChain;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-xxx</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>vSwitch ID</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-xxx</p>
     */
    @NameInMap("SwitchId")
    public String switchId;

    /**
     * <p>Vpc ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static UserVpc build(java.util.Map<String, ?> map) throws Exception {
        UserVpc self = new UserVpc();
        return TeaModel.build(map, self);
    }

    public UserVpc setDefaultRoute(String defaultRoute) {
        this.defaultRoute = defaultRoute;
        return this;
    }
    public String getDefaultRoute() {
        return this.defaultRoute;
    }

    public UserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
        this.extendedCIDRs = extendedCIDRs;
        return this;
    }
    public java.util.List<String> getExtendedCIDRs() {
        return this.extendedCIDRs;
    }

    public UserVpc setRoleChain(String roleChain) {
        this.roleChain = roleChain;
        return this;
    }
    public String getRoleChain() {
        return this.roleChain;
    }

    public UserVpc setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public UserVpc setSwitchId(String switchId) {
        this.switchId = switchId;
        return this;
    }
    public String getSwitchId() {
        return this.switchId;
    }

    public UserVpc setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
