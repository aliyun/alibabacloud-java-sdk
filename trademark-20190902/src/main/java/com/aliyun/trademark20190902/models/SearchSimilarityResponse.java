// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SearchSimilarityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchSimilarityResponseBody body;

    public static SearchSimilarityResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchSimilarityResponse self = new SearchSimilarityResponse();
        return TeaModel.build(map, self);
    }

    public SearchSimilarityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchSimilarityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchSimilarityResponse setBody(SearchSimilarityResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchSimilarityResponseBody getBody() {
        return this.body;
    }

}
