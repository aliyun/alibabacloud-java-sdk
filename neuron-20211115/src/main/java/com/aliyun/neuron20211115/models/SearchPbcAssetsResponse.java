// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SearchPbcAssetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchPbcAssetsResponseBody body;

    public static SearchPbcAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchPbcAssetsResponse self = new SearchPbcAssetsResponse();
        return TeaModel.build(map, self);
    }

    public SearchPbcAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchPbcAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchPbcAssetsResponse setBody(SearchPbcAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchPbcAssetsResponseBody getBody() {
        return this.body;
    }

}
