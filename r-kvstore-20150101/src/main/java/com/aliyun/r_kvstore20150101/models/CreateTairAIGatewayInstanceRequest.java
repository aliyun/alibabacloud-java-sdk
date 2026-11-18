// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairAIGatewayInstanceRequest extends TeaModel {
    /**
     * <p>Only pay-as-you-go is supported. Ignore this parameter. Specifies whether to enable automatic payment. The value is fixed to <strong>true</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Only pay-as-you-go is supported. Ignore this parameter. Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable auto-renewal.</li>
     * <li><strong>false</strong> (default): Disable auto-renewal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Only pay-as-you-go is supported. Ignore this parameter. The auto-renewal epoch. Unit: months. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>6</strong>, and <strong>12</strong>.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>AutoRenew</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoRenewPeriod")
    public String autoRenewPeriod;

    /**
     * <p>Only pay-as-you-go is supported. Ignore this parameter.
     * Specifies whether to use a voucher. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Use a voucher.</li>
     * <li><strong>false</strong> (default): Do not use a voucher.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The activity ID and business information.</p>
     * 
     * <strong>example:</strong>
     * <p>000000000</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The billing method. Only pay-as-you-go is supported. Valid values:</p>
     * <ul>
     * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token is case-sensitive and can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The coupon code. Default value: <code>default</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>Specifies whether to perform a dry run before you create the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run and does not create the instance. The system checks the request parameters, request format, service limits, and available resources. If the request fails the dry run, the corresponding error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends a normal request and creates the instance after the request passes the check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>TestGateway01</p>
     */
    @NameInMap("GatewayName")
    public String gatewayName;

    /**
     * <p>The specifications of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>aigw.std.2</p>
     */
    @NameInMap("GatewayType")
    public String gatewayType;

    /**
     * <p>Only pay-as-you-go is supported. Ignore this parameter.
     * The renewal period. Unit: months. Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, and <strong>36</strong>.</p>
     * <blockquote>
     * <p>For example, if an instance expires in three months and you renew it for three months, the instance will expire in six months after the renewal.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PluginParams")
    public String pluginParams;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PluginType")
    public String pluginType;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tags of the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTairAIGatewayInstanceRequestTag> tag;

    /**
     * <p>The ID of the vSwitch in the VPC. You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query the vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-l</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateTairAIGatewayInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTairAIGatewayInstanceRequest self = new CreateTairAIGatewayInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateTairAIGatewayInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateTairAIGatewayInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateTairAIGatewayInstanceRequest setAutoRenewPeriod(String autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateTairAIGatewayInstanceRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateTairAIGatewayInstanceRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateTairAIGatewayInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateTairAIGatewayInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTairAIGatewayInstanceRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public CreateTairAIGatewayInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTairAIGatewayInstanceRequest setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

    public CreateTairAIGatewayInstanceRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public CreateTairAIGatewayInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateTairAIGatewayInstanceRequest setPluginParams(String pluginParams) {
        this.pluginParams = pluginParams;
        return this;
    }
    public String getPluginParams() {
        return this.pluginParams;
    }

    public CreateTairAIGatewayInstanceRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public CreateTairAIGatewayInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTairAIGatewayInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTairAIGatewayInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateTairAIGatewayInstanceRequest setTag(java.util.List<CreateTairAIGatewayInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTairAIGatewayInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateTairAIGatewayInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateTairAIGatewayInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateTairAIGatewayInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateTairAIGatewayInstanceRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <blockquote>
         * <ul>
         * <li><strong>N</strong> specifies the sequence number of the tag key. You can attach up to 20 tags to an instance. For example, Tag.1.Key specifies the key of the first tag, and Tag.2.Key specifies the key of the second tag.</li>
         * <li>If the tag key does not exist, it is automatically created.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>demokey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <blockquote>
         * <p><strong>N</strong> specifies the sequence number of the tag value. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag, and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testvalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTairAIGatewayInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTairAIGatewayInstanceRequestTag self = new CreateTairAIGatewayInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTairAIGatewayInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTairAIGatewayInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
