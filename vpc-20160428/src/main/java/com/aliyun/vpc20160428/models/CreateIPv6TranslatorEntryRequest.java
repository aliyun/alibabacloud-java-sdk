// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorEntryRequest extends TeaModel {
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AclStatus")
    public String aclStatus;

    @NameInMap("AclType")
    public String aclType;

    @NameInMap("AllocateIpv6Port")
    public Integer allocateIpv6Port;

    @NameInMap("BackendIpv4Addr")
    public String backendIpv4Addr;

    @NameInMap("BackendIpv4Port")
    public Integer backendIpv4Port;

    @NameInMap("EntryBandwidth")
    public Integer entryBandwidth;

    @NameInMap("EntryDescription")
    public String entryDescription;

    @NameInMap("EntryName")
    public String entryName;

    @NameInMap("Ipv6TranslatorId")
    public String ipv6TranslatorId;

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

    @NameInMap("TransProtocol")
    public String transProtocol;

    public static CreateIPv6TranslatorEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorEntryRequest self = new CreateIPv6TranslatorEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateIPv6TranslatorEntryRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public CreateIPv6TranslatorEntryRequest setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public CreateIPv6TranslatorEntryRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public CreateIPv6TranslatorEntryRequest setAllocateIpv6Port(Integer allocateIpv6Port) {
        this.allocateIpv6Port = allocateIpv6Port;
        return this;
    }
    public Integer getAllocateIpv6Port() {
        return this.allocateIpv6Port;
    }

    public CreateIPv6TranslatorEntryRequest setBackendIpv4Addr(String backendIpv4Addr) {
        this.backendIpv4Addr = backendIpv4Addr;
        return this;
    }
    public String getBackendIpv4Addr() {
        return this.backendIpv4Addr;
    }

    public CreateIPv6TranslatorEntryRequest setBackendIpv4Port(Integer backendIpv4Port) {
        this.backendIpv4Port = backendIpv4Port;
        return this;
    }
    public Integer getBackendIpv4Port() {
        return this.backendIpv4Port;
    }

    public CreateIPv6TranslatorEntryRequest setEntryBandwidth(Integer entryBandwidth) {
        this.entryBandwidth = entryBandwidth;
        return this;
    }
    public Integer getEntryBandwidth() {
        return this.entryBandwidth;
    }

    public CreateIPv6TranslatorEntryRequest setEntryDescription(String entryDescription) {
        this.entryDescription = entryDescription;
        return this;
    }
    public String getEntryDescription() {
        return this.entryDescription;
    }

    public CreateIPv6TranslatorEntryRequest setEntryName(String entryName) {
        this.entryName = entryName;
        return this;
    }
    public String getEntryName() {
        return this.entryName;
    }

    public CreateIPv6TranslatorEntryRequest setIpv6TranslatorId(String ipv6TranslatorId) {
        this.ipv6TranslatorId = ipv6TranslatorId;
        return this;
    }
    public String getIpv6TranslatorId() {
        return this.ipv6TranslatorId;
    }

    public CreateIPv6TranslatorEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateIPv6TranslatorEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateIPv6TranslatorEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIPv6TranslatorEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateIPv6TranslatorEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateIPv6TranslatorEntryRequest setTransProtocol(String transProtocol) {
        this.transProtocol = transProtocol;
        return this;
    }
    public String getTransProtocol() {
        return this.transProtocol;
    }

}
