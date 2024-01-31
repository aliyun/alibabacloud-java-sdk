// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CalculateDBInstanceWeightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CalculateDBInstanceWeightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CalculateDBInstanceWeightResponse setBody(CalculateDBInstanceWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public CalculateDBInstanceWeightResponseBody getBody() {
        return this.body;
    }

}
