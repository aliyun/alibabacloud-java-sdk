// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateIpv6AddressRequest extends TeaModel {
    /**
     * <p>The type of the IPv6 address. Valid values:</p>
     * <ul>
     * <li>IPv6Address (default): The instance is a single IPv6 address.</li>
     * <li>IPv6Prefix: The instance is an IPv6 prefix CIDR block.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv6Address</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p>true: performs a dry run. The system checks the required parameters, request syntax, and business restrictions. If the check fails, the corresponding error is returned. If the check succeeds, the error code DryRunOperation is returned.</p>
     * </li>
     * <li><p>false (default): performs a dry run and sends the request. If the check succeeds, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IPv6 address to allocate. The specified IPv6 address must be an idle address within the CIDR block of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:XXXX:153:3921:851c:c435:7b12:1c5f</p>
     */
    @NameInMap("Ipv6Address")
    public String ipv6Address;

    /**
     * <p>The description of the IPv6 address instance.</p>
     * <p>The description must be 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6-description</p>
     */
    @NameInMap("Ipv6AddressDescription")
    public String ipv6AddressDescription;

    /**
     * <p>The name of the IPv6 address instance.</p>
     * <p>The name must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6-name</p>
     */
    @NameInMap("Ipv6AddressName")
    public String ipv6AddressName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">What is a resource group?</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of tags for the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AllocateIpv6AddressRequestTag> tag;

    /**
     * <p>The ID of the vSwitch to which the IPv6 address belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-asdfjlnaue4g****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static AllocateIpv6AddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpv6AddressRequest self = new AllocateIpv6AddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocateIpv6AddressRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
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
         * <p>The tag key of the resource. You can specify up to 20 tag keys. Do not pass in an empty string.</p>
         * <p>A tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. You can pass in an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with aliyun or acs:, or contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
