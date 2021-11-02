// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListMediaNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMediaNameResponseBody body;

    public static ListMediaNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaNameResponse self = new ListMediaNameResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaNameResponse setBody(ListMediaNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaNameResponseBody getBody() {
        return this.body;
    }

}
