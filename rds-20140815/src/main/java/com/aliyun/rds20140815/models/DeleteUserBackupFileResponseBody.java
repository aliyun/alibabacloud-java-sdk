// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteUserBackupFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the deleted full backup file.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserBackupFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserBackupFileResponseBody self = new DeleteUserBackupFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserBackupFileResponseBody setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public DeleteUserBackupFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
