// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportUserBackupFileResponseBody extends TeaModel {
    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("RequestId")
    public String requestId;

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
