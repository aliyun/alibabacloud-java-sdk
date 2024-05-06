// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListDelegatedServicesForAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListDelegatedServicesForAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDelegatedServicesForAccountResponse setBody(ListDelegatedServicesForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDelegatedServicesForAccountResponseBody getBody() {
        return this.body;
    }

}
