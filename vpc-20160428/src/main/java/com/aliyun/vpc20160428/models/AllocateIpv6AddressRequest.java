// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateIpv6AddressRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * <p>*   false (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IPv6 address. The IPv6 address must be an idle one that falls within the vSwitch CIDR block.</p>
     */
    @NameInMap("Ipv6Address")
    public String ipv6Address;

    /**
     * <p>The description of the IPv6 address.</p>
     */
    @NameInMap("Ipv6AddressDescription")
    public String ipv6AddressDescription;

    /**
     * <p>The name of the IPv6 address.</p>
     */
    @NameInMap("Ipv6AddressName")
    public String ipv6AddressName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. For more information about resource groups, see related documentation.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AllocateIpv6AddressRequestTag> tag;

    /**
     * <p>The ID of the vSwitch to which the IPv6 address belongs.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static AllocateIpv6AddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpv6AddressRequest self = new AllocateIpv6AddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocateIpv6AddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocateIpv6AddressRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AllocateIpv6AddressRequest setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public String getIpv6Address() {
        return this.ipv6Address;
    }

    public AllocateIpv6AddressRequest setIpv6AddressDescription(String ipv6AddressDescription) {
        this.ipv6AddressDescription = ipv6AddressDescription;
        return this;
    }
    public String getIpv6AddressDescription() {
        return this.ipv6AddressDescription;
    }

    public AllocateIpv6AddressRequest setIpv6AddressName(String ipv6AddressName) {
        this.ipv6AddressName = ipv6AddressName;
        return this;
    }
    public String getIpv6AddressName() {
        return this.ipv6AddressName;
    }

    public AllocateIpv6AddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateIpv6AddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateIpv6AddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateIpv6AddressRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AllocateIpv6AddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateIpv6AddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AllocateIpv6AddressRequest setTag(java.util.List<AllocateIpv6AddressRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AllocateIpv6AddressRequestTag> getTag() {
        return this.tag;
    }

    public AllocateIpv6AddressRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class AllocateIpv6AddressRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         */
        @NameInMap("Value")
        public String value;

        public static AllocateIpv6AddressRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AllocateIpv6AddressRequestTag self = new AllocateIpv6AddressRequestTag();
            return TeaModel.build(map, self);
        }

        public AllocateIpv6AddressRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AllocateIpv6AddressRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
