// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchObjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchObjectResponseBody body;

    public static SearchObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchObjectResponse self = new SearchObjectResponse();
        return TeaModel.build(map, self);
    }

    public SearchObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchObjectResponse setBody(SearchObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchObjectResponseBody getBody() {
        return this.body;
    }

}
