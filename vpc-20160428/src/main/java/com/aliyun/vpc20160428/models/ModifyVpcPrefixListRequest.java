// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpcPrefixListRequest extends TeaModel {
    /**
     * <p>The information about CIDR blocks to be added to the prefix list.</p>
     */
    @NameInMap("AddPrefixListEntry")
    public java.util.List<ModifyVpcPrefixListRequestAddPrefixListEntry> addPrefixListEntry;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system uses <strong>RequestId</strong> as <strong>ClientToken</strong>. <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: checks the request without performing the operation. The system prechecks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends the request. If the request passes the check, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The maximum number of CIDR blocks supported by the prefix list after the configuration of the prefix list is modified.</p>
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
     * <p>The description must be 1 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>newdescription</p>
     */
    @NameInMap("PrefixListDescription")
    public String prefixListDescription;

    /**
     * <p>The ID of the prefix list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-0b7hwu67****</p>
     */
    @NameInMap("PrefixListId")
    public String prefixListId;

    /**
     * <p>The new name of the prefix list.</p>
     * <p>The name must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>newname</p>
     */
    @NameInMap("PrefixListName")
    public String prefixListName;

    /**
     * <p>The region ID of the prefix list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The information about CIDR blocks to be deleted to the prefix list.</p>
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
         * <p>The CIDR block to be added to the prefix list.</p>
         * <blockquote>
         * <p> If the CIDR block already exists in the prefix list, you can only modify the description of the CIDR block by setting the <strong>AddPrefixListEntry.N.Description</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/12</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the CIDR block to be added to the prefix list.</p>
         * <p>The description must be 1 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The CIDR block that you want to delete from the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the CIDR block that you want to delete.</p>
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
