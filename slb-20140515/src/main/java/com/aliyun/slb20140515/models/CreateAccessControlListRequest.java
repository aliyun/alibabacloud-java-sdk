// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateAccessControlListRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **CreateAccessControlList**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclName")
    public String aclName;

    /**
     * <p>The ID of the region where you want to create the ACL.</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the ACL. The name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), hyphens (-), forward slashes (/), and underscores (_). The name of the ACL that you create must be unique within each region.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAccessControlListRequestTag> tag;

    public static CreateAccessControlListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessControlListRequest self = new CreateAccessControlListRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessControlListRequest setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public CreateAccessControlListRequest setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public CreateAccessControlListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAccessControlListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAccessControlListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAccessControlListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAccessControlListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAccessControlListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAccessControlListRequest setTag(java.util.List<CreateAccessControlListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAccessControlListRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateAccessControlListRequestTag extends TeaModel {
        /**
         * <p>The tag key of the bastion host. Valid values of N: **1 to 20**. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be at most 64 characters in length, and cannot contain `http://` or `https://`. It must not start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify at most 20 tag values. The tag value cannot be an empty string.</p>
         * <br>
         * <p>The tag value must be 1 to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAccessControlListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessControlListRequestTag self = new CreateAccessControlListRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAccessControlListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAccessControlListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
