// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UserVpc extends TeaModel {
    @NameInMap("DefaultForwardInfo")
    public ForwardInfo defaultForwardInfo;

    /**
     * <p>DefaultRoute</p>
     * 
     * <strong>example:</strong>
     * <p>eth0</p>
     */
    @NameInMap("DefaultRoute")
    public String defaultRoute;

    /**
     * <p>ExtendedCIDRs</p>
     */
    @NameInMap("ExtendedCIDRs")
    public java.util.List<String> extendedCIDRs;

    /**
     * <p>RoleArn</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::25xxxx:role/AliyunPAIDLCDefaultRole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>SecurityGroupID</p>
     * 
     * <strong>example:</strong>
     * <p>sg-abcdef****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>VSW ID</p>
     * 
     * <strong>example:</strong>
     * <p>vs-abcdef****</p>
     */
    @NameInMap("SwitchId")
    public String switchId;

    /**
     * <p>VPC ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-abcdef****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static UserVpc build(java.util.Map<String, ?> map) throws Exception {
        UserVpc self = new UserVpc();
        return TeaModel.build(map, self);
    }

    public UserVpc setDefaultForwardInfo(ForwardInfo defaultForwardInfo) {
        this.defaultForwardInfo = defaultForwardInfo;
        return this;
    }
    public ForwardInfo getDefaultForwardInfo() {
        return this.defaultForwardInfo;
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
