// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVmMetaResponseBody body;

    public static GetVmMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVmMetaResponse self = new GetVmMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetVmMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVmMetaResponse setBody(GetVmMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVmMetaResponseBody getBody() {
        return this.body;
    }

}
