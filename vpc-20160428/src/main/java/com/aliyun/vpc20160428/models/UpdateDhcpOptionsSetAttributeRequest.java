// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateDhcpOptionsSetAttributeRequest extends TeaModel {
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
     * <p>The description can be empty or 2 to 256 characters in length. It must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("DhcpOptionsSetDescription")
    public String dhcpOptionsSetDescription;

    /**
     * <p>The ID of the DHCP options set to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dopt-o6w0df4epg9zo8isy****</p>
     */
    @NameInMap("DhcpOptionsSetId")
    public String dhcpOptionsSetId;

    /**
     * <p>The name of the DHCP options set.</p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or Chinese character. It can contain digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("DhcpOptionsSetName")
    public String dhcpOptionsSetName;

    /**
     * <p>The hostname suffix, such as example.com.</p>
     * <p>After you attach the DHCP options set to an associate VPC, the hostname suffix is automatically synchronized to ECS instances in the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The IP addresses of DNS servers. You can specify up to four DNS server IP addresses, separated by commas (,).</p>
     * <blockquote>
     * <p>If you do not specify any DNS server IP addresses, ECS instances use the DNS server IP addresses provided by Alibaba Cloud (100.100.2.136 and 100.100.2.138) by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.123</p>
     */
    @NameInMap("DomainNameServers")
    public String domainNameServers;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <p><strong>true</strong>: performs a dry run without modifying the DHCP options set configuration. The system checks the required parameters, request format, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * <p><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the DHCP options set configuration is modified.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The lease time of the IPv6 DHCP options set.</p>
     * <ul>
     * <li><p>If the lease time is set in hours, the unit is h. Valid values: <strong>24h to 1176h</strong> and <strong>87600h to 175200h</strong>. Default value: <strong>24h</strong>.</p>
     * </li>
     * <li><p>If the lease time is set in days, the unit is d. Valid values: <strong>1d to 49d</strong> and <strong>3650d to 7300d</strong>. Default value: <strong>1d</strong>.</p>
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
     * <li><p>If the lease time is set in hours, the unit is h. Valid values: <strong>24h to 1176h</strong> and <strong>87600h to 175200h</strong>. Default value: <strong>87600h</strong>.</p>
     * </li>
     * <li><p>If the lease time is set in days, the unit is d. Valid values: <strong>1d to 49d</strong> and <strong>3650d to 7300d</strong>. Default value: <strong>3650d</strong>.</p>
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
     * <p>The region ID of the DHCP options set to modify. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

    public static UpdateDhcpOptionsSetAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDhcpOptionsSetAttributeRequest self = new UpdateDhcpOptionsSetAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDhcpOptionsSetAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateDhcpOptionsSetAttributeRequest setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
        this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
        return this;
    }
    public String getDhcpOptionsSetDescription() {
        return this.dhcpOptionsSetDescription;
    }

    public UpdateDhcpOptionsSetAttributeRequest setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public UpdateDhcpOptionsSetAttributeRequest setDhcpOptionsSetName(String dhcpOptionsSetName) {
        this.dhcpOptionsSetName = dhcpOptionsSetName;
        return this;
    }
    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    public UpdateDhcpOptionsSetAttributeRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDhcpOptionsSetAttributeRequest setDomainNameServers(String domainNameServers) {
        this.domainNameServers = domainNameServers;
        return this;
    }
    public String getDomainNameServers() {
        return this.domainNameServers;
    }

    public UpdateDhcpOptionsSetAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateDhcpOptionsSetAttributeRequest setIpv6LeaseTime(String ipv6LeaseTime) {
        this.ipv6LeaseTime = ipv6LeaseTime;
        return this;
    }
    public String getIpv6LeaseTime() {
        return this.ipv6LeaseTime;
    }

    public UpdateDhcpOptionsSetAttributeRequest setLeaseTime(String leaseTime) {
        this.leaseTime = leaseTime;
        return this;
    }
    public String getLeaseTime() {
        return this.leaseTime;
    }

    public UpdateDhcpOptionsSetAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateDhcpOptionsSetAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateDhcpOptionsSetAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDhcpOptionsSetAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateDhcpOptionsSetAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
