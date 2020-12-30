// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAclListEntryRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AclEntryId")
    public String aclEntryId;

    @NameInMap("AclEntryComment")
    public String aclEntryComment;

    public static ModifyIPv6TranslatorAclListEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAclListEntryRequest self = new ModifyIPv6TranslatorAclListEntryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorAclListEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyIPv6TranslatorAclListEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyIPv6TranslatorAclListEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyIPv6TranslatorAclListEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyIPv6TranslatorAclListEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyIPv6TranslatorAclListEntryRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public ModifyIPv6TranslatorAclListEntryRequest setAclEntryId(String aclEntryId) {
        this.aclEntryId = aclEntryId;
        return this;
    }
    public String getAclEntryId() {
        return this.aclEntryId;
    }

    public ModifyIPv6TranslatorAclListEntryRequest setAclEntryComment(String aclEntryComment) {
        this.aclEntryComment = aclEntryComment;
        return this;
    }
    public String getAclEntryComment() {
        return this.aclEntryComment;
    }

}
