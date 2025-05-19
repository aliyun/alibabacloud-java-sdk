// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables automatic payment. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: does not automatically complete the payment. An unpaid order is generated.</li>
     * </ul>
     * <blockquote>
     * <p> If your account balance is insufficient, you can set the parameter to false. In this case, an unpaid order is generated. You can complete the payment in the Expenses and Costs console.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. You must specify this parameter only when the data disk uses the subscription billing method. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> The auto-renewal cycle is one month for a monthly subscription. The auto-renewal cycle is one year for a yearly subscription.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The disk description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The data disk type. Valid values:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: ultra disk</li>
     * <li><strong>cloud_ssd</strong>: standard SSD</li>
     * <li><strong>cloud_essd</strong>: ESSD</li>
     * <li><strong>cloud_auto</strong> (default): Premium ESSD</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The name of the data disk. The name must be 2 to 128 characters in length and can contain letters and digits. The name can contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>ZStack-Hybrid-Test-ECS-Instance</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>The billing method. Set the value to <strong>Postpaid</strong>, which specifies the pay-as-you-go billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The ID of the instance to which you want to attach the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-v28c6k3jupp61m2t****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The performance level (PL) of ESSDs. Valid values:</p>
     * <ul>
     * <li><strong>PL0</strong>: A single ESSD delivers up to 10,000 random read/write IOPS.</li>
     * <li><strong>PL1: An ESSD delivers up to 50,000 random read/write IOPS.</strong></li>
     * <li><strong>PL2</strong>: A single ESSD delivers up to 100,000 random read/write IOPS.</li>
     * <li><strong>PL3</strong>: A single ESSD delivers up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * <p>For information about ESSD PLs, see <a href="https://help.aliyun.com/document_detail/2859916.html">ESSDs</a>.</p>
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
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The disk size. Unit: GiB. This parameter is required. Valid values:</p>
     * <ul>
     * <li><p>Valid values if you set DiskCategory to <strong>cloud_efficiency</strong>: 20 to 32768.</p>
     * </li>
     * <li><p>Valid values if you set DiskCategory to <strong>cloud_ssd</strong>: 20 to 32768.</p>
     * </li>
     * <li><p>Valid values if you set DiskCategory to <strong>cloud_auto</strong>: 1 to 65536.</p>
     * </li>
     * <li><p>Valid values when DiskCategory is set to cloud_essd: depending on the value of <strong>PerformanceLevel</strong>.****</p>
     * <ul>
     * <li>Valid values if PerformanceLevel is set to PL0: 1 to 65536</li>
     * <li>Valid values if PerformanceLevel is set to PL1: 20 to 65536</li>
     * <li>Valid values if PerformanceLevel is set to PL2: 461 to 65536</li>
     * <li>Valid values if PerformanceLevel is set to PL3: 1261 to 65536</li>
     * </ul>
     * </li>
     * </ul>
     * <p>If <strong>SnapshotId</strong> is specified and the size of the corresponding snapshot is greater than the <strong>Size</strong> value, the size of the created disk is the same as that of the snapshot. If the snapshot size is less than the <strong>Size</strong> value, the size of the created disk is equal to the <strong>Size</strong> value.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The snapshot that you want to use to create the disk.</p>
     * <ul>
     * <li>If the size of the snapshot specified by <strong>SnapshotId</strong> is greater than the value of <strong>Size</strong>, the size of the created disk is equal to the specified snapshot size. If the snapshot size is less than the <strong>Size</strong> value, the size of the created disk is equal to the <strong>Size</strong> value.</li>
     * <li>You cannot create elastic ephemeral disks from snapshots.</li>
     * <li>Snapshots that were created on or before July 15, 2013 cannot be used to create disks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rcds-umtnkvevqbu****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("Tag")
    public java.util.List<CreateRCDiskRequestTag> tag;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required if you do not specify <strong>InstanceId</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
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
        @NameInMap("Key")
        public String key;

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
