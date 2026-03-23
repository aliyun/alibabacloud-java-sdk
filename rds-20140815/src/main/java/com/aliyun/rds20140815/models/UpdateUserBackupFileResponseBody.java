// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpdateUserBackupFileResponseBody extends TeaModel {
    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserBackupFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserBackupFileResponseBody self = new UpdateUserBackupFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserBackupFileResponseBody setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public UpdateUserBackupFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
