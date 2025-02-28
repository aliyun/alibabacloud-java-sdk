// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCNodePoolRequest extends TeaModel {
    /**
     * <p>The number of RDS Custom instances that you want to create. The parameter is available if you want to create multiple RDS Custom instances at a time.</p>
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
     * <li><strong>true</strong>: enables the feature. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
     * </ul>
     * <blockquote>
     * <p> Default value: true. If your account balance is insufficient, you can set AutoPay to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. If you specify the subscription billing method for the instance, you must specify this parameter. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Monthly subscription: The auto-renewal period is one month.</p>
     * </li>
     * <li><p>Annually: The auto-renewal period is one year.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

    /**
     * <p>The ID of the ACK cluster to which the RDS Custom instance belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c463aaa89e2b84cacacfbf23c4867****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to add the instance to the ACK cluster. If this parameter is set to <strong>1</strong>, the created instances can be added to the ACK cluster. This allows you to efficiently manage container applications. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: adds the instance to the ACK cluster.</li>
     * <li><strong>0</strong> (default): does not add the instance to the ACK cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CreateMode")
    public String createMode;

    /**
     * <p>The data disks.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<CreateRCNodePoolRequestDataDisk> dataDisk;

    /**
     * <p>The ID of the deployment set.</p>
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
     * <p>Specifies whether to perform a dry run. Default value: false. Valid values:</p>
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
     * <p>The instance hostname.</p>
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
     * <p>image-dsvjzw2ii8n4fvr6de</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
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
     * <p>None</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
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
     * <p>The name of the node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>testNodePool</p>
     */
    @NameInMap("NodePoolName")
    public String nodePoolName;

    /**
     * <p>The password for the root account of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
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
     * <p>The region ID.</p>
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
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group. You can enter an existing security group ID. If no security groups exist, a security group is automatically created.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-m5e9abdu1rtxa12b****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The supported scenario. If you set the <strong>createMode</strong> parameter to <strong>1</strong>, you must also specify the SupportCase parameter. Valid value: <strong>edge</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>edge</p>
     */
    @NameInMap("SupportCase")
    public String supportCase;

    /**
     * <p>The specification of the system disk.</p>
     */
    @NameInMap("SystemDisk")
    public CreateRCNodePoolRequestSystemDisk systemDisk;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateRCNodePoolRequestTag> tag;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The vSwitch ID.</p>
     * <blockquote>
     * <p> The vSwitch must belong to the same zone as the instance.</p>
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
     * <p> If you specify the VSwitchId parameter, the zone specified by the ZoneId parameter must be the same as the zone in which the specified vSwitch resides. You can leave the ZoneId parameter empty. In this case, the system uses the zone in which the specified vSwitch resides.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateRCNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRCNodePoolRequest self = new CreateRCNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateRCNodePoolRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateRCNodePoolRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateRCNodePoolRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateRCNodePoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRCNodePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateRCNodePoolRequest setCreateMode(String createMode) {
        this.createMode = createMode;
        return this;
    }
    public String getCreateMode() {
        return this.createMode;
    }

    public CreateRCNodePoolRequest setDataDisk(java.util.List<CreateRCNodePoolRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateRCNodePoolRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateRCNodePoolRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateRCNodePoolRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRCNodePoolRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateRCNodePoolRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateRCNodePoolRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateRCNodePoolRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateRCNodePoolRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateRCNodePoolRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateRCNodePoolRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateRCNodePoolRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateRCNodePoolRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateRCNodePoolRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateRCNodePoolRequest setNodePoolName(String nodePoolName) {
        this.nodePoolName = nodePoolName;
        return this;
    }
    public String getNodePoolName() {
        return this.nodePoolName;
    }

    public CreateRCNodePoolRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateRCNodePoolRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateRCNodePoolRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateRCNodePoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRCNodePoolRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRCNodePoolRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateRCNodePoolRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateRCNodePoolRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateRCNodePoolRequest setSupportCase(String supportCase) {
        this.supportCase = supportCase;
        return this;
    }
    public String getSupportCase() {
        return this.supportCase;
    }

    public CreateRCNodePoolRequest setSystemDisk(CreateRCNodePoolRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateRCNodePoolRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateRCNodePoolRequest setTag(java.util.List<CreateRCNodePoolRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateRCNodePoolRequestTag> getTag() {
        return this.tag;
    }

    public CreateRCNodePoolRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateRCNodePoolRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateRCNodePoolRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateRCNodePoolRequestDataDisk extends TeaModel {
        /**
         * <p>The type of the data disk. Set the value to <strong>cloud_essd</strong>, which indicates Enterprise SSDs (ESSDs).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>Specifies whether to encrypt the data disk. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The performance level of the ESSD. Valid values:</p>
         * <ul>
         * <li><strong>PL0</strong>: A single ESSD delivers up to 10,000 random read/write IOPS.</li>
         * <li><strong>PL1</strong>: A single ESSD delivers up to 50,000 random read/write IOPS.</li>
         * <li><strong>PL2</strong>: A single ESSD delivers up to 100,000 random read/write IOPS.</li>
         * <li><strong>PL3</strong>: A single ESSD delivers up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the data disk. Unit: GiB. Valid values: 20 to 65536.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static CreateRCNodePoolRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateRCNodePoolRequestDataDisk self = new CreateRCNodePoolRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateRCNodePoolRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateRCNodePoolRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateRCNodePoolRequestDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateRCNodePoolRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateRCNodePoolRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateRCNodePoolRequestSystemDisk extends TeaModel {
        /**
         * <p>The type of the system disk. Set the value to <strong>cloud_essd</strong>, which indicates ESSDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of the ESSD. Valid values:</p>
         * <ul>
         * <li><strong>PL0</strong>: A single ESSD delivers up to 10,000 random read/write IOPS.</li>
         * <li><strong>PL1</strong>: A single ESSD delivers up to 50,000 random read/write IOPS.</li>
         * <li><strong>PL2</strong>: A single ESSD delivers up to 100,000 random read/write IOPS.</li>
         * <li><strong>PL3</strong>: A single ESSD delivers up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values: 20 to 2048.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static CreateRCNodePoolRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateRCNodePoolRequestSystemDisk self = new CreateRCNodePoolRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateRCNodePoolRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateRCNodePoolRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateRCNodePoolRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateRCNodePoolRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. You can create N tag keys at a time. Valid values of N: <strong>1 to 20</strong>. This parameter cannot be an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can create N tag values at a time. Valid values of N: <strong>1</strong> to <strong>20</strong>. This parameter can be an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRCNodePoolRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateRCNodePoolRequestTag self = new CreateRCNodePoolRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateRCNodePoolRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRCNodePoolRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
