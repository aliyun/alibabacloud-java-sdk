// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpcPrefixListRequest extends TeaModel {
    @NameInMap("AddPrefixListEntry")
    public java.util.List<ModifyVpcPrefixListRequestAddPrefixListEntry> addPrefixListEntry;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("MaxEntries")
    public Integer maxEntries;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PrefixListDescription")
    public String prefixListDescription;

    @NameInMap("PrefixListId")
    public String prefixListId;

    @NameInMap("PrefixListName")
    public String prefixListName;

    @NameInMap("RegionId")
    public String regionId;

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
        @NameInMap("Cidr")
        public String cidr;

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
        @NameInMap("Cidr")
        public String cidr;

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
