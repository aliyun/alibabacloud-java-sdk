// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTodoDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTodoDetailResponseBody body;

    public static GetTodoDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTodoDetailResponse self = new GetTodoDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetTodoDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTodoDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTodoDetailResponse setBody(GetTodoDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTodoDetailResponseBody getBody() {
        return this.body;
    }

}
