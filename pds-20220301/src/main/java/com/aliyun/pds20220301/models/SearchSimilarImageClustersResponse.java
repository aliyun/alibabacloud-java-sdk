// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchSimilarImageClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchSimilarImageClustersResponseBody body;

    public static SearchSimilarImageClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchSimilarImageClustersResponse self = new SearchSimilarImageClustersResponse();
        return TeaModel.build(map, self);
    }

    public SearchSimilarImageClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchSimilarImageClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchSimilarImageClustersResponse setBody(SearchSimilarImageClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchSimilarImageClustersResponseBody getBody() {
        return this.body;
    }

}
