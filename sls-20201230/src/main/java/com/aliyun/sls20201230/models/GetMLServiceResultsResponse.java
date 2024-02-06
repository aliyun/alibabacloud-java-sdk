// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMLServiceResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMLServiceResultsResponseBody body;

    public static GetMLServiceResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMLServiceResultsResponse self = new GetMLServiceResultsResponse();
        return TeaModel.build(map, self);
    }

    public GetMLServiceResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMLServiceResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMLServiceResultsResponse setBody(GetMLServiceResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMLServiceResultsResponseBody getBody() {
        return this.body;
    }

}
