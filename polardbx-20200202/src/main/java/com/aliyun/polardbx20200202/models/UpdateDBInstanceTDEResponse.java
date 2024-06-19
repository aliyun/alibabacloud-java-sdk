// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateDBInstanceTDEResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDBInstanceTDEResponseBody body;

    public static UpdateDBInstanceTDEResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDBInstanceTDEResponse self = new UpdateDBInstanceTDEResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDBInstanceTDEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDBInstanceTDEResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDBInstanceTDEResponse setBody(UpdateDBInstanceTDEResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDBInstanceTDEResponseBody getBody() {
        return this.body;
    }

}
