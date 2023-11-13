// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetSavedQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSavedQueryResponseBody body;

    public static GetSavedQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSavedQueryResponse self = new GetSavedQueryResponse();
        return TeaModel.build(map, self);
    }

    public GetSavedQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSavedQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSavedQueryResponse setBody(GetSavedQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSavedQueryResponseBody getBody() {
        return this.body;
    }

}
