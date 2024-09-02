// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFunctionDefaultInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFunctionDefaultInstanceResponseBody body;

    public static UpdateFunctionDefaultInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionDefaultInstanceResponse self = new UpdateFunctionDefaultInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionDefaultInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFunctionDefaultInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFunctionDefaultInstanceResponse setBody(UpdateFunctionDefaultInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFunctionDefaultInstanceResponseBody getBody() {
        return this.body;
    }

}
