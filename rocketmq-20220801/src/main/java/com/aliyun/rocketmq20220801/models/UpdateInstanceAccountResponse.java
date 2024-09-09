// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceAccountResponseBody body;

    public static UpdateInstanceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAccountResponse self = new UpdateInstanceAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceAccountResponse setBody(UpdateInstanceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceAccountResponseBody getBody() {
        return this.body;
    }

}
