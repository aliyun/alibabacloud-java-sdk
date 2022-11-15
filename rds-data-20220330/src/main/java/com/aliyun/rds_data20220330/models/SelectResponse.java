// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class SelectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SelectResponseBody body;

    public static SelectResponse build(java.util.Map<String, ?> map) throws Exception {
        SelectResponse self = new SelectResponse();
        return TeaModel.build(map, self);
    }

    public SelectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SelectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SelectResponse setBody(SelectResponseBody body) {
        this.body = body;
        return this;
    }
    public SelectResponseBody getBody() {
        return this.body;
    }

}
