// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CalculateDBInstanceWeightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CalculateDBInstanceWeightResponseBody body;

    public static CalculateDBInstanceWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        CalculateDBInstanceWeightResponse self = new CalculateDBInstanceWeightResponse();
        return TeaModel.build(map, self);
    }

    public CalculateDBInstanceWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CalculateDBInstanceWeightResponse setBody(CalculateDBInstanceWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public CalculateDBInstanceWeightResponseBody getBody() {
        return this.body;
    }

}
