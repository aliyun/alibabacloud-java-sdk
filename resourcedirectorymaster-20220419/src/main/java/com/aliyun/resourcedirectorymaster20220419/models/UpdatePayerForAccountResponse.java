// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class UpdatePayerForAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePayerForAccountResponseBody body;

    public static UpdatePayerForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePayerForAccountResponse self = new UpdatePayerForAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePayerForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePayerForAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePayerForAccountResponse setBody(UpdatePayerForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePayerForAccountResponseBody getBody() {
        return this.body;
    }

}
