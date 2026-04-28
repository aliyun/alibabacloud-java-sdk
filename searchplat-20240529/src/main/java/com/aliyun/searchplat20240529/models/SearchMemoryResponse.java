// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class SearchMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchMemoryResponseBody body;

    public static SearchMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMemoryResponse self = new SearchMemoryResponse();
        return TeaModel.build(map, self);
    }

    public SearchMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchMemoryResponse setBody(SearchMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMemoryResponseBody getBody() {
        return this.body;
    }

}
