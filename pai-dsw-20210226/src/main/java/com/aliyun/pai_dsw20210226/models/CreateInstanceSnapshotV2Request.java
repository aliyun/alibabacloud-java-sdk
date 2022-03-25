// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceSnapshotV2Request extends TeaModel {
    // 镜像地址
    @NameInMap("ImageUrl")
    public String imageUrl;

    // 实例快照描述
    @NameInMap("SnapshotDescription")
    public String snapshotDescription;

    // 实例快照名称
    @NameInMap("SnapshotName")
    public String snapshotName;

    public static CreateInstanceSnapshotV2Request build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceSnapshotV2Request self = new CreateInstanceSnapshotV2Request();
        return TeaModel.build(map, self);
    }

    public CreateInstanceSnapshotV2Request setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateInstanceSnapshotV2Request setSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
        return this;
    }
    public String getSnapshotDescription() {
        return this.snapshotDescription;
    }

    public CreateInstanceSnapshotV2Request setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

}
