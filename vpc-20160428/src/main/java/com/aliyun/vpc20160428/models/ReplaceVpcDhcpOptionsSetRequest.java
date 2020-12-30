// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ReplaceVpcDhcpOptionsSetRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DhcpOptionsSetId")
    public String dhcpOptionsSetId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static ReplaceVpcDhcpOptionsSetRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceVpcDhcpOptionsSetRequest self = new ReplaceVpcDhcpOptionsSetRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceVpcDhcpOptionsSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReplaceVpcDhcpOptionsSetRequest setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public ReplaceVpcDhcpOptionsSetRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ReplaceVpcDhcpOptionsSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReplaceVpcDhcpOptionsSetRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReplaceVpcDhcpOptionsSetRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReplaceVpcDhcpOptionsSetRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReplaceVpcDhcpOptionsSetRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReplaceVpcDhcpOptionsSetRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
