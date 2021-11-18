// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class Vpc extends TeaModel {
    // vpc子网
    @NameInMap("CidrBlock")
    public String cidrBlock;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // vpc描述
    @NameInMap("Description")
    public String description;

    // 是否默认
    @NameInMap("IsDefault")
    public Boolean isDefault;

    // vpc状态
    @NameInMap("Status")
    public String status;

    // 路由id
    @NameInMap("VRouterId")
    public String VRouterId;

    // vpc id
    @NameInMap("VpcId")
    public String vpcId;

    // vpc名称
    @NameInMap("VpcName")
    public String vpcName;

    public static Vpc build(java.util.Map<String, ?> map) throws Exception {
        Vpc self = new Vpc();
        return TeaModel.build(map, self);
    }

    public Vpc setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public Vpc setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Vpc setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Vpc setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Vpc setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Vpc setVRouterId(String VRouterId) {
        this.VRouterId = VRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.VRouterId;
    }

    public Vpc setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public Vpc setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

}
