// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ClonePolarFsBasicSnapshotResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-bp150t3****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>pfs-2ze0i7*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static ClonePolarFsBasicSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClonePolarFsBasicSnapshotResponseBody self = new ClonePolarFsBasicSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public ClonePolarFsBasicSnapshotResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ClonePolarFsBasicSnapshotResponseBody setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public ClonePolarFsBasicSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClonePolarFsBasicSnapshotResponseBody setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }
    public String getSourcePath() {
        return this.sourcePath;
    }

    public ClonePolarFsBasicSnapshotResponseBody setTargetPath(String targetPath) {
        this.targetPath = targetPath;
        return this;
    }
    public String getTargetPath() {
        return this.targetPath;
    }

}
