// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateBackupResponseBody extends TeaModel {
    /**
     * <p>The ID of the backup task.\
     * For cluster instances created before December 5, 2023, the return value is a comma-separated list composed of the job ID of each node within an instance. For example, if you have a cluster instance with two shards, the return value of BackupJobID is &quot;10000,10001&quot;.\
     * For cluster instance created after December 5, 2023, all jobs for nodes in an instance are represented by a single job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1162****</p>
     */
    @NameInMap("BackupJobID")
    public String backupJobID;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2FF6158E-3394-4A90-B634-79C49184****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupResponseBody self = new CreateBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupResponseBody setBackupJobID(String backupJobID) {
        this.backupJobID = backupJobID;
        return this;
    }
    public String getBackupJobID() {
        return this.backupJobID;
    }

    public CreateBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
