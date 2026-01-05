// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ClonePolarFsBasicSnapshotRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>pfs-test*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("SourcePath")
    public String sourcePath;

    /**
     * <strong>example:</strong>
     * <p>/testclone</p>
     */
    @NameInMap("TargetPath")
    public String targetPath;

    public static ClonePolarFsBasicSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        ClonePolarFsBasicSnapshotRequest self = new ClonePolarFsBasicSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public ClonePolarFsBasicSnapshotRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ClonePolarFsBasicSnapshotRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public ClonePolarFsBasicSnapshotRequest setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }
    public String getSourcePath() {
        return this.sourcePath;
    }

    public ClonePolarFsBasicSnapshotRequest setTargetPath(String targetPath) {
        this.targetPath = targetPath;
        return this;
    }
    public String getTargetPath() {
        return this.targetPath;
    }

}
