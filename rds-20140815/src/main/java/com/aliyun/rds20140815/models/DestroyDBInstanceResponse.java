// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DestroyDBInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DestroyDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DestroyDBInstanceResponse self = new DestroyDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DestroyDBInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
