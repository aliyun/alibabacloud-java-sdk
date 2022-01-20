// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceSnapshotResponseBody extends TeaModel {
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

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 实例快照Id
    @NameInMap("SnapshotId")
    public String snapshotId;

    // 实例快照名称
    @NameInMap("SnapshotName")
    public String snapshotName;

    // 实例快照状态
    @NameInMap("Status")
    public String status;

    public static GetInstanceSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSnapshotResponseBody self = new GetInstanceSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceSnapshotResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetInstanceSnapshotResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetInstanceSnapshotResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetInstanceSnapshotResponseBody setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GetInstanceSnapshotResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceSnapshotResponseBody setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public GetInstanceSnapshotResponseBody setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public GetInstanceSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceSnapshotResponseBody setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public GetInstanceSnapshotResponseBody setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public GetInstanceSnapshotResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
