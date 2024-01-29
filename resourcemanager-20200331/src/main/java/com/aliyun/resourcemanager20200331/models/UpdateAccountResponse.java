// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAccountResponseBody body;

    public static UpdateAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountResponse self = new UpdateAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAccountResponse setBody(UpdateAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccountResponseBody getBody() {
        return this.body;
    }

}
