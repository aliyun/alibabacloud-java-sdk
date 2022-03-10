// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListRecentViewReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRecentViewReportsResponseBody body;

    public static ListRecentViewReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecentViewReportsResponse self = new ListRecentViewReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecentViewReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecentViewReportsResponse setBody(ListRecentViewReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecentViewReportsResponseBody getBody() {
        return this.body;
    }

}
