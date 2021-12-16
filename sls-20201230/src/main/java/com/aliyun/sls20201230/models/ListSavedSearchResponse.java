// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListSavedSearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSavedSearchResponseBody body;

    public static ListSavedSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSavedSearchResponse self = new ListSavedSearchResponse();
        return TeaModel.build(map, self);
    }

    public ListSavedSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSavedSearchResponse setBody(ListSavedSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSavedSearchResponseBody getBody() {
        return this.body;
    }

}
