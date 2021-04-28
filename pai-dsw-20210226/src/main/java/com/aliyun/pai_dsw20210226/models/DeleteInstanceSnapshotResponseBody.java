// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class DeleteInstanceSnapshotResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例快照ID
    @NameInMap("InstanceSnapshotId")
    public String instanceSnapshotId;

    public static DeleteInstanceSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceSnapshotResponseBody self = new DeleteInstanceSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteInstanceSnapshotResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteInstanceSnapshotResponseBody setInstanceSnapshotId(String instanceSnapshotId) {
        this.instanceSnapshotId = instanceSnapshotId;
        return this;
    }
    public String getInstanceSnapshotId() {
        return this.instanceSnapshotId;
    }

}
