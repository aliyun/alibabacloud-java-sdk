// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateTempDBInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TempDBInstanceId")
    @Validation(required = true)
    public String tempDBInstanceId;

    public static CreateTempDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTempDBInstanceResponse self = new CreateTempDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateTempDBInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTempDBInstanceResponse setTempDBInstanceId(String tempDBInstanceId) {
        this.tempDBInstanceId = tempDBInstanceId;
        return this;
    }
    public String getTempDBInstanceId() {
        return this.tempDBInstanceId;
    }

}
