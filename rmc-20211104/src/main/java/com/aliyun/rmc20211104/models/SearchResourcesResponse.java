// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmc20211104.models;

import com.aliyun.tea.*;

public class SearchResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchResourcesResponseBody body;

    public static SearchResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchResourcesResponse self = new SearchResourcesResponse();
        return TeaModel.build(map, self);
    }

    public SearchResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchResourcesResponse setBody(SearchResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchResourcesResponseBody getBody() {
        return this.body;
    }

}
