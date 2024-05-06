// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListDelegatedAdministratorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDelegatedAdministratorsResponseBody body;

    public static ListDelegatedAdministratorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDelegatedAdministratorsResponse self = new ListDelegatedAdministratorsResponse();
        return TeaModel.build(map, self);
    }

    public ListDelegatedAdministratorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDelegatedAdministratorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDelegatedAdministratorsResponse setBody(ListDelegatedAdministratorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDelegatedAdministratorsResponseBody getBody() {
        return this.body;
    }

}
