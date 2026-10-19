// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteWorkItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkItemResponseBody body;

    public static DeleteWorkItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkItemResponse self = new DeleteWorkItemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkItemResponse setBody(DeleteWorkItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkItemResponseBody getBody() {
        return this.body;
    }

}
