// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSessionListResponseBody body;

    public static GetSessionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSessionListResponse self = new GetSessionListResponse();
        return TeaModel.build(map, self);
    }

    public GetSessionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSessionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSessionListResponse setBody(GetSessionListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSessionListResponseBody getBody() {
        return this.body;
    }

}
