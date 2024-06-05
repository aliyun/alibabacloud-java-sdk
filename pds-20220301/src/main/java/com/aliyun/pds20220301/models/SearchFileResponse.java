// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchFileResponseBody body;

    public static SearchFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchFileResponse self = new SearchFileResponse();
        return TeaModel.build(map, self);
    }

    public SearchFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchFileResponse setBody(SearchFileResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchFileResponseBody getBody() {
        return this.body;
    }

}
