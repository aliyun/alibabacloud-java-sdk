// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReceiveDBInstanceResponseBody extends TeaModel {
    @NameInMap("GuardDBInstanceId")
    public String guardDBInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static ReceiveDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReceiveDBInstanceResponseBody self = new ReceiveDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReceiveDBInstanceResponseBody setGuardDBInstanceId(String guardDBInstanceId) {
        this.guardDBInstanceId = guardDBInstanceId;
        return this;
    }
    public String getGuardDBInstanceId() {
        return this.guardDBInstanceId;
    }

    public ReceiveDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
