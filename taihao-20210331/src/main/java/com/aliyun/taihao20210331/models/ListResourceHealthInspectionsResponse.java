// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListResourceHealthInspectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceHealthInspectionsResponseBody body;

    public static ListResourceHealthInspectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceHealthInspectionsResponse self = new ListResourceHealthInspectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceHealthInspectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceHealthInspectionsResponse setBody(ListResourceHealthInspectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceHealthInspectionsResponseBody getBody() {
        return this.body;
    }

}
