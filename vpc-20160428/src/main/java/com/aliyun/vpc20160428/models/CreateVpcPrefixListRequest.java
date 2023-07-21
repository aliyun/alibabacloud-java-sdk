// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcPrefixListRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IP version. Valid values:</p>
     * <br>
     * <p>*   **IPv4** (default)</p>
     * <p>*   **IPv6**</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The maximum number of CIDR blocks that you can specify in the prefix list. Default value: 50.</p>
     */
    @NameInMap("MaxEntries")
    public Integer maxEntries;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the prefix list.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("PrefixListDescription")
    public String prefixListDescription;

    @NameInMap("PrefixListEntries")
    public java.util.List<CreateVpcPrefixListRequestPrefixListEntries> prefixListEntries;

    /**
     * <p>The name of the prefix list.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length, and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("PrefixListName")
    public String prefixListName;

    /**
     * <p>The ID of the region where you want to create the prefix list.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the prefix list belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<CreateVpcPrefixListRequestTag> tag;

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

    public CreateVpcPrefixListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public CreateVpcPrefixListRequest setTag(java.util.List<CreateVpcPrefixListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVpcPrefixListRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateVpcPrefixListRequestPrefixListEntries extends TeaModel {
        /**
         * <p>The CIDR block specified in the prefix list.</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the CIDR block specified in the prefix list.</p>
         * <br>
         * <p>The description must be 1 to 256 characters in length and cannot start with `http://` or `https://`.</p>
         */
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

    public static class CreateVpcPrefixListRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateVpcPrefixListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVpcPrefixListRequestTag self = new CreateVpcPrefixListRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVpcPrefixListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVpcPrefixListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
