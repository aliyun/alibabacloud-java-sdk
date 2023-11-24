// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFunctionResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFunctionResourceResponseBody body;

    public static UpdateFunctionResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionResourceResponse self = new UpdateFunctionResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFunctionResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFunctionResourceResponse setBody(UpdateFunctionResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFunctionResourceResponseBody getBody() {
        return this.body;
    }

}
