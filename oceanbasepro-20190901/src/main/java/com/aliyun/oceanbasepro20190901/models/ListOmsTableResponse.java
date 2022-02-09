// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOmsTableResponseBody body;

    public static ListOmsTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOmsTableResponse self = new ListOmsTableResponse();
        return TeaModel.build(map, self);
    }

    public ListOmsTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOmsTableResponse setBody(ListOmsTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOmsTableResponseBody getBody() {
        return this.body;
    }

}
