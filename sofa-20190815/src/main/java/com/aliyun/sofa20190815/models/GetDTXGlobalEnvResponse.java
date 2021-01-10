// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXGlobalEnvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDTXGlobalEnvResponseBody body;

    public static GetDTXGlobalEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDTXGlobalEnvResponse self = new GetDTXGlobalEnvResponse();
        return TeaModel.build(map, self);
    }

    public GetDTXGlobalEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDTXGlobalEnvResponse setBody(GetDTXGlobalEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDTXGlobalEnvResponseBody getBody() {
        return this.body;
    }

}
