// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UserVpc extends TeaModel {
    // ExtendedCIDRs
    @NameInMap("ExtendedCIDRs")
    public java.util.List<String> extendedCIDRs;

    // SecurityGroupID
    @NameInMap("SecurityGroupID")
    public String securityGroupID;

    // VSW ID
    @NameInMap("SwitchID")
    public String switchID;

    // VPC ID
    @NameInMap("VpcID")
    public String vpcID;

    public static UserVpc build(java.util.Map<String, ?> map) throws Exception {
        UserVpc self = new UserVpc();
        return TeaModel.build(map, self);
    }

    public UserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
        this.extendedCIDRs = extendedCIDRs;
        return this;
    }
    public java.util.List<String> getExtendedCIDRs() {
        return this.extendedCIDRs;
    }

    public UserVpc setSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
        return this;
    }
    public String getSecurityGroupID() {
        return this.securityGroupID;
    }

    public UserVpc setSwitchID(String switchID) {
        this.switchID = switchID;
        return this;
    }
    public String getSwitchID() {
        return this.switchID;
    }

    public UserVpc setVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }
    public String getVpcID() {
        return this.vpcID;
    }

}
