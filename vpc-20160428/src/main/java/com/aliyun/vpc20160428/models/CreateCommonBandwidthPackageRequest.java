// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateCommonBandwidthPackageRequest extends TeaModel {
    /**
     * <p>The peak bandwidth of the Internet Shared Bandwidth instance. Unit: Mbit/s. </p>
     * <p>&lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>1</strong> to <strong>1000</strong>. Default value: <strong>1</strong>.</ph></p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>If <strong>InternetChargeType</strong> is set to <strong>PayByBandwidth</strong>, which indicates that the billing method of the Internet Shared Bandwidth instance is pay-by-bandwidth, the valid values of <strong>Bandwidth</strong> are <strong>2</strong> to <strong>20000</strong>.</li>
     * <li>If <strong>InternetChargeType</strong> is set to <strong>PayBy95</strong>, which indicates that the billing method of the Internet Shared Bandwidth instance is pay-by-enhanced-95th-percentile, the valid values of <strong>Bandwidth</strong> are <strong>200</strong> to <strong>20000</strong>.</li>
     * <li>If <strong>InternetChargeType</strong> is set to <strong>PayByDominantTraffic</strong>, which indicates that the billing method of the Internet Shared Bandwidth instance is pay-by-dominant-traffic, the valid values of <strong>Bandwidth</strong> are <strong>1</strong> to <strong>2000</strong>.</li>
     * </ul>
     * <p>Default value: <strong>1000</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the Internet Shared Bandwidth instance.</p>
     * <p>The description must be 0 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The line type. Valid values:</p>
     * <ul>
     * <li><strong>BGP</strong> (default): BGP (multi-ISP) line. BGP (multi-ISP) lines are supported in all regions.</li>
     * <li><strong>BGP_PRO</strong>: BGP (multi-ISP) Pro line. BGP (multi-ISP) Pro Internet Shared Bandwidth is supported only in the Hong Kong (China), Singapore, Japan (Tokyo), Philippines (Manila), Malaysia (Kuala Lumpur), Indonesia (Jakarta), and Thailand (Bangkok) regions.</li>
     * </ul>
     * <p>If your account is added to the whitelist for single-ISP bandwidth, you can also select the following values:</p>
     * <ul>
     * <li><strong>ChinaTelecom</strong>: China Telecom</li>
     * <li><strong>ChinaUnicom</strong>: China Unicom</li>
     * <li><strong>ChinaMobile</strong>: China Mobile</li>
     * <li><strong>ChinaTelecom_L2</strong>: China Telecom L2</li>
     * <li><strong>ChinaUnicom_L2</strong>: China Unicom L2</li>
     * <li><strong>ChinaMobile_L2</strong>: China Mobile L2</li>
     * </ul>
     * <p>If you use Alibaba Finance Cloud in the China (Hangzhou) region, this parameter is required. Set the value to <strong>BGP_FinanceCloud</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The billing method of the Internet Shared Bandwidth instance. Valid values:
     * &lt;props=&quot;intl&quot;&gt;<strong>PayByTraffic</strong> (pay-by-data-transfer).</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</li>
     * <li><strong>PayBy95</strong>: pay-by-enhanced-95th-percentile.</li>
     * <li><strong>PayByDominantTraffic</strong>: pay-by-dominant-traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>For China site: PayByBandwidth, for International site: PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The name of the Internet Shared Bandwidth instance.</p>
     * <p>The name must be 0 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The minimum bandwidth percentage of the Internet Shared Bandwidth instance. Set the value to <strong>20</strong>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;<ph>This parameter is required when <strong>InternetChargeType</strong> is set to <strong>PayBy95</strong>.</ph></p>
     * <blockquote>
     * <p>This parameter is supported only on the Alibaba Cloud China site.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Ratio")
    public Integer ratio;

    /**
     * <p>The region ID of the Internet Shared Bandwidth instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazdjdhd****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The security protection level.</p>
     * <ul>
     * <li><p>If this parameter is left empty, Anti-DDoS Basic is used by default.</p>
     * </li>
     * <li><p>If this parameter is set to <strong>AntiDDoS_Enhanced</strong>, Anti-DDoS (Enhanced) is used.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;<ph>You can configure this parameter when <strong>InternetChargeType</strong> is set to <strong>PayBy95</strong>.</ph></p>
     * <p>You can add up to 10 security protection levels.</p>
     * <blockquote>
     * <p><strong>[Deprecated]</strong> This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AntiDDoS_Enhanced</p>
     */
    @NameInMap("SecurityProtectionTypes")
    public java.util.List<String> securityProtectionTypes;

    /**
     * <p>The list of tags of the Internet Shared Bandwidth instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCommonBandwidthPackageRequestTag> tag;

    /**
     * <p>The zone of the Internet Shared Bandwidth instance.
     * This parameter is required when you create an Internet Shared Bandwidth instance for a CloudBox.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1-lzdvn-cb</p>
     */
    @NameInMap("Zone")
    public String zone;

    public static CreateCommonBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommonBandwidthPackageRequest self = new CreateCommonBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommonBandwidthPackageRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateCommonBandwidthPackageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCommonBandwidthPackageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCommonBandwidthPackageRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public CreateCommonBandwidthPackageRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateCommonBandwidthPackageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCommonBandwidthPackageRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCommonBandwidthPackageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCommonBandwidthPackageRequest setRatio(Integer ratio) {
        this.ratio = ratio;
        return this;
    }
    public Integer getRatio() {
        return this.ratio;
    }

    public CreateCommonBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCommonBandwidthPackageRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCommonBandwidthPackageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCommonBandwidthPackageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCommonBandwidthPackageRequest setSecurityProtectionTypes(java.util.List<String> securityProtectionTypes) {
        this.securityProtectionTypes = securityProtectionTypes;
        return this;
    }
    public java.util.List<String> getSecurityProtectionTypes() {
        return this.securityProtectionTypes;
    }

    public CreateCommonBandwidthPackageRequest setTag(java.util.List<CreateCommonBandwidthPackageRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCommonBandwidthPackageRequestTag> getTag() {
        return this.tag;
    }

    public CreateCommonBandwidthPackageRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public static class CreateCommonBandwidthPackageRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. If you specify this parameter, you cannot specify an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. If you specify this parameter, you can specify an empty string.</p>
         * <p>A tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCommonBandwidthPackageRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateCommonBandwidthPackageRequestTag self = new CreateCommonBandwidthPackageRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateCommonBandwidthPackageRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCommonBandwidthPackageRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
