// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchBodyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchBodyResponseBody body;

    public static SearchBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchBodyResponse self = new SearchBodyResponse();
        return TeaModel.build(map, self);
    }

    public SearchBodyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchBodyResponse setBody(SearchBodyResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchBodyResponseBody getBody() {
        return this.body;
    }

}
