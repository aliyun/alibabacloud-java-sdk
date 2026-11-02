// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcPrefixListRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run and does not create the prefix list. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the prefix list is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IP version. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong> (default): IPv4</li>
     * <li><strong>IPv6</strong>: IPv6</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The maximum number of entries for Classless Inter-Domain Routing in the prefix list. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxEntries")
    public Integer maxEntries;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the prefix list.</p>
     * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("PrefixListDescription")
    public String prefixListDescription;

    /**
     * <p>The Classless Inter-Domain Routing information of the prefix list.</p>
     */
    @NameInMap("PrefixListEntries")
    public java.util.List<CreateVpcPrefixListRequestPrefixListEntries> prefixListEntries;

    /**
     * <p>The name of the prefix list.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("PrefixListName")
    public String prefixListName;

    /**
     * <p>The region ID of the prefix list. </p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the prefix list belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
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
         * <p>The Classless Inter-Domain Routing of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the Classless Inter-Domain Routing in the prefix list.</p>
         * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>CIDR</p>
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
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. If you specify this parameter, you cannot specify an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. If you specify this parameter, you can specify an empty string.</p>
         * <p>A tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
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
