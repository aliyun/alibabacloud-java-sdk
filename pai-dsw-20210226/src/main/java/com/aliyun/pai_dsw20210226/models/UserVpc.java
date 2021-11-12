// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class UserVpc extends TeaModel {
    // 角色标识码
    @NameInMap("RoleArn")
    public String roleArn;

    // 安全组ID
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // 虚拟网络ID
    @NameInMap("VpcId")
    public String vpcId;

    // 虚拟交换机ID
    @NameInMap("VswitchId")
    public String vswitchId;

    public static UserVpc build(java.util.Map<String, ?> map) throws Exception {
        UserVpc self = new UserVpc();
        return TeaModel.build(map, self);
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

    public UserVpc setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public UserVpc setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

}
