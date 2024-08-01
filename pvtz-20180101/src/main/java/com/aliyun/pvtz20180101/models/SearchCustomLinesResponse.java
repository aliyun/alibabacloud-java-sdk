// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SearchCustomLinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchCustomLinesResponseBody body;

    public static SearchCustomLinesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchCustomLinesResponse self = new SearchCustomLinesResponse();
        return TeaModel.build(map, self);
    }

    public SearchCustomLinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchCustomLinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchCustomLinesResponse setBody(SearchCustomLinesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchCustomLinesResponseBody getBody() {
        return this.body;
    }

}
