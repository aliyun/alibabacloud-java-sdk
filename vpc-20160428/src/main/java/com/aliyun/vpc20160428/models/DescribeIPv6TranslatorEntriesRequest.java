// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorEntriesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Ipv6TranslatorId")
    public String ipv6TranslatorId;

    @NameInMap("Ipv6TranslatorEntryId")
    public String ipv6TranslatorEntryId;

    @NameInMap("EntryName")
    public String entryName;

    @NameInMap("AllocateIpv6Addr")
    public String allocateIpv6Addr;

    @NameInMap("AllocateIpv6Port")
    public Integer allocateIpv6Port;

    @NameInMap("BackendIpv4Addr")
    public String backendIpv4Addr;

    @NameInMap("BackendIpv4Port")
    public Integer backendIpv4Port;

    @NameInMap("TransProtocol")
    public String transProtocol;

    @NameInMap("AclStatus")
    public String aclStatus;

    @NameInMap("AclType")
    public String aclType;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DescribeIPv6TranslatorEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorEntriesRequest self = new DescribeIPv6TranslatorEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeIPv6TranslatorEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeIPv6TranslatorEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeIPv6TranslatorEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeIPv6TranslatorEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeIPv6TranslatorEntriesRequest setIpv6TranslatorId(String ipv6TranslatorId) {
        this.ipv6TranslatorId = ipv6TranslatorId;
        return this;
    }
    public String getIpv6TranslatorId() {
        return this.ipv6TranslatorId;
    }

    public DescribeIPv6TranslatorEntriesRequest setIpv6TranslatorEntryId(String ipv6TranslatorEntryId) {
        this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
        return this;
    }
    public String getIpv6TranslatorEntryId() {
        return this.ipv6TranslatorEntryId;
    }

    public DescribeIPv6TranslatorEntriesRequest setEntryName(String entryName) {
        this.entryName = entryName;
        return this;
    }
    public String getEntryName() {
        return this.entryName;
    }

    public DescribeIPv6TranslatorEntriesRequest setAllocateIpv6Addr(String allocateIpv6Addr) {
        this.allocateIpv6Addr = allocateIpv6Addr;
        return this;
    }
    public String getAllocateIpv6Addr() {
        return this.allocateIpv6Addr;
    }

    public DescribeIPv6TranslatorEntriesRequest setAllocateIpv6Port(Integer allocateIpv6Port) {
        this.allocateIpv6Port = allocateIpv6Port;
        return this;
    }
    public Integer getAllocateIpv6Port() {
        return this.allocateIpv6Port;
    }

    public DescribeIPv6TranslatorEntriesRequest setBackendIpv4Addr(String backendIpv4Addr) {
        this.backendIpv4Addr = backendIpv4Addr;
        return this;
    }
    public String getBackendIpv4Addr() {
        return this.backendIpv4Addr;
    }

    public DescribeIPv6TranslatorEntriesRequest setBackendIpv4Port(Integer backendIpv4Port) {
        this.backendIpv4Port = backendIpv4Port;
        return this;
    }
    public Integer getBackendIpv4Port() {
        return this.backendIpv4Port;
    }

    public DescribeIPv6TranslatorEntriesRequest setTransProtocol(String transProtocol) {
        this.transProtocol = transProtocol;
        return this;
    }
    public String getTransProtocol() {
        return this.transProtocol;
    }

    public DescribeIPv6TranslatorEntriesRequest setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public DescribeIPv6TranslatorEntriesRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public DescribeIPv6TranslatorEntriesRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DescribeIPv6TranslatorEntriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIPv6TranslatorEntriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIPv6TranslatorEntriesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
