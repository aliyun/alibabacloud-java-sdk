// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectShellexeclogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectShellexeclogResponseBody body;

    public static GetHasInspectShellexeclogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectShellexeclogResponse self = new GetHasInspectShellexeclogResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectShellexeclogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectShellexeclogResponse setBody(GetHasInspectShellexeclogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectShellexeclogResponseBody getBody() {
        return this.body;
    }

}
