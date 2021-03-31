// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListSnapshotsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Snapshots")
    public java.util.List<ListSnapshotsResponseBodySnapshots> snapshots;

    public static ListSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsResponseBody self = new ListSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSnapshotsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSnapshotsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSnapshotsResponseBody setSnapshots(java.util.List<ListSnapshotsResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<ListSnapshotsResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public static class ListSnapshotsResponseBodySnapshots extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        @NameInMap("SnapshotName")
        public String snapshotName;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        @NameInMap("RegionId")
        public String regionId;

        public static ListSnapshotsResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotsResponseBodySnapshots self = new ListSnapshotsResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public ListSnapshotsResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSnapshotsResponseBodySnapshots setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListSnapshotsResponseBodySnapshots setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public ListSnapshotsResponseBodySnapshots setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public ListSnapshotsResponseBodySnapshots setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListSnapshotsResponseBodySnapshots setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListSnapshotsResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public ListSnapshotsResponseBodySnapshots setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public ListSnapshotsResponseBodySnapshots setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
