// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccountResponseBody body;

    public static ListAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountResponse self = new ListAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccountResponse setBody(ListAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccountResponseBody getBody() {
        return this.body;
    }

}
