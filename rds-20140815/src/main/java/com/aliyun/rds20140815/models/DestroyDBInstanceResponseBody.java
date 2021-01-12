// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DestroyDBInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DestroyDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DestroyDBInstanceResponseBody self = new DestroyDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DestroyDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
