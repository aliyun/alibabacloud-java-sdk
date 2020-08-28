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

}
