// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetTrafficMirrorServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrafficMirrorServiceStatusResponseBody body;

    public static GetTrafficMirrorServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficMirrorServiceStatusResponse self = new GetTrafficMirrorServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTrafficMirrorServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrafficMirrorServiceStatusResponse setBody(GetTrafficMirrorServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrafficMirrorServiceStatusResponseBody getBody() {
        return this.body;
    }

}
