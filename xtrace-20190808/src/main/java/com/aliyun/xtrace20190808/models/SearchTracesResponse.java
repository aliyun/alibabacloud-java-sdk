// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class SearchTracesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchTracesResponseBody body;

    public static SearchTracesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesResponse self = new SearchTracesResponse();
        return TeaModel.build(map, self);
    }

    public SearchTracesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTracesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTracesResponse setBody(SearchTracesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTracesResponseBody getBody() {
        return this.body;
    }

}
