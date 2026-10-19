// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateWorkItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkItemResponseBody body;

    public static CreateWorkItemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkItemResponse self = new CreateWorkItemResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkItemResponse setBody(CreateWorkItemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkItemResponseBody getBody() {
        return this.body;
    }

}
