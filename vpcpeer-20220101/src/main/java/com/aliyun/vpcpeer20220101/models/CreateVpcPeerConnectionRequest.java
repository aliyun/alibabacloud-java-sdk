// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class CreateVpcPeerConnectionRequest extends TeaModel {
    @NameInMap("AcceptingAliUid")
    public Long acceptingAliUid;

    @NameInMap("AcceptingRegionId")
    public String acceptingRegionId;

    @NameInMap("AcceptingVpcId")
    public String acceptingVpcId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("VpcId")
    public String vpcId;

    public static CreateVpcPeerConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcPeerConnectionRequest self = new CreateVpcPeerConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcPeerConnectionRequest setAcceptingAliUid(Long acceptingAliUid) {
        this.acceptingAliUid = acceptingAliUid;
        return this;
    }
    public Long getAcceptingAliUid() {
        return this.acceptingAliUid;
    }

    public CreateVpcPeerConnectionRequest setAcceptingRegionId(String acceptingRegionId) {
        this.acceptingRegionId = acceptingRegionId;
        return this;
    }
    public String getAcceptingRegionId() {
        return this.acceptingRegionId;
    }

    public CreateVpcPeerConnectionRequest setAcceptingVpcId(String acceptingVpcId) {
        this.acceptingVpcId = acceptingVpcId;
        return this;
    }
    public String getAcceptingVpcId() {
        return this.acceptingVpcId;
    }

    public CreateVpcPeerConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpcPeerConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpcPeerConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVpcPeerConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpcPeerConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpcPeerConnectionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVpcPeerConnectionRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
