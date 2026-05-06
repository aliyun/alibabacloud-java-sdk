// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SearchSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchSampleResponseBody body;

    public static SearchSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchSampleResponse self = new SearchSampleResponse();
        return TeaModel.build(map, self);
    }

    public SearchSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchSampleResponse setBody(SearchSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchSampleResponseBody getBody() {
        return this.body;
    }

}
