// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateBackupResponseBody extends TeaModel {
    /**
     * <p>The ID of the backup task.</p>
     * 
     * <strong>example:</strong>
     * <p>5073731</p>
     */
    @NameInMap("BackupJobId")
    public String backupJobId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2C125605-266F-41CA-8AC5-3A643D4F42C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupResponseBody self = new CreateBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupResponseBody setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
        return this;
    }
    public String getBackupJobId() {
        return this.backupJobId;
    }

    public CreateBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
