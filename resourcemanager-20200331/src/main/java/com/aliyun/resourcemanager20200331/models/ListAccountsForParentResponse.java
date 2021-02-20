// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAccountsForParentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccountsForParentResponseBody body;

    public static ListAccountsForParentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsForParentResponse self = new ListAccountsForParentResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountsForParentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccountsForParentResponse setBody(ListAccountsForParentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccountsForParentResponseBody getBody() {
        return this.body;
    }

}
