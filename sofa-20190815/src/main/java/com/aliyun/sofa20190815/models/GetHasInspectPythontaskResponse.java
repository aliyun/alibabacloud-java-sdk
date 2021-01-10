// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPythontaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectPythontaskResponseBody body;

    public static GetHasInspectPythontaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPythontaskResponse self = new GetHasInspectPythontaskResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPythontaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectPythontaskResponse setBody(GetHasInspectPythontaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectPythontaskResponseBody getBody() {
        return this.body;
    }

}
