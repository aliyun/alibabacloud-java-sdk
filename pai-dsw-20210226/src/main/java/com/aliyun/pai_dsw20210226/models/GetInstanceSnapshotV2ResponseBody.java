// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceSnapshotV2ResponseBody extends TeaModel {
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

    public static GetInstanceSnapshotV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSnapshotV2ResponseBody self = new GetInstanceSnapshotV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceSnapshotV2ResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetInstanceSnapshotV2ResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetInstanceSnapshotV2ResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetInstanceSnapshotV2ResponseBody setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GetInstanceSnapshotV2ResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceSnapshotV2ResponseBody setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public GetInstanceSnapshotV2ResponseBody setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public GetInstanceSnapshotV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceSnapshotV2ResponseBody setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public GetInstanceSnapshotV2ResponseBody setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public GetInstanceSnapshotV2ResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
