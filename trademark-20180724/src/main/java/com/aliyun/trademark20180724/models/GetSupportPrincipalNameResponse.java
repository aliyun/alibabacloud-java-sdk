// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetSupportPrincipalNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSupportPrincipalNameResponseBody body;

    public static GetSupportPrincipalNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupportPrincipalNameResponse self = new GetSupportPrincipalNameResponse();
        return TeaModel.build(map, self);
    }

    public GetSupportPrincipalNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupportPrincipalNameResponse setBody(GetSupportPrincipalNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupportPrincipalNameResponseBody getBody() {
        return this.body;
    }

}
