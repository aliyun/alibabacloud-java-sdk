// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFunctionInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFunctionInstanceResponseBody body;

    public static UpdateFunctionInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionInstanceResponse self = new UpdateFunctionInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFunctionInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFunctionInstanceResponse setBody(UpdateFunctionInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFunctionInstanceResponseBody getBody() {
        return this.body;
    }

}
