// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateNetworkAclRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("NetworkAclId")
    public String networkAclId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Resource")
    public java.util.List<AssociateNetworkAclRequestResource> resource;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AssociateNetworkAclRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkAclRequest self = new AssociateNetworkAclRequest();
        return TeaModel.build(map, self);
    }

    public AssociateNetworkAclRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateNetworkAclRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public AssociateNetworkAclRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssociateNetworkAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateNetworkAclRequest setResource(java.util.List<AssociateNetworkAclRequestResource> resource) {
        this.resource = resource;
        return this;
    }
    public java.util.List<AssociateNetworkAclRequestResource> getResource() {
        return this.resource;
    }

    public AssociateNetworkAclRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssociateNetworkAclRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class AssociateNetworkAclRequestResource extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static AssociateNetworkAclRequestResource build(java.util.Map<String, ?> map) throws Exception {
            AssociateNetworkAclRequestResource self = new AssociateNetworkAclRequestResource();
            return TeaModel.build(map, self);
        }

        public AssociateNetworkAclRequestResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AssociateNetworkAclRequestResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
