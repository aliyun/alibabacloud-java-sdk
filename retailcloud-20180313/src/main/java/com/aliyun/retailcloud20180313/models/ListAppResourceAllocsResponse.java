// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAppResourceAllocsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppResourceAllocsResponseBody body;

    public static ListAppResourceAllocsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppResourceAllocsResponse self = new ListAppResourceAllocsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppResourceAllocsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppResourceAllocsResponse setBody(ListAppResourceAllocsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppResourceAllocsResponseBody getBody() {
        return this.body;
    }

}
