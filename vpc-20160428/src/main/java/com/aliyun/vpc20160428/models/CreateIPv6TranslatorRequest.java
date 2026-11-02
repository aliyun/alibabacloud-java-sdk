// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorRequest extends TeaModel {
    /**
     * <p>Specifies whether automatic payment is enabled for subscription bills. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The bandwidth of the IPv6 Translation Service instance. Unit: Mbit/s. Valid values: <strong>1</strong> to <strong>200</strong>. If you do not specify the bandwidth for an IPv6 translation mapping entry, all IPv6 translation mapping entries in the instance share this bandwidth. </p>
     * <blockquote>
     * <p>If you do not specify the bandwidth, the default value is 10 Mbit/s.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. The client token must be unique across different requests and can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>sha111</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li>If the billing cycle is <strong>Month</strong>, valid values are <strong>1</strong> to <strong>9</strong>.  </li>
     * <li>If the billing cycle is <strong>Year</strong>, the valid value is <strong>3</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The name of the IPv6 Translation Service instance. Default value: the instance ID. The name must be 2 to 100 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6_1</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the IPv6 Translation Service instance. Valid values: </p>
     * <ul>
     * <li><p><strong>PREPAY</strong>: subscription.</p>
     * </li>
     * <li><p><strong>POSTPAY</strong>: pay-as-you-go.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle of the subscription instance. Valid values: </p>
     * <ul>
     * <li><p><strong>Month</strong> (default): billed on a monthly basis.</p>
     * </li>
     * <li><p><strong>Year</strong>: billed on a yearly basis.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The region of the IPv6 Translation Service instance. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cm-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The specification of the IPv6 Translation Service instance. Valid value: <strong>small</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>small</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static CreateIPv6TranslatorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorRequest self = new CreateIPv6TranslatorRequest();
        return TeaModel.build(map, self);
    }

    public CreateIPv6TranslatorRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateIPv6TranslatorRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateIPv6TranslatorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIPv6TranslatorRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateIPv6TranslatorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIPv6TranslatorRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateIPv6TranslatorRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateIPv6TranslatorRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateIPv6TranslatorRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateIPv6TranslatorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIPv6TranslatorRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateIPv6TranslatorRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateIPv6TranslatorRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
