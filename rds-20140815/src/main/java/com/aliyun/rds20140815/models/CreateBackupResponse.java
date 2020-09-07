// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateBackupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BackupJobId")
    @Validation(required = true)
    public String backupJobId;

    public static CreateBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupResponse self = new CreateBackupResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBackupResponse setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
        return this;
    }
    public String getBackupJobId() {
        return this.backupJobId;
    }

}
