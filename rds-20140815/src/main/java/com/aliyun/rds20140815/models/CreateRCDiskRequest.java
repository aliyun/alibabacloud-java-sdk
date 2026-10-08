// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables automatic payment. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: generates an order without charging.</li>
     * </ul>
     * <blockquote>
     * <p>If your payment method has insufficient balance, set this parameter to false. An unpaid order is generated, and you can log on to the ApsaraDB RDS console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. This parameter is valid only when you create a subscription data cloud disk. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong>: disables auto-renewal.</li>
     * </ul>
     * <blockquote>
     * <p>If you purchase the cloud disk on a monthly basis, the auto-renewal epoch is one month.
     *  If you purchase the cloud disk on a yearly basis, the auto-renewal epoch is one year.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The description of the cloud disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The category of the data cloud disk. Valid values:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: ultra cloud disk.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD.</li>
     * <li><strong>cloud_essd</strong>: ESSD.</li>
     * <li><strong>cloud_auto</strong> (default): premium performance disk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The name of the cloud disk. The name must be 2 to 128 characters in length and can contain characters that are categorized as letter in Unicode, including Chinese characters, English letters, and digits. The name can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testDisk</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go. Cloud disks with this billing method do not need to be mounted to an instance. You can also mount them to an instance of any billing method during creation as needed.</li>
     * <li><strong>Prepaid</strong>: subscription. Cloud disks with this billing method must be mounted to a subscription instance. You must specify the <strong>InstanceId</strong> (instance ID) of a subscription instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>Instance ID of the instance to which the cloud disk is attached. If <strong>InstanceChargeType</strong> is set to <strong>Prepaid</strong> (subscription), you must specify instance ID of a subscription instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-v28c6k3jupp61m2t****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The performance level (PL) of the ESSD cloud disk. Valid values:</p>
     * <ul>
     * <li><strong>PL0</strong>: A single cloud disk can deliver up to 10,000 random read/write IOPS.</li>
     * <li><strong>PL1</strong> (default): A single cloud disk can deliver up to 50,000 random read/write IOPS.</li>
     * <li><strong>PL2</strong>: A single cloud disk can deliver up to 100,000 random read/write IOPS.</li>
     * <li><strong>PL3</strong>: A single cloud disk can deliver up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * <p>For more information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/2859916.html">ESSD cloud disk</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query region IDs.</p>
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
     * <p>rg-ac****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The capacity size. Unit: GiB. You must specify a value for this parameter. Valid values:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: 20 to 32,768.</li>
     * <li><strong>cloud_ssd</strong>: 20 to 32,768.</li>
     * <li><strong>cloud_auto</strong>: 1 to 65,536.</li>
     * <li><strong>cloud_essd</strong>: The valid value range depends on the value of <strong>PerformanceLevel</strong>.<ul>
     * <li>PL0: 1 to 65,536.</li>
     * <li>PL1: 20 to 65,536.</li>
     * <li>PL2: 461 to 65,536.</li>
     * <li>PL3: 1,261 to 65,536.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>If <strong>SnapshotId</strong> is specified and the capacity of the corresponding snapshot is greater than the value of <strong>Size</strong>, snapshot size of the created cloud disk is the same as the snapshot capacity. If the snapshot capacity is less than the value of <strong>Size</strong>, snapshot size of the created cloud disk is the value of <strong>Size</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The snapshot that is used to create the cloud disk.</p>
     * <ul>
     * <li>RDS Custom snapshots and ECS snapshots (non-shared type) are supported.</li>
     * <li>If the capacity of the snapshot specified by <strong>SnapshotId</strong> is greater than the value of <strong>Size</strong>, snapshot size of the created cloud disk is the same as the snapshot capacity. If the snapshot capacity is less than the value of <strong>Size</strong>, snapshot size of the created cloud disk is the value of <strong>Size</strong>.</li>
     * <li>Creating elastic ephemeral disks from snapshots is not supported.</li>
     * <li>Snapshots created on or before July 15, 2013 cannot be used to create cloud disks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rcds-umtnkvevqbu****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateRCDiskRequestTag> tag;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required if the <strong>InstanceId</strong> parameter (the instance ID of the instance to which the cloud disk is mounted) is not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateRCDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRCDiskRequest self = new CreateRCDiskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRCDiskRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateRCDiskRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateRCDiskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRCDiskRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public CreateRCDiskRequest setDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }
    public String getDiskName() {
        return this.diskName;
    }

    public CreateRCDiskRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateRCDiskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRCDiskRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public CreateRCDiskRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateRCDiskRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateRCDiskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRCDiskRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRCDiskRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public CreateRCDiskRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateRCDiskRequest setTag(java.util.List<CreateRCDiskRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateRCDiskRequestTag> getTag() {
        return this.tag;
    }

    public CreateRCDiskRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateRCDiskRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can specify up to N tag keys at a time. Valid values of N: <strong>1 to 20</strong>. The tag key cannot be an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that corresponds to the tag key. You can specify up to N tag values at a time. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag value can be an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRCDiskRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateRCDiskRequestTag self = new CreateRCDiskRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateRCDiskRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRCDiskRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
