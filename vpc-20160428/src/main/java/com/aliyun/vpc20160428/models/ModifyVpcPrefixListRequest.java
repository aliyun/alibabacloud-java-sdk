// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpcPrefixListRequest extends TeaModel {
    /**
     * <p>The list of Classless Inter-Domain Routing blocks to add to the prefix list instance.</p>
     */
    @NameInMap("AddPrefixListEntry")
    public java.util.List<ModifyVpcPrefixListRequestAddPrefixListEntry> addPrefixListEntry;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may differ for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without modifying the prefix list configuration. The system checks the required parameters, request format, and service limits. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the check succeeds, an HTTP 2xx status code is returned and the prefix list configuration is modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The new maximum number of Classless Inter-Domain Routing block entries in the prefix list instance.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxEntries")
    public Integer maxEntries;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new description of the prefix list.</p>
     * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>newdescription</p>
     */
    @NameInMap("PrefixListDescription")
    public String prefixListDescription;

    /**
     * <p>The instance ID of the prefix list that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-0b7hwu67****</p>
     */
    @NameInMap("PrefixListId")
    public String prefixListId;

    /**
     * <p>The new name of the prefix list.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>newname</p>
     */
    @NameInMap("PrefixListName")
    public String prefixListName;

    /**
     * <p>The region ID of the prefix list that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of Classless Inter-Domain Routing blocks to delete from the prefix list instance.</p>
     */
    @NameInMap("RemovePrefixListEntry")
    public java.util.List<ModifyVpcPrefixListRequestRemovePrefixListEntry> removePrefixListEntry;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyVpcPrefixListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcPrefixListRequest self = new ModifyVpcPrefixListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcPrefixListRequest setAddPrefixListEntry(java.util.List<ModifyVpcPrefixListRequestAddPrefixListEntry> addPrefixListEntry) {
        this.addPrefixListEntry = addPrefixListEntry;
        return this;
    }
    public java.util.List<ModifyVpcPrefixListRequestAddPrefixListEntry> getAddPrefixListEntry() {
        return this.addPrefixListEntry;
    }

    public ModifyVpcPrefixListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVpcPrefixListRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyVpcPrefixListRequest setMaxEntries(Integer maxEntries) {
        this.maxEntries = maxEntries;
        return this;
    }
    public Integer getMaxEntries() {
        return this.maxEntries;
    }

    public ModifyVpcPrefixListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVpcPrefixListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVpcPrefixListRequest setPrefixListDescription(String prefixListDescription) {
        this.prefixListDescription = prefixListDescription;
        return this;
    }
    public String getPrefixListDescription() {
        return this.prefixListDescription;
    }

    public ModifyVpcPrefixListRequest setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }
    public String getPrefixListId() {
        return this.prefixListId;
    }

    public ModifyVpcPrefixListRequest setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
        return this;
    }
    public String getPrefixListName() {
        return this.prefixListName;
    }

    public ModifyVpcPrefixListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVpcPrefixListRequest setRemovePrefixListEntry(java.util.List<ModifyVpcPrefixListRequestRemovePrefixListEntry> removePrefixListEntry) {
        this.removePrefixListEntry = removePrefixListEntry;
        return this;
    }
    public java.util.List<ModifyVpcPrefixListRequestRemovePrefixListEntry> getRemovePrefixListEntry() {
        return this.removePrefixListEntry;
    }

    public ModifyVpcPrefixListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVpcPrefixListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyVpcPrefixListRequestAddPrefixListEntry extends TeaModel {
        /**
         * <p>The Classless Inter-Domain Routing block to add to the prefix list instance.</p>
         * <blockquote>
         * <p>If the Classless Inter-Domain Routing block already exists in the prefix list, only the value of <strong>AddPrefixListEntry.N.Description</strong> is modified, which means only the description of the Classless Inter-Domain Routing block is updated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/12</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the Classless Inter-Domain Routing block to add to the prefix list instance.</p>
         * <p>The description must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>newcidr</p>
         */
        @NameInMap("Description")
        public String description;

        public static ModifyVpcPrefixListRequestAddPrefixListEntry build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpcPrefixListRequestAddPrefixListEntry self = new ModifyVpcPrefixListRequestAddPrefixListEntry();
            return TeaModel.build(map, self);
        }

        public ModifyVpcPrefixListRequestAddPrefixListEntry setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ModifyVpcPrefixListRequestAddPrefixListEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ModifyVpcPrefixListRequestRemovePrefixListEntry extends TeaModel {
        /**
         * <p>The Classless Inter-Domain Routing block to delete from the prefix list instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the Classless Inter-Domain Routing block to delete from the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>cidr</p>
         */
        @NameInMap("Description")
        public String description;

        public static ModifyVpcPrefixListRequestRemovePrefixListEntry build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpcPrefixListRequestRemovePrefixListEntry self = new ModifyVpcPrefixListRequestRemovePrefixListEntry();
            return TeaModel.build(map, self);
        }

        public ModifyVpcPrefixListRequestRemovePrefixListEntry setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ModifyVpcPrefixListRequestRemovePrefixListEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
