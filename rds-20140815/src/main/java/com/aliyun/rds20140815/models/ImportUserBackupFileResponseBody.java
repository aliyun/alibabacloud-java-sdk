// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportUserBackupFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the full backup file.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the full backup file is successfully imported into the instance. If the full backup file is successfully imported, **true** is returned. Otherwise, an error message is returned.</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static ImportUserBackupFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportUserBackupFileResponseBody self = new ImportUserBackupFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportUserBackupFileResponseBody setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public ImportUserBackupFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportUserBackupFileResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
