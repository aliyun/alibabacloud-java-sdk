// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceAccountResponseBody body;

    public static ListInstanceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAccountResponse self = new ListInstanceAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceAccountResponse setBody(ListInstanceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceAccountResponseBody getBody() {
        return this.body;
    }

}
