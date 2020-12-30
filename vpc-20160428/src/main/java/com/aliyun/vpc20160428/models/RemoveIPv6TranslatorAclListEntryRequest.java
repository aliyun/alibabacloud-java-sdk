// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveIPv6TranslatorAclListEntryRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AclEntryId")
    public String aclEntryId;

    public static RemoveIPv6TranslatorAclListEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveIPv6TranslatorAclListEntryRequest self = new RemoveIPv6TranslatorAclListEntryRequest();
        return TeaModel.build(map, self);
    }

    public RemoveIPv6TranslatorAclListEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveIPv6TranslatorAclListEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveIPv6TranslatorAclListEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveIPv6TranslatorAclListEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveIPv6TranslatorAclListEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveIPv6TranslatorAclListEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveIPv6TranslatorAclListEntryRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public RemoveIPv6TranslatorAclListEntryRequest setAclEntryId(String aclEntryId) {
        this.aclEntryId = aclEntryId;
        return this;
    }
    public String getAclEntryId() {
        return this.aclEntryId;
    }

}
