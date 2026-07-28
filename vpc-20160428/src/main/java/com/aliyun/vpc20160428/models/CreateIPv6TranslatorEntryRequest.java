// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorEntryRequest extends TeaModel {
    /**
     * <p>The ID of the associated access control policy group.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6transacl-bp1g8bhrdexnrxxxx</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>Specifies whether to enable access control. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enabled.</li>
     * <li><strong>off</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AclStatus")
    public String aclStatus;

    /**
     * <p>The type of access control:</p>
     * <ul>
     * <li><p><strong>white</strong>: Allows the IPv6 addresses in the access control policy group to access backend services.</p>
     * </li>
     * <li><p><strong>black</strong>: Denies the IPv6 addresses in the access control policy group from accessing backend services.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>white</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The port used by the IPv6 address allocated by the IPv6 Translation Service instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("AllocateIpv6Port")
    public Integer allocateIpv6Port;

    /**
     * <p>The public IPv4 address that requires IPv6 services (the IPv4 address of the IPv4-only server).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>46.22.xx.xx</p>
     */
    @NameInMap("BackendIpv4Addr")
    public String backendIpv4Addr;

    /**
     * <p>The port of the public IPv4 address that requires IPv6 services.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("BackendIpv4Port")
    public Integer backendIpv4Port;

    /**
     * <p>The peak bandwidth of the IPv6 translation mapping entry. Valid values: </p>
     * <ul>
     * <li>-1 (default): No bandwidth limit is imposed on the IPv6 translation mapping entry.  </li>
     * <li>1-200Mbps: The bandwidth value of the mapping entry.</li>
     * </ul>
     * <blockquote>
     * <p>The sum of peak bandwidth values of all IPv6 translation mapping entries cannot exceed the peak bandwidth of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EntryBandwidth")
    public Integer entryBandwidth;

    /**
     * <p>The description of the IPv6 translation mapping entry.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("EntryDescription")
    public String entryDescription;

    /**
     * <p>The name of the IPv6 translation mapping entry. The name must be 2 to 100 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("EntryName")
    public String entryName;

    /**
     * <p>The instance ID of the IPv6 Translation Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6trans-bp1858ys57xxxxxx</p>
     */
    @NameInMap("Ipv6TranslatorId")
    public String ipv6TranslatorId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region of the IPv6 Translation Service instance. You can call the <strong>DescribeRegions</strong> operation to query region IDs.</p>
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
     * <p>The protocol type. Valid values:</p>
     * <ul>
     * <li><strong>tcp</strong>: Forwards TCP packets.  </li>
     * <li><strong>udp</strong>: Forwards UDP packets.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
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
