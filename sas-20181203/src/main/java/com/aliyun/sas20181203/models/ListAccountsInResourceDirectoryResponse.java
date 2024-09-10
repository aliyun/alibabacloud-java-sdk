// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAccountsInResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccountsInResourceDirectoryResponseBody body;

    public static ListAccountsInResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsInResourceDirectoryResponse self = new ListAccountsInResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountsInResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccountsInResourceDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccountsInResourceDirectoryResponse setBody(ListAccountsInResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccountsInResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
