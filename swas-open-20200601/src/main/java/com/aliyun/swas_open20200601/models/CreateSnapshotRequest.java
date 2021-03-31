// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateSnapshotRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("SnapshotName")
    public String snapshotName;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotRequest self = new CreateSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSnapshotRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public CreateSnapshotRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public CreateSnapshotRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
