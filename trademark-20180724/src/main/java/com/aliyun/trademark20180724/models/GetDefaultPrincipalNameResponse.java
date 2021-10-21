// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetDefaultPrincipalNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDefaultPrincipalNameResponseBody body;

    public static GetDefaultPrincipalNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultPrincipalNameResponse self = new GetDefaultPrincipalNameResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultPrincipalNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDefaultPrincipalNameResponse setBody(GetDefaultPrincipalNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDefaultPrincipalNameResponseBody getBody() {
        return this.body;
    }

}
