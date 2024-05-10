// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVSwitchCidrReservationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run, without performing the actual request. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IP version of the reserved CIDR block. Valid values:</p>
     * <br>
     * <p>*   **IPv4** (default)</p>
     * <p>*   **IPv6**</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the vSwitch is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Resource tags</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVSwitchCidrReservationRequestTag> tag;

    /**
     * <p>The reserved CIDR block of the vSwitch.</p>
     * <br>
     * <p>*   When **IpVersion** is set to **IPv4**, the reserved CIDR block must be a proper subset of the IPv4 CIDR block of the vSwitch and the subnet mask length of the reserved CIDR block cannot be greater than 28.</p>
     * <p>*   When **IpVersion** is set to **IPv6**, the reserved CIDR block must be a proper subset of the IPv6 CIDR block of the vSwitch and the subnet mask length of the reserved CIDR block cannot be greater than 80.</p>
     * <br>
     * <p>>  You must specify one of **VSwitchCidrReservationMask** and **VSwitchCidrReservationCidr**.</p>
     */
    @NameInMap("VSwitchCidrReservationCidr")
    public String vSwitchCidrReservationCidr;

    /**
     * <p>The description of the reserved CIDR block. This parameter is empty by default.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("VSwitchCidrReservationDescription")
    public String vSwitchCidrReservationDescription;

    /**
     * <p>The subnet mask of the reserved CIDR block.</p>
     * <br>
     * <p>*   When **IpVersion** is set to **IPv4**, the subnet mask length of the CIDR block must be greater than the IPv4 subnet mask length of the vSwitch and cannot be greater than 28.</p>
     * <p>*   When **IpVersion** is set to **IPv6**, the subnet mask length of the CIDR block must be greater than the IPv6 subnet mask length of the vSwitch and cannot be greater than 80.</p>
     * <br>
     * <p>>  You must specify one of **VSwitchCidrReservationMask** and **VSwitchCidrReservationCidr**.</p>
     */
    @NameInMap("VSwitchCidrReservationMask")
    public String vSwitchCidrReservationMask;

    /**
     * <p>The name of the reserved CIDR block.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("VSwitchCidrReservationName")
    public String vSwitchCidrReservationName;

    /**
     * <p>The type of reserved CIDR block. Set the value to **prefix**.</p>
     * <br>
     * <p>>  When a user or a cloud service allocates a CIDR block to an elastic network interface (ENI), the CIDR block must be allocated from the reserved CIDR block. If the reserved CIDR block is exhausted, an error is returned.</p>
     */
    @NameInMap("VSwitchCidrReservationType")
    public String vSwitchCidrReservationType;

    /**
     * <p>The ID of the vSwitch to which the reserved CIDR block belongs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateVSwitchCidrReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchCidrReservationRequest self = new CreateVSwitchCidrReservationRequest();
        return TeaModel.build(map, self);
    }

    public CreateVSwitchCidrReservationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVSwitchCidrReservationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVSwitchCidrReservationRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateVSwitchCidrReservationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVSwitchCidrReservationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVSwitchCidrReservationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVSwitchCidrReservationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVSwitchCidrReservationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVSwitchCidrReservationRequest setTag(java.util.List<CreateVSwitchCidrReservationRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVSwitchCidrReservationRequestTag> getTag() {
        return this.tag;
    }

    public CreateVSwitchCidrReservationRequest setVSwitchCidrReservationCidr(String vSwitchCidrReservationCidr) {
        this.vSwitchCidrReservationCidr = vSwitchCidrReservationCidr;
        return this;
    }
    public String getVSwitchCidrReservationCidr() {
        return this.vSwitchCidrReservationCidr;
    }

    public CreateVSwitchCidrReservationRequest setVSwitchCidrReservationDescription(String vSwitchCidrReservationDescription) {
        this.vSwitchCidrReservationDescription = vSwitchCidrReservationDescription;
        return this;
    }
    public String getVSwitchCidrReservationDescription() {
        return this.vSwitchCidrReservationDescription;
    }

    public CreateVSwitchCidrReservationRequest setVSwitchCidrReservationMask(String vSwitchCidrReservationMask) {
        this.vSwitchCidrReservationMask = vSwitchCidrReservationMask;
        return this;
    }
    public String getVSwitchCidrReservationMask() {
        return this.vSwitchCidrReservationMask;
    }

    public CreateVSwitchCidrReservationRequest setVSwitchCidrReservationName(String vSwitchCidrReservationName) {
        this.vSwitchCidrReservationName = vSwitchCidrReservationName;
        return this;
    }
    public String getVSwitchCidrReservationName() {
        return this.vSwitchCidrReservationName;
    }

    public CreateVSwitchCidrReservationRequest setVSwitchCidrReservationType(String vSwitchCidrReservationType) {
        this.vSwitchCidrReservationType = vSwitchCidrReservationType;
        return this;
    }
    public String getVSwitchCidrReservationType() {
        return this.vSwitchCidrReservationType;
    }

    public CreateVSwitchCidrReservationRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateVSwitchCidrReservationRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVSwitchCidrReservationRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVSwitchCidrReservationRequestTag self = new CreateVSwitchCidrReservationRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVSwitchCidrReservationRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVSwitchCidrReservationRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
