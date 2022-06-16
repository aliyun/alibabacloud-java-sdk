// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteNodeLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNodeLabelResponseBody body;

    public static DeleteNodeLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeLabelResponse self = new DeleteNodeLabelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNodeLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNodeLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNodeLabelResponse setBody(DeleteNodeLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNodeLabelResponseBody getBody() {
        return this.body;
    }

}
