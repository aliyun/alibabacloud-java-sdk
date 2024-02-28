// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeKmsAssociateResourcesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("KmsResourceId")
    public String kmsResourceId;

    @NameInMap("KmsResourceRegionId")
    public String kmsResourceRegionId;

    @NameInMap("KmsResourceType")
    public String kmsResourceType;

    @NameInMap("KmsResourceUser")
    public String kmsResourceUser;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static DescribeKmsAssociateResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsAssociateResourcesRequest self = new DescribeKmsAssociateResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKmsAssociateResourcesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeKmsAssociateResourcesRequest setKmsResourceId(String kmsResourceId) {
        this.kmsResourceId = kmsResourceId;
        return this;
    }
    public String getKmsResourceId() {
        return this.kmsResourceId;
    }

    public DescribeKmsAssociateResourcesRequest setKmsResourceRegionId(String kmsResourceRegionId) {
        this.kmsResourceRegionId = kmsResourceRegionId;
        return this;
    }
    public String getKmsResourceRegionId() {
        return this.kmsResourceRegionId;
    }

    public DescribeKmsAssociateResourcesRequest setKmsResourceType(String kmsResourceType) {
        this.kmsResourceType = kmsResourceType;
        return this;
    }
    public String getKmsResourceType() {
        return this.kmsResourceType;
    }

    public DescribeKmsAssociateResourcesRequest setKmsResourceUser(String kmsResourceUser) {
        this.kmsResourceUser = kmsResourceUser;
        return this;
    }
    public String getKmsResourceUser() {
        return this.kmsResourceUser;
    }

    public DescribeKmsAssociateResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeKmsAssociateResourcesRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeKmsAssociateResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeKmsAssociateResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeKmsAssociateResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeKmsAssociateResourcesRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
