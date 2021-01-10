// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASApplicationDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCASApplicationDetailResponseBody body;

    public static GetCASApplicationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCASApplicationDetailResponse self = new GetCASApplicationDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCASApplicationDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCASApplicationDetailResponse setBody(GetCASApplicationDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCASApplicationDetailResponseBody getBody() {
        return this.body;
    }

}
