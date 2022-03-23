// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchItemResponseBody body;

    public static SearchItemResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchItemResponse self = new SearchItemResponse();
        return TeaModel.build(map, self);
    }

    public SearchItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchItemResponse setBody(SearchItemResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchItemResponseBody getBody() {
        return this.body;
    }

}
