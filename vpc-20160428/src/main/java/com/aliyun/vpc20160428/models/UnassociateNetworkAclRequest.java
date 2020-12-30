// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateNetworkAclRequest extends TeaModel {
    @NameInMap("NetworkAclId")
    public String networkAclId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Resource")
    public java.util.List<UnassociateNetworkAclRequestResource> resource;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static UnassociateNetworkAclRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateNetworkAclRequest self = new UnassociateNetworkAclRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateNetworkAclRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public UnassociateNetworkAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnassociateNetworkAclRequest setResource(java.util.List<UnassociateNetworkAclRequestResource> resource) {
        this.resource = resource;
        return this;
    }
    public java.util.List<UnassociateNetworkAclRequestResource> getResource() {
        return this.resource;
    }

    public UnassociateNetworkAclRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnassociateNetworkAclRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnassociateNetworkAclRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnassociateNetworkAclRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UnassociateNetworkAclRequestResource extends TeaModel {
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceId")
        public String resourceId;

        public static UnassociateNetworkAclRequestResource build(java.util.Map<String, ?> map) throws Exception {
            UnassociateNetworkAclRequestResource self = new UnassociateNetworkAclRequestResource();
            return TeaModel.build(map, self);
        }

        public UnassociateNetworkAclRequestResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public UnassociateNetworkAclRequestResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
