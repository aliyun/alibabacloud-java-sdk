// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetContactBlockListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContactBlockListResponseBody body;

    public static GetContactBlockListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContactBlockListResponse self = new GetContactBlockListResponse();
        return TeaModel.build(map, self);
    }

    public GetContactBlockListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContactBlockListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContactBlockListResponse setBody(GetContactBlockListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContactBlockListResponseBody getBody() {
        return this.body;
    }

}
