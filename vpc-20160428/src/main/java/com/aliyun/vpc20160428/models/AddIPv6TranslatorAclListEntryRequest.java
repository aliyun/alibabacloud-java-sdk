// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddIPv6TranslatorAclListEntryRequest extends TeaModel {
    /**
     * <p>The remarks of the ACL entry.</p>
     * <br>
     * <p>It must be 2 to 100 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("AclEntryComment")
    public String aclEntryComment;

    /**
     * <p>The IPv6 address or IPv6 CIDR block that you want to add to the ACL entry, for example, 12XX:0:0:XXXX::0102 or 12XX:0:0:XXXX::/60.</p>
     */
    @NameInMap("AclEntryIp")
    public String aclEntryIp;

    /**
     * <p>The ID of the ACL to which you want to add the IP entry.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the ACL.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddIPv6TranslatorAclListEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIPv6TranslatorAclListEntryRequest self = new AddIPv6TranslatorAclListEntryRequest();
        return TeaModel.build(map, self);
    }

    public AddIPv6TranslatorAclListEntryRequest setAclEntryComment(String aclEntryComment) {
        this.aclEntryComment = aclEntryComment;
        return this;
    }
    public String getAclEntryComment() {
        return this.aclEntryComment;
    }

    public AddIPv6TranslatorAclListEntryRequest setAclEntryIp(String aclEntryIp) {
        this.aclEntryIp = aclEntryIp;
        return this;
    }
    public String getAclEntryIp() {
        return this.aclEntryIp;
    }

    public AddIPv6TranslatorAclListEntryRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public AddIPv6TranslatorAclListEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddIPv6TranslatorAclListEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddIPv6TranslatorAclListEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddIPv6TranslatorAclListEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddIPv6TranslatorAclListEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
