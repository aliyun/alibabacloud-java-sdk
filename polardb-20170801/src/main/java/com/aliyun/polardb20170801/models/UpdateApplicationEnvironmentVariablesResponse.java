// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationEnvironmentVariablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationEnvironmentVariablesResponseBody body;

    public static UpdateApplicationEnvironmentVariablesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationEnvironmentVariablesResponse self = new UpdateApplicationEnvironmentVariablesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationEnvironmentVariablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationEnvironmentVariablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationEnvironmentVariablesResponse setBody(UpdateApplicationEnvironmentVariablesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationEnvironmentVariablesResponseBody getBody() {
        return this.body;
    }

}
