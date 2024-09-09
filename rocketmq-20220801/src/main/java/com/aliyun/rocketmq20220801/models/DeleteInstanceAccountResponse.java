// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteInstanceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInstanceAccountResponseBody body;

    public static DeleteInstanceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceAccountResponse self = new DeleteInstanceAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstanceAccountResponse setBody(DeleteInstanceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceAccountResponseBody getBody() {
        return this.body;
    }

}
