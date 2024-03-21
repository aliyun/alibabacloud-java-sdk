// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SearchItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchItemsResponseBody body;

    public static SearchItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchItemsResponse self = new SearchItemsResponse();
        return TeaModel.build(map, self);
    }

    public SearchItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchItemsResponse setBody(SearchItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchItemsResponseBody getBody() {
        return this.body;
    }

}
