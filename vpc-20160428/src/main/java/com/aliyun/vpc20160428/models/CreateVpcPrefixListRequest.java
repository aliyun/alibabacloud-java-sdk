// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcPrefixListRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("MaxEntries")
    public Integer maxEntries;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PrefixListDescription")
    public String prefixListDescription;

    @NameInMap("PrefixListEntries")
    public java.util.List<CreateVpcPrefixListRequestPrefixListEntries> prefixListEntries;

    @NameInMap("PrefixListName")
    public String prefixListName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateVpcPrefixListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcPrefixListRequest self = new CreateVpcPrefixListRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcPrefixListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpcPrefixListRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVpcPrefixListRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateVpcPrefixListRequest setMaxEntries(Integer maxEntries) {
        this.maxEntries = maxEntries;
        return this;
    }
    public Integer getMaxEntries() {
        return this.maxEntries;
    }

    public CreateVpcPrefixListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVpcPrefixListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVpcPrefixListRequest setPrefixListDescription(String prefixListDescription) {
        this.prefixListDescription = prefixListDescription;
        return this;
    }
    public String getPrefixListDescription() {
        return this.prefixListDescription;
    }

    public CreateVpcPrefixListRequest setPrefixListEntries(java.util.List<CreateVpcPrefixListRequestPrefixListEntries> prefixListEntries) {
        this.prefixListEntries = prefixListEntries;
        return this;
    }
    public java.util.List<CreateVpcPrefixListRequestPrefixListEntries> getPrefixListEntries() {
        return this.prefixListEntries;
    }

    public CreateVpcPrefixListRequest setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
        return this;
    }
    public String getPrefixListName() {
        return this.prefixListName;
    }

    public CreateVpcPrefixListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpcPrefixListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVpcPrefixListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class CreateVpcPrefixListRequestPrefixListEntries extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("Description")
        public String description;

        public static CreateVpcPrefixListRequestPrefixListEntries build(java.util.Map<String, ?> map) throws Exception {
            CreateVpcPrefixListRequestPrefixListEntries self = new CreateVpcPrefixListRequestPrefixListEntries();
            return TeaModel.build(map, self);
        }

        public CreateVpcPrefixListRequestPrefixListEntries setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public CreateVpcPrefixListRequestPrefixListEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
