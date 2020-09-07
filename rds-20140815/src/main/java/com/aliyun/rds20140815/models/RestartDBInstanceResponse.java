// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestartDBInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RestartDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDBInstanceResponse self = new RestartDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestartDBInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
