// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateDBInstanceSSLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDBInstanceSSLResponseBody body;

    public static UpdateDBInstanceSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDBInstanceSSLResponse self = new UpdateDBInstanceSSLResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDBInstanceSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDBInstanceSSLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDBInstanceSSLResponse setBody(UpdateDBInstanceSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDBInstanceSSLResponseBody getBody() {
        return this.body;
    }

}
