// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RunRCInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The number of RDS Custom instances that you want to create. The parameter is available if you want to create multiple RDS Custom instances at a time.</p>
     * <p>Valid values: <strong>1</strong> to <strong>10</strong>. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
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
     * <p>false</p>
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
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CreateAckEdgeParam")
    public String createAckEdgeParamShrink;

    @NameInMap("CreateExtraParam")
    public String createExtraParam;

    @NameInMap("CreateMode")
    public String createMode;

    /**
     * <p>The information about the data disks.</p>
     */
    @NameInMap("DataDisk")
    public String dataDiskShrink;

    /**
     * <p>The deployment set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-uf6670sipmph5j5b6ke4</p>
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

    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the image used by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>image-dsvjzw2ii8n4fvr6de</p>
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
     * <p>ceshi</p>
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
     * <p>null</p>
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

    /**
     * <p>The password of the account that is used to log on to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2F9e9@a69c!e18b569c8</p>
     */
    @NameInMap("Password")
    public String password;

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
     * <p>Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
     * <p>sg-uf6av412xaxixuezol6w</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SupportCase")
    public String supportCase;

    /**
     * <p>The specification of the system disk.</p>
     */
    @NameInMap("SystemDisk")
    public String systemDiskShrink;

    @NameInMap("Tag")
    public java.util.List<RunRCInstancesShrinkRequestTag> tag;

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

    public RunRCInstancesShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
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
        @NameInMap("Key")
        public String key;

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
