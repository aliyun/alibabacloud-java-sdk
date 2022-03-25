// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstanceSnapshotV2ResponseBody extends TeaModel {
    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 本分页中请求的实例镜像列表
    @NameInMap("Snapshots")
    public java.util.List<ListInstanceSnapshotV2ResponseBodySnapshots> snapshots;

    // 实例总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstanceSnapshotV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceSnapshotV2ResponseBody self = new ListInstanceSnapshotV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceSnapshotV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceSnapshotV2ResponseBody setSnapshots(java.util.List<ListInstanceSnapshotV2ResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<ListInstanceSnapshotV2ResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public ListInstanceSnapshotV2ResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceSnapshotV2ResponseBodySnapshots extends TeaModel {
        // 实例快照创建时间
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        // 实例快照修改时间
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        // 实例快照的镜像Id
        @NameInMap("ImageId")
        public String imageId;

        // 实例快照的镜像地址
        @NameInMap("ImageUrl")
        public String imageUrl;

        // 实例Id
        @NameInMap("InstanceId")
        public String instanceId;

        // 实例快照错误代码
        @NameInMap("ReasonCode")
        public String reasonCode;

        // 实例快照错误消息
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        // 实例快照Id
        @NameInMap("SnapshotId")
        public String snapshotId;

        // 实例快照名称
        @NameInMap("SnapshotName")
        public String snapshotName;

        // 实例快照状态
        @NameInMap("Status")
        public String status;

        public static ListInstanceSnapshotV2ResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceSnapshotV2ResponseBodySnapshots self = new ListInstanceSnapshotV2ResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public ListInstanceSnapshotV2ResponseBodySnapshots setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstanceSnapshotV2ResponseBodySnapshots setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstanceSnapshotV2ResponseBodySnapshots setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListInstanceSnapshotV2ResponseBodySnapshots setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListInstanceSnapshotV2ResponseBodySnapshots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceSnapshotV2ResponseBodySnapshots setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public ListInstanceSnapshotV2ResponseBodySnapshots setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public ListInstanceSnapshotV2ResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public ListInstanceSnapshotV2ResponseBodySnapshots setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public ListInstanceSnapshotV2ResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
