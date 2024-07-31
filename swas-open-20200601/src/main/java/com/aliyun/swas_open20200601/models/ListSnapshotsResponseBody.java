// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the snapshots.</p>
     */
    @NameInMap("Snapshots")
    public java.util.List<ListSnapshotsResponseBodySnapshots> snapshots;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsResponseBody self = new ListSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSnapshotsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSnapshotsResponseBody setSnapshots(java.util.List<ListSnapshotsResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<ListSnapshotsResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public ListSnapshotsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSnapshotsResponseBodySnapshotsTags extends TeaModel {
        /**
         * <p>The tag key of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListSnapshotsResponseBodySnapshotsTags build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotsResponseBodySnapshotsTags self = new ListSnapshotsResponseBodySnapshotsTags();
            return TeaModel.build(map, self);
        }

        public ListSnapshotsResponseBodySnapshotsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSnapshotsResponseBodySnapshotsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSnapshotsResponseBodySnapshots extends TeaModel {
        /**
         * <p>The time when the snapshot was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-09T07:12:49Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the simple application server.</p>
         * <p>Note: This parameter has a value returned for only system disk snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>2ad1ae67295445f598017499dc****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The progress of snapshot creation.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
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

        /**
         * <p>The remarks of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>test-Remark</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the resource group to which the snapshot belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2bti7cf7****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The time when the last disk rollback was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-09T07:12:49Z</p>
         */
        @NameInMap("RollbackTime")
        public String rollbackTime;

        /**
         * <p>The snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp16oazlsold4dks****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The name of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>test-SnapshotName</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <p>The ID of the source disk. This parameter has a value even after the source disk is released.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp14wq0149cpp2xy****</p>
         */
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        /**
         * <p>The type of the source disk. Valid values:</p>
         * <ul>
         * <li>system: system disk.</li>
         * <li>data: data disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The status of the snapshot. Valid values:</p>
         * <ul>
         * <li>Progressing: The snapshot is being created.</li>
         * <li>Accomplished: The snapshot is created.</li>
         * <li>Failed: The snapshot failed to be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Accomplished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the snapshot.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListSnapshotsResponseBodySnapshotsTags> tags;

        public static ListSnapshotsResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotsResponseBodySnapshots self = new ListSnapshotsResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public ListSnapshotsResponseBodySnapshots setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListSnapshotsResponseBodySnapshots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSnapshotsResponseBodySnapshots setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListSnapshotsResponseBodySnapshots setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListSnapshotsResponseBodySnapshots setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListSnapshotsResponseBodySnapshots setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListSnapshotsResponseBodySnapshots setRollbackTime(String rollbackTime) {
            this.rollbackTime = rollbackTime;
            return this;
        }
        public String getRollbackTime() {
            return this.rollbackTime;
        }

        public ListSnapshotsResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public ListSnapshotsResponseBodySnapshots setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public ListSnapshotsResponseBodySnapshots setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public ListSnapshotsResponseBodySnapshots setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public ListSnapshotsResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSnapshotsResponseBodySnapshots setTags(java.util.List<ListSnapshotsResponseBodySnapshotsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListSnapshotsResponseBodySnapshotsTags> getTags() {
            return this.tags;
        }

    }

}
