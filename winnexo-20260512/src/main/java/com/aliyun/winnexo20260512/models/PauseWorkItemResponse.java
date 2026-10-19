// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class PauseWorkItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PauseWorkItemResponseBody body;

    public static PauseWorkItemResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseWorkItemResponse self = new PauseWorkItemResponse();
        return TeaModel.build(map, self);
    }

    public PauseWorkItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseWorkItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseWorkItemResponse setBody(PauseWorkItemResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseWorkItemResponseBody getBody() {
        return this.body;
    }

}
