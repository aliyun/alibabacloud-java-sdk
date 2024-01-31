// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class TransformDBInstancePayTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransformDBInstancePayTypeResponseBody body;

    public static TransformDBInstancePayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        TransformDBInstancePayTypeResponse self = new TransformDBInstancePayTypeResponse();
        return TeaModel.build(map, self);
    }

    public TransformDBInstancePayTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransformDBInstancePayTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransformDBInstancePayTypeResponse setBody(TransformDBInstancePayTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformDBInstancePayTypeResponseBody getBody() {
        return this.body;
    }

}
