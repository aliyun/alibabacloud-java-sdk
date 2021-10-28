// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeBlockVolumeSnapshotsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Snapshots")
    public DescribeBlockVolumeSnapshotsResponseBodySnapshots snapshots;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBlockVolumeSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockVolumeSnapshotsResponseBody self = new DescribeBlockVolumeSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockVolumeSnapshotsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeBlockVolumeSnapshotsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBlockVolumeSnapshotsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBlockVolumeSnapshotsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBlockVolumeSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlockVolumeSnapshotsResponseBody setSnapshots(DescribeBlockVolumeSnapshotsResponseBodySnapshots snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public DescribeBlockVolumeSnapshotsResponseBodySnapshots getSnapshots() {
        return this.snapshots;
    }

    public DescribeBlockVolumeSnapshotsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBlockVolumeSnapshotsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBlockVolumeSnapshotsResponseBodySnapshotsSnapshot extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("SnapshotName")
        public String snapshotName;

        public static DescribeBlockVolumeSnapshotsResponseBodySnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockVolumeSnapshotsResponseBodySnapshotsSnapshot self = new DescribeBlockVolumeSnapshotsResponseBodySnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeBlockVolumeSnapshotsResponseBodySnapshotsSnapshot setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeBlockVolumeSnapshotsResponseBodySnapshotsSnapshot setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeBlockVolumeSnapshotsResponseBodySnapshotsSnapshot setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

    }

    public static class DescribeBlockVolumeSnapshotsResponseBodySnapshots extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<DescribeBlockVolumeSnapshotsResponseBodySnapshotsSnapshot> snapshot;

        public static DescribeBlockVolumeSnapshotsResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockVolumeSnapshotsResponseBodySnapshots self = new DescribeBlockVolumeSnapshotsResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public DescribeBlockVolumeSnapshotsResponseBodySnapshots setSnapshot(java.util.List<DescribeBlockVolumeSnapshotsResponseBodySnapshotsSnapshot> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<DescribeBlockVolumeSnapshotsResponseBodySnapshotsSnapshot> getSnapshot() {
            return this.snapshot;
        }

    }

}
