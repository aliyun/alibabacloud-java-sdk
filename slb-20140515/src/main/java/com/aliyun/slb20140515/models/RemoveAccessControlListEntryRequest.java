// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveAccessControlListEntryRequest extends TeaModel {
    /**
     * <p>The IP entries that you want to remove from the network ACL. Valid values:</p>
     * <ul>
     * <li><strong>entry</strong>: the IP address or CIDR block that you want to remove from the network ACL. Separate multiple IP addresses or CIDR blocks with commas (,).</li>
     * <li><strong>comment</strong>: the description of the network ACL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;entry&quot;:&quot;10.0.10.0/24&quot;,&quot;comment&quot;:&quot;privaterule1&quot;}]</p>
     */
    @NameInMap("AclEntrys")
    public String aclEntrys;

    /**
     * <p>The ID of the network ACL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-bp1l0kk4gxce43k******</p>
     */
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the network ACL is created.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/27584.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RemoveAccessControlListEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessControlListEntryRequest self = new RemoveAccessControlListEntryRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAccessControlListEntryRequest setAclEntrys(String aclEntrys) {
        this.aclEntrys = aclEntrys;
        return this;
    }
    public String getAclEntrys() {
        return this.aclEntrys;
    }

    public RemoveAccessControlListEntryRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public RemoveAccessControlListEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveAccessControlListEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveAccessControlListEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveAccessControlListEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveAccessControlListEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
