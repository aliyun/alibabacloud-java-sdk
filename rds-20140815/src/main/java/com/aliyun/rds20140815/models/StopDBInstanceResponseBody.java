// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopDBInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDBInstanceResponseBody self = new StopDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
