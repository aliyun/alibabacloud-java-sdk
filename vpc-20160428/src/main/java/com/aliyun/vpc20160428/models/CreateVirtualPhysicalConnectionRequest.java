// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualPhysicalConnectionRequest extends TeaModel {
    // Vpconn的description
    @NameInMap("Description")
    public String description;

    // DryRun
    @NameInMap("DryRun")
    public Boolean dryRun;

    // Vpconn的name
    @NameInMap("Name")
    public String name;

    // vpconn的支付方
    @NameInMap("OrderMode")
    public String orderMode;

    // Vpconn的主Pconn
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    @NameInMap("RegionId")
    public String regionId;

    // vpconn规格
    @NameInMap("Spec")
    public String spec;

    // 幂等Token
    @NameInMap("Token")
    public String token;

    // vpconn的VlanID
    @NameInMap("VlanId")
    public Long vlanId;

    // Vpconn拥有者
    @NameInMap("VpconnAliUid")
    public Long vpconnAliUid;

    public static CreateVirtualPhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualPhysicalConnectionRequest self = new CreateVirtualPhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualPhysicalConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVirtualPhysicalConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVirtualPhysicalConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVirtualPhysicalConnectionRequest setOrderMode(String orderMode) {
        this.orderMode = orderMode;
        return this;
    }
    public String getOrderMode() {
        return this.orderMode;
    }

    public CreateVirtualPhysicalConnectionRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public CreateVirtualPhysicalConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVirtualPhysicalConnectionRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateVirtualPhysicalConnectionRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateVirtualPhysicalConnectionRequest setVlanId(Long vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public Long getVlanId() {
        return this.vlanId;
    }

    public CreateVirtualPhysicalConnectionRequest setVpconnAliUid(Long vpconnAliUid) {
        this.vpconnAliUid = vpconnAliUid;
        return this;
    }
    public Long getVpconnAliUid() {
        return this.vpconnAliUid;
    }

}
