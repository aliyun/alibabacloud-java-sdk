// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateInstanceSnapshotRequest extends TeaModel {
    // 镜像地址
    @NameInMap("ImageUrl")
    public String imageUrl;

    // 实例快照描述
    @NameInMap("SnapshotDescription")
    public String snapshotDescription;

    // 实例快照名称
    @NameInMap("SnapshotName")
    public String snapshotName;

    public static CreateInstanceSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceSnapshotRequest self = new CreateInstanceSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceSnapshotRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateInstanceSnapshotRequest setSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
        return this;
    }
    public String getSnapshotDescription() {
        return this.snapshotDescription;
    }

    public CreateInstanceSnapshotRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

}
