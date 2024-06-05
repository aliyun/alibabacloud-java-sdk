// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchStoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchStoriesResponseBody body;

    public static SearchStoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchStoriesResponse self = new SearchStoriesResponse();
        return TeaModel.build(map, self);
    }

    public SearchStoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchStoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchStoriesResponse setBody(SearchStoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchStoriesResponseBody getBody() {
        return this.body;
    }

}
