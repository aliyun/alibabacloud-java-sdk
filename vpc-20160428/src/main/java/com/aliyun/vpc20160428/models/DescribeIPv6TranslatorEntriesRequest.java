// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorEntriesRequest extends TeaModel {
    /**
     * <p>The ID of the network ACL.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6transacl-bp1de2****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>Specifies whether to enable access control lists (ACLs). Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("AclStatus")
    public String aclStatus;

    /**
     * <p>The ACL type. Valid values:</p>
     * <ul>
     * <li><strong>white</strong>: a whitelist. IPv6 addresses in the ACL are allowed to access backend services.</li>
     * <li><strong>black</strong>: a blacklist. IPv6 addresses in the ACL are not allowed to access backend services.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>white</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The IPv6 address allocated to the IPv6 Translation Service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2400:3200:1600::XX</p>
     */
    @NameInMap("AllocateIpv6Addr")
    public String allocateIpv6Addr;

    /**
     * <p>The port used by the IPv6 address allocated to the IPv6 Translation Service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("AllocateIpv6Port")
    public Integer allocateIpv6Port;

    /**
     * <p>The public IPv4 address that needs to provide IPv6 services.</p>
     * 
     * <strong>example:</strong>
     * <p>47.99.XX.XX</p>
     */
    @NameInMap("BackendIpv4Addr")
    public String backendIpv4Addr;

    /**
     * <p>The port used by the public IPv4 address that needs to provide IPv6 services.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("BackendIpv4Port")
    public Integer backendIpv4Port;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the IPv6 mapping entry.</p>
     * 
     * <strong>example:</strong>
     * <p>entryname</p>
     */
    @NameInMap("EntryName")
    public String entryName;

    /**
     * <p>The ID of the IPv6 mapping entry.</p>
     * <blockquote>
     * <p>If <strong>Ipv6TranslatorId</strong> and <strong>Ipv6TranslatorEntryId</strong> are empty, information about all IPv6 mapping entries is returned. If only <strong>Ipv6TranslatorEntryId</strong> is empty, information about the IPv6 mapping entries of the current IPv6 Translation Service instance is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ipv6transentry-bp1g8bhrde****</p>
     */
    @NameInMap("Ipv6TranslatorEntryId")
    public String ipv6TranslatorEntryId;

    /**
     * <p>The ID of the IPv6 Translation Service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6trans-bp1858ysxx****</p>
     */
    @NameInMap("Ipv6TranslatorId")
    public String ipv6TranslatorId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region of the IPv6 Translation Service instance. You can call the <strong>DescribeRegions</strong> operation to query the most recent region list.</p>
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

    /**
     * <p>The protocol used by the data to be forwarded.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("TransProtocol")
    public String transProtocol;

    public static DescribeIPv6TranslatorEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorEntriesRequest self = new DescribeIPv6TranslatorEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorEntriesRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
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

    public DescribeIPv6TranslatorEntriesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeIPv6TranslatorEntriesRequest setEntryName(String entryName) {
        this.entryName = entryName;
        return this;
    }
    public String getEntryName() {
        return this.entryName;
    }

    public DescribeIPv6TranslatorEntriesRequest setIpv6TranslatorEntryId(String ipv6TranslatorEntryId) {
        this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
        return this;
    }
    public String getIpv6TranslatorEntryId() {
        return this.ipv6TranslatorEntryId;
    }

    public DescribeIPv6TranslatorEntriesRequest setIpv6TranslatorId(String ipv6TranslatorId) {
        this.ipv6TranslatorId = ipv6TranslatorId;
        return this;
    }
    public String getIpv6TranslatorId() {
        return this.ipv6TranslatorId;
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

    public DescribeIPv6TranslatorEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DescribeIPv6TranslatorEntriesRequest setTransProtocol(String transProtocol) {
        this.transProtocol = transProtocol;
        return this;
    }
    public String getTransProtocol() {
        return this.transProtocol;
    }

}
