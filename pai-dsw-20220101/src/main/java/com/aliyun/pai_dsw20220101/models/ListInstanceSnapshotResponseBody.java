// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListInstanceSnapshotResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 说明
    @NameInMap("Message")
    public String message;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 本分页中请求的实例镜像列表
    @NameInMap("Snapshots")
    public java.util.List<ListInstanceSnapshotResponseBodySnapshots> snapshots;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    // 实例总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstanceSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceSnapshotResponseBody self = new ListInstanceSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceSnapshotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceSnapshotResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstanceSnapshotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceSnapshotResponseBody setSnapshots(java.util.List<ListInstanceSnapshotResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<ListInstanceSnapshotResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public ListInstanceSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListInstanceSnapshotResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceSnapshotResponseBodySnapshots extends TeaModel {
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

        public static ListInstanceSnapshotResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceSnapshotResponseBodySnapshots self = new ListInstanceSnapshotResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public ListInstanceSnapshotResponseBodySnapshots setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstanceSnapshotResponseBodySnapshots setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstanceSnapshotResponseBodySnapshots setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListInstanceSnapshotResponseBodySnapshots setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListInstanceSnapshotResponseBodySnapshots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceSnapshotResponseBodySnapshots setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public ListInstanceSnapshotResponseBodySnapshots setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public ListInstanceSnapshotResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public ListInstanceSnapshotResponseBodySnapshots setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public ListInstanceSnapshotResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
