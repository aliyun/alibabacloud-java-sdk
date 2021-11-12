// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceSnapshotRequest extends TeaModel {
    // 实例快照描述
    @NameInMap("InstanceSnapshotDescription")
    public String instanceSnapshotDescription;

    // 实例快照名称
    @NameInMap("InstanceSnapshotName")
    public String instanceSnapshotName;

    // 实例快照存储地址（可选）
    @NameInMap("InstanceSnapshotRepoUrl")
    public String instanceSnapshotRepoUrl;

    public static CreateInstanceSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceSnapshotRequest self = new CreateInstanceSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceSnapshotRequest setInstanceSnapshotDescription(String instanceSnapshotDescription) {
        this.instanceSnapshotDescription = instanceSnapshotDescription;
        return this;
    }
    public String getInstanceSnapshotDescription() {
        return this.instanceSnapshotDescription;
    }

    public CreateInstanceSnapshotRequest setInstanceSnapshotName(String instanceSnapshotName) {
        this.instanceSnapshotName = instanceSnapshotName;
        return this;
    }
    public String getInstanceSnapshotName() {
        return this.instanceSnapshotName;
    }

    public CreateInstanceSnapshotRequest setInstanceSnapshotRepoUrl(String instanceSnapshotRepoUrl) {
        this.instanceSnapshotRepoUrl = instanceSnapshotRepoUrl;
        return this;
    }
    public String getInstanceSnapshotRepoUrl() {
        return this.instanceSnapshotRepoUrl;
    }

}
