// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class InsertInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InsertInstanceResponseBody body;

    public static InsertInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertInstanceResponse self = new InsertInstanceResponse();
        return TeaModel.build(map, self);
    }

    public InsertInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertInstanceResponse setBody(InsertInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertInstanceResponseBody getBody() {
        return this.body;
    }

}
