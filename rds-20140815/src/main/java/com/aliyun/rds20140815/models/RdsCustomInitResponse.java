// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RdsCustomInitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RdsCustomInitResponseBody body;

    public static RdsCustomInitResponse build(java.util.Map<String, ?> map) throws Exception {
        RdsCustomInitResponse self = new RdsCustomInitResponse();
        return TeaModel.build(map, self);
    }

    public RdsCustomInitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RdsCustomInitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RdsCustomInitResponse setBody(RdsCustomInitResponseBody body) {
        this.body = body;
        return this;
    }
    public RdsCustomInitResponseBody getBody() {
        return this.body;
    }

}
