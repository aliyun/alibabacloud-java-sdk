// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestoreTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestoreTableResponseBody body;

    public static RestoreTableResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreTableResponse self = new RestoreTableResponse();
        return TeaModel.build(map, self);
    }

    public RestoreTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreTableResponse setBody(RestoreTableResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreTableResponseBody getBody() {
        return this.body;
    }

}
