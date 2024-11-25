// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCSnapshotRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcefully delete the snapshot that is used to create cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: forcefully deletes the snapshot After the snapshot is forcefully deleted, the cloud disks created from the snapshot cannot be re-initialized.</li>
     * <li><strong>false</strong>(default): does not forcefully delete the snapshot.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The snapshot ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rcds-7mbefjzkqccvdev****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static DeleteRCSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCSnapshotRequest self = new DeleteRCSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRCSnapshotRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteRCSnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRCSnapshotRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
