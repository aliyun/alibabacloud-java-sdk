// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The region ID of the simple application server.</p>
     */
    @NameInMap("Snapshots")
    public java.util.List<ListSnapshotsResponseBodySnapshots> snapshots;

    /**
     * <p>The total number of entries returned.</p>
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

    public static class ListSnapshotsResponseBodySnapshots extends TeaModel {
        /**
         * <p>The time when the snapshot was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The progress of snapshot creation.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The remarks of the snapshot.</p>
         */
        @NameInMap("Remark")
        public String remark;

        @NameInMap("RollbackTime")
        public String rollbackTime;

        /**
         * <p>The ID of the snapshot.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The name of the snapshot.</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <p>The ID of the source disk. This parameter has a value even after the source disk is released.</p>
         */
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        /**
         * <p>The type of the source disk. Valid values:</p>
         * <br>
         * <p>*   System: system disk</p>
         * <p>*   data: data disk</p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The status of the snapshot. Valid values:</p>
         * <br>
         * <p>*   Progressing: The snapshot is being created.</p>
         * <p>*   Accomplished: The snapshot is created.</p>
         * <p>*   Failed: The snapshot failed to be created.</p>
         */
        @NameInMap("Status")
        public String status;

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

    }

}
