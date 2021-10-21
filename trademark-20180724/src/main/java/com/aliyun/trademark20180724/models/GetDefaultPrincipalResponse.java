// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetDefaultPrincipalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDefaultPrincipalResponseBody body;

    public static GetDefaultPrincipalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultPrincipalResponse self = new GetDefaultPrincipalResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultPrincipalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDefaultPrincipalResponse setBody(GetDefaultPrincipalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDefaultPrincipalResponseBody getBody() {
        return this.body;
    }

}
