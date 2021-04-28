// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class UpdateInstanceSnapshotRequest extends TeaModel {
    // 实例快照名称
    @NameInMap("InstanceSnapshotName")
    public String instanceSnapshotName;

    public static UpdateInstanceSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceSnapshotRequest self = new UpdateInstanceSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceSnapshotRequest setInstanceSnapshotName(String instanceSnapshotName) {
        this.instanceSnapshotName = instanceSnapshotName;
        return this;
    }
    public String getInstanceSnapshotName() {
        return this.instanceSnapshotName;
    }

}
