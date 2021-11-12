// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceSnapshotResponseBody extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例快照ID
    @NameInMap("InstanceSnapshotId")
    public String instanceSnapshotId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

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

    public CreateInstanceSnapshotResponseBody setInstanceSnapshotId(String instanceSnapshotId) {
        this.instanceSnapshotId = instanceSnapshotId;
        return this;
    }
    public String getInstanceSnapshotId() {
        return this.instanceSnapshotId;
    }

    public CreateInstanceSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
