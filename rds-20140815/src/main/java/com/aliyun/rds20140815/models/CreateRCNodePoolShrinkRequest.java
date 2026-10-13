// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCNodePoolShrinkRequest extends TeaModel {
    /**
     * <p>Specifies the number of RDS Custom instances to create. This parameter is applicable only when you create multiple RDS Custom instances at a time.</p>
     * <p>Valid values: <strong>1</strong> to <strong>5</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Automatic payment is enabled. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: Only an order is generated and no payment is made.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>true</strong>. If the balance of your payment method is insufficient, you can set the AutoPay parameter to false. In this case, an unpaid order is generated, and you can log on to the ApsaraDB RDS console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. This parameter is valid only when you create a subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the subscription duration is one month, the auto-renewal cycle is 1 month.</li>
     * <li>If the subscription duration is one year, the auto-renewal cycle is 1 year.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The RDS Custom container cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c463aaa89e2b84cacacfbf23c4867****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether the instance is allowed to join an ACK cluster. When this parameter is set to <strong>1</strong>, the created instance can be added to an ACK cluster for efficient management of containerized applications.</p>
     * <ul>
     * <li><strong>1</strong>: yes.</li>
     * <li><strong>0</strong> (default): no.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CreateMode")
    public String createMode;

    /**
     * <p>The data cloud disks.</p>
     */
    @NameInMap("DataDisk")
    public String dataDiskShrink;

    /**
     * <p>The deployment set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-uf6c8qerk019bj1l****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The instance description. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run before creating the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: A dry run is performed and no instance is created. The system checks the request parameters, request format, service limits, and available resources.</li>
     * <li><strong>false</strong> (default): A normal request is sent and the instance is created if the request passes the dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The hostname of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testHost1</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The image ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>image-dsvjzw2ii8n4fvr6de</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type. For the instance types supported by RDS Custom, see <a href="https://help.aliyun.com/document_detail/2844823.html">RDS Custom instance types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.i8.large.2cm</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Reserved parameter. Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>Reserved parameter. Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Reserved parameter. Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The key pair name. Only one key pair name is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>dell5502</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The node pool name.</p>
     * 
     * <strong>example:</strong>
     * <p>testNodePool</p>
     */
    @NameInMap("NodePoolName")
    public String nodePoolName;

    /**
     * <p>The password of the root account for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The subscription duration of the resource. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The time unit of the subscription billing method. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: year.</li>
     * <li><strong>Month</strong> (default): month.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

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
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Reserved parameter. Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The security group ID. You can specify an existing security group ID. If the specified security group does not exist, a security group is automatically created.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-m5e9abdu1rtxa12b****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Reserved parameter. Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The supported scenario. This parameter is required when the <strong>createMode</strong> parameter is set to <strong>1</strong>. Only <strong>edge</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>edge</p>
     */
    @NameInMap("SupportCase")
    public String supportCase;

    /**
     * <p>The system cloud disk.</p>
     */
    @NameInMap("SystemDisk")
    public String systemDiskShrink;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateRCNodePoolShrinkRequestTag> tag;

    /**
     * <p>Reserved parameter. Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The vSwitch ID.</p>
     * <blockquote>
     * <p>The vSwitch must be in the same zone as the RDS instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6adz52c2p****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the instance.</p>
     * <blockquote>
     * <p>If you specify the VSwitchId parameter, the ZoneId parameter must be set to the zone where the vSwitch resides. You can also leave the ZoneId parameter empty, and the system automatically selects the zone where the specified vSwitch resides.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateRCNodePoolShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRCNodePoolShrinkRequest self = new CreateRCNodePoolShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRCNodePoolShrinkRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateRCNodePoolShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateRCNodePoolShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateRCNodePoolShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRCNodePoolShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateRCNodePoolShrinkRequest setCreateMode(String createMode) {
        this.createMode = createMode;
        return this;
    }
    public String getCreateMode() {
        return this.createMode;
    }

    public CreateRCNodePoolShrinkRequest setDataDiskShrink(String dataDiskShrink) {
        this.dataDiskShrink = dataDiskShrink;
        return this;
    }
    public String getDataDiskShrink() {
        return this.dataDiskShrink;
    }

    public CreateRCNodePoolShrinkRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateRCNodePoolShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRCNodePoolShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateRCNodePoolShrinkRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateRCNodePoolShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateRCNodePoolShrinkRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateRCNodePoolShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateRCNodePoolShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateRCNodePoolShrinkRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateRCNodePoolShrinkRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateRCNodePoolShrinkRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateRCNodePoolShrinkRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateRCNodePoolShrinkRequest setNodePoolName(String nodePoolName) {
        this.nodePoolName = nodePoolName;
        return this;
    }
    public String getNodePoolName() {
        return this.nodePoolName;
    }

    public CreateRCNodePoolShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateRCNodePoolShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateRCNodePoolShrinkRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateRCNodePoolShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRCNodePoolShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRCNodePoolShrinkRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateRCNodePoolShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateRCNodePoolShrinkRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateRCNodePoolShrinkRequest setSupportCase(String supportCase) {
        this.supportCase = supportCase;
        return this;
    }
    public String getSupportCase() {
        return this.supportCase;
    }

    public CreateRCNodePoolShrinkRequest setSystemDiskShrink(String systemDiskShrink) {
        this.systemDiskShrink = systemDiskShrink;
        return this;
    }
    public String getSystemDiskShrink() {
        return this.systemDiskShrink;
    }

    public CreateRCNodePoolShrinkRequest setTag(java.util.List<CreateRCNodePoolShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateRCNodePoolShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateRCNodePoolShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateRCNodePoolShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateRCNodePoolShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateRCNodePoolShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can create up to N tag keys at a time. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag key cannot be an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that corresponds to the tag key. You can create up to N tag values at a time. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag value can be an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRCNodePoolShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateRCNodePoolShrinkRequestTag self = new CreateRCNodePoolShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateRCNodePoolShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRCNodePoolShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
