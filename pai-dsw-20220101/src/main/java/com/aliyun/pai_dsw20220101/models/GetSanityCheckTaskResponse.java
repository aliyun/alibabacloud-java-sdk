// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetSanityCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSanityCheckTaskResponseBody body;

    public static GetSanityCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSanityCheckTaskResponse self = new GetSanityCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetSanityCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSanityCheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSanityCheckTaskResponse setBody(GetSanityCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSanityCheckTaskResponseBody getBody() {
        return this.body;
    }

}
