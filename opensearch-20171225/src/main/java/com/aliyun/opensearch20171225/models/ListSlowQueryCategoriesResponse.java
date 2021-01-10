// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSlowQueryCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSlowQueryCategoriesResponseBody body;

    public static ListSlowQueryCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSlowQueryCategoriesResponse self = new ListSlowQueryCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListSlowQueryCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSlowQueryCategoriesResponse setBody(ListSlowQueryCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSlowQueryCategoriesResponseBody getBody() {
        return this.body;
    }

}
