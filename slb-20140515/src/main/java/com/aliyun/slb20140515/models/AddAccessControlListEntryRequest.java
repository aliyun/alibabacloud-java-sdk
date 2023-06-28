// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddAccessControlListEntryRequest extends TeaModel {
    /**
     * <p>The configuration of the network ACL. Valid values:</p>
     * <br>
     * <p>*   **entry**: the IP entries that you want to add to the network ACL. You can add CIDR blocks. Separate multiple CIDR blocks with commas (,).</p>
     * <p>*   **comment**: the comment on the network ACL.</p>
     * <br>
     * <p>> You can add at most 50 IP entries to a network ACL in each call. If the IP entry that you want to add to a network ACL already exists, the IP entry is not added. The IP entries that you add must be CIDR blocks.</p>
     */
    @NameInMap("AclEntrys")
    public String aclEntrys;

    /**
     * <p>The ID of the network ACL.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the network ACL.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddAccessControlListEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAccessControlListEntryRequest self = new AddAccessControlListEntryRequest();
        return TeaModel.build(map, self);
    }

    public AddAccessControlListEntryRequest setAclEntrys(String aclEntrys) {
        this.aclEntrys = aclEntrys;
        return this;
    }
    public String getAclEntrys() {
        return this.aclEntrys;
    }

    public AddAccessControlListEntryRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public AddAccessControlListEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddAccessControlListEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddAccessControlListEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddAccessControlListEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddAccessControlListEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
