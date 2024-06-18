// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpdateUserBackupFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>b-g14d0m772f7b********</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A236067-4727-4B42-92CF-734E417ED69A</p>
     */
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
