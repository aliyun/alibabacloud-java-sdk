// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateDhcpOptionsSetAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Enter a description for the DHCP options set.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter and cannot start with `http://` or `https://`. You can also leave the description empty.</p>
     */
    @NameInMap("DhcpOptionsSetDescription")
    public String dhcpOptionsSetDescription;

    /**
     * <p>The ID of the DHCP options set.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DhcpOptionsSetId")
    public String dhcpOptionsSetId;

    /**
     * <p>The name of the DHCP options set.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
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
     * <p>>  If you do not specify a DNS server IP address, Elastic Compute Service (ECS) instances use the IP addresses of the Alibaba Cloud DNS servers, which are 100.100.2.136 and 100.100.2.138.</p>
     */
    @NameInMap("DomainNameServers")
    public String domainNameServers;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>**true**: performs a dry run. The system checks the required parameters, request format, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
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
     * <p>>  If you specify a value, you must also specify the unit.</p>
     */
    @NameInMap("Ipv6LeaseTime")
    public String ipv6LeaseTime;

    /**
     * <p>The lease time of the IPv4 addresses for the DHCP options set.</p>
     * <br>
     * <p>*   If you use hours as the unit, valid values are **24h to 1176h** and **87600h to 175200h**. Default value: **87600h**.</p>
     * <p>*   If you use days as the unit, valid values are **1d to 49d** and **3650d to 7300d**. Default value: **3650d**.</p>
     * <br>
     * <p>>  If you specify a value, you must also specify the unit.</p>
     */
    @NameInMap("LeaseTime")
    public String leaseTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region where the DHCP options set is deployed. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
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
