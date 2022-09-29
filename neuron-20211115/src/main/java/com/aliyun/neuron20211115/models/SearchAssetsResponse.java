// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SearchAssetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchAssetsResponseBody body;

    public static SearchAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAssetsResponse self = new SearchAssetsResponse();
        return TeaModel.build(map, self);
    }

    public SearchAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAssetsResponse setBody(SearchAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAssetsResponseBody getBody() {
        return this.body;
    }

}
