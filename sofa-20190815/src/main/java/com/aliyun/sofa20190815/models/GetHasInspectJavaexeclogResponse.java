// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectJavaexeclogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectJavaexeclogResponseBody body;

    public static GetHasInspectJavaexeclogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectJavaexeclogResponse self = new GetHasInspectJavaexeclogResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectJavaexeclogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectJavaexeclogResponse setBody(GetHasInspectJavaexeclogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectJavaexeclogResponseBody getBody() {
        return this.body;
    }

}
