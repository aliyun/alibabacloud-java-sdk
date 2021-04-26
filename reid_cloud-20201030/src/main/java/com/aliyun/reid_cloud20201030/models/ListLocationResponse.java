// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListLocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLocationResponseBody body;

    public static ListLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLocationResponse self = new ListLocationResponse();
        return TeaModel.build(map, self);
    }

    public ListLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLocationResponse setBody(ListLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLocationResponseBody getBody() {
        return this.body;
    }

}
