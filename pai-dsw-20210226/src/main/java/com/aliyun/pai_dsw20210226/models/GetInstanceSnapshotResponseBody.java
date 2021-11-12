// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceSnapshotResponseBody extends TeaModel {
    // 实例快照保存时间（GMT）
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 实例快照修改时间（GMT）
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例快照描述
    @NameInMap("InstanceSnapshotDescription")
    public String instanceSnapshotDescription;

    // 实例快照ID
    @NameInMap("InstanceSnapshotId")
    public String instanceSnapshotId;

    // 实例快照名称
    @NameInMap("InstanceSnapshotName")
    public String instanceSnapshotName;

    // 实例快照存储地址
    @NameInMap("InstanceSnapshotRepoUrl")
    public String instanceSnapshotRepoUrl;

    // 实例快照状态
    @NameInMap("InstanceSnapshotStatus")
    public String instanceSnapshotStatus;

    // 实例快照标签
    @NameInMap("InstanceSnapshotTag")
    public String instanceSnapshotTag;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

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

    public GetInstanceSnapshotResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceSnapshotResponseBody setInstanceSnapshotDescription(String instanceSnapshotDescription) {
        this.instanceSnapshotDescription = instanceSnapshotDescription;
        return this;
    }
    public String getInstanceSnapshotDescription() {
        return this.instanceSnapshotDescription;
    }

    public GetInstanceSnapshotResponseBody setInstanceSnapshotId(String instanceSnapshotId) {
        this.instanceSnapshotId = instanceSnapshotId;
        return this;
    }
    public String getInstanceSnapshotId() {
        return this.instanceSnapshotId;
    }

    public GetInstanceSnapshotResponseBody setInstanceSnapshotName(String instanceSnapshotName) {
        this.instanceSnapshotName = instanceSnapshotName;
        return this;
    }
    public String getInstanceSnapshotName() {
        return this.instanceSnapshotName;
    }

    public GetInstanceSnapshotResponseBody setInstanceSnapshotRepoUrl(String instanceSnapshotRepoUrl) {
        this.instanceSnapshotRepoUrl = instanceSnapshotRepoUrl;
        return this;
    }
    public String getInstanceSnapshotRepoUrl() {
        return this.instanceSnapshotRepoUrl;
    }

    public GetInstanceSnapshotResponseBody setInstanceSnapshotStatus(String instanceSnapshotStatus) {
        this.instanceSnapshotStatus = instanceSnapshotStatus;
        return this;
    }
    public String getInstanceSnapshotStatus() {
        return this.instanceSnapshotStatus;
    }

    public GetInstanceSnapshotResponseBody setInstanceSnapshotTag(String instanceSnapshotTag) {
        this.instanceSnapshotTag = instanceSnapshotTag;
        return this;
    }
    public String getInstanceSnapshotTag() {
        return this.instanceSnapshotTag;
    }

    public GetInstanceSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
