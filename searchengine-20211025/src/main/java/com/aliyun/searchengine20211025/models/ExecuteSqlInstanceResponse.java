// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ExecuteSqlInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteSqlInstanceResponseBody body;

    public static ExecuteSqlInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSqlInstanceResponse self = new ExecuteSqlInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteSqlInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteSqlInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteSqlInstanceResponse setBody(ExecuteSqlInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteSqlInstanceResponseBody getBody() {
        return this.body;
    }

}
