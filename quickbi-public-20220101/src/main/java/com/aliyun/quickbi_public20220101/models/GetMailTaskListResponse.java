// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetMailTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMailTaskListResponseBody body;

    public static GetMailTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMailTaskListResponse self = new GetMailTaskListResponse();
        return TeaModel.build(map, self);
    }

    public GetMailTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMailTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMailTaskListResponse setBody(GetMailTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMailTaskListResponseBody getBody() {
        return this.body;
    }

}
