// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateFreeExplorationWorkItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFreeExplorationWorkItemResponseBody body;

    public static CreateFreeExplorationWorkItemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFreeExplorationWorkItemResponse self = new CreateFreeExplorationWorkItemResponse();
        return TeaModel.build(map, self);
    }

    public CreateFreeExplorationWorkItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFreeExplorationWorkItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFreeExplorationWorkItemResponse setBody(CreateFreeExplorationWorkItemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFreeExplorationWorkItemResponseBody getBody() {
        return this.body;
    }

}
