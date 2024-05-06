// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetPayerForAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPayerForAccountResponseBody body;

    public static GetPayerForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPayerForAccountResponse self = new GetPayerForAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetPayerForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPayerForAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPayerForAccountResponse setBody(GetPayerForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPayerForAccountResponseBody getBody() {
        return this.body;
    }

}
