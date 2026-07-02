// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairKVCacheVNodeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment. The value must be <strong>true</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables auto-renewal.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Disables auto-renewal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period, in months. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>6</strong>, and <strong>12</strong>.</p>
     * <blockquote>
     * <p>This parameter is required when the <strong>AutoRenew</strong> parameter is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public String autoRenewPeriod;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Use a coupon.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Do not use a coupon.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>Additional business information, such as a promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>000000000</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The billing method for the instance. Valid value:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: Subscription. If you specify this value, you must also specify the <strong>Period</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>A client-generated token that ensures request idempotence. This token must be unique across requests, is case-sensitive, and cannot exceed 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of compute units. Currently, only one compute unit is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ComputeUnitNum")
    public Integer computeUnitNum;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a dry run and does not create the instance. The system checks the request parameters, request format, business limits, and available inventory. If the check fails, the system returns the corresponding error. If the check passes, the system returns the <code>DryRunOperation</code> error code.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request. If the check passes, the system creates the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is no longer used.</p>
     */
    @NameInMap("ElasticTimeRange")
    public String elasticTimeRange;

    /**
     * <p>The instance specification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kvcache.cu.g4b.2</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The name of the new instance. The name must be 2 to 80 characters long and must start with a letter (case-insensitive) or a Chinese character. Spaces and the following special characters are not supported: <code>@/:=”&lt;&gt;{[]}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>vnodetest</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription period in months. Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, and <strong>36</strong>.</p>
     * <blockquote>
     * <p>This parameter is required when the <strong>ChargeType</strong> parameter is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The ID of the region where you want to create the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance will belong.</p>
     * <blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation or view resource group IDs in the console. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information about a resource group</a>.</p>
     * </li>
     * <li><p>Before changing the resource group of an instance, call the <a href="158866">ListResources</a> API to view the current resource group of the instance.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tags to add to the instance. You can specify a maximum of five tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTairKVCacheVNodeRequestTag> tag;

    /**
     * <p>This parameter is no longer used.</p>
     */
    @NameInMap("VNodeType")
    public String VNodeType;

    /**
     * <p>The ID of the vSwitch for the instance. The vSwitch must belong to the VPC that is associated with the specified virtual cluster. You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to obtain the vSwitch ID.</p>
     * <blockquote>
     * <p>The vSwitch must be in the same zone as the instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual cluster that hosts the VNode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tk-2ze4bba3c8fe****</p>
     */
    @NameInMap("VkName")
    public String vkName;

    /**
     * <p>The ID of the zone where you want to create the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-f</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateTairKVCacheVNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTairKVCacheVNodeRequest self = new CreateTairKVCacheVNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateTairKVCacheVNodeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateTairKVCacheVNodeRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateTairKVCacheVNodeRequest setAutoRenewPeriod(String autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateTairKVCacheVNodeRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateTairKVCacheVNodeRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateTairKVCacheVNodeRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateTairKVCacheVNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTairKVCacheVNodeRequest setComputeUnitNum(Integer computeUnitNum) {
        this.computeUnitNum = computeUnitNum;
        return this;
    }
    public Integer getComputeUnitNum() {
        return this.computeUnitNum;
    }

    public CreateTairKVCacheVNodeRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public CreateTairKVCacheVNodeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTairKVCacheVNodeRequest setElasticTimeRange(String elasticTimeRange) {
        this.elasticTimeRange = elasticTimeRange;
        return this;
    }
    public String getElasticTimeRange() {
        return this.elasticTimeRange;
    }

    public CreateTairKVCacheVNodeRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateTairKVCacheVNodeRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateTairKVCacheVNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTairKVCacheVNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTairKVCacheVNodeRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateTairKVCacheVNodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTairKVCacheVNodeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTairKVCacheVNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTairKVCacheVNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTairKVCacheVNodeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateTairKVCacheVNodeRequest setTag(java.util.List<CreateTairKVCacheVNodeRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTairKVCacheVNodeRequestTag> getTag() {
        return this.tag;
    }

    public CreateTairKVCacheVNodeRequest setVNodeType(String VNodeType) {
        this.VNodeType = VNodeType;
        return this;
    }
    public String getVNodeType() {
        return this.VNodeType;
    }

    public CreateTairKVCacheVNodeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateTairKVCacheVNodeRequest setVkName(String vkName) {
        this.vkName = vkName;
        return this;
    }
    public String getVkName() {
        return this.vkName;
    }

    public CreateTairKVCacheVNodeRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateTairKVCacheVNodeRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <blockquote>
         * <p>You can specify up to 5 tag key-value pairs at a time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>value1_test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <blockquote>
         * <p><strong>N</strong> represents the index of a tag, starting from 1. For example, <strong>Tag.1.Value</strong> is the value of the first tag.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>key1_test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTairKVCacheVNodeRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTairKVCacheVNodeRequestTag self = new CreateTairKVCacheVNodeRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTairKVCacheVNodeRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTairKVCacheVNodeRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
