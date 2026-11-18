// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateBackupResponseBody extends TeaModel {
    /**
     * <p>The backup job ID.<br>For cluster instances created before December 5, 2023, the return value consists of the job IDs of all child database nodes. For example, for a cluster instance with two shards, the return value is similar to &quot;10000,10001&quot;.<br>For cluster instances created on or after December 5, 2023, the jobs of all database nodes in a cluster are described by a single job ID. You only need to focus on this job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;1022,2480&quot;</p>
     */
    @NameInMap("BackupJobID")
    public String backupJobID;

    /**
     * <p>The request ID.</p>
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
