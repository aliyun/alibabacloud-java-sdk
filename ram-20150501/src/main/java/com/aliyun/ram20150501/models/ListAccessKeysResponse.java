// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListAccessKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccessKeysResponseBody body;

    public static ListAccessKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysResponse self = new ListAccessKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccessKeysResponse setBody(ListAccessKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessKeysResponseBody getBody() {
        return this.body;
    }

}
