// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkItemResponseBody body;

    public static GetWorkItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemResponse self = new GetWorkItemResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkItemResponse setBody(GetWorkItemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkItemResponseBody getBody() {
        return this.body;
    }

}
