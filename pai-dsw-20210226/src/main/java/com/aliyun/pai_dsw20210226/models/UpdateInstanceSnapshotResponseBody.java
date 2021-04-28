// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class UpdateInstanceSnapshotResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例镜像ID
    @NameInMap("InstanceSnapshotId")
    public String instanceSnapshotId;

    public static UpdateInstanceSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceSnapshotResponseBody self = new UpdateInstanceSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceSnapshotResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceSnapshotResponseBody setInstanceSnapshotId(String instanceSnapshotId) {
        this.instanceSnapshotId = instanceSnapshotId;
        return this;
    }
    public String getInstanceSnapshotId() {
        return this.instanceSnapshotId;
    }

}
