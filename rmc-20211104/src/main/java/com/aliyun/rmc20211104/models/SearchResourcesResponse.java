// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmc20211104.models;

import com.aliyun.tea.*;

public class SearchResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchResourcesResponseBody body;

    public static SearchResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchResourcesResponse self = new SearchResourcesResponse();
        return TeaModel.build(map, self);
    }

    public SearchResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchResourcesResponse setBody(SearchResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchResourcesResponseBody getBody() {
        return this.body;
    }

}
