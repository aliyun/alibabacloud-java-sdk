// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateBackupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackupJobID")
    public String backupJobID;

    public static CreateBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupResponseBody self = new CreateBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBackupResponseBody setBackupJobID(String backupJobID) {
        this.backupJobID = backupJobID;
        return this;
    }
    public String getBackupJobID() {
        return this.backupJobID;
    }

}
