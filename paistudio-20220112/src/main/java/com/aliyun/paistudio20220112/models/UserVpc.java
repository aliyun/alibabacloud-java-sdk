// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UserVpc extends TeaModel {
    @NameInMap("DefaultRoute")
    public String defaultRoute;

    @NameInMap("ExtendedCIDRs")
    public java.util.List<String> extendedCIDRs;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SwitchId")
    public String switchId;

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

    public UserVpc setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
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
