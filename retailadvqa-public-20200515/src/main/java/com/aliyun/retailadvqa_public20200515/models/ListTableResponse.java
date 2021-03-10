// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTableResponseBody body;

    public static ListTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTableResponse self = new ListTableResponse();
        return TeaModel.build(map, self);
    }

    public ListTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTableResponse setBody(ListTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTableResponseBody getBody() {
        return this.body;
    }

}
