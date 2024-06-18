// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateTempDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>248DE93F-8647-4B9D-8287-4A4A0FE56AD5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The temporary instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sub138****_rm-******</p>
     */
    @NameInMap("TempDBInstanceId")
    public String tempDBInstanceId;

    public static CreateTempDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTempDBInstanceResponseBody self = new CreateTempDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTempDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTempDBInstanceResponseBody setTempDBInstanceId(String tempDBInstanceId) {
        this.tempDBInstanceId = tempDBInstanceId;
        return this;
    }
    public String getTempDBInstanceId() {
        return this.tempDBInstanceId;
    }

}
