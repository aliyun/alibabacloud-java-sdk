// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateCloudConnectNetworkRequest extends TeaModel {
    /**
     * <p>The private CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>172.XX.XX.0/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The description of the CCN instance.</p>
     * <p>The description must be 2 to 128 characters in length and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>ccndesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the CCN instance.</p>
     * <p>The name must be 2 to 100 characters in length and can contain letters, digits, periods (.), underscores (_),and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>ccnname</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the CCN instance is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The private CIDR block used for Source Network Address Translation (SNAT).</p>
     * 
     * <strong>example:</strong>
     * <p>172.XX.XX.0/25</p>
     */
    @NameInMap("SnatCidrBlock")
    public String snatCidrBlock;

    public static CreateCloudConnectNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudConnectNetworkRequest self = new CreateCloudConnectNetworkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudConnectNetworkRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateCloudConnectNetworkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCloudConnectNetworkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCloudConnectNetworkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCloudConnectNetworkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCloudConnectNetworkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCloudConnectNetworkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCloudConnectNetworkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCloudConnectNetworkRequest setSnatCidrBlock(String snatCidrBlock) {
        this.snatCidrBlock = snatCidrBlock;
        return this;
    }
    public String getSnatCidrBlock() {
        return this.snatCidrBlock;
    }

}
