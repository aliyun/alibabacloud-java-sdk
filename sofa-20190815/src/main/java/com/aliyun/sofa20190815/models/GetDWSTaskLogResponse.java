// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSTaskLogResponseBody body;

    public static GetDWSTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSTaskLogResponse self = new GetDWSTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSTaskLogResponse setBody(GetDWSTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSTaskLogResponseBody getBody() {
        return this.body;
    }

}
