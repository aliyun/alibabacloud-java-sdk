// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateNetworkAclRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the network ACL that you want to disassociate from a resource.</p>
     */
    @NameInMap("NetworkAclId")
    public String networkAclId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the network ACL.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The information about the associated resource.</p>
     */
    @NameInMap("Resource")
    public java.util.List<UnassociateNetworkAclRequestResource> resource;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UnassociateNetworkAclRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateNetworkAclRequest self = new UnassociateNetworkAclRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateNetworkAclRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UnassociateNetworkAclRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public UnassociateNetworkAclRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public static class UnassociateNetworkAclRequestResource extends TeaModel {
        /**
         * <p>The ID of the resource from which you want to disassociate the network ACL.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource from which you want to disassociate the network ACL. Set the value to **VSwitch**.</p>
         * <br>
         * <p>Valid values of **N**: 0 to 29. You can disassociate a network ACL from at most 30 resources at a time.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static UnassociateNetworkAclRequestResource build(java.util.Map<String, ?> map) throws Exception {
            UnassociateNetworkAclRequestResource self = new UnassociateNetworkAclRequestResource();
            return TeaModel.build(map, self);
        }

        public UnassociateNetworkAclRequestResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UnassociateNetworkAclRequestResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
