// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateInstanceSnapshotResponseBody extends TeaModel {
    // 实例Id
    @NameInMap("InstanceId")
    public String instanceId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 实例快照Id
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static CreateInstanceSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceSnapshotResponseBody self = new CreateInstanceSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceSnapshotResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateInstanceSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceSnapshotResponseBody setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
