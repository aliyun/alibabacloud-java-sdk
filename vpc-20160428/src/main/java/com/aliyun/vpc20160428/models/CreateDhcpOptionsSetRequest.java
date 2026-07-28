// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateDhcpOptionsSetRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the DHCP options set. </p>
     * <p>The description can be empty or 1 to 256 characters in length. It must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("DhcpOptionsSetDescription")
    public String dhcpOptionsSetDescription;

    /**
     * <p>The name of the DHCP options set.</p>
     * <p>The name must be 1 to 128 characters in length and must start with a letter or Chinese character. It can contain digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("DhcpOptionsSetName")
    public String dhcpOptionsSetName;

    /**
     * <p>The hostname suffix. Example: example.com.</p>
     * <p>After the DHCP options set is used to associate VPC, the hostname suffix is automatically synchronized to the ECS instances in the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The IP addresses of DNS servers. You can specify up to four DNS server IP addresses. Separate multiple IP addresses with commas (,).</p>
     * <blockquote>
     * <p>If you do not specify DNS server IP addresses, ECS instances use the DNS server IP addresses provided by Alibaba Cloud (100.100.2.136 and 100.100.2.138) by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.123</p>
     */
    @NameInMap("DomainNameServers")
    public String domainNameServers;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <p><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * <p><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the DHCP options set is created.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The lease time of the IPv6 DHCP options set.</p>
     * <ul>
     * <li><p>If the lease time is in hours, the unit is h. Valid values: <strong>24h to 1176h</strong> and <strong>87600h to 175200h</strong>. Default value: <strong>24h</strong>.</p>
     * </li>
     * <li><p>If the lease time is in days, the unit is d. Valid values: <strong>1d to 49d</strong> and <strong>3650d to 7300d</strong>. Default value: <strong>1d</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must include the unit when specifying the value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3650d</p>
     */
    @NameInMap("Ipv6LeaseTime")
    public String ipv6LeaseTime;

    /**
     * <p>The lease time of the IPv4 DHCP options set.</p>
     * <ul>
     * <li><p>If the lease time is in hours, the unit is h. Valid values: <strong>24h to 1176h</strong> and <strong>87600h to 175200h</strong>. Default value: <strong>87600h</strong>.</p>
     * </li>
     * <li><p>If the lease time is in days, the unit is d. Valid values: <strong>1d to 49d</strong> and <strong>3650d to 7300d</strong>. Default value: <strong>3650d</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must include the unit when specifying the value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3650d</p>
     */
    @NameInMap("LeaseTime")
    public String leaseTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region in which the DHCP options set resides.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the DHCP options set belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags of the resource.</p>
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
         * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
