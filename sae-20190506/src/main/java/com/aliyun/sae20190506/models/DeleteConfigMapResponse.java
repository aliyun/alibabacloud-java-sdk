// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteConfigMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConfigMapResponseBody body;

    public static DeleteConfigMapResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigMapResponse self = new DeleteConfigMapResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConfigMapResponse setBody(DeleteConfigMapResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigMapResponseBody getBody() {
        return this.body;
    }

}
