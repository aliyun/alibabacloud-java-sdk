// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteInstanceSnapshotResponseBody extends TeaModel {
    // 实例Id
    @NameInMap("InstanceId")
    public String instanceId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 实例快照Id
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static DeleteInstanceSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceSnapshotResponseBody self = new DeleteInstanceSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceSnapshotResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteInstanceSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteInstanceSnapshotResponseBody setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
