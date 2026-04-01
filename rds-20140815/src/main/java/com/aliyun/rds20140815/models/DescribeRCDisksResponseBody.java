// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCDisksResponseBody extends TeaModel {
    /**
     * <p>The information about the disks.</p>
     */
    @NameInMap("Disks")
    public java.util.List<DescribeRCDisksResponseBodyDisks> disks;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8B993DA9-5272-5414-94E3-4CA8BA0146C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeRCDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCDisksResponseBody self = new DescribeRCDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCDisksResponseBody setDisks(java.util.List<DescribeRCDisksResponseBodyDisks> disks) {
        this.disks = disks;
        return this;
    }
    public java.util.List<DescribeRCDisksResponseBodyDisks> getDisks() {
        return this.disks;
    }

    public DescribeRCDisksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCDisksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRCDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCDisksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRCDisksResponseBodyDisksTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeRCDisksResponseBodyDisksTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCDisksResponseBodyDisksTag self = new DescribeRCDisksResponseBodyDisksTag();
            return TeaModel.build(map, self);
        }

        public DescribeRCDisksResponseBodyDisksTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeRCDisksResponseBodyDisksTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeRCDisksResponseBodyDisks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2017-12-05T2340:00Z</p>
         */
        @NameInMap("AttachedTime")
        public String attachedTime;

        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the disk. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: ultra disk.</li>
         * <li><strong>cloud_ssd</strong>: standard SSD.</li>
         * <li><strong>cloud_essd</strong>: ESSD.</li>
         * <li><strong>cloud_auto</strong>: Premium ESSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-22T02:41:37Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the automatic snapshots of the cloud disk are deleted after the disk is released. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteAutoSnapshot")
        public Boolean deleteAutoSnapshot;

        /**
         * <p>Indicates whether the cloud disk is released when its associated instance is released. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The disk description.</p>
         * 
         * <strong>example:</strong>
         * <p>zd_test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvda</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The billing method of the disk.</p>
         * <p>Only <strong>PostPaid</strong> (pay-as-you-go) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("DiskChargeType")
        public String diskChargeType;

        /**
         * <p>The disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rcd-wz9f3peueu5npsl****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The disk name.</p>
         * 
         * <strong>example:</strong>
         * <p>fvt-ecs-bcfb3627</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Indicates whether only encrypted cloud disks are queried. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>A reserved parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × *Capacity - Baseline performance}. Baseline performance = min{1,800 + 50 × *Capacity, 50,000}</p>
         * <p>This parameter is available only when the <code>Category</code> parameter is set to <code>cloud_auto</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("IOPS")
        public Long IOPS;

        /**
         * <p>The ID of the image that is used to create the instance. This parameter is returned only if the cloud disk is created from an image. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>m-2zeb24dw6wripjn2****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-e8w1cn7634kiam****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The performance level (PL) of the ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("Portable")
        public Boolean portable;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the disk belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzescnje5khnq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The serial number of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>bp18um4r4f2fve2****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The ID of the snapshot that was used to create the cloud disk.</p>
         * <p>This parameter is empty unless the cloud disk was created from a snapshot. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>rcds-bp67acfmxazb4p****</p>
         */
        @NameInMap("SourceSnapshotId")
        public String sourceSnapshotId;

        /**
         * <p>The status of the disk. Valid values:</p>
         * <ul>
         * <li>In_use: The disk is in use.</li>
         * <li>Available: The disk can be attached.</li>
         * <li>Attaching: The disk is being attached.</li>
         * <li>Detaching: The cloud disk is being detached.</li>
         * <li>Creating: The disk is being created.</li>
         * <li>ReIniting: The disk is being initialized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>In_use</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the dedicated block storage cluster to which the cloud disk belongs. If your cloud disk belongs to the public block storage cluster, an empty value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>dbsc-cn-zvp2rl601****</p>
         */
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        /**
         * <p>The storage set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-i-bp1j4i2jdf3owlhe****</p>
         */
        @NameInMap("StorageSetId")
        public String storageSetId;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tag")
        public java.util.List<DescribeRCDisksResponseBodyDisksTag> tag;

        /**
         * <p>The disk type. Valid values:</p>
         * <ul>
         * <li>system: system disk</li>
         * <li>data: data disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>data</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRCDisksResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCDisksResponseBodyDisks self = new DescribeRCDisksResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public DescribeRCDisksResponseBodyDisks setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeRCDisksResponseBodyDisks setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeRCDisksResponseBodyDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeRCDisksResponseBodyDisks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRCDisksResponseBodyDisks setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }
        public Boolean getDeleteAutoSnapshot() {
            return this.deleteAutoSnapshot;
        }

        public DescribeRCDisksResponseBodyDisks setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeRCDisksResponseBodyDisks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRCDisksResponseBodyDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeRCDisksResponseBodyDisks setDiskChargeType(String diskChargeType) {
            this.diskChargeType = diskChargeType;
            return this;
        }
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        public DescribeRCDisksResponseBodyDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeRCDisksResponseBodyDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeRCDisksResponseBodyDisks setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeRCDisksResponseBodyDisks setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeRCDisksResponseBodyDisks setIOPS(Long IOPS) {
            this.IOPS = IOPS;
            return this;
        }
        public Long getIOPS() {
            return this.IOPS;
        }

        public DescribeRCDisksResponseBodyDisks setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeRCDisksResponseBodyDisks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRCDisksResponseBodyDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeRCDisksResponseBodyDisks setPortable(Boolean portable) {
            this.portable = portable;
            return this;
        }
        public Boolean getPortable() {
            return this.portable;
        }

        public DescribeRCDisksResponseBodyDisks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRCDisksResponseBodyDisks setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRCDisksResponseBodyDisks setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeRCDisksResponseBodyDisks setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeRCDisksResponseBodyDisks setSourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = sourceSnapshotId;
            return this;
        }
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        public DescribeRCDisksResponseBodyDisks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRCDisksResponseBodyDisks setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

        public DescribeRCDisksResponseBodyDisks setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeRCDisksResponseBodyDisks setTag(java.util.List<DescribeRCDisksResponseBodyDisksTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeRCDisksResponseBodyDisksTag> getTag() {
            return this.tag;
        }

        public DescribeRCDisksResponseBodyDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRCDisksResponseBodyDisks setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
