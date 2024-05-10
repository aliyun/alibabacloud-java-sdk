// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateDhcpOptionsSetRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the DHCP options set.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length. It must start with a letter and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("DhcpOptionsSetDescription")
    public String dhcpOptionsSetDescription;

    /**
     * <p>The name of the DHCP options set.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("DhcpOptionsSetName")
    public String dhcpOptionsSetName;

    /**
     * <p>The root domain. For example, you can set the value to example.com.</p>
     * <br>
     * <p>After a DHCP options set is associated with a virtual private cloud (VPC), the root domain in the DHCP options set is automatically synchronized with the ECS instances in the VPC.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The IP address of the DNS server. You can enter at most four DNS server IP addresses. Separate IP addresses with commas (,).</p>
     * <br>
     * <p>>  If no IP address is specified, the Elastic Compute Service (ECS) instance uses the IP addresses 100.100.2.136 and 100.100.2.138, which are provided by Alibaba Cloud by default.</p>
     */
    @NameInMap("DomainNameServers")
    public String domainNameServers;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request.</p>
     * <br>
     * <p>**true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <br>
     * <p>**false** (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The lease time of the IPv6 addresses for the DHCP options set.</p>
     * <br>
     * <p>*   If you use hours as the unit, valid values are **24h to 1176h** and **87600h to 175200h**. Default value: **87600h**.</p>
     * <p>*   If you use days as the unit, valid values are **1d to 49d** and **3650d to 7300d**. Default value: **3650d**.</p>
     * <br>
     * <p>>  When you enter a value, you must also specify the unit.</p>
     */
    @NameInMap("Ipv6LeaseTime")
    public String ipv6LeaseTime;

    /**
     * <p>The lease time of the IPv4 addresses for the DHCP options set.</p>
     * <br>
     * <p>*   If you use hours as the unit, valid values are **24h to 1176h** and **87600h to 175200h**. Default value: **87600h**.</p>
     * <p>*   If you use days as the unit, valid values are **1d to 49d** and **3650d to 7300d**. Default value: **3650d**.</p>
     * <br>
     * <p>>  When you enter a value, you must also specify the unit.</p>
     */
    @NameInMap("LeaseTime")
    public String leaseTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region to which the DHCP options set belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the DHCP options set belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDhcpOptionsSetRequestTag> tag;

    public static CreateDhcpOptionsSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDhcpOptionsSetRequest self = new CreateDhcpOptionsSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDhcpOptionsSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDhcpOptionsSetRequest setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
        this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
        return this;
    }
    public String getDhcpOptionsSetDescription() {
        return this.dhcpOptionsSetDescription;
    }

    public CreateDhcpOptionsSetRequest setDhcpOptionsSetName(String dhcpOptionsSetName) {
        this.dhcpOptionsSetName = dhcpOptionsSetName;
        return this;
    }
    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    public CreateDhcpOptionsSetRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateDhcpOptionsSetRequest setDomainNameServers(String domainNameServers) {
        this.domainNameServers = domainNameServers;
        return this;
    }
    public String getDomainNameServers() {
        return this.domainNameServers;
    }

    public CreateDhcpOptionsSetRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDhcpOptionsSetRequest setIpv6LeaseTime(String ipv6LeaseTime) {
        this.ipv6LeaseTime = ipv6LeaseTime;
        return this;
    }
    public String getIpv6LeaseTime() {
        return this.ipv6LeaseTime;
    }

    public CreateDhcpOptionsSetRequest setLeaseTime(String leaseTime) {
        this.leaseTime = leaseTime;
        return this;
    }
    public String getLeaseTime() {
        return this.leaseTime;
    }

    public CreateDhcpOptionsSetRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDhcpOptionsSetRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDhcpOptionsSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDhcpOptionsSetRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDhcpOptionsSetRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDhcpOptionsSetRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDhcpOptionsSetRequest setTag(java.util.List<CreateDhcpOptionsSetRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDhcpOptionsSetRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateDhcpOptionsSetRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>A tag key can be at most 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length, and cannot contain `http://` or `https://`. The tag value cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDhcpOptionsSetRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDhcpOptionsSetRequestTag self = new CreateDhcpOptionsSetRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDhcpOptionsSetRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDhcpOptionsSetRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
