// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SearchSimilarityListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchSimilarityListResponseBody body;

    public static SearchSimilarityListResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchSimilarityListResponse self = new SearchSimilarityListResponse();
        return TeaModel.build(map, self);
    }

    public SearchSimilarityListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchSimilarityListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchSimilarityListResponse setBody(SearchSimilarityListResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchSimilarityListResponseBody getBody() {
        return this.body;
    }

}
