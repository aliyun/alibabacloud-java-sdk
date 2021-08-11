// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListDelegatedServicesForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDelegatedServicesForAccountResponseBody body;

    public static ListDelegatedServicesForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDelegatedServicesForAccountResponse self = new ListDelegatedServicesForAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListDelegatedServicesForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDelegatedServicesForAccountResponse setBody(ListDelegatedServicesForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDelegatedServicesForAccountResponseBody getBody() {
        return this.body;
    }

}
