// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceTypeResponseBody body;

    public static GetInstanceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTypeResponse self = new GetInstanceTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceTypeResponse setBody(GetInstanceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceTypeResponseBody getBody() {
        return this.body;
    }

}
