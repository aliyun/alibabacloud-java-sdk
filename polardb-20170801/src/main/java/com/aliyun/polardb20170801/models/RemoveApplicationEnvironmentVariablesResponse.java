// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RemoveApplicationEnvironmentVariablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveApplicationEnvironmentVariablesResponseBody body;

    public static RemoveApplicationEnvironmentVariablesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveApplicationEnvironmentVariablesResponse self = new RemoveApplicationEnvironmentVariablesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveApplicationEnvironmentVariablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveApplicationEnvironmentVariablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveApplicationEnvironmentVariablesResponse setBody(RemoveApplicationEnvironmentVariablesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveApplicationEnvironmentVariablesResponseBody getBody() {
        return this.body;
    }

}
