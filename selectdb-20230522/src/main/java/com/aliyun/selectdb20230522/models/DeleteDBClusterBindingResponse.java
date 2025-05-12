// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DeleteDBClusterBindingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBClusterBindingResponseBody body;

    public static DeleteDBClusterBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterBindingResponse self = new DeleteDBClusterBindingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBClusterBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBClusterBindingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBClusterBindingResponse setBody(DeleteDBClusterBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBClusterBindingResponseBody getBody() {
        return this.body;
    }

}
