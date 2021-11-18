// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class SecurityGroup extends TeaModel {
    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 描述
    @NameInMap("Description")
    public String description;

    // 安全组id
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // 名称
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    // vpc id
    @NameInMap("VpcId")
    public String vpcId;

    public static SecurityGroup build(java.util.Map<String, ?> map) throws Exception {
        SecurityGroup self = new SecurityGroup();
        return TeaModel.build(map, self);
    }

    public SecurityGroup setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public SecurityGroup setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SecurityGroup setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SecurityGroup setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public SecurityGroup setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
