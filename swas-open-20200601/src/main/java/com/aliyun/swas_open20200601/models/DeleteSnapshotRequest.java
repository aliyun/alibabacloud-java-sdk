// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteSnapshotRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotRequest self = new DeleteSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSnapshotRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public DeleteSnapshotRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
