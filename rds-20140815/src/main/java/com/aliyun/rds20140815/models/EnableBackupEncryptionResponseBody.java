// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class EnableBackupEncryptionResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static EnableBackupEncryptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableBackupEncryptionResponseBody self = new EnableBackupEncryptionResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableBackupEncryptionResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public EnableBackupEncryptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
