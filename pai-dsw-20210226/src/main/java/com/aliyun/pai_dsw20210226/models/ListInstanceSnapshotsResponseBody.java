// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstanceSnapshotsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 镜像快照列表
    @NameInMap("InstanceSnapshots")
    public java.util.List<InstanceSnapshot> instanceSnapshots;

    public static ListInstanceSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceSnapshotsResponseBody self = new ListInstanceSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceSnapshotsResponseBody setInstanceSnapshots(java.util.List<InstanceSnapshot> instanceSnapshots) {
        this.instanceSnapshots = instanceSnapshots;
        return this;
    }
    public java.util.List<InstanceSnapshot> getInstanceSnapshots() {
        return this.instanceSnapshots;
    }

}
