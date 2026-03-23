// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RunRCInstancesShrinkRequest extends TeaModel {
    /**
     * <p>ACU type</p>
     * 
     * <strong>example:</strong>
     * <p>gn8is</p>
     */
    @NameInMap("AcuType")
    public String acuType;

    /**
     * <p>The number of RDS Custom instances that you want to create. The parameter is available if you want to create multiple RDS Custom instances at a time.</p>
     * <p>Valid values: <strong>1</strong> to <strong>10</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable the automatic payment feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables the feature. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
     * </ul>
     * <blockquote>
     * <p> If your account balance is insufficient, you can set the AutoPay parameter to false. In this case, an unpaid order is generated. You can complete the payment in the Expenses and Costs console.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default)</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to automatically use a coupon. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * <blockquote>
     * <p>If you use a coupon and later decrease the quota, the amount offset by the coupon will not be refunded.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Information about the ACK Edge cluster.</p>
     */
    @NameInMap("CreateAckEdgeParam")
    public String createAckEdgeParamShrink;

    /**
     * <p>Reserved parameter. Not supported currently.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("CreateExtraParam")
    public String createExtraParam;

    /**
     * <p>Specifies whether the instance can be added to an ACK cluster. When this parameter is set to <strong>1</strong>, the created instance can be added to an ACK cluster by invoking the <strong>AttachRCInstances</strong> API operation, enabling efficient management of container applications.</p>
     * <ul>
     * <li><strong>1</strong>: Yes.</li>
     * <li><strong>0</strong> (default): No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CreateMode")
    public String createMode;

    /**
     * <p>The information about the data disks.</p>
     */
    @NameInMap("DataDisk")
    public String dataDiskShrink;

    /**
     * <p>Specifies whether to enable release protection. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Enabled  </li>
     * <li><strong>false</strong> (default): Disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The deployment set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-uf6670sipmph********</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The instance description. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance_Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and insufficient inventory errors.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, the instance is directly created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Hostname of the instance (2–64 characters).  </p>
     * <ul>
     * <li>Multiple segments separated by periods (.) are supported. Each segment can contain uppercase and lowercase English letters, digits, and hyphens (-).  </li>
     * <li>A period (.) or hyphen (-) cannot appear at the beginning or end of a segment, nor can two periods or hyphens appear consecutively.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testHost1</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the image used by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>image-dsvjzw2ii8n4******</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The billing method of the instance. Set the value to <strong>Prepaid</strong>, which indicates the subscription billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-node-[99,1]-rchost</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type. For more information about the instance types that are supported by RDS Custom instances, see <a href="https://help.aliyun.com/document_detail/2844823.html">Instance types for RDS Custom instances</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.i8.large.2cm</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The name of the AccessKey pair. You can specify only one name.</p>
     * 
     * <strong>example:</strong>
     * <p>dell5502</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("NetworkOptions")
    public String networkOptionsShrink;

    /**
     * <p>The password of the account that is used to log on to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>TestRDS123!</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the password preset in the image. When this parameter is used, the Password parameter must be empty, and you must ensure that the selected image has a password already configured. Default value: false.</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The subscription duration of the instance. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong></li>
     * <li><strong>Month</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <strong>example:</strong>
     * <p><code>10.1.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>72329885****</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Scheduled elasticity rule</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;rule&quot;:[{&quot;beginTime&quot;:&quot;09:00&quot;,&quot;endTime&quot;:&quot;17:00&quot;,&quot;acu&quot;:4}]}</p>
     */
    @NameInMap("ScheduledRule")
    public String scheduledRule;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to which you want to add the new instance. Instances in the same security group can communicate with each other. The maximum number of instances allowed in a security group varies based on the type of the security group. For more information, see the &quot;Security group limits&quot; section in <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * <blockquote>
     * <p> The network type of the instance is determined by the security group specified by the SecurityGroupId parameter. For example, if the network type of the specified security group is VPC, the instance is a VPC-type instance. In this case, you must specify the VSwitchId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-uf6av412xaxixu******</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupIds")
    public String securityGroupIdsShrink;

    /**
     * <p>The spot strategy for pay-as-you-go instances. This parameter takes effect only when the <strong>InstanceChargeType</strong> parameter is set to <strong>PostPaid</strong>. Valid values:  </p>
     * <ul>
     * <li><strong>NoSpot</strong>: Normal pay-as-you-go instance.  </li>
     * <li><strong>SpotAsPriceGo</strong>: The system automatically bids based on the current market price.</li>
     * </ul>
     * <p>Default value: <strong>NoSpot</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The deployment type of RDS Custom. Valid values:</p>
     * <ul>
     * <li><strong>eni</strong>: Dual network interface cards.</li>
     * <li><strong>edge</strong>: Point of presence (POP) node pool.</li>
     * <li><strong>share</strong>: VPC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>share</p>
     */
    @NameInMap("SupportCase")
    public String supportCase;

    /**
     * <p>The specification of the system disk.</p>
     */
    @NameInMap("SystemDisk")
    public String systemDiskShrink;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunRCInstancesShrinkRequestTag> tag;

    /**
     * <p>The instance user data. The raw data can be up to 32 KB in size.  </p>
     * <p>Do not pass sensitive information, such as passwords and private keys, in plaintext. If you must pass such information, encrypt it first, encode it in Base64, and then transmit it. Decrypt and use it inside the instance. The following is an example of converting a script into a Base64-encoded string:  </p>
     * <pre><code>echo -n \\&quot;#!/bin/sh
     * echo &quot;Hello World&quot;\\&quot; | base64 -w 0
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>IyEvYmluL3NoCmVjaG8gIkhlbGxvIFdvcmxkLiBUaGUgdGltZSBpcyBub3cgJChkYXRlIC1SKSIhIHwgdGVlIC9yb290L3VzZXJkYXRhX3Rlc3QudHh0</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>Specifies whether custom data is Base64-encoded.  </p>
     * <ul>
     * <li><strong>true</strong>: Yes.  </li>
     * <li><strong>false</strong> (default): No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UserDataInBase64")
    public Boolean userDataInBase64;

    /**
     * <p>The vSwitch ID of the instance. You must specify this parameter when you create an instance of the virtual private cloud (VPC) type. The specified vSwitch and security group must belong to the same VPC.</p>
     * <blockquote>
     * <p> If you specify the VSwitchId parameter, the zone specified by the ZoneId parameter must be the same as the zone in which the specified vSwitch resides. You can leave the ZoneId parameter empty. In this case, the system uses the zone in which the specified vSwitch resides.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2vcd61ngm890sk****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the instance. You can call the DescribeZones operation to query the zone IDs.</p>
     * <blockquote>
     * <p> If you specify the VSwitchId parameter, the zone specified by the ZoneId parameter must be the same as the zone in which the specified vSwitch resides. You can leave the ZoneId parameter empty. In this case, the system uses the zone in which the specified vSwitch resides.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-f</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static RunRCInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunRCInstancesShrinkRequest self = new RunRCInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunRCInstancesShrinkRequest setAcuType(String acuType) {
        this.acuType = acuType;
        return this;
    }
    public String getAcuType() {
        return this.acuType;
    }

    public RunRCInstancesShrinkRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public RunRCInstancesShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RunRCInstancesShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RunRCInstancesShrinkRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public RunRCInstancesShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunRCInstancesShrinkRequest setCreateAckEdgeParamShrink(String createAckEdgeParamShrink) {
        this.createAckEdgeParamShrink = createAckEdgeParamShrink;
        return this;
    }
    public String getCreateAckEdgeParamShrink() {
        return this.createAckEdgeParamShrink;
    }

    public RunRCInstancesShrinkRequest setCreateExtraParam(String createExtraParam) {
        this.createExtraParam = createExtraParam;
        return this;
    }
    public String getCreateExtraParam() {
        return this.createExtraParam;
    }

    public RunRCInstancesShrinkRequest setCreateMode(String createMode) {
        this.createMode = createMode;
        return this;
    }
    public String getCreateMode() {
        return this.createMode;
    }

    public RunRCInstancesShrinkRequest setDataDiskShrink(String dataDiskShrink) {
        this.dataDiskShrink = dataDiskShrink;
        return this;
    }
    public String getDataDiskShrink() {
        return this.dataDiskShrink;
    }

    public RunRCInstancesShrinkRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public RunRCInstancesShrinkRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public RunRCInstancesShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunRCInstancesShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RunRCInstancesShrinkRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public RunRCInstancesShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RunRCInstancesShrinkRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public RunRCInstancesShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public RunRCInstancesShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RunRCInstancesShrinkRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public RunRCInstancesShrinkRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public RunRCInstancesShrinkRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public RunRCInstancesShrinkRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public RunRCInstancesShrinkRequest setNetworkOptionsShrink(String networkOptionsShrink) {
        this.networkOptionsShrink = networkOptionsShrink;
        return this;
    }
    public String getNetworkOptionsShrink() {
        return this.networkOptionsShrink;
    }

    public RunRCInstancesShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RunRCInstancesShrinkRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public RunRCInstancesShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RunRCInstancesShrinkRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RunRCInstancesShrinkRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public RunRCInstancesShrinkRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public RunRCInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunRCInstancesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RunRCInstancesShrinkRequest setScheduledRule(String scheduledRule) {
        this.scheduledRule = scheduledRule;
        return this;
    }
    public String getScheduledRule() {
        return this.scheduledRule;
    }

    public RunRCInstancesShrinkRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public RunRCInstancesShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RunRCInstancesShrinkRequest setSecurityGroupIdsShrink(String securityGroupIdsShrink) {
        this.securityGroupIdsShrink = securityGroupIdsShrink;
        return this;
    }
    public String getSecurityGroupIdsShrink() {
        return this.securityGroupIdsShrink;
    }

    public RunRCInstancesShrinkRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public RunRCInstancesShrinkRequest setSupportCase(String supportCase) {
        this.supportCase = supportCase;
        return this;
    }
    public String getSupportCase() {
        return this.supportCase;
    }

    public RunRCInstancesShrinkRequest setSystemDiskShrink(String systemDiskShrink) {
        this.systemDiskShrink = systemDiskShrink;
        return this;
    }
    public String getSystemDiskShrink() {
        return this.systemDiskShrink;
    }

    public RunRCInstancesShrinkRequest setTag(java.util.List<RunRCInstancesShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RunRCInstancesShrinkRequestTag> getTag() {
        return this.tag;
    }

    public RunRCInstancesShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public RunRCInstancesShrinkRequest setUserDataInBase64(Boolean userDataInBase64) {
        this.userDataInBase64 = userDataInBase64;
        return this;
    }
    public Boolean getUserDataInBase64() {
        return this.userDataInBase64;
    }

    public RunRCInstancesShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public RunRCInstancesShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class RunRCInstancesShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can create up to N tag keys at the same time, where N ranges from <strong>1 to 20</strong>. Empty strings are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>Testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value corresponding to the tag key. You can create up to N tag values at the same time, where N ranges from <strong>1 to 20</strong>. Empty strings are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>Testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static RunRCInstancesShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RunRCInstancesShrinkRequestTag self = new RunRCInstancesShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public RunRCInstancesShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunRCInstancesShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
