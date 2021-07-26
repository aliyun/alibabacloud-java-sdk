// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgoTreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlgoTreeResponseBody body;

    public static GetAlgoTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgoTreeResponse self = new GetAlgoTreeResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgoTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgoTreeResponse setBody(GetAlgoTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgoTreeResponseBody getBody() {
        return this.body;
    }

}
