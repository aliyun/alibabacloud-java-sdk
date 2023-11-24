// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteFunctionResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFunctionResourceResponseBody body;

    public static DeleteFunctionResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionResourceResponse self = new DeleteFunctionResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFunctionResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFunctionResourceResponse setBody(DeleteFunctionResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFunctionResourceResponseBody getBody() {
        return this.body;
    }

}
