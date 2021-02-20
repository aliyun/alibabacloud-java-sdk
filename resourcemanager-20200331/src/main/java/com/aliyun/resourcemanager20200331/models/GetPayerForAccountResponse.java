// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetPayerForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetPayerForAccountResponse setBody(GetPayerForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPayerForAccountResponseBody getBody() {
        return this.body;
    }

}
