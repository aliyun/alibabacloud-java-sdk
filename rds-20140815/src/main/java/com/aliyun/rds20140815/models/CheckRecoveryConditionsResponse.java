// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckRecoveryConditionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("RecoveryStatus")
    @Validation(required = true)
    public String recoveryStatus;

    public static CheckRecoveryConditionsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRecoveryConditionsResponse self = new CheckRecoveryConditionsResponse();
        return TeaModel.build(map, self);
    }

    public CheckRecoveryConditionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckRecoveryConditionsResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CheckRecoveryConditionsResponse setRecoveryStatus(String recoveryStatus) {
        this.recoveryStatus = recoveryStatus;
        return this;
    }
    public String getRecoveryStatus() {
        return this.recoveryStatus;
    }

}
