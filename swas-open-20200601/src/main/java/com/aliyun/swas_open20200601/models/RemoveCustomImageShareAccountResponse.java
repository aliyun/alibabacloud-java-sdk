// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class RemoveCustomImageShareAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveCustomImageShareAccountResponseBody body;

    public static RemoveCustomImageShareAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveCustomImageShareAccountResponse self = new RemoveCustomImageShareAccountResponse();
        return TeaModel.build(map, self);
    }

    public RemoveCustomImageShareAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveCustomImageShareAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveCustomImageShareAccountResponse setBody(RemoveCustomImageShareAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveCustomImageShareAccountResponseBody getBody() {
        return this.body;
    }

}
