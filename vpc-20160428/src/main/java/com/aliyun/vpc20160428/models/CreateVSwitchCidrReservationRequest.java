// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVSwitchCidrReservationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a check request without creating the reserved CIDR block for a vSwitch. The system checks whether the required parameters are specified, the request format is valid, and the service limits are not exceeded. If the check fails, the corresponding error message is returned. If the check passes, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends a Normal request. After the check passes, an HTTP 2xx status code is returned and the vSwitch reserved CIDR block for a vSwitch is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The expected number of IP prefixes to reserve. Valid values: 1 to 32.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IpPrefixNumber")
    public Integer ipPrefixNumber;

    /**
     * <p>The IP version of the reserved CIDR block for a vSwitch. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong> (default)</li>
     * <li><strong>IPv6</strong></li>
     * </ul>
     * <blockquote>
     * <p>You do not need to specify this parameter when creating an IPv4 reserved CIDR block for a vSwitch. This parameter is required when creating an IPv6 reserved CIDR block for a vSwitch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the vSwitch.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The resource tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVSwitchCidrReservationRequestTag> tag;

    /**
     * <p>The reserved CIDR block for a vSwitch.</p>
     * <ul>
     * <li>If <strong>IpVersion</strong> is set to <strong>IPv4</strong>, the reserved CIDR block for a vSwitch must be a proper subset of the IPv4 CIDR block of the vSwitch, and the mask length cannot exceed 28.</li>
     * <li>If <strong>IpVersion</strong> is set to <strong>IPv6</strong>, the reserved CIDR block for a vSwitch must be a proper subset of the IPv6 CIDR block of the vSwitch, and the mask length cannot exceed 80.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You must specify either the <strong>VSwitchCidrReservationMask</strong> parameter or the <strong>VSwitchCidrReservationCidr</strong> parameter.</li>
     * <li>The reserved CIDR block cannot contain the system reserved IP addresses of the vSwitch.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.64/28</p>
     */
    @NameInMap("VSwitchCidrReservationCidr")
    public String vSwitchCidrReservationCidr;

    /**
     * <p>The description of the reserved CIDR block for a vSwitch. If you leave this parameter empty, the default value is empty.</p>
     * <p>The description must be 1 to 256 characters in length and must start with a letter or Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ReservationDescription</p>
     */
    @NameInMap("VSwitchCidrReservationDescription")
    public String vSwitchCidrReservationDescription;

    /**
     * <p>The mask of the reserved CIDR block for a vSwitch.</p>
     * <ul>
     * <li>If <strong>IpVersion</strong> is set to <strong>IPv4</strong>, the mask length of the reserved CIDR block must be at least 2 bits longer than the IPv4 CIDR block mask of the vSwitch and cannot exceed 28.</li>
     * <li>If <strong>IpVersion</strong> is set to <strong>IPv6</strong>, the mask length of the reserved CIDR block must be longer than the IPv6 CIDR block mask of the vSwitch and cannot exceed 80.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You must specify either the <strong>VSwitchCidrReservationMask</strong> parameter or the <strong>VSwitchCidrReservationCidr</strong> parameter.</li>
     * <li>The reserved CIDR block cannot contain the system reserved IP addresses of the vSwitch.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("VSwitchCidrReservationMask")
    public String vSwitchCidrReservationMask;

    /**
     * <p>The name of the reserved CIDR block for a vSwitch.</p>
     * <p>The name must be 1 to 128 characters in length and must start with a letter or Chinese character. It can contain digits, underscores (_), and hyphens (-). It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ReservationName</p>
     */
    @NameInMap("VSwitchCidrReservationName")
    public String vSwitchCidrReservationName;

    /**
     * <p>The type of the reserved CIDR block for a vSwitch. Valid values: <strong>prefix</strong>, which indicates that IP addresses are allocated by CIDR block.</p>
     * <blockquote>
     * <p>When users or cloud services automatically assign CIDR blocks to elastic network interfaces (ENIs), the CIDR blocks must be allocated from the reserved CIDR block for a vSwitch. If the IP addresses in the reserved CIDR block for a vSwitch are exhausted, the system returns an error.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>prefix</p>
     */
    @NameInMap("VSwitchCidrReservationType")
    public String vSwitchCidrReservationType;

    /**
     * <p>The ID of the vSwitch for which you want to create a reserved CIDR block for a vSwitch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-25navfgbue4g****</p>
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

    public CreateVSwitchCidrReservationRequest setIpPrefixNumber(Integer ipPrefixNumber) {
        this.ipPrefixNumber = ipPrefixNumber;
        return this;
    }
    public Integer getIpPrefixNumber() {
        return this.ipPrefixNumber;
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
         * <p>The tag key of the resource. You can specify up to 20 tag keys. If you specify this parameter, the value cannot be an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. If you specify this parameter, the value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
