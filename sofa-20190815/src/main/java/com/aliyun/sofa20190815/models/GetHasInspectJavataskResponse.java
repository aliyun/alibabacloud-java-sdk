// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectJavataskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectJavataskResponseBody body;

    public static GetHasInspectJavataskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectJavataskResponse self = new GetHasInspectJavataskResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectJavataskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectJavataskResponse setBody(GetHasInspectJavataskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectJavataskResponseBody getBody() {
        return this.body;
    }

}
