// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairKVCacheVNodeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Set the value to <strong>true</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled</li>
     * <li><strong>false</strong>: disables auto-renewal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The subscription duration that is supported by auto-renewal. Unit: month. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>6</strong>, and <strong>12</strong>.</p>
     * <blockquote>
     * <p> This parameter is required if the <strong>AutoRenew</strong> parameter is set to <strong>true</strong>.</p>
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
     * <li><strong>true</strong>: uses a coupon.</li>
     * <li><strong>false</strong>: does not use a coupon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The extended information such as the promotional event ID and business information.</p>
     * 
     * <strong>example:</strong>
     * <p>000000000</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The new billing method. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription. If you set this parameter to PrePaid, you must also specify the <strong>Period</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests and is case-sensitive. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of compute units. Valid values: 1.</p>
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
     * <li><strong>true</strong>: performs a dry run and does not create the instance. The system prechecks the request parameters, request format, service limits, and available resources. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: performs a dry run and performs the actual request. If the request passes the dry run, the instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ElasticTimeRange")
    public String elasticTimeRange;

    /**
     * <p>Instance specification</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kvcache.cu.g4b.2</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The name of the instance. The name must be 2 to 80 characters in length. The name must start with a letter and cannot contain spaces or the following special characters: <code>@ / : = &quot; &lt; &gt; { [ ] }</code></p>
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
     * <p>The subscription duration. Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, and <strong>36</strong>. Unit: months.</p>
     * <blockquote>
     * <p> This parameter is required only if the <strong>ChargeType</strong> parameter is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The ID of the region where the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group that you want to manage.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can query resource group IDs in the console or by calling the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information about a resource group</a>.</p>
     * </li>
     * <li><p>Before you modify the resource group to which an instance belongs, you can call the <a href="https://help.aliyun.com/document_detail/158866.html">ListResources</a> operation to view the current resource group of the instance.</p>
     * </li>
     * </ul>
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
     * <p>Details of the tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTairKVCacheVNodeRequestTag> tag;

    @NameInMap("VNodeType")
    public String VNodeType;

    /**
     * <p>The ID of the vSwitch to which the instance belongs. The vSwitch must belong to the VPC of the VCluser. You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query the VPC ID.</p>
     * <blockquote>
     * <p> The vSwitch and the instance must be deployed in the same zone.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VCluster that contains the VNode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tk-2ze4bba3c8fe****</p>
     */
    @NameInMap("VkName")
    public String vkName;

    /**
     * <p>The zone ID of the instance.</p>
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
         * <p> A maximum of five key-value pairs can be specified at a time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>value1_test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the instance.</p>
         * <blockquote>
         * <p> <strong>N</strong> specifies the value of the nth tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag, and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
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
