// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SearchMemoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchMemoriesResponseBody body;

    public static SearchMemoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMemoriesResponse self = new SearchMemoriesResponse();
        return TeaModel.build(map, self);
    }

    public SearchMemoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMemoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchMemoriesResponse setBody(SearchMemoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMemoriesResponseBody getBody() {
        return this.body;
    }

}
