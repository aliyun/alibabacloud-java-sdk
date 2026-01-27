// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCSnapshotsResponseBody extends TeaModel {
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
     * <p>9DAC759A-F4F0-5D02-8335-BC458C0CCB94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of snapshots.</p>
     */
    @NameInMap("Snapshots")
    public java.util.List<DescribeRCSnapshotsResponseBodySnapshots> snapshots;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeRCSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCSnapshotsResponseBody self = new DescribeRCSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCSnapshotsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCSnapshotsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRCSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCSnapshotsResponseBody setSnapshots(java.util.List<DescribeRCSnapshotsResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<DescribeRCSnapshotsResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public DescribeRCSnapshotsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRCSnapshotsResponseBodySnapshotsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeRCSnapshotsResponseBodySnapshotsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCSnapshotsResponseBodySnapshotsTag self = new DescribeRCSnapshotsResponseBodySnapshotsTag();
            return TeaModel.build(map, self);
        }

        public DescribeRCSnapshotsResponseBodySnapshotsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeRCSnapshotsResponseBodySnapshotsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeRCSnapshotsResponseBodySnapshots extends TeaModel {
        /**
         * <p>Indicates whether the snapshot can be shared and used to create or roll back a cloud disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Available")
        public Boolean available;

        /**
         * <p>The snapshot type. Valid values:</p>
         * <ul>
         * <li>Standard: standard snapshot</li>
         * <li>Flash: local snapshot This value will be deprecated. The local snapshot feature is replaced with the instant access feature.</li>
         * <li>archive: archived snapshot</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The creation time. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-18T09:37:14Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The snapshot description.</p>
         * 
         * <strong>example:</strong>
         * <p>zd_test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the snapshot was encrypted. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        /**
         * <p>The progress of the snapshot creation task in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rcds-hc1zg51xobdg4****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The snapshot name.</p>
         * 
         * <strong>example:</strong>
         * <p>s-2ze8klip00xcogcwer76</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <p>The snapshot type. Valid values:</p>
         * <ul>
         * <li>auto or timer: automatically created snapshot</li>
         * <li>user: manually created snapshot</li>
         * <li>all: all snapshot types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("SnapshotType")
        public String snapshotType;

        /**
         * <p>The ID of the original disk. This parameter is retained even after the original disk for which the snapshot was created is released.</p>
         * 
         * <strong>example:</strong>
         * <p>rcd-bp67acfmxazb4ph****</p>
         */
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        /**
         * <p>The storage capacity of the original disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("SourceDiskSize")
        public Long sourceDiskSize;

        /**
         * <p>The type of the original disk. Valid values:</p>
         * <ul>
         * <li>SYSTEM: system disk</li>
         * <li>DATA: data disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>data</p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The type of the source disk.</p>
         * <blockquote>
         * <p> This parameter will be removed in the future. To ensure future compatibility, we recommend that you use other parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>disk</p>
         */
        @NameInMap("SourceStorageType")
        public String sourceStorageType;

        /**
         * <p>The snapshot status. Valid values:</p>
         * <ul>
         * <li>progressing: The snapshot is being created.</li>
         * <li>accomplished: The snapshot is created.</li>
         * <li>failed: The snapshot fails to be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>progressing</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tag")
        public java.util.List<DescribeRCSnapshotsResponseBodySnapshotsTag> tag;

        /**
         * <p>Indicates whether the snapshot is used to create custom images or disks. Valid values:</p>
         * <ul>
         * <li>image: The snapshot is used to create custom images.</li>
         * <li>disk: The snapshot is used to create disks.</li>
         * <li>image_disk: The snapshot is used to create custom images and data disks.</li>
         * <li>none: The snapshot is not used to create custom images or disks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static DescribeRCSnapshotsResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCSnapshotsResponseBodySnapshots self = new DescribeRCSnapshotsResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public DescribeRCSnapshotsResponseBodySnapshots setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setInstantAccess(Boolean instantAccess) {
            this.instantAccess = instantAccess;
            return this;
        }
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setSnapshotType(String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public String getSnapshotType() {
            return this.snapshotType;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setSourceDiskSize(Long sourceDiskSize) {
            this.sourceDiskSize = sourceDiskSize;
            return this;
        }
        public Long getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setSourceStorageType(String sourceStorageType) {
            this.sourceStorageType = sourceStorageType;
            return this;
        }
        public String getSourceStorageType() {
            return this.sourceStorageType;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setTag(java.util.List<DescribeRCSnapshotsResponseBodySnapshotsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeRCSnapshotsResponseBodySnapshotsTag> getTag() {
            return this.tag;
        }

        public DescribeRCSnapshotsResponseBodySnapshots setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

}
