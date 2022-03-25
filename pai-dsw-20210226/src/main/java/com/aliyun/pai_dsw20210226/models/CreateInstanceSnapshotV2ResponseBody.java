// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceSnapshotV2ResponseBody extends TeaModel {
    // 实例Id
    @NameInMap("InstanceId")
    public String instanceId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 实例快照Id
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static CreateInstanceSnapshotV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceSnapshotV2ResponseBody self = new CreateInstanceSnapshotV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceSnapshotV2ResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateInstanceSnapshotV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceSnapshotV2ResponseBody setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
