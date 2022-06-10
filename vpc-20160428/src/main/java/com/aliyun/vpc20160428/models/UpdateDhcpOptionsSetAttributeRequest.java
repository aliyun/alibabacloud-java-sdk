// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateDhcpOptionsSetAttributeRequest extends TeaModel {
    @NameInMap("BootFileName")
    public String bootFileName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DhcpOptionsSetDescription")
    public String dhcpOptionsSetDescription;

    @NameInMap("DhcpOptionsSetId")
    public String dhcpOptionsSetId;

    @NameInMap("DhcpOptionsSetName")
    public String dhcpOptionsSetName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainNameServers")
    public String domainNameServers;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Ipv6LeaseTime")
    public String ipv6LeaseTime;

    @NameInMap("LeaseTime")
    public String leaseTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TFTPServerName")
    public String TFTPServerName;

    public static UpdateDhcpOptionsSetAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDhcpOptionsSetAttributeRequest self = new UpdateDhcpOptionsSetAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDhcpOptionsSetAttributeRequest setBootFileName(String bootFileName) {
        this.bootFileName = bootFileName;
        return this;
    }
    public String getBootFileName() {
        return this.bootFileName;
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

    public UpdateDhcpOptionsSetAttributeRequest setTFTPServerName(String TFTPServerName) {
        this.TFTPServerName = TFTPServerName;
        return this;
    }
    public String getTFTPServerName() {
        return this.TFTPServerName;
    }

}
