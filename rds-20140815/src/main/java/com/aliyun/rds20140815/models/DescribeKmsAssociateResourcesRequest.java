// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeKmsAssociateResourcesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the KMS resource. Only key IDs are supported.</p>
     */
    @NameInMap("KmsResourceId")
    public String kmsResourceId;

    /**
     * <p>The ID of the region to which the KMS resource belongs.</p>
     */
    @NameInMap("KmsResourceRegionId")
    public String kmsResourceRegionId;

    /**
     * <p>The type of the KMS resource. Only key is supported.</p>
     */
    @NameInMap("KmsResourceType")
    public String kmsResourceType;

    /**
     * <p>The ID of the Alibaba Cloud account to which the KMS resource belongs.</p>
     */
    @NameInMap("KmsResourceUser")
    public String kmsResourceUser;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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

    public DescribeKmsAssociateResourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
