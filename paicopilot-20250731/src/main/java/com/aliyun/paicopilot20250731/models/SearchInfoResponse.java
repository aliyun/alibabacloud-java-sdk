// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class SearchInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchInfoResponseBody body;

    public static SearchInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchInfoResponse self = new SearchInfoResponse();
        return TeaModel.build(map, self);
    }

    public SearchInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchInfoResponse setBody(SearchInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchInfoResponseBody getBody() {
        return this.body;
    }

}
