// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorEntryRequest extends TeaModel {
    /**
     * <p>The ID of the associated ACL.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6transacl-bp1de27sou71g0lf****</p>
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
     * <p>The port that is used by the IPv6 address allocated to the IPv6 Translation Service instance.</p>
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
     * <p>47.11.XX.XX</p>
     */
    @NameInMap("BackendIpv4Addr")
    public String backendIpv4Addr;

    /**
     * <p>The port of the public IPv4 address that needs to provide IPv6 services.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("BackendIpv4Port")
    public Integer backendIpv4Port;

    /**
     * <p>The maximum bandwidth specified in the IPv6 mapping entry. Unit: Mbit/s. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong> (default): does not limit the maximum bandwidth specified in the IPv6 mapping entry.</li>
     * <li><strong>1</strong> to <strong>200</strong>: changes the maximum bandwidth specified in the IPv6 mapping entry.</li>
     * </ul>
     * <blockquote>
     * <p>The sum of maximum bandwidth values specified in all IPv6 entries cannot exceed the maximum bandwidth supported by the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("EntryBandwidth")
    public Integer entryBandwidth;

    /**
     * <p>The description of the IPv6 mapping entry. It must be 2 to 100 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot start with http:// or <a href="https://%E3%80%82">https://</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>entrydescription</p>
     */
    @NameInMap("EntryDescription")
    public String entryDescription;

    /**
     * <p>The name of the IPv6 mapping entry. It must be 2 to 100 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot start with http:// or <a href="https://%E3%80%82">https://</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>entry1</p>
     */
    @NameInMap("EntryName")
    public String entryName;

    /**
     * <p>The ID of the IPv6 mapping entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6trans-bp1858ys****</p>
     */
    @NameInMap("Ipv6TranslatorEntryId")
    public String ipv6TranslatorEntryId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region of the IPv6 Translation Service instance. You can call the DescribeRegions operation to query the most recent region list.</p>
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
     * <p>The protocol. Valid values:</p>
     * <ul>
     * <li><strong>tcp</strong></li>
     * <li><strong>udp</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("TransProtocol")
    public String transProtocol;

    public static ModifyIPv6TranslatorEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorEntryRequest self = new ModifyIPv6TranslatorEntryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorEntryRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public ModifyIPv6TranslatorEntryRequest setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public ModifyIPv6TranslatorEntryRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public ModifyIPv6TranslatorEntryRequest setAllocateIpv6Port(Integer allocateIpv6Port) {
        this.allocateIpv6Port = allocateIpv6Port;
        return this;
    }
    public Integer getAllocateIpv6Port() {
        return this.allocateIpv6Port;
    }

    public ModifyIPv6TranslatorEntryRequest setBackendIpv4Addr(String backendIpv4Addr) {
        this.backendIpv4Addr = backendIpv4Addr;
        return this;
    }
    public String getBackendIpv4Addr() {
        return this.backendIpv4Addr;
    }

    public ModifyIPv6TranslatorEntryRequest setBackendIpv4Port(Integer backendIpv4Port) {
        this.backendIpv4Port = backendIpv4Port;
        return this;
    }
    public Integer getBackendIpv4Port() {
        return this.backendIpv4Port;
    }

    public ModifyIPv6TranslatorEntryRequest setEntryBandwidth(Integer entryBandwidth) {
        this.entryBandwidth = entryBandwidth;
        return this;
    }
    public Integer getEntryBandwidth() {
        return this.entryBandwidth;
    }

    public ModifyIPv6TranslatorEntryRequest setEntryDescription(String entryDescription) {
        this.entryDescription = entryDescription;
        return this;
    }
    public String getEntryDescription() {
        return this.entryDescription;
    }

    public ModifyIPv6TranslatorEntryRequest setEntryName(String entryName) {
        this.entryName = entryName;
        return this;
    }
    public String getEntryName() {
        return this.entryName;
    }

    public ModifyIPv6TranslatorEntryRequest setIpv6TranslatorEntryId(String ipv6TranslatorEntryId) {
        this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
        return this;
    }
    public String getIpv6TranslatorEntryId() {
        return this.ipv6TranslatorEntryId;
    }

    public ModifyIPv6TranslatorEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyIPv6TranslatorEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyIPv6TranslatorEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyIPv6TranslatorEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyIPv6TranslatorEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyIPv6TranslatorEntryRequest setTransProtocol(String transProtocol) {
        this.transProtocol = transProtocol;
        return this;
    }
    public String getTransProtocol() {
        return this.transProtocol;
    }

}
