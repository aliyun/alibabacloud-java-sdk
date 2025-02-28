// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCNodePoolResponseBody extends TeaModel {
    /**
     * <p>The node pool information.</p>
     */
    @NameInMap("NodePoolList")
    public java.util.List<DescribeRCNodePoolResponseBodyNodePoolList> nodePoolList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C816A4BF-A6EC-4722-95F9-2055859CCFD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCNodePoolResponseBody self = new DescribeRCNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCNodePoolResponseBody setNodePoolList(java.util.List<DescribeRCNodePoolResponseBodyNodePoolList> nodePoolList) {
        this.nodePoolList = nodePoolList;
        return this;
    }
    public java.util.List<DescribeRCNodePoolResponseBodyNodePoolList> getNodePoolList() {
        return this.nodePoolList;
    }

    public DescribeRCNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRCNodePoolResponseBodyNodePoolListDataDisk extends TeaModel {
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
         * <p>Indicates whether to encrypt the cloud disk. Valid values:</p>
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
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The data disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static DescribeRCNodePoolResponseBodyNodePoolListDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNodePoolResponseBodyNodePoolListDataDisk self = new DescribeRCNodePoolResponseBodyNodePoolListDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeRCNodePoolResponseBodyNodePoolListDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeRCNodePoolResponseBodyNodePoolListSystemDisk extends TeaModel {
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
         * <p>The size of the system disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static DescribeRCNodePoolResponseBodyNodePoolListSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNodePoolResponseBodyNodePoolListSystemDisk self = new DescribeRCNodePoolResponseBodyNodePoolListSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeRCNodePoolResponseBodyNodePoolListSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeRCNodePoolResponseBodyNodePoolListTag extends TeaModel {
        /**
         * <p>The tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>Testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRCNodePoolResponseBodyNodePoolListTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNodePoolResponseBodyNodePoolListTag self = new DescribeRCNodePoolResponseBodyNodePoolListTag();
            return TeaModel.build(map, self);
        }

        public DescribeRCNodePoolResponseBodyNodePoolListTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRCNodePoolResponseBodyNodePoolListTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRCNodePoolResponseBodyNodePoolList extends TeaModel {
        /**
         * <p>Indicates whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): enables the feature. You must make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPay")
        public Boolean autoPay;

        /**
         * <p>Indicates whether to enable auto-renewal for the instance. Valid values:</p>
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
         * <p>The ID of the container cluster in which the RDS Custom instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>c463aaa89e2b84cacacfbf23c4867****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>Indicates whether to add the instance to the ACK cluster.</p>
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
        public java.util.List<DescribeRCNodePoolResponseBodyNodePoolListDataDisk> dataDisk;

        /**
         * <p>The ID of the deployment set.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp18ukv66rlyuffv****</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

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
         * <p>image-dsvjzw2ii8n4fvr****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The billing method. Valid value:</p>
         * <ul>
         * <li><strong>Prepaid</strong>: subscription</li>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * </ul>
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
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance type.</p>
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
         * <p>The key pair name.</p>
         * 
         * <strong>example:</strong>
         * <p>dell5502</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np31da1b38983f4511b490fc62108a****</p>
         */
        @NameInMap("NodePoolId")
        public String nodePoolId;

        /**
         * <p>The name of the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>np31da1b38983f4511b490fc62108a****</p>
         */
        @NameInMap("NodePoolName")
        public String nodePoolName;

        /**
         * <p>The password of the root user of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testPassword</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The subscription duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The unit of the subscription period. Valid values:</p>
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
         * <p>The region ID of the instance.</p>
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
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf6av412xaxixuez****</p>
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
         * <p>The specification of the system disk.</p>
         */
        @NameInMap("SystemDisk")
        public DescribeRCNodePoolResponseBodyNodePoolListSystemDisk systemDisk;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tag")
        public java.util.List<DescribeRCNodePoolResponseBodyNodePoolListTag> tag;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-zm0qvgv3sm3sjzbkr****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRCNodePoolResponseBodyNodePoolList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNodePoolResponseBodyNodePoolList self = new DescribeRCNodePoolResponseBodyNodePoolList();
            return TeaModel.build(map, self);
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setDataDisk(java.util.List<DescribeRCNodePoolResponseBodyNodePoolListDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeRCNodePoolResponseBodyNodePoolListDataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setNodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setNodePoolName(String nodePoolName) {
            this.nodePoolName = nodePoolName;
            return this;
        }
        public String getNodePoolName() {
            return this.nodePoolName;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setSystemDisk(DescribeRCNodePoolResponseBodyNodePoolListSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public DescribeRCNodePoolResponseBodyNodePoolListSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setTag(java.util.List<DescribeRCNodePoolResponseBodyNodePoolListTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeRCNodePoolResponseBodyNodePoolListTag> getTag() {
            return this.tag;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeRCNodePoolResponseBodyNodePoolList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
