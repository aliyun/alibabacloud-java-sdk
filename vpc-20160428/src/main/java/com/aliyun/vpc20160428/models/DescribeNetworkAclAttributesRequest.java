// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclAttributesRequest extends TeaModel {
    @NameInMap("NetworkAclId")
    public String networkAclId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DescribeNetworkAclAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAclAttributesRequest self = new DescribeNetworkAclAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAclAttributesRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public DescribeNetworkAclAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkAclAttributesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeNetworkAclAttributesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeNetworkAclAttributesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeNetworkAclAttributesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
